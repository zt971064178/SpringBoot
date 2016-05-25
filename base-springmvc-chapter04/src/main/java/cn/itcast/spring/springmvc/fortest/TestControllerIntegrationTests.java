package cn.itcast.spring.springmvc.fortest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get ;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content ;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl ;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model ;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status ;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view ;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyMvcConfig.class})
// 注解WebAppConfiguration，声明加载的ApplicationContext是WebApplicationContext
// 他的属性指的是web资源的位置，默认为src/main/webapp
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {
	// 模拟MVC对象
	private MockMvc mockMvc ;
	@Autowired
	private DemoService demoService ;
	
	@Autowired
	private WebApplicationContext wac ;
	
	@Autowired
	private MockHttpSession session ;
	
	@Autowired
	private MockHttpServletRequest request ;
	
	@Before
	public void setup() {
		// 初始化
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build() ;
	}
	
	@Test
	public void testNormalController() throws Exception {
		// 模拟get请求
		mockMvc.perform(get("/normal"))
				// 预期返回200
				.andExpect(status().isOk())
				// view名称为page
				.andExpect(view().name("page")) 
				// 页面转向的真是路径
				.andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
				// 预期model里返回的值为Hello  SpringMVC
				.andExpect(model().attribute("msg", demoService.saySomething())) ;
	}
	
	@Test
	public void testRestController() throws Exception {
		// 模拟请求判断返回数据是不是预期的数据
		mockMvc.perform(get("/testRest"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"))
				.andExpect(content().string(demoService.saySomething())) ;
	}
	
}

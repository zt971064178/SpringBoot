package cn.itcast.spring.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
// 在Junit环境下提供 Spring TextContext Framework功能
@RunWith(SpringJUnit4ClassRunner.class)
// 用于加载配置文件ApplicationContext，其中class属性用于加载配置类
@ContextConfiguration(classes = {TestConfig.class})
// 用于声明活动的profile
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
	// 注入Bean
	@Autowired
	private TestBean testBean ;
	
	@Test
	public void devBeanShouldInject() {
		String expected =  "from development profile" ;
		String actual = testBean.getContent() ;
		// 用Assert断言测试
		Assert.assertEquals(expected, actual);
	}
}

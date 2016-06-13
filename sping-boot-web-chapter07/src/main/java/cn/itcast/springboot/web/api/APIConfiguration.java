package cn.itcast.springboot.web.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * 添加Swagger配置类
 */
@Configuration
@EnableSwagger2
public class APIConfiguration {
	
	/** * 可以定义多个组，比如本类中定义把test和demo区分开了 * （访问页面就可以看到效果了） * */
	@Bean  
	public Docket testApi(){  
			// return new Docket(DocumentationType.SWAGGER_2);  
		return new Docket(DocumentationType.SWAGGER_2)
					.groupName("test")
					.genericModelSubstitutes(DeferredResult.class)
					// .genericModelSubstitutes(ResponseEntity.class)
					.useDefaultResponseMessages(false)
					.forCodeGeneration(true)// api测试请求地址
					.pathMapping("/")// base，最终调用接口后会和paths拼接在一起
					.select()
					.paths(PathSelectors.regex("/api/.*")) // 过滤的接口
					.build()
					.apiInfo(testApiInfo()) ;
	}  
	
	@Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
                //  .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/demo/.*"))//过滤的接口
                .build()
                .apiInfo(demoApiInfo());
    }
	
	private ApiInfo testApiInfo() {
        Contact contact = new Contact("张田", "http://my.oschina.net/wangnian", "2251181679@qq.com");
        ApiInfo apiInfo = new ApiInfo("某API接口",//大标题
                "REST风格API",//小标题
                "0.1",//版本
                "www.baidu.com",
                contact,//作者
                "主页",//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }
	
	private ApiInfo demoApiInfo() {
        Contact contact = new Contact("张田", "http://my.oschina.net/wangnian", "2251181679@qq.com");
        ApiInfo apiInfo = new ApiInfo("某API接口",//大标题
                "REST风格API",//小标题
                "0.1",//版本
                "www.baidu.com",
                contact,//作者
                "主页",//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }
}

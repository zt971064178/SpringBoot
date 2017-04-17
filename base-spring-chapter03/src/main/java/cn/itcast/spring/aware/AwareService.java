package cn.itcast.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName ;
	private ResourceLoader loader ;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader ;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName ;
	}
	
	public void outPutResource() {
		System.out.println("Bean 的名称为："+beanName);
		Resource resource = loader.getResource("config/test.txt") ;
		try {
			System.out.println(IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

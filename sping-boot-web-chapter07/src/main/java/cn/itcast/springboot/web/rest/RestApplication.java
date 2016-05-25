package cn.itcast.springboot.web.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ApplicationConfiguration.class)
public class RestApplication {
	
	@Autowired
	private PersonRepository personRepository ;
	
	@Test
	public void test() {
		Person p1 = new Person(1L, "张田", 24, "北京") ;
		Person p2 = new Person(2L, "王刚", 21, "苏州") ;
		Person p3 = new Person(3L, "张易某", 22, "南京") ;
		
		personRepository.save(p1) ;
		personRepository.save(p2) ;
		personRepository.save(p3) ;
	}
}

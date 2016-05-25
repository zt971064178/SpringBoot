package cn.itcast.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/*
 * 多例
 */
@Service
@Scope(value="prototype")
public class DemoPrototypeService {

}

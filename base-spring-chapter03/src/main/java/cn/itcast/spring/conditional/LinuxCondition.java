package cn.itcast.spring.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// 条件分支，作为判别依据
public class LinuxCondition implements Condition {

	// 重写match方法
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}

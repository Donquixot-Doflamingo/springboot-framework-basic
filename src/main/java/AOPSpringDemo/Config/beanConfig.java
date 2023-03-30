package AOPSpringDemo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "AOPSpringDemo.Aspects")
@ComponentScan(basePackages = "AOPSpringDemo.baseClasses")
@EnableAspectJAutoProxy
public class beanConfig {
}

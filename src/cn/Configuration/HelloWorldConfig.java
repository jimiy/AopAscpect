package cn.Configuration;

import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}

/*
*
* <beans>
   <bean id="helloWorld" class="cn.Configuration.HelloWorld" />
</beans>
*
* */
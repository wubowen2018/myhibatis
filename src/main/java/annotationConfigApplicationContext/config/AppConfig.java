package annotationConfigApplicationContext.config;

import annotationConfigApplicationContext.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //这个注解表示这是一个java配置文件，spring会根据它来生成IoC容器来装配Bean
public class AppConfig {

    @Bean(name="user")  //这个注解表示 initUser返回的POJO装配到IoC中，参数name的值是Bean的名字，不写会把initUser当做名称
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setUsername("user_name_1");
        user.setNote("note_1");
        return user;
    }
}

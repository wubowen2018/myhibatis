package top.jer.componentScan.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //这个注解表示这是一个java配置文件，spring会根据它来生成IoC容器来装配Bean
@ComponentScan //@ComponentScan 在没有传参数的时候，只会扫面当前包和其子包
public class AppConfig {

}

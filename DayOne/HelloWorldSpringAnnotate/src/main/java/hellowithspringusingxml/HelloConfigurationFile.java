package hellowithspringusingxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfigurationFile {
    @Bean
    public MsgProvider createMsgProvider(){
       return new HelloMsgProvider();
    }
    @Bean
        public MsgRender createMsgRender(){
        return new StandardMsgRender();
    }


}

package user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.port.InputPort;
import user.port.OutputPort;
import user.service.UserService;
import user.usecase.UserInfo;

@Configuration
public class AddBean {
    @Bean
    public InputPort inputPort(){
        return new UserInfo(outputPort());
    }

    @Bean
    public OutputPort outputPort(){
        return new UserService();
    }
}

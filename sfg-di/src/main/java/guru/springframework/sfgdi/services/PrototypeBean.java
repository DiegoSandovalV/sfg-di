package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    
    public PrototypeBean(){
        System.out.println("Creating a Prototype Bean!!!");
    }

    public String getMyScope(){
        return "I'm a Prototype";
    }
}

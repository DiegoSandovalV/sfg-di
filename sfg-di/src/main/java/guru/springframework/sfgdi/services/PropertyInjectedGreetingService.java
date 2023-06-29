package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService  implements GrettingService{
    
    @Override
    public String sayGretting() {
        return "Hello World - Property";
    }

}

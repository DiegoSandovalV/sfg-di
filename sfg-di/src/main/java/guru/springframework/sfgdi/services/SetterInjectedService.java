package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class SetterInjectedService  implements GrettingService{
     @Override
    public String sayGretting() {
        return "Hello World - Setter";
    }
}

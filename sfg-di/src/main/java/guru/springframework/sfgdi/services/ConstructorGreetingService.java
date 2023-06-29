package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GrettingService {
    
    @Override
    public String sayGretting() {
        return "Hello World - Constructor";
    }
}

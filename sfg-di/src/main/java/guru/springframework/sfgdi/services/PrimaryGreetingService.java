package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GrettingService{
    
    @Override
    public String sayGretting() {
        return "Hello World - From the PRIMARY Bean";
    }

}

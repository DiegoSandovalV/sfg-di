package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import guru.springframework.sfgdi.services.GrettingService;

@Controller
public class PropertyInjectedController {
    
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GrettingService greetingService;

    public String getGretting() {
        return greetingService.sayGretting();
    }


}

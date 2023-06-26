package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import guru.springframework.sfgdi.services.GrettingService;

@Controller
public class SetterInjectedController {

    private GrettingService greetingService;

    @Qualifier("setterInjectedService")
    @Autowired
    public void setGreetingService(GrettingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGretting() {
        return greetingService.sayGretting();
    }
    
}

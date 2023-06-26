package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GrettingService;

@Controller
public class ConstructorInjectedController {
   private final GrettingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GrettingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGretting() {
        return greetingService.sayGretting();
    }
}

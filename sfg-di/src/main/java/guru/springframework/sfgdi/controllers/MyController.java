package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GrettingService;

@Controller
public class MyController {

    private final GrettingService greetingService;

    

    public MyController(GrettingService greetingService) {
        this.greetingService = greetingService;
    }



    public String Sayhello() {
        

        return greetingService.sayGretting();
    }

}

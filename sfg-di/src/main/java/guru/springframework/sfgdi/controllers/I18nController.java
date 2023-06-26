package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GrettingService;

@Controller
public class I18nController {
    
    private final GrettingService grettingService;

    public I18nController(@Qualifier("i18nService") GrettingService grettingService) {
        this.grettingService = grettingService;
    }

    public String sayHello() {
        return grettingService.sayGretting();
    }
}

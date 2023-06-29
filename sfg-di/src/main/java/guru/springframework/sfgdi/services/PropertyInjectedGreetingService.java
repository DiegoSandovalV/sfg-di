package guru.springframework.sfgdi.services;



public class PropertyInjectedGreetingService  implements GrettingService{
    
    @Override
    public String sayGretting() {
        return "Hello World - Property";
    }

}

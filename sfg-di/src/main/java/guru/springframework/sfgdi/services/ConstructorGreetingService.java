package guru.springframework.sfgdi.services;




public class ConstructorGreetingService implements GrettingService {
    
    @Override
    public String sayGretting() {
        return "Hello World - Constructor";
    }
}

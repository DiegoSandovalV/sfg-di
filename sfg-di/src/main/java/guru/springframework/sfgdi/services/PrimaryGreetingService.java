package guru.springframework.sfgdi.services;




public class PrimaryGreetingService implements GrettingService{
    
    @Override
    public String sayGretting() {
        return "Hello World - From the PRIMARY Bean";
    }

}

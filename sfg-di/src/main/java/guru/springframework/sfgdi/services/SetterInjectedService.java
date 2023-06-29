package guru.springframework.sfgdi.services;




public class SetterInjectedService  implements GrettingService{
     @Override
    public String sayGretting() {
        return "Hello World - Setter";
    }
}

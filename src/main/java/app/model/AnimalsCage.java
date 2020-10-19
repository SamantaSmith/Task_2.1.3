package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    @Qualifier("timer")
    private Timer timer;

    public Timer getTimer() {
        return timer;
    };



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");

        System.out.println(timer.getTime());
        System.out.println("________________________");
    }


    @Bean(name = "dog")
    public Dog dog() {
        return new Dog();
    }

    @Bean(name = "timer")
    public Timer timer() {
        return new Timer();
    }
}

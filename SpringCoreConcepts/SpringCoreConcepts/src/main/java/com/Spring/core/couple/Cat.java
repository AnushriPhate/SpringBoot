package com.Spring.core.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("cat") // if dont wanna use it like this we can also use @Qualifier here
@Component
//@Qualifier("cat")
//@Primary
public class Cat implements Animal{
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

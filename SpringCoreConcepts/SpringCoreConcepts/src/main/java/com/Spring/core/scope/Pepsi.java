package com.Spring.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope("prototype")  //new object create everytime
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pepsi {

    @Autowired
    private Soda soda;
    public Pepsi(){
        System.out.println("Creating Pepsi");
    }

    public void drink(){
        System.out.println("Pepsi is very cool");
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }
}

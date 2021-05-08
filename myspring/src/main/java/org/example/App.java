package org.example;

import com.spring.ApplicationContext;
import com.spring.annotation.ComponentScan;

import java.io.IOException;

/**
 * Hello world!
 *
 */
@ComponentScan("org.example")
public class App 
{
    public static void main( String[] args ) throws IOException {
        ApplicationContext applicationContext = new ApplicationContext(App.class,args);
        applicationContext.start();
    }
}

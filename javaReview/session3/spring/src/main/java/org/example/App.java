package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws ClassNotFoundException {

//        System.out.println( "test ..." );
//        Class clazz = Class.forName("org.example.Bank");
//        Object obj = clazz.componentType();
//        Bank bb =(Bank) obj;
//        List list = new ArrayList<String>();
        //meta xml
        var context = new GenericXmlApplicationContext("file:/Users/kiarash.shamaii/Documents/javaClass/ramin105/javaReview/session3/spring/src/main/java/org/example/config.xml");

//       var milad = (MiladChild) context.getBean("Milad");
//       milad.run();
//        Bank b = (Bank) context.getBean("bank");
//        b.getName();
//        System.out.println(b.getId());
        BankV2 n = (BankV2) context.getBean("bankV2Imp2");
        n.payment();


    }
}

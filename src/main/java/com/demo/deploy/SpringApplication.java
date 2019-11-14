package com.demo.deploy;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {
    public static void run(){
        System.out.println("init deploy");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.addWebapp("/","d:\\spring\\");
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }


    }
}

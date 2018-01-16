package com.javapoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

/**
 * @author danielematteo90@gmail.com
 * @update 1/07/2018
 * @version 0.2.1
 *
 */
@SpringBootApplication
public class SpringBootExampleAplication 
{
    public static void main( String[] args )
    {
    	//The SpringApplication is a Spring Boot class, and it's used to bootstrap out application
        //It calls static method run(). 
    	//It starts auto-configured tomcat web server when Spring application is started.
    	SpringApplication.run(SpringBootExampleAplication.class,args);
    }
}

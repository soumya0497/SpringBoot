package com.javadevelopersguide.www;
import org.springframework.boot.SpringApplication;
/**
 * This Luncher for the spring boot application.
 * 
 * @author manoj.bardhan
 *
 */
public class SpringBootApplicationLauncher {
public static void main(String[] args) {
SpringApplication.run(HelloWorldController.class, args);
}
}
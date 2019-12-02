package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kodilla.*;


@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);
        int a = 10;
        int b = 5;

        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania " + a + " do " + b + " to " + calculator.addAtoB(a,b));
        System.out.println("Wynik odejmowania " + b + " od " + a + " to " + calculator.substractBfromA(a,b));
    }
}
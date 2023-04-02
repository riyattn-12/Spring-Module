package com.example.Spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
    @SpringBootApplication
    public class tightCoupling {

        public static void main(String[] args) {

            //SpringApplication.run(SpringDemoApplication.class, args);

            Cylinder b = new Cylinder(15, 15, 15);
            System.out.println(b.volume);


        }
    }

        class Cylinder
        {
            public int volume;
            Cylinder(int length, int width, int height)
            {
                this.volume = length * width * height;
            }
        }





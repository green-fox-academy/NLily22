package com.greenfoxacademy.springstart;
import com.greenfoxacademy.springstart.interfaces.MyColor;
import com.greenfoxacademy.springstart.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

  public static void main(String[] args) { SpringApplication.run(SpringstartApplication.class, args);
  }

  @Autowired
  MyColor color;

  @Autowired
  Printer printer;

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}





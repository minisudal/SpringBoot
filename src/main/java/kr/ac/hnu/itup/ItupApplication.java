package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.Objects;

@Slf4j
@SpringBootApplication
@ImportResource("classpath:root-context.xml")
public class ItupApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ItupApplication.class, args);
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
//        System.out.println("restaurant: {}" + restaurant);
        log.info("restaurant: {}", restaurant);
    }

}

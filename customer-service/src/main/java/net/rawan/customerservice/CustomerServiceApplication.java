package net.rawan.customerservice;

import net.rawan.customerservice.entities.Customer;
import net.rawan.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("rawan")
                            .email("rawan@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("ghita")
                    .email("ghita@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("basma")
                    .email("basma@gmail.com")
                    .build());
        };
    }
}

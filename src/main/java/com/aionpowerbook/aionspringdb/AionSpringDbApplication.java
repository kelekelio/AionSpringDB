package com.aionpowerbook.aionspringdb;

import com.aionpowerbook.aionspringdb.item.entity.Item;
import com.aionpowerbook.aionspringdb.item.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AionSpringDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(AionSpringDbApplication.class, args);
    }

    @Bean
    public CommandLineRunner sampleData(ItemRepository repository) {
        return (args) -> {
            repository.save(new Item(1L, "test_item_1"));
            repository.save(new Item(2L, "test_item_2"));
        };
    }

}

package com.relation.reation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.relation.reation.Entity.Author;
import com.relation.reation.Entity.Menu;
import com.relation.reation.repository.AuthorRepository;
import com.relation.reation.repository.MenuRepository;

@SpringBootApplication
public class ReationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReationApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository,
		MenuRepository menuRepository
	){
		return args -> {
			// var author = Author.builder()
			// .firstName("fuad")
			// .lastName("null")
			// .age(34)
			// .email("fuad@gmail.com")
			// .build();
			// authorRepository.save(author);
			var parent = Menu.builder()
			.name("fuad")
			.build();

			var child = Menu.builder()
			.name("abdullah")
			.parentMenu(parent)
			.build();

			var child2 = Menu.builder()
			.name("abdur rahman")
			.parentMenu(parent)
			.build();

			List<Menu> su = new ArrayList<>();
			su.add(child);
			su.add(child2);
			parent.setSubMenus(su);

			menuRepository.save(parent);
		};
	}

}

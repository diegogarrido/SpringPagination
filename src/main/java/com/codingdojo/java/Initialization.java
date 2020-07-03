package com.codingdojo.java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.codingdojo.java.model.Dojo;
import com.codingdojo.java.model.Ninja;
import com.codingdojo.java.model.dao.DojoDAO;
import com.codingdojo.java.model.dao.NinjaDAO;

@SpringBootConfiguration
public class Initialization {

	@Bean
	public CommandLineRunner initialize(DojoDAO ddao, NinjaDAO ndao) {
		return (args) -> {
			Dojo burbank = new Dojo();
			burbank.setName("Burbank");
			burbank = ddao.save(burbank);
			Dojo sanJose = new Dojo();
			sanJose.setName("San Jose");
			sanJose = ddao.save(sanJose);
			Dojo seattle = new Dojo();
			seattle.setName("Seattle");
			seattle = ddao.save(seattle);
			
			Ninja n = new Ninja();
			n.setFirstName("Jhon");
			n.setLastName("Doe");
			n.setDojo(burbank);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jhon");
			n.setLastName("Doe5");
			n.setDojo(burbank);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jhon");
			n.setLastName("Doe2");
			n.setDojo(burbank);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jhon");
			n.setLastName("Doe3");
			n.setDojo(burbank);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jhon");
			n.setLastName("Doe4");
			n.setDojo(burbank);
			ndao.save(n);
			
			n = new Ninja();
			n.setFirstName("Eduardo");
			n.setLastName("Baik");
			n.setDojo(sanJose);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("James");
			n.setLastName("Gosling");
			n.setDojo(sanJose);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Kelvin");
			n.setLastName("Luu");
			n.setDojo(sanJose);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Eduardo");
			n.setLastName("Baik");
			n.setDojo(sanJose);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Lance");
			n.setLastName("Robertson");
			n.setDojo(sanJose);
			ndao.save(n);
			
			n = new Ninja();
			n.setFirstName("Jane");
			n.setLastName("Doe");
			n.setDojo(seattle);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jane");
			n.setLastName("Doe2");
			n.setDojo(seattle);
			ndao.save(n);
			n = new Ninja();
			n.setFirstName("Jane");
			n.setLastName("Doe3");
			n.setDojo(seattle);
			ndao.save(n);
		};
	}

}

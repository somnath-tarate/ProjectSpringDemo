package com.tka.Spring.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("fristaip")

	public String welcomemassege() {
		return "massage_data";

	}

	@GetMapping("allcaraip")

	public ArrayList<String> allcar() {
		ArrayList<String> alcar = new ArrayList<>();
		alcar.add("Honda");
		alcar.add("Suzuki");
		alcar.add("Hundai");
		alcar.add("RollsRoys");

		return alcar;
	}

	@GetMapping("allcardetails")
	public ArrayList<String> allcardetails() {
		ArrayList<allcardetails> alcars = new ArrayList<>();
		allcardetails alcars1 = new allcardetails(1, "Honda", "RollsRoys", 5676676);
		allcardetails alcars2 = new allcardetails(2, "Hundai", "Suzuki", 2345665);
		allcardetails alcars3 = new allcardetails(3, "RollsRoys", "Hundai", 8765434);
		alcars.add(alcars1);
		alcars.add(alcars2);
		alcars.add(alcars3);

		return allcardetails();

	}
}

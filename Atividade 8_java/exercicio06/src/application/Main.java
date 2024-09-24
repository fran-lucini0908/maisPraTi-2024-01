package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Cat;
import entities.Cow;
import entities.Dog;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Cow());
		
		for (Animal animal : animals) {
			animal.makeSound();
		}
	}

}

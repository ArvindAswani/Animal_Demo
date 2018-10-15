import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 */

/**
 * @author AAASWANI
 *
 */
public class Manager {
public static void main(String[] args) {
/*	Animal[] animals = new Animal[4];
    animals[0] = new Cat();
    animals[1] = new Dog();
    animals[2] = new Wolf();
    animals[3] = new Lion();
   */
  
    
 CopyOnWriteArrayList<Animal> list 
        = new CopyOnWriteArrayList<Animal>(/*Arrays.asList(animals)*/);
 Animal cat = new Cat();
 Animal dog = new Dog();
 Animal lion = new Lion();
 Animal wolf = new Wolf();
		list.add(wolf);
		list.add(cat);
		list.add(dog);
		list.add(lion);
		
		list.forEach(System.out::println);
		
		list.stream().forEach(x -> {
			x.callSound();
			if(x instanceof Dog) {
				list.remove(x);
			}
		});
 
		list.forEach(System.out::println);
}
}

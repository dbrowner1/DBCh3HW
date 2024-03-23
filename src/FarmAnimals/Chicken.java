/**Class: Chicken
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: March 12, 2024
 */
package FarmAnimals;

public class Chicken extends FarmAnimal {
    private String sound = "Cluck Cluck";

    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am - 4pm";
    }

    @Override
    public String toString() {
        return super.toString() + " " + makeSound();
    }
}

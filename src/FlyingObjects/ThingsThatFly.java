/**Class: ThingsThatFly
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: March 12, 2024
 */
package FlyingObjects;

public class ThingsThatFly {
    public static void main(String[] args) {
        Flight[] flyingObjects = new Flight[3];

        //create the objects
        flyingObjects[0] = new Airplane("Boeing 747", 2016);
        flyingObjects[1] = new Bird("Eagle");
        flyingObjects[2] = new Bird("Hummingbird");

        //process the objects
        for (Flight obj : flyingObjects) {
            System.out.println(obj.toString() + ": ");
            obj.fly();
            System.out.println();
        }
    }
}


/**
 * 
 * Problem:
 * As of right now, Java comes with 8 primitive datatypes. 
 * What if we wanted to create our own datatypes?
 * 
 * Solution:
 * Classes allow us to define a custom datatype.
 * When we create a variable with a class as its datatype, that variable is considered an object.
 * NOTE: We have already seen objects with the String class.  
 *          Try "ctrl + left-click" on the text "String" to see the source code of the String class.
 * 
 * An object is an instantiation of a class.
 * We would like objects to be able to:
 *      a) contain some data
 *      and
 *      b) change its behavior based off of the data that it individually contains.
 *
 * Let's say we're working on a birdwatching app.
 * Using OOP, we could maintain many bird objects which individually contain their own
 * age, and can generate their own sound. This concept of an object controlling its own data can be
 * referred to as encapsulation.
 *
 * In the app, an individual bird should be able to "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
 * greater than or equal to 3.
 * 
 * 
 */
public class Bird {
    /**
     * A variable (in this context, often referred to as a field), which represents the age of the bird.
     */
    public int ageMonths;


    public Bird(){

    }

    public String sound(){
        String birdSound = "";
        if (ageMonths < 3){
            birdSound = "Tweet";
        }
        else if(ageMonths >= 3){
            birdSound = "Chirp";
        }

        return birdSound;
    }

}

/*Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/

/*Write a Java program where the "Cat" class includes a method to set a cat's breed. */
/*Write a Java program where the "Cat" class supports a method to determine if a cat is a kitten (age < 1 year). */
/*Write a Java program where the "Cat" class allows setting and getting the cat’s weight. */

/*Write a Java program where the "Cat" class includes a method to compare the ages of two cats.
 */

public class Ex1 {
    public static void main(String[] args) {
        cat c = new cat("mufasha",25,"Lion",45);
        cat c2=new cat("TOM", 9, "household",15);

        System.out.println("The name of CAT "+c.name);
        System.out.println("The age of the CAT "+c.getage());
        System.out.println("the breed of the CAT is"+c.breed());
        System.out.println(c.compareage(c2));
        
    }
    
}

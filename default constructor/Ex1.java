/*Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/

public class Ex1 {
    public static void main(String[] args) {
        cat c = new cat("ritik",25);

        System.out.println("The name of CAT "+c.name);
        System.out.println("The age of the CAT "+c.age);
        
    }
    
}

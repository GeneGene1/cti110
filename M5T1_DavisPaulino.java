package m5t1_davispaulino;

import java.util.Scanner;

public class M5T1_DavisPaulino {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Scanner keyboard = new Scanner(System.in);
        int age;
        
        System.out.println("How old are you?");
        age = keyboard.nextInt();
        System.out.println("The value is "+age);
        System.out.println(age);
    }
}

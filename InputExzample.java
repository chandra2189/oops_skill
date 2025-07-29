package typeconverstion;
import java.util.*;
public class InputExzample.java


public static void main(String []args)
{
String name;
int age;
float weight;
//creating object of Scanner class
Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
name = input.next();
System.out.print("Enter your age: ");
age = input.nextInt();
System.out.print("Enter your weight: ");
weight = input.nextFloat();
System.out.println("Name:" + name +", Age: "+ age +", Weight: "+weight);
}

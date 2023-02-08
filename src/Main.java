import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Skriv in dagens temperatur i celcius grader: ");
        double celcius = scan.nextDouble();
       double farenheit = (celcius)*1.8+32;
       double kelvin = (farenheit+459.67)/1.8;

       System.out.println((farenheit)+" grader Farenheit");
       System.out.println((kelvin)+" grader Kelvin");
       System.out.println("Det är "+(celcius)+" grader Celcius idag");

    }
}
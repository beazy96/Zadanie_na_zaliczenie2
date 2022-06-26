//Kalkulator równania kwadratowego
//ax2+bx+c=0

import java.util.Scanner;
import java.math.*;
class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj a :");
double a = scanner.nextDouble();
System.out.println("Podaj b :");
double b = scanner.nextDouble();
System.out.println("Podaj c :");
double c = scanner.nextDouble();
double delta=0;
double x =0;
double x1 =0;
double x2 =0;
double pierwdelta=0;
delta = (b*b)-4*(a*c);
pierwdelta = Math.sqrt(delta);
    if (delta < 0){
    System.out.println("Brak rozwiazan-2
                       ");
    }
    if (delta == 0){
    x=(-b)/(2*a);
    System.out.println("Jedno Rozwiązanie: "+x);}
    if (delta > 0){
    x1= ((-b)-(pierwdelta))/(2*a);
    x2= ((-b)+(pierwdelta))/(2*a);
    System.out.println("Dwa rozwiazania "+x1  +" i "+x2);
    }
  }
}
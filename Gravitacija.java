import java.lang.Math;
import java.util.Scanner;
public class Gravitacija {

public static double pospesek (double v){

  double M = 5.972 * Math.pow(10,24);
  double C = 6.674 * Math.pow(10,-11);
  double r = 6.371 * Math.pow(10, 6);
  
  double a = (C * M )/((r+v)*(r+v));
  return a ;
}
public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Vnesete visina (v metrih) ");
  int visina = sc.nextInt();

  double pospesek = Gravitacija.pospesek(visina);
  System.out.printf("Pospesek je enak: %.6f m/s^2%n", pospesek);
  System.out.printf("Visina je enaka: %d m%n", visina);
  }
}

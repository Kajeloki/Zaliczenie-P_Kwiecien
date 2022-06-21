import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj kolejne 3 liczby");
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int max=Math.max(a,b);
    max=Math.max(max,c);
    System.out.println("Najwieksza liczba z podanych:"+max);
  }
}
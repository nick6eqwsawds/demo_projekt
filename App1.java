import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
    try (Scanner tangetbort = new Scanner(System.in)){
        System.out.println("Skriv in ett tal:");
        int tal = tangetbort.nextInt();
        if (tal>10){
            System.out.println("Talet är större än 10");
        } else if (tal<=10){
            System.out.println("talet är mindre eller lika med 10");
        }
    }
    }
    }


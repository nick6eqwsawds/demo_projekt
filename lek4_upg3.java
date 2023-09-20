import java.util.Scanner;

public class lek4_upg3 {
    public static void main(String[] args) throws Exception {
    System.out.println("skriv ditt förnamn, efternamn, läng, ålder och vikt med mellanslag mellan sig:");
    try (Scanner del_sträng = new Scanner(System.in)) {
        String nytt_namn = del_sträng.nextLine();

        String data = nytt_namn;
        System.out.println(data.indexOf(" ")+1);
        int plats1 = data.indexOf(" ");
        String f_namn = data.substring(0, plats1);

     // String metoder:hämta deltext
     //String namn = nytt_namn.substring(0, 5);
     System.out.println("Ditt förnamn är "+ f_namn);

     int plats2 = data.indexOf(" ", plats1+1);
     String e_namn = data.substring(plats1+1, plats2);
     System.out.println("ditt efternamn är "+ e_namn);

     int plats3 = data.indexOf(" ", plats2+1);
     String längd = data.substring(plats2+1, plats3);
     System.out.println("du är "+ längd+"cm lång");

     int plats4 = data.indexOf(" ", plats3+1);
     String vikt = data.substring(plats3+1, plats4);
     System.out.println("du väger "+ vikt+"kg");

    }
    }
}

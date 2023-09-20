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
     double längd1 = Double.parseDouble(längd);
     System.out.println("du är "+ längd1+"cm lång");

     int plats4 = data.indexOf(" ", plats3+1);
     String ålder = data.substring(plats3+1, plats4);
     System.out.println("Du är "+ ålder+" år gammal");

     int plats5 = data.indexOf(" ", plats4+1);
     String vikt = data.substring(plats4+1, plats5);
     double vikt1 = Double.parseDouble(vikt);
     System.out.println("du väger "+ vikt1+"kg");

     int ålder2 = Integer.parseInt(ålder);
     int ålder3 = ålder2%2;
     if (ålder3 > 0) {
        System.out.println("Du fylle jämt om 1 år");
     } else {
        System.out.println("Du fyller jämt om 2 år");
     }

    }
    }
}

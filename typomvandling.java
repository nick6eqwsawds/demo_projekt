import java.util.Scanner;

public class typomvandling{
    public static void main(String[] args) throws Exception{
        int x = 30;
        int y = 45;

        double d_dec = (double)y/x;
        int d = (int) d_dec;
        if (d_dec-d > 0.49999){
             d = d+1;
        } else {
            d = d+1-1;
        }
        System.out.println(y+" / "+x+" = "+d_dec);
        System.out.println(d_dec+" som heltal är "+d);

        //del 2
        System.out.println("Skriv ett substantiv:");
        try (Scanner tangentbord = new Scanner(System.in)){
            String substantiv = tangentbord.nextLine();

            System.out.println("Skriv substantivets pluraländelse:");
            String plural_ändelse = tangentbord.nextLine();

        System.out.println("En "+substantiv+", Flera "+substantiv+plural_ändelse);
        }
    }
}
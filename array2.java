import java.util.Scanner;

public class array2 {
    public static void main(String[] args) throws Exception {

        String ord = "sax";
        //String ord = "SAX";
        String[] orden = {"tak", "bil", "sax"};

        boolean svar;

        svar = orden[0].equalsIgnoreCase(ord);

        System.out.println(orden[0]+"="+ord+" är "+svar);

        svar = orden[1].equalsIgnoreCase(ord);

        System.out.println(orden[1]+"="+ord+" är "+svar);

        svar = orden[2].equals(ord);
        //svar = orden[2].equalsIgnoreCase(ord);

        System.out.println(orden[2]+"="+ord+" är "+svar);
    }
}
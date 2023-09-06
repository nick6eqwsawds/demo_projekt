import java.util.Scanner;

public class demo_java_scanner {
    public static void main(String[] args) throws Exception {
        System.out.println( "Ange ditt födelsedatum");
        try (Scanner tangentbord = new Scanner(System.in)) {
            int födelse_datum = tangentbord.nextInt();

            System.out.println("Ange 4 sista");
            int fyra_sista = tangentbord.nextInt();

            System.out.println("Ditt personummer är: "+födelse_datum+":"+fyra_sista);
        }
    }
}

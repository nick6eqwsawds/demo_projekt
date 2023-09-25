import java.util.Scanner;

public class lek_fält_upg1 {
    public static void main(String[] args) {
                try (Scanner tangentbord = new Scanner(System.in)) {
        int[] fält1 = {3, 4, 6, 8, 9};
        for (int i = 0; i < fält1.length; i++) {
            System.out.println(fält1[i]);
        }
        System.out.println("längden är: "+fält1.length);
        double medelvärde = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/fält1.length;
        System.out.println("medelvärdet är: "+medelvärde);

        int[] fält2 = {13, 14, 16, 18, 19};
        int summa_fält1 = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        int summa_fält2 = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        int summa_fält3 = summa_fält1+summa_fält2;
        System.out.println("summan av fält1 = "+summa_fält1);
        System.out.println("summan av fält2 = "+summa_fält2);
        System.out.println("summan av fält1 + fält2 = "+summa_fält3);
        
        double medelvärde2 = (fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4])/fält2.length;
        System.out.println("medelvärdet av fält2 = "+medelvärde2);

        int[] summafält = {fält1[0]+fält2[0], fält1[1]+fält2[1], fält1[2]+fält2[2], fält1[3]+fält2[3], fält1[4]+fält2[4] };
        System.out.println("summafält variablar är: "+summafält[0]+" "+summafält[1]+" "+summafält[2]+" "+summafält[3]+" "+summafält[4]);
        
        System.out.println("Skriv in 4 tal");
        int[] tangentbordsfält = new int[4];
        tangentbordsfält[0] = tangentbord.nextInt();
        tangentbordsfält[1] = tangentbord.nextInt();
        tangentbordsfält[2] = tangentbord.nextInt();
        tangentbordsfält[3] = tangentbord.nextInt();

        int tangentbordfält_summa = tangentbordsfält[0]+tangentbordsfält[1]+tangentbordsfält[2]+tangentbordsfält[3];
        System.out.println("Summan av dina tal är: "+tangentbordfält_summa);

        }
    }
}


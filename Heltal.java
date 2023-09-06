public class Heltal {
    public static void main(String[] args) throws Exception{
        int tal1 = 2;
        int tal2 = 30;

        int summa_addition = tal1+tal2;
        int summa_subtraktion = tal1-tal2;

        System.out.println("summan av tal + tal2 är "+summa_addition);
        System.out.println("summan av tal - tal2 är "+summa_subtraktion);

        int produkt = tal1*tal2;
        int kvot = tal1/tal2;

        System.out.println("Produkten av tal1*tal2 är "+produkt);
        System.out.println("Kvoten av tal1/tal2 är "+kvot);

        int rest1 = 10%3;
        int rest2 = 9%3;

        System.out.println("Resten av 10/3 är "+rest1);
        System.out.println("Resten av 9/3 är "+rest2);
    }
    
}

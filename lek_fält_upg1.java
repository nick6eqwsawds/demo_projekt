public class lek_fält_upg1 {
    public static void main(String[] args) {
        int[] fält1 = {3, 4, 6, 8, 9};
        for (int i = 0; i < fält1.length; i++) {
            System.out.println(fält1[i]);
        }
        System.out.println("längden är: "+fält1.length);
        double medelvärde = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/fält1.length;
        System.out.println("medelvärdet är: "+medelvärde);
    }
}


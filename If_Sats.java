public class If_Sats {
    public static void main(String[] args) throws Exception{

        double tid=6;
        if(tid>=7.50)
        {
             System.out.println("Frukost");
        }

        else if(tid>=10.30 && tid<=12.30)
        {
            System.out.println("Lunch");
        } else {
             System.out.println("Ingen lunch");
        }

        int klocka = 6;

        int variabel = 1;

        switch(variabel)
        {
        case 1:
           System.out.println("Det va 1");
           break;
        case 2 :
           System.out.println("Det va 2");
           break;  
         default:
         System.out.println("Det va INTE 1 eller 2");

        }

    }
    
}

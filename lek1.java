import java.util.Scanner;

public class lek1 {
    public static void main(String[] args) throws Exception {
        //Tilldelnings operatorer
        int x = 20;
        
        //System.out.println(++x);
        //System.out.println(x==20);
        /*
         * mittTal==10 10=sant
         * mittTal!=10 inte 10=sant
         * || = &&
         */
        System.out.println(x++);
        System.out.println(x);

        x=x+2;
        x+=2;

        x=x*2;
        x*=2;

        x-=2;
    }
    
}

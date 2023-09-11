public class string {
    public static void main(String[] args) throws Exception {
        // Göra om int till double
        double fem_dec= 5.0;
        int fem =(int) fem_dec;
        System.out.println(fem+" som decimal är "+fem_dec);


        // Division
        int x= 3;
        int y= 4;
        double d = (double)x/y;
        System.out.println(x+"/"+y+"="+d);


        //String matematiska operatorer
        String f_namn ="Kalle";
        String e_namn="Anka";

        String namn = f_namn+" "+e_namn;

        // Blandning Strängar och tal

        System.out.println("45+100="+(45+100));

        // String metoder: innehåller ord sant/falskt
        boolean svar= namn.contains("Anka");
        System.out.println("Innehåller namnet Kalle:"+ svar);

        // String metoder:  Byt ut text
        String nytt_namn = namn.replace("Kalle", "Kajsa");
        System.out.println(namn+" har bytt namn till "+nytt_namn);

        // String metoder: natal bokstäver i ord
        int antal_bokstäver = namn.length();
        System.out.println(namn+" innehåller "+antal_bokstäver+" bokstäver");

        // String metoder: hitta plats för bokstav
        int n_index = nytt_namn.indexOf("n");
        System.out.println("bokstaven liger på plats "+n_index);

        // String metoder:hämta deltext
        String del_sträng = nytt_namn.substring(0, 5);
        System.out.println("TExt mellan index 0 och 5 är "+ del_sträng);

        String jämförelse_sträng="Kajsa Anka";
        nytt_namn.equalsIgnoreCase(jämförelse_sträng);




    }
}

public class Metoder {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        sägHej();
        sägNågot("Snö");   
        sägNågot("Snart är det jul");
        sägNgtFleraGgr(4, "HEJ");
        int summan = plus(40, 4);
        System.out.println("Summan är "+ summan);
        summan = plus(3, 30);
        System.out.println("Summan är "+summan);


    }

    static int plus(int tal1, int tal2)
    {
        int summan = tal1+tal2;
        return summan;
    }

    static void sägNgtFleraGgr(int ggr, String ngt)
    {
        for(int i=0; i<ggr; i++)
        {
            System.out.println(ngt);
        }
    }

    static void sägNågot(String ngt)
    {
        System.out.println("säg "+ngt+" från sägNgt");
    }

    static void sägHej()
    {
        System.out.println("Hej från metoden");
    }
    
}

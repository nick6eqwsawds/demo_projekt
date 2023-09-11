public class typomvandling{
    public static void main(String[] args) throws Exception{
        int x = 30;
        int y = 45;

        double d_dec = (double)y/x;
        int d = (int) d_dec;
        System.out.println(y+" / "+x+" = "+d_dec);
        System.out.println(d_dec+" som heltal är "+d);
    }
}
public class fibonacci {
    public static void main(String args[]){
        int SUM = 0;
        int a = 0;
        int b = 1;
        int c = a + b;
        while (c < 4000000){
            if (c % 2 == 0){
                SUM = SUM + c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(SUM);
    }
 
}
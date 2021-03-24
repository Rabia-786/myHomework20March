public class Q07 {


        public void average(int a, int b,int c,int d,int e) {
        int total= (a+b+c+d+e)/5;
            System.out.println("Average of a,b,c,d,e  = " +
                    + ( a + b + c + d + e));
            System.out.println(total);
        }

        public static void main(String[] args) {

            Q07 Q07 = new Q07();
            Q07.average(5,10,5,20,30);
        }

}

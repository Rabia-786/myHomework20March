public class Q13 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        char symbol = '+';      // symbol can be changed like '-', '*', '/'
        if (symbol == '+'){
            System.out.println(a + b);
        } else if (symbol == '-'){
            System.out.println(a - b);

        } else if (symbol == '*'){
            System.out.println(a * b);
        }
            else if (symbol == '/'){
            System.out.println(a / b);
        }
           else{
            System.out.println("invalid");
        }
    }
}

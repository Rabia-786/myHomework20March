public class Q6 {



    public static void main(String[] args) {

        int id = 1234;
        String Name = "Eva";
        int BasicSalary = 4000;
        float HRA = BasicSalary * 10/100;
        float DA = BasicSalary * 8/100;
        float TA = BasicSalary * 9/100;
        float PF = BasicSalary * 20/100;
        double total = BasicSalary + HRA + TA + DA - PF;
        System.out.println("Gross Salary =" + (BasicSalary + HRA + TA + DA - PF));
        System.out.println(total);
    }
}





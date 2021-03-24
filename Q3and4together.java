public class Q3and4together {
    public static void main(String[] args) {
        String studentName = "jack";
        int rollNo = 3;
        int physics = 79;
        int maths = 85;
        int english = 75;
        int total = (physics + maths + english);
        int percentage = (total * 100 / 300);
        if(percentage>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Total marks");

        System.out.println(total);
        System.out.println("percentage");
        System.out.println(percentage);

        if (percentage >= 80) {
            System.out.println("A+ grade");
        } else if (percentage >= 60) {
            System.out.println("A grade");
        } else if (percentage >= 50) {
            System.out.println("B grade");
        } else if (percentage >= 35) {
            System.out.println("C grade");

        } else {
            System.out.println("Fail");

        }
    }
}

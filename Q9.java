public class Q9 {

    public static void main(String[] args){
         int id= 1234;
         String sallerName= "David";
         int Amount= 30000;

         int salaryBasic= 10000;
         if( Amount>=50000){
                    System.out.println("Commission 35%");
            	    }
            else if(Amount>=30000 ){
                    System.out.println("Commission 20%");
            }
           else if(Amount>=20000 ) {
             System.out.println("Commission 10%");
         }

                 else if(Amount>=10000 ){
                 System.out.println("Commission 5%");
             }
             else if(Amount<10000 ) {
             System.out.println("Commission 2%");
         }
                    else{
                           System.out.println("Invalid!");
                    }



             }


}

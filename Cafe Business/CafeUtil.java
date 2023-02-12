import java.util.ArrayList;
// import java.util.Arrays;


class CafeUtil  {
    public int getStreakGoal(){
        int weeksum= 0;
        for( int i = 0 ; i <= 10 ; i++){ 
          weeksum += i ;

        }
        return weeksum;
    }

    public double getOrderTotal(double[] lineItems){
     double pricesum = 0;
       for(double i=0; i < lineItems.length; i++ ){
           pricesum += i;
       }
       return pricesum;
    

    // enhanced for loop= wrapper class variable : ArrayList name
    // condition : variable to hold the final result += variable from the loop
    // return varable holding the final total ( w1d2@19m)
        // for (Double values : lineItems){
        //     pricesum += values;
        // }
        // return pricesum;
    }
    public void displayMenu(ArrayList<String> menu){
        // String menu =   menu.get(); // to access an element in an ArrayList using an index 
                for (int i = 0; i < menu.size(); i++){
                System.out.println( i + " "+ menu.get( i ) ); } 
            // int index = 0;
            // for (String menuItems : menu){
            //         System.out.println((index++) +" "+ menuItems);
            // }
            // another solution
        

        System.out.println(menu);
    }
    
    public void addCustomer(ArrayList<String> customers){
    System.out.println(" Please enter your name");
    String userName = System.console().readLine();
    System.out.printf(" Hello %s", userName);
    System.out.printf(" There are %s people ahead of you : ", customers.size());
    customers.add(userName);
        System.out.println(customers);
}

} 
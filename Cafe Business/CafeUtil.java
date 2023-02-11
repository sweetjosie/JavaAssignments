import java.util.ArrayList;
// import java.util.Arrays;


class CafeUtil  {
    public int getStreakGoal(){
        int weeksum= 0;
        for( int i = 0 ; i<= 10 ; i++){
          weeksum += 5;
        //    System.out.println(i);
        }
        return weeksum;
    }

    public double getOrderTotal(double[] lineItems){
     double pricesum = 0;
    //    for(double i=0; i < lineItems.length; i++ ){
    //       double  pricesum += lineItems;
    //    }
    //    return lineItems;
    // what is missing?

    // enhanced for loop= wrapper class variable : ArrayList/collection of items
    // condition : variable to hold the final result += variable from the loop
    // return varable holding the final total ( w1d2@19m)
        for (Double values : lineItems){
            pricesum += values;
        }
        return pricesum;
    }
    public void displayMenu(ArrayList<String> menu){
        // String menu =   menu.get(); // to access an element in an ArrayList using an index <-- doesnt like this
                // for (int i = 0; i < menu.size(); i++){
                //      System.out.println( ""+ menu.get( i ) ); } // it prints the items in the menu but not the index position
            int index = 0;
            for (String menuItems : menu){
                    System.out.println((index++) +" "+ menuItems);
            }
        

        // System.out.println(menu);
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
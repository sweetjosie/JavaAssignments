public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = " your order will be ready shortly";
        String readyMessage = " your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 5.5;
        double dripPrice = 3;
        double capuccinoPrice =  4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 ); // Displays "Welcome to Cafe Java, Cindhuri"
        if(isReadyOrder1) {
            System.out.println( customer1 + displayTotalMessage + dripPrice);
        }
            else{
                 System.out.println( customer1 + pendingMessage);
            }
            System.out.println(generalGreeting + customer2);
        if(isReadyOrder2) {
            System.out.println( customer2 + readyMessage + displayTotalMessage + mochaPrice);
        }
            else{
                 System.out.println( customer2 + pendingMessage);
            }
                System.out.println(generalGreeting + customer2);
        if(isReadyOrder3) {
            System.out.println( customer3 + readyMessage + displayTotalMessage + lattePrice);
        }
            else{
                 System.out.println( customer3 + pendingMessage);
            }
                        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4) {
            System.out.println( customer4 + readyMessage + displayTotalMessage + capuccinoPrice);
        }
            else{
                 System.out.println( customer4 + pendingMessage);
            }
             System.out.println(" Sorry for our mistake "+ customer3 + displayTotalMessage + (lattePrice - dripPrice));
        }
    }
        
       
    
        

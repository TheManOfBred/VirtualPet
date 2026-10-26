import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Mr. Pickles.");

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {

         // TODO 2:
         // Display happiness, hunger, and energy.
         System.out.println("Happiness = " + happiness);
         System.out.println("Hunger = " + hunger);
         System.out.println("Energy = " + energy);
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         if (choice == 1) {
            happiness += 1;
            hunger -= 3;
            System.out.println("You feed your pet. Look at them eating!");
            
         } else if (choice == 2) {
            happiness += 3;
            hunger += 2;
            energy -= 2;
            System.out.println("You play with your pet. Look at them jump!");
         } else if (choice == 3) {
            happiness -= 1;
            hunger += 1;
            energy += 3;
            System.out.println("You let your pet sleep.");
         } else if (choice == 4) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
            System.out.println("You give your pet a bath.");
         } else if (choice == 5) {
            
         } else {
            System.out.println("Only integers from 1 to 5 are allowed. Please try again.");
         }
      }

      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      if (happiness >= 15) {
         System.out.println("YOU WIN!");
      } else if (hunger >= 10) {
         System.out.println("Your pet ran away looking for food!");
      } else if (energy <= 0) {
         System.out.println("Let's just say that your parents took your pet to a farm. The less you know the better.");
      } else if (choice == 5) {
         System.out.println("Goodbye!");
      }
      input.close();
   }
}
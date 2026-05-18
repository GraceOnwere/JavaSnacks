import java.util.Scanner;
public class NokiaMenuMap{

    public static void main(String[] args){

    System.out.println("Welcome to Nokia 3110!!!");
    System.out.println("\nList of Menu Fun1ctions");
    System.out.println("1. Phonebook\n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services\n0. Exit");

    System.out.print("\nEnter a number from (1-13) or select 0 for Back: ");
    Scanner inputCollector = new Scanner(System.in);

    while (inputCollector.hasNext()){

    int mainMenu = inputCollector.nextInt();

    switch (mainMenu){
    
    case 1:
    System.out.println("\n1. Phonebook");
    
    int menuOneSubMenu = 0;

    while (menuOneSubMenu <= 12){
    
    System.out.println("\n  1. Search\n  2. Service Nos\n  3. Add name\n  4. Erase\n  5. Edit\n  6. Assign tone\n  7. Send b'card\n  8. Options\n  9. Speed dials\n  10. Voice tags\n  11. Back");
    System.out.print("\nEnter a number from (1-10) and 11 for Back: ");

    Scanner subMenuOne = new Scanner(System.in);

    menuOneSubMenu = inputCollector.nextInt();

    switch (menuOneSubMenu){
    
    case 1:
    System.out.println("Search");
    break;
    
    case 2:
    System.out.println("Service Nos");
    break;

    case 3:
    System.out.println("Add name");
    break;

    case 4:
    System.out.println("Erase");
    break;

    case 5:
    System.out.println("Edit");
    break;
    
    case 6:
    System.out.println("Assign tone");
    break;   

    case 7:
    System.out.println("Send b'card");
    break;

    case 8:
    System.out.println("\n1. Options");
    
    int menuTwoSubMenu = 0;

    while (menuTwoSubMenu <= 4){
    
    System.out.println("\n 1.  Type of view\n 2.  Memory status\n 3.  Back");
    System.out.print("Enter a number between 1 and 2 or 3 for Back");
    
    Scanner subMenuThree = new Scanner(System.in);
    
    menuTwoSubMenu = inputCollector.nextInt();

    switch (menuTwoSubMenu){

    case 1:
    System.out.println("Type of view");
    break;

    case 2:
    System.out.println("Memory status");
    break;

    case 3:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid");
    break;
    
        }

     if (menuTwoSubMenu == 3){
    break;
    
        }
    }

    break;

    case 9:
    System.out.println("Speed dials");
    break;
    
    case 10:
    System.out.println("Voice tags");
    break;

    case 11:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid");
    break;

        }
    
    if (menuOneSubMenu == 11){
    break; 

        }
   
    }

    break;
    
    case 2:
    System.out.println("\n2. Messages");
    System.out.println("\n  1. Write messages\n  2. Inbox\n  3. Outbox\n  4. Picture messages\n  5. Templates\n  6. Smileys\n  7. Message settings\n  8. Info service\n  9. Voice mailbox number\n  10. Service commander editore\n  11. Back");
    System.out.print("Enter a number from (1-10) and 11 for Back: ");

    //while (menuTwoSubMenu != 11){
    
    Scanner subMenuThree = new Scanner(System.in);

    int menuThreeSubMenu = inputCollector.nextInt();
    
    System.out.println(menuTwoSubMenu);
    break;

        }
    }
    
    /*case 8:
    System.out.println("Options");
    
    System.out.print("Enter a number 1 or 2 for the submenu: ");

    Scanner subMenuOne = new Scanner(System.in);
    
    int menuEightSubMenu = inputCollector.nextInt();
    
    switch (menuEightSubMenu){
    
    case 1:
    System.out.println("Type of view");
    break;
    
    case 2:
    System.out.println("Memory status");
    break;

    break;    
    }// menu eight sub menu switch

    break;
    } // menu one sub menu switch


    }//while menu one sub menu

    }//

  */ 
    
    

    

    
    
        }
    
    
    }

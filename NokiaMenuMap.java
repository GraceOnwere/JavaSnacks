import java.util.Scanner;
public class NokiaMenuMap{

    public static void main(String[] args){

    System.out.println("Welcome to Nokia 3110!!!");
    System.out.println("\nList of Menu Functions");
    //System.out.println("1. Phonebook\n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services\n14. Exit");

   // System.out.print("\nEnter a number from (1-13) or select 14 for Exit: ");
    
    Scanner inputCollector = new Scanner(System.in);

    int mainMenu = 1;

    while (mainMenu > 0){

    System.out.println("\n1. Phonebook\n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM Services\n14. Exit");

    System.out.print("\nEnter a number from (1-13) or select 14 for Exit: ");

    mainMenu = inputCollector.nextInt();

    switch (mainMenu){
    
    case 1:
    System.out.println("\n1. Phonebook");
    
    int menuOneSubMenu = 1;

    while (menuOneSubMenu > 0){
    
    System.out.println("\n  1. Search\n  2. Service Nos\n  3. Add name\n  4. Erase\n  5. Edit\n  6. Assign tone\n  7. Send b'card\n  8. Options\n  9. Speed dials\n  10. Voice tags\n  11. Back");
    System.out.print("\nEnter a number from (1-10) and 11 for Back: ");

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
    
    int menuTwoSubMenu = 1;

    while (menuTwoSubMenu > 0){
    
    System.out.println("\n 1.  Type of view\n 2.  Memory status\n 3.  Back");
    System.out.print("Enter a number between 1 and 2 or 3 for Back: ");
    
    
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

     if (menuTwoSubMenu == 3)
    break;
    
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
    System.out.println("Invalid choice");
    break;

        }
    
    if (menuOneSubMenu == 11){
    break; 
        }
   
    }

    break;
    
    case 2:
    System.out.println("\n2. Messages");

    int menuThreeSubMenu = 1;    
    
    while (menuThreeSubMenu > 0){
    
    System.out.println("\n  1. Write messages\n  2. Inbox\n  3. Outbox\n  4. Picture messages\n  5. Templates\n  6. Smileys\n  7. Message settings\n  8. Info service\n  9. Voice mailbox number\n  10. Service commander editor\n  11. Back");
    System.out.print("\nEnter a number from (1-10) and 11 for Back: ");


    menuThreeSubMenu = inputCollector.nextInt();
    
    switch (menuThreeSubMenu){

    case 1:
    System.out.println("Write messages");
    break;

    case 2:
    System.out.println("Inbox");
    break;

    case 3:
    System.out.println("Outbox");
    break;

    case 4:
    System.out.println("Picture messages");
    break;

    case 5:
    System.out.println("Templates");
    break;

    case 6:
    System.out.println("Smileys");
    break;

    case 7:
    System.out.println("Message settings");

    int menuFourSubMenu = 1;

    while (menuFourSubMenu > 0){

    System.out.println("\n 1.  Set 1\n 2.  Common\n 3.  Back");
    System.out.print("Enter a number between 1 and 2 or 3 for Back: ");

    
    menuFourSubMenu = inputCollector.nextInt();

    switch (menuFourSubMenu){

    case 1:
    System.out.println("Set 1");
    
    int menuFiveSubMenu = 1;

    while (menuFiveSubMenu > 0){
    
    System.out.println("\n 1.  Message centre number\n 2.  Message sent as\n 3.  Message validity\n 4.  Back");
    System.out.print("Enter a number between 1 and 3 or 4 for Back: ");
   

    menuFiveSubMenu = inputCollector.nextInt();

    switch (menuFiveSubMenu){
    
    case 1:
    System.out.println("Message centre number");
    break;

    case 2:
    System.out.println("Message sent as");
    break;

    case 3:
    System.out.println("Message validity");
    break;

    case 4:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;

     }
        if (menuFiveSubMenu == 4){
        break;
                }

            }  

    break;//set 1 break


    case 2:
    System.out.println("Common");

    int menuSixSubMenu = 1;

    while (menuSixSubMenu > 0){

    System.out.println("\n 1.  Delivery reports\n 2.  Repy via same centre\n 3.  Character support\n 4.  Back");
    System.out.print("Enter a number between 1 and 3 or 4 for Back: ");

    menuSixSubMenu = inputCollector.nextInt();

    switch (menuSixSubMenu){

    case 1:
    System.out.println("Delivery reports");
    break;

    case 2:
    System.out.println("Reply via same centre");
    break;

    case 3:
    System.out.println("Character support");
    break;

    case 4:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;

    }
        if (menuSixSubMenu == 4)
        break;                
                    
            }

    break;//common break

    case 3:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    }
    
            if (menuFourSubMenu == 3)
                break;
        }//message settings break
    break;

    case 8:
    System.out.println("Info service");
    break;

    case 9:
    System.out.println("Voice mailbox");
    break;

    case 10:
    System.out.println("Service command editor");
    break;

    case 11:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    
    }
           
       if (menuThreeSubMenu == 11)
            break;
    }//messages break
    break;

    case 3:
    System.out.println("Chat");
    break;

    case 4:
    System.out.println("Call register");

    int menuSevenSubMenu = 1;

    while (menuSevenSubMenu > 0){

    System.out.println("\n 1.  Missed calls\n 2.  Received calls\n 3.  Dialled numbers\n 4.  Erase recent call lists\n 5.  Show call duration\n 6.  Show call costs\n 7.  Call cost settings\n 8.  Prepaid credit\n 9.  Back");
    System.out.print("Enter a number between 1 and 8 or 9 for Back: ");

    menuSevenSubMenu = inputCollector.nextInt();

    switch (menuSevenSubMenu){

    case 1:
    System.out.println("Missed calls");
    break;

    case 2:
    System.out.println("Received calls");
    break;

    case 3:
    System.out.println("Dialled numbers");
    break;

    case 4:
    System.out.println("Erased recent call");
    break;

    case 5:
    System.out.println("Show call duration");

    int menuEightSubMenu = 1;

    while (menuEightSubMenu > 0){

    System.out.println("\n 1.  Last call duration\n 2.  All call's duration\n 3.  Received call's duration\n 4.  Dialled call's duration\n 5.  Clear timers\n 6.  Back");
    System.out.print("Enter a number between 1 and 5 or 6 for Back: ");

    menuEightSubMenu = inputCollector.nextInt();

    switch (menuEightSubMenu){

    case 1:
    System.out.println("Last call duration");
    break;

    case 2:
    System.out.println("All call's duration");
    break;

    case 3:
    System.out.println("Received call's duration");
    break;

    case 4:
    System.out.println("Dialled call's duration");
    break;
    
    case 5:
    System.out.println("Clear timers");
    break;

    case 6:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invaild choice");
    break;
    }
        if (menuEightSubMenu == 6)
        break;

        }
    break;

    case 6:
    System.out.println("Show call costs");

    int menuNineSubMenu = 1;

    while(menuNineSubMenu > 0){

     System.out.println("\n 1.  Last call cost\n 2.  All call's cost\n 3.  Clear counters\n 4.  Back");
    System.out.print("Enter a number between 1 and 3 or 4 for Back: ");

    menuNineSubMenu = inputCollector.nextInt();

    switch (menuNineSubMenu){

    case 1:
    System.out.println("Last call cost");
    break;

    case 2:
    System.out.println("All call's cost");
    break;

    case 3:
    System.out.println("Clear counters");
    break;

    case 4:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    }
        if (menuNineSubMenu == 4)
        break;
            }
    break;

    case 7:
    System.out.println("Call cost settings");

    int menuTenSubMenu = 1;

    while(menuTenSubMenu > 0){

    System.out.println("\n 1.  Call cost limit\n 2.  Show costs in\n 3.  Back");
    System.out.print("Enter a number between 1 and 2 or 3 for Back: ");

    menuTenSubMenu = inputCollector.nextInt();

    switch (menuTenSubMenu){

    case 1:
    System.out.println("Call cost limit");
    break;

    case 2:
    System.out.println("Show costs in");
    break;

    case 3:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;    
    }
         if (menuTenSubMenu == 3)
         break;    
    
            }
    break;

    case 8:
    System.out.println("Prepaid credit");
    break;        

    case 9:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;


    }
        if (menuSevenSubMenu == 9)
        break;

        }

    break;

    case 5:
    System.out.println("Tones");

    int menuElevenSubMenu = 1;

    while (menuElevenSubMenu > 0){
    
    System.out.println("\n  1. Ringing tone\n  2. Ringing volume\n  3. Incoming call alert\n  4. Composer\n  5. Message alert tone\n  6. Keypad tones\n  7. Warning and game tones\n  8. Vibrating alert\n  9. Screen saver\n  10. Back");
    System.out.print("\nEnter a number between 1 and 9 or 10 for Back: ");

    menuElevenSubMenu = inputCollector.nextInt();

    switch(menuElevenSubMenu){

    case 1:
    System.out.println("Ringing tone");
    break;

    case 2:
    System.out.println("Ring volume");
    break;

    case 3:
    System.out.println("Incoming call alert");
    break;

    case 4:
    System.out.println("Composer");
    break;

    case 5:
    System.out.println("Message alert tone");
    break;

    case 6:
    System.out.println("Keypad tones");
    break;

    case 7:
    System.out.println("Warning and game tones");
    break;

    case 8:
    System.out.println("Vibrating alert");
    break;

    case 9:
    System.out.println("Screen saver");
    break;

    case 10:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    }
        if (menuElevenSubMenu == 10)
        break;    
            }
    break;

    case 6:
    System.out.println("Settings");

    int menuTwelveSubMenu = 1;

    while (menuTwelveSubMenu > 0){
    
    System.out.println("\n  1. Call settings\n  2. Phone settings\n  3. Security settings\n  4. Restore factory settings\n  5. Back");
    System.out.print("\nEnter a number between 1 and 4 and 5 for Back: ");
    
    menuTwelveSubMenu = inputCollector.nextInt();

    switch (menuTwelveSubMenu){
    
    case 1:
    System.out.println("Call settings");

    int menuThirteenSubMenu = 1;

    while (menuThirteenSubMenu > 0){

    System.out.println("\n  1. Automatic redial\n  2. Speed dialling\n  3. Call waiting options\n  4. Own number sending\n  5. Phone line in use\n  6. Automatic answer\n  7. Back");
    System.out.print("\nEnter a number between 1 and 6 or 7 for Back: ");
    
    menuThirteenSubMenu = inputCollector.nextInt();

    switch (menuThirteenSubMenu){
    
    case 1:
    System.out.println("Automatic redial");
    break;

    case 2:
    System.out.println("Speed dialling");
    break;

    case 3:
    System.out.println("Call waiting options");
    break;

    case 4:
    System.out.println("Own number sending");
    break;

    case 5:
    System.out.println("Phone line in use");
    break;

    case 6:
    System.out.println("Automatic answer");
    break;

    case 7:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;

    }
        if (menuThirteenSubMenu == 7)
        break;   
            }
    break;

    case 2:
    System.out.println("Phone settings");

    int menuFourteenSubMenu = 1;

    while (menuFourteenSubMenu > 0){

     System.out.println("\n  1.  Language\n  2.  Cell info display\n  3.  Welcome note\n  4.  Nework selection\n  5.  Lights\n  6.  Confirm SIM service actions\n  7.  Back");
    System.out.print("\nEnter a number between 1 and 6 or 7 for Back: ");

    menuFourteenSubMenu = inputCollector.nextInt();

    switch (menuFourteenSubMenu){

    case 1:
    System.out.println("Language");
    break;

    case 2:
    System.out.println("Cell info display");
    break;

    case 3:
    System.out.println("Welcome note");
    break;

    case 4:
    System.out.println("Nework selcetion");
    break;

    case 5:
    System.out.println("Lights");
    break;

    case 6:
    System.out.println("Confirm SIM service actions");
    break;

    case 7:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    
    }
           if (menuFourteenSubMenu == 7 )
           break;

            }
    break;

    case 3:
    System.out.println("Security settings");

    int menuFifthteenSubMenu = 1;

    while (menuFifthteenSubMenu > 0){

    System.out.println("\n  1.  PIN code request\n  2.  Calling barring service\n  3.  Fixed dialling\n  4.  Closer user group\n  5.  Phone security\n  6.  Change access codes\n  7.  Back");
    System.out.print("\nEnter a number between 1 and 6 or 7 for Back: ");

    menuFifthteenSubMenu = inputCollector.nextInt();
    
    switch (menuFifthteenSubMenu){
    
    case 1:
    System.out.println("PIN code request");
    break;

    case 2:
    System.out.println("Call barring service");
    break;

    case 3:
    System.out.println("Fixed dialling");
    break;

    case 4:
    System.out.println("Closer user group");
    break;

    case 5:
    System.out.println("Phone security");
    break;

    case 6:
    System.out.println("Change access code");
    break;

    case 7:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;

    }
           if (menuFifthteenSubMenu == 7)
           break;
            }

    break;

    case 4:
    System.out.println("Restore factory settings");
    break;
    
    case 5:
    System.out.println("Back");
    break; 

    default:
    System.out.println("Invalid choice");
    break;               
    }
          if (menuTwelveSubMenu == 5)
          break;

            } 
    break;

    case 7:
    System.out.println("Call divert");
    break;

    case 8:
    System.out.println("Games");
    break;

    case 9:
    System.out.println("Calculator");
    break;

    case 10:
    System.out.println("Reminders");
    break;

    case 11:
    System.out.println("Clock");

    int menuSixteenSubMenu = 1;

    while (menuSixteenSubMenu > 0){

    System.out.println("\n  1.  Alarm clock\n  2.  Clock settings\n  3.  Date setting\n  4.  Stopwatch\n  5.  Countdown time\n  6.  Auto update of date and time\n  7.  Back");
    System.out.print("\nEnter a number between 1 and 6 or 7 for Back: ");
    
    menuSixteenSubMenu = inputCollector.nextInt();            

    switch (menuSixteenSubMenu){
    
    case 1:
    System.out.println("Alarm clock");
    break;

    case 2:
    System.out.println("Clock settings");
    break;

    case 3:
    System.out.println("Date setting");
    break;

    case 4:
    System.out.println("Stopwatch");
    break;

    case 5:
    System.out.println("Countdown timer");
    break;

    case 6:
    System.out.println("Auto update of date and time");
    break;

    case 7:
    System.out.println("Back");
    break;

    default:
    System.out.println("Invalid choice");
    break;
    }
          if (menuSixteenSubMenu == 7)
          break;

        }
    break;

    case 12:
    System.out.println("Profiles");
    break;

    case 13:
    System.out.println("SIM services");
    break;

    case 14:
    System.out.println("Exit\nPower Off");
    break;

    default:
    System.out.println("Invalid choice");
    //break;
        }

        if (mainMenu == 14)
        break;
    }
    
   
    
    
    //break; 
    
        }
    
    
    }

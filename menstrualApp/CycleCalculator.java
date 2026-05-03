public class CycleCalculator {

    public static void main(String[] args){

    int startDay = 31;

    String month = "August";

    int cycleLength = 27;

    String nextPeriod = getNextPeriod(startDay, month, cycleLength);

    int ovulation = getOvulationDay(cycleLength);

    int fertileStart = getFertileStart(ovulation);

    int fertileEnd = getFertileEnd(ovulation);

    System.out.println("Next period: " + nextPeriod);

    System.out.println("Ovulation Day (cycle): Day " + ovulation);

    System.out.println("Fertile Window: Day "+ fertileStart + " to Day " + fertileEnd);
    }

    public static int getMonthDays(String month){

    int days = 0;

    switch (month){

    case "January", "March", "May", "July","August", "October","December":
     
        days = 31;
        break;

    case "Feburary":

        days = 28;
        break;

    case "April", "June", "September", "November":

        days = 30;
        break;

        }
    return days;
    }


    public static String getNextMonth(String month){

    switch(month){ 
        case "January": return "Feburary";
        case "Feburary": return "March";
        case "March": return "April";
        case "April": return "May";
        case "May": return "June";
        case "June": return "July";
        case "July": return "August";
        case "August": return "September";
        case "September": return "October";
        case "October": return "November";
        case "November": return "December";
        case "December": return "January";
    }
    return month;
    }


    public static String getNextPeriod (int startDay, String month, int cycleLength){

    int daysInMonth = getMonthDays(month);

    int daysLeftInMonth = daysInMonth - startDay;

    if (cycleLength <= daysLeftInMonth){
        int resultDay = startDay + cycleLength;
        return resultDay + " " + month;    
    }

    int remainingDays = cycleLength - daysLeftInMonth;
    
    String nextMonth = getNextMonth(month);

    return remainingDays + " " + nextMonth;
      
    }

    public static int getOvulationDay(int cycleLength){
        return cycleLength - 14;
    }

    public static int getFertileStart(int ovulationDay){
        return ovulationDay - 5;
    }

    public static int getFertileEnd (int ovulationDay){ 
        return ovulationDay + 2;
    }
}

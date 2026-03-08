package lab4;
import java.util.Scanner;
public class DateTime {
	private int year;
    private int month;
    private int datenumber;
    public DateTime(String dt) {
    	String[] values = dt.split("[-./]");
        year = Integer.parseInt(values[0]);
        month = Integer.parseInt(values[1]);
        datenumber = Integer.parseInt(values[2]);
    }

    private int getyearcode(int year) {
        return (year % 100 + (year % 100) / 4) % 7;
    }
    private int getmonthcode(int month) {
    	switch(month){
            case 1: return 0;
            case 2: return 3;
            case 3: return 3;
            case 4: return 6;
            case 5: return 1;
            case 6: return 4;
            case 7: return 6;
            case 8: return 2;
            case 9: return 5;
            case 10: return 0;
            case 11: return 3;
            case 12: return 5;
			default: return 0;
        }
    }
    private int getcenturycode(int century){

        switch(century){
            case 17: return 4;
            case 18: return 2;
            case 19: return 0;
            case 20: return 6;
            case 21: return 4;
            case 22: return 2;
            case 23: return 0;
        }
        return 0;
    }
    private int getleapyearcode(int year, int month){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            if(month == 1 || month == 2){
                return 1;
            }
        }

        return 0;
    }
    private int dayofweek(){
        int yearcode = getyearcode(year);
        int monthcode = getmonthcode(month);
        int centurycode = getcenturycode(year / 100);
        int leapyearcode = getleapyearcode(year, month);
        int result = (yearcode + monthcode + centurycode + datenumber - leapyearcode) % 7;
        return result;
    }

    public void printdayofweek(){

        String[] days = {
                "Sunday","Monday","Tuesday",
                "Wednesday","Thursday","Friday","Saturday"
        };

        int d = dayofweek();
        System.out.println(year + " onii " + month +
                "-r sariin " + datenumber + " bol " + days[d]);
    }
}




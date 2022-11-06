public class Clock {
    
    // attributes
    int hour, minute;
    int alarmHour, alarmMinute;


    // constructors

    Clock()
    {
        hour = 0;
        minute = 0;
    }

    Clock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    // methods

    public void setClock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock()
    {
        hour = 0;
        minute = 0;
    }

    public void displayTime()
    {
        if (hour == 0 && minute == 0){
            System.out.println("Time " + hour + hour + ":" + minute + minute);
        } else if (hour == 0 && minute < 10){
            System.out.println("Time " + hour + hour + ":0" + minute);
        } else if (hour < 10 && minute < 10){
            System.out.println("Time: 0" + hour + ":0" + minute);
        } else if(hour > 10 && minute < 10){
            System.out.println("Time: " + hour + ":0" + minute);
        } else {
            System.out.println("Time: " + hour + ":" + minute);
        }
    }

    public void addOneMinute()
    {
        minute = minute + 1;

        if(minute > 59){
            minute = 0;
            hour += 1;
        }
        
        if(hour > 23){
            hour = 0;
            minute = 0;
        }

        if((alarmHour == hour) && (alarmMinute == minute)){
            runAlarm();
        }
    }

    public void setAlarm(int hour, int minute)
    {
        alarmHour = hour;
        alarmMinute = minute;
    }

    public void runAlarm()
    {
        System.out.println("beep-beep-beep-beep!!");
    }

    public static void main(String args[]){

        Clock c1 = new Clock(12, 47);
        c1.displayTime();

        c1.setAlarm(0, 2);

        c1.setClock(18, 47);
        c1.displayTime();

        c1.setClock(9, 3);
        c1.displayTime();

        c1.setClock(23, 58);
        c1.displayTime();

        c1.addOneMinute();
        c1.displayTime();

        c1.addOneMinute();
        c1.displayTime();

        c1.addOneMinute();
        c1.addOneMinute();
    }
}

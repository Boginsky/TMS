package task24;


public class TimeInterval {

    int sec;
    int min;
    Integer hour;

    TimeInterval(int sec, Integer hour){
        this.sec = sec;
        this.hour = hour;
    }

    TimeInterval(int min,int sec){
        this.min = min;
        this.sec = sec;
    }


    void fullNumberOfSeconds(TimeInterval timeInterval) {
        if (hour == null) {
            System.out.println(sec + (min * 60));
        } else {
            System.out.println(sec + (min * 60) + (hour * 60 * 60));
        }
    }

        void showData () {
            System.out.println("Количество секунд равно: " + sec + ". " + "Количество минут равно: " + min + ". " + "Количество часов равно: " + hour + ".");
        }

    }



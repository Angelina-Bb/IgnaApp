package ignaapp.entities;

import java.time.LocalTime;


public class Schedule {
    private LocalTime hour;
    private String title;
    private String comment;
    private Day day; //asociacion de la clase Schedule con la clase Day

    public Schedule() {
    }

    public Schedule(LocalTime hour, String title, String comment, Day day) {
        this.hour = hour;
        this.title = title;
        this.comment = comment;
        this.day = day;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Schedule{" + "hour=" + hour + ", comment=" + comment + ", day=" + day + '}';
    }
    
}

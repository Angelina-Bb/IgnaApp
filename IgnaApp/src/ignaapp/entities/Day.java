package ignaapp.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Day extends Calendar{
    private ArrayList<Schedule> schedule;

    public Day() {
    }

    public Day(ArrayList<Schedule> schedule, LocalDate currenDate) {
        super(currenDate);
        this.schedule = schedule;
    }

    public ArrayList<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Schedule> schedule) {
        this.schedule = schedule;
    }

    public LocalDate getCurrenDate() {
        return currenDate;
    }

    public void setCurrenDate(LocalDate currenDate) {
        this.currenDate = currenDate;
    }

    @Override
    public String toString() {
        return "Day{" + "schedule=" + schedule + '}';
    }
    
}

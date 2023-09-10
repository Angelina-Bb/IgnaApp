package ignaapp.entities;

import java.time.LocalDate;


public class Calendar {
    protected LocalDate currenDate;

    public Calendar() {
    }

    public Calendar(LocalDate currenDate) {
        this.currenDate = currenDate;
    }

    public LocalDate getCurrenDate() {
        return currenDate;
    }

    public void setCurrenDate(LocalDate currenDate) {
        this.currenDate = currenDate;
    }

    @Override
    public String toString() {
        return "Calendar{" + "currenDate=" + currenDate + '}';
    }
    
    
}

package ignaapp.services;

import ignaapp.entities.Day;
import ignaapp.entities.Schedule;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScheduleService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Schedule newSchedule;
    Day newDay = new Day();
    
    public void createSchedule(){
        
    }
    
    public void requestSchedule() {
        LocalDate myDateNow = LocalDate.now();
        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = myDateNow.format(myFormatDate);
        System.out.println("Las tareas pendientes para del dia " + formattedDate + " son:");
        newDay.setCurrenDate(myDateNow);
        
        //CREATE LA BASE DE DATOS!
    }
    
    public void updateSchedule(){
        
    }

    public void deleteSchedule(){
    
    }
}

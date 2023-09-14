package ignaapp.services;

import ignaapp.entities.Day;
import ignaapp.entities.Schedule;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScheduleService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Schedule newSchedule = new Schedule();
    Day newDay = new Day();
    DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter myFormatTime = DateTimeFormatter.ofPattern("HH:mm");
    LocalDate myDateNow = LocalDate.now();
    
    public Schedule createSchedule(){
        System.out.println("CREAR UNA TAREA PENDIENTE");
        // Usuario ingresa por teclado la fecha a la cual desea crear una tarea.
        System.out.println("Fecha en dd/MM/aaaa");
        String myDate = read.next();
        LocalDate theFormatDate = LocalDate.parse(myDate, myFormatDate);
        // Variable formattedDate para visualizar la fecha segun america latina
        String formattedDate = theFormatDate.format(myFormatDate);
        if(theFormatDate.isEqual(myDateNow) || theFormatDate.isAfter(myDateNow)){
            System.out.println("Titulo de la tarea.");
            newSchedule.setTitle(read.next());
            System.out.println("Descripcion de la tarea.");
            newSchedule.setComment(read.next());
            System.out.println("Hora de la tarea. HH:mm");
            String myTime = read.next();
            LocalTime theFormatTime = LocalTime.parse(myTime, myFormatTime);
        }else{
            System.out.println("No se puede crear una tarea en fechas anteriores a la actual.");
        }
        return newSchedule;
    }
    
    public void requestSchedule() {
        
        String formattedDate = myDateNow.format(myFormatDate);
        newDay.setCurrenDate(myDateNow);
        System.out.println("Las tareas pendientes para del dia " + formattedDate + " son:");
        
        //CREATE LA BASE DE DATOS!!
    }
    
    public void updateSchedule(){
        
    }

    public void deleteSchedule(){
    
    }
}

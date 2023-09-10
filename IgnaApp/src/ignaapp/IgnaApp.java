package ignaapp;

import ignaapp.services.ScheduleService;


public class IgnaApp {

    public static void main(String[] args) {
        ScheduleService nss = new ScheduleService();
        
        nss.requestSchedule();
    }

}

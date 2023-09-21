package ignaapp;

import ignaapp.services.ScheduleService;


public class IgnaApp {

    public static void main(String[] args) {
        // Conectando la base de datos
        CConnection objConnection = new CConnection();
        objConnection.establishConnection();
        // Ejecutando programa
        ScheduleService nss = new ScheduleService();
        nss.createSchedule();
        
        
        //TODO pensar en como realizar alertas para que la app realice alertas a traves de whatsapp para ciertas citas
    }

}

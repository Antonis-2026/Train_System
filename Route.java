//TSIGGERHS ANTONIS AM: 604-2026

package java_set_c;

import java.util.ArrayList;

public class Route {
    //DHLWSH PEDIWN KLASHS ROUTE
    private int id;
    private int train;
    private String departure;
    private String arrival;
    private ArrayList <Ticket> tickets = new ArrayList<>();
     //CONSTRUCTORES XWRIS KAI ME ORISMATA
    public Route(){
        id = 0;
        train = 0;
        departure = "";
        arrival = "";
        tickets = new ArrayList<>();
    }
    public Route(int ID,int a,String d,String arr){
        id = ID;
        train = a;
        departure = d;
        arrival = arr;
        tickets = new ArrayList<>();
    }
    //METHODOI SET-GET GIA OLA TA PEDIA THS KLASHS
    public void setId(int ID){
        id = ID;
    }
    public void setTrain(int a){
        train =a;
    }
    public void setDeparture(String d){
        departure =d;
    }
    public void setArrival(String a){
        arrival =a;
    }
    public int getId(){
        return id;
    }
    public int getTrain(){
        return train;
    }
    public String getDeparture(){
        return departure;
    }
    public String getArrival(){
        return arrival;
    }
    //METHODOS ADDTICKET OPOY EISAGEI ENA EISHTHRIO STH LISTA KAI XEIRIZETAI SYGKEKREIMENA EXCEPTION
    public void addTicket(Ticket t,Train t1 ){ 
        
        try{
            
            if(tickets.size()>=t1.getMaxPassenger())
                throw new Exception ("!!!Den yparxei diathesimos xwros!!!");
            if(t.getID()!=id)
                throw new Exception ("!!!Diaforetiko id eishtirioy apo diadromhs!!!");
            if(!t.getDeparture().equals(departure)||!t.getArrival().equals(arrival))
               throw new Exception ("!!!Diaforetikh afethria h proorismos!!!"); 
            tickets.add(t);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    //METHODOS FINALIZE OPOY EKTYPWNEI OLA TA DEDOMENA KAI XEIRIZETAI EXCEPTION    
    }
    public void finalize(){
        try{
        System.out.println("Route ID: "+id+"Train ID: "+train+"\nDeparture: "+departure
                +"\nArrival: "+arrival+"\n**Tickets List**\n "+tickets);
        if(tickets.isEmpty())
            throw new Exception("**DEN YPARXOYN EPIBATES\n TO DROMOLOGIO DEN THA EKTELESTEI");
        System.out.println("TO DROMOLOGIO THA EKTELESTEI KANONIKA--");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
    }
        
    }
    //OVERRIDE THS TOSTRING
    @Override
    public String toString(){
        return "Route ID: "+id+"Train ID: "+train+"\nDeparture: "+departure
                +"\nArrival: "+arrival+"\n**Tickets List**\n "+tickets;
    }
    
}

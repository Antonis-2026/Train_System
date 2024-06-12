//TSIGGERHS ANTONIS AM: 604-2026

package java_set_c;

import java.util.Scanner;

public class Ticket {
    //DHLWSH PEDIWN
    private int id;
    private String passenger;
    private String departure;
    private String arrival;
    private float distance;
    private float cost;
    //CONSTRUCTORES XWRIS KAI ME ORISMATA
    public Ticket(){
        id = 0;
        passenger = "";
        departure = "";
        arrival = "";
        distance = 0;
        cost = 0;
    }
    public Ticket (int ID,String p,String d,String a,float dis,float c){
        id = ID;
        passenger = p;
        departure = d;
        arrival = a;
        try{
            distance = dis;
            if(dis==0||dis<0)
                throw new Exception("H XILIOMETRIKH APOSTASH DEN GINETAI NA EINAI MHDEN H ARNHTIKH");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        cost = c;
    }
    //METHODI SET GIA OLA TA PEDIA
    public void setID(int x){
        id = x;
    }
    public void setPassenger(String x){
        passenger = x;
    }
    public void setDeparture(String x){
        departure = x;
    }
    public void setArrival(String x){
        arrival = x;
    }
    public void setDistance(float x){
        distance = x;
    }
    public void setCost(float x){
        cost = x;
    }
    //METHODOI GET GIA OLA TA PEDIA
    public int getID(){
        return id;
    }
    public String getPassenger(){
        return passenger;
    }
    public String getDeparture(){
        return departure;
    }
    public String getArrival(){
        return arrival;
    }
    public float getDistance(){
        return distance;
    }
    public float getCost(){
        return cost;
    }
    //METHODOS READ POU DIAVAZEI TA DEDEOMENA APO TO PLHKTROLOGIO KAI XEIRIZETAI EXCEPTION
    public void read(){
        boolean x=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Dwse kodiko dromologiou: ");
        id = input.nextInt();
        System.out.println("Dwse onoma epibath: ");
        passenger = input.nextLine();
        System.out.println("Dwse topo anaxwrhshs: ");
        departure = input.nextLine();
        System.out.println("Dwse proorismo: ");
        arrival = input.nextLine();
        System.out.println("Dwse apostash dromologiou se xiliometra: ");
        distance = input.nextFloat();
        do{
            try{
            System.out.println("Dwse to kostos dromologiou: ");
        
            cost = input.nextFloat();
            if(cost==0||cost<0)
                throw new Exception("TO KOSTOS DEN MPOREI NA EINAI ARNHTIKO H MHDEN");
            x = false;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(x);
    }
    //OVERRIDE THS TOSTRING
    public String toString(){
        return "Ticket ID:"+id + "\nPassenger: "+passenger+
                "\nDeparture: "+departure+"\nArrival: "+arrival+
                "\nDistance: "+distance+ "\nTicket Cost:"+ cost; 
    }
    
    
}

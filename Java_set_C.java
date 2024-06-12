//TSIGGERHS ANTONIS AM: 604-2026

package java_set_c;

import java.util.ArrayList;

public class Java_set_C {

    public static void main(String[] args) {
            //DHLWSH KAI DHMIOYRGIA ARRAYLIST
            ArrayList <Route> routes = new ArrayList<>();
            //DHLWSH ANTIKEIMENWN ROUTE
            Route d1 = new Route(1,1,"ATHENS","KOZANI");
            IndirectRoute d2 = new IndirectRoute(2,1,"ATHENS","KOZANI","LAMIA");
            Route d3 = new Route(3,1,"KOZANI","ATHENS");
            //DHLWSH KAI DHMIOYRGIA ANTIKOIMENWN TICKET
            Ticket t1 = new Ticket(1,"ANTONIS","ATHENS","KOZANI",500,25);
            Ticket t2 = new Ticket(2,"antonis","ATHENS","KOZANI",0,25);
            //DHLWSH KAI DHMIOYRGIA ANTIKOIMENOY TRAIN
            Train tr1 = new Train(1,"ELECTRIC",20);
            //XRHSH MEHTODWN ADDTICKET
            d1.addTicket(t1,tr1);
            d2.addTicket(t2,tr1);
            //XRHSH METHODWN FINALIZE
            d1.finalize();
            d2.finalize();
            d3.finalize();
    }
    
}

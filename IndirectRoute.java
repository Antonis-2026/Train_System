//TSIGGERHS ANTONIS AM: 604-2026

package java_set_c;
//KLASH POY KLHRONOMEI TH ROUTE
public class IndirectRoute extends Route {
    //DHLWSH PEDIWN
    private String middlestop;
     //CONSTRUCTORES XWRIS KAI ME ORISMATA
    public IndirectRoute(){
        super();
        middlestop = "";       
    }
    
    public IndirectRoute(int ID,int a,String d,String arr,String m){
        super(ID,a,d,arr);
        middlestop = m;
    }
    //SYNARTHREIS SET-GET GIA TO PEDIO
    public void setMiddlestop(String m){
        middlestop = m;
    }
    public String getMiddlestop(){
        return middlestop;
    }
    //METHODOS ADDTICKET
    public void addTicket(Ticket t,Train t1){
        super.addTicket(t, t1);
      
    }
    //METHODOS FINALIZE
    public void finalize(){
        super.finalize();
    }
    
    //OVERRIDE THS TO STRING 
    public String toString(){
        return super.toString()+"\nMiddle stop: "+middlestop;
    }
    
}

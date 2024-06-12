//TSIGGERHS ANTONIS AM: 604-2026

package java_set_c;

import java.util.Scanner;

public class Train {
    //DHLWSH PEDIWN
    private int id;
    private String model;
    private int maxPassenger;
    //CONSTRUCTORES XWRIS KAI ME ORISMATA
    public Train(){
        id= 0;
        model="";
        maxPassenger=0;
    }
    
    public Train (int i,String m,int p){
        id = i;
        model=m;
        maxPassenger=p;
    }
    //METHODOI SET GET GIA OLA TA PEDIA 
    public void setId(int ID){
        id = ID;
    }
    public void setModel(String m){
        model = m;
    }
    public void setMaxPassenger(int p){
        maxPassenger = p;
    }
    public int getId(){
        return id ;
    }
    public String getModel(){
        return model;
    }
    public int getMaxPassenger(){
        return maxPassenger;
    }
    //METHODOS READ POU DIAVAZEI TA DEDEOMENA APO TO PLHKTROLOGIO KAI XEIRIZETAI EXCEPTION
    public void read(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give train id: ");
        id = input.nextInt();
        System.out.println("Give train model: ");
        model = input.nextLine();
        System.out.println("Give train max passengers: ");
        maxPassenger = input.nextInt();
              
    }
    //OVERRIDE THS TOSTRING 
    public String toString(){
        return "Train ID: "+id+"\nModel: "+model+
                "\nMax passengers: "+maxPassenger;
    }
    
    
}

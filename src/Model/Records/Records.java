package Model.Records;

public class Records {


    int steps;
    int sleephrs;
    int hydration;
    boolean meditation;


    public void setsteps(int steps) {
        this.steps = steps;
    }

    public void setsleephrs(int sleephrs) {
        this.sleephrs = sleephrs;
    }

    public void sethydration(int hydration) {
        this.hydration = hydration;
    }

    public void setmeditation(boolean meditation) { 
        this.meditation = meditation;
    }
   
    public int getsteps() {
        return steps;
    }

    public int getsleephrs() {
        return sleephrs;
    }

    public int gethydration() {
        return hydration;
    }

    public boolean getmeditation() {
        return meditation;
    }
    public void display()
    {
        System.out.println("Client stepsstatus: "+getsteps());
        System.out.println("Client sleephrs status: "+getsleephrs());
        System.out.println("Client hydraion status: "+gethydration());
        System.out.println("Client meditation status: "+getmeditation()); 
    }

}

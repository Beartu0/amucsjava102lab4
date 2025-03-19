public class message {
    private String text;
    private double cost;
    private static int count;

    public message(){
        this.text="NOMESSAGE";
        this.cost=1;
        count++;
    }
    public message(String txt, double cos){
        this.text=txt;
        this.cost=cos;
        count++;
    }
    public message (message other){
        this.cost=other.cost;
        this.text=other.text;
        count++;
    }
    public String toString(){
        String h= this.text;
        double r=this.cost;
        return("text:"+h+"cost:"+r);
    }
    public boolean equals(message other){        
        return (this.text.equals(other.text) && this.cost==other.cost);
    }
    public void append(message other){
        double c=this.cost; 
        double c2=other.cost;
        String t=this.text;
        String t2= other.text;
        double cf=c+c2;
        String text=(t+t2);
        message messageappend =new message(text,cf);

    }
    public void getNumberOfMessages(){
        System.out.println("number of messages : "+count);
    }
}

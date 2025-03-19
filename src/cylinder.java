public class cylinder {
    private double radius;
    private double height;
    private static int count;

    public cylinder(){
        this.radius=1.0;
        this.height=1.0;
        count++;
    }
    public cylinder(double rad, double heig){
        this.radius=rad;
        this.height=heig;
        count++;
    }
    public cylinder(cylinder other){
        this.radius=other.radius;
        this.height=other.height;
        count++;
    }
    public String toString(cylinder other){
        double h= other.radius;
        double r=other.height;
        return("radius:"+r+"height:"+h);
    }
    public boolean equals(cylinder other){
        return (this.radius==other.radius && this.height==other.height);
    }
    public void setRadius(int rad){
        this.radius=rad;
    }
    public void setHeight(int heig){
        this.height=heig;
    }
    public void getHeight(){
        System.out.println("height:"+this.height);
    }
    public void getRadius(){
        System.out.println("Radius:"+this.radius);
    }
    public void getNumberOfCylinders(){
        System.out.println("number of cylinders is: "+count);
    }
    public void volume(){
        double tmpvol= 3.14*this.radius*this.radius*this.height;
        System.out.println("volume is"+tmpvol);
    }
    public void surface(){
        double tmpsur=2*3.14*(this.radius+this.height);
        System.out.println("surface is"+tmpsur);
    }



}


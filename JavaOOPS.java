public class JavaOOPS {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("red");
        System.out.println("newcolor :"+p1.color);
        p1.setTip(5);
         
    }
} 

class Pen{
    public String color;
    private int tip;
    void setColor(String newColr){
        color=newColr;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
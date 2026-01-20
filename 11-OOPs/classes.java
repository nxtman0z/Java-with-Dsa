public class classes{
    public static void main(String[] args) {
        Pen p = new Pen();//created a pen object called p
        p.setColor("Blue");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
        p.color = "yellow";
        System.out.println(p.color);
        

    }
}

class Pen{
    //properties + functions
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
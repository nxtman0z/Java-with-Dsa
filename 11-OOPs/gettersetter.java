public class gettersetter {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());
        p.setColor("yellow");
        System.out.println(p.getColor());
        
    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this .color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

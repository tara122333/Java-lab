import javax.sound.midi.SysexMessage;

class Box{
    private double width;
    private double height;
    private double depth;

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = len;
        height = len;
        depth = len;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight(BoxWeight obj){
        super(obj);
        weight = obj.weight;
    }
}

public class Exp7B {
    public static void main(String arg[]){
        BoxWeight mybox1 = new BoxWeight(10,20,15,20.5);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.5);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mybox4 = new BoxWeight(3,5);
        BoxWeight mybox = new BoxWeight(mybox1);
        double var = mybox1.volume();
        System.out.println("Volume is : "+var);
        System.out.println("weight is : "+mybox1.weight);

    }
}

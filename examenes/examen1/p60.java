package examen1;

class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}
 
class OTG extends PenDrive {
    String type;
    String make; 
    OTG(int capacity, String type) {
        super(capacity);
        this.type=type;
    }
    OTG(String make) {
       super(0);
       this.make = make;
    }
}
 
public class p60 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
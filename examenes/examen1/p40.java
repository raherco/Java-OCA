package examen1;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
        System.out.println("pasa por aqui");
    }
}
 
public class p40 {
    public static void main(String[] args) {
        Object [] arr = new Object[4];
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1: 
                    arr[i] = new String("Java");
                    break;
                case 2: 
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3: 
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(obj);
        }
    }
}

import java.util.*;

public class Mainnn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Cylinder> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String mau = sc.next();
            double banKinh = sc.nextDouble();
            double chieuCao = sc.nextDouble();
            Cylinder c = new Cylinder(chieuCao, banKinh, mau);
            arr.add(c);
        }
        Collections.sort(arr, new Comparator<Cylinder>() {
            @Override
            public int compare(Cylinder t, Cylinder t1) {
                if (t.getVolume() != t1.getVolume()) {
                    if (t.getVolume() > t1.getVolume()) 
                        return -1;
                    
                    return 1;

                } 
                    return t.getColor().compareTo(t1.getColor());
                

            }
        });
        for(Cylinder x : arr){
            System.out.print(x);
        }
    }
}

import com.sun.jdi.IntegerValue;

public class Multiples {
    public static void main(String[] args) {
        int multiples_so_far = 0;
        int i = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples_so_far += 1;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println(multiples_so_far);;
    }
}

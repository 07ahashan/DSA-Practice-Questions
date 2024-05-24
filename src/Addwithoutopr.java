
public class Addwithoutopr {
    public static void main(String[] args) {

        System.out.println(addnumber(8, 10));
    }

    static int addnumber(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            // Carry now contains common set bits of 'a' and 'b'
            int carry = a & b;

            // Sum of bits of 'a' and 'b' where at least one of the bits is not set
            a = a ^ b;

            // Carry is shifted by one so that adding it to 'a' gives the required sum
            b = carry << 1;

            return addnumber(a, b);
        }


    }

    static int Addusingloop(int a, int b) {
        while (b != 0) {
            int carry = a & b;

            a = a ^ b;

            b = carry << 1;
        }
    return a;
    }

}

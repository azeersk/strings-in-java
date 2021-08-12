import java.util.Scanner;
import static java.lang.Math.*;
public class constat {
    public static void main(String[] args) {
        Scanner intobj = new Scanner(System.in);
        System.out.println("ma\tam\bdkj\"hk\bf\"hj\rjhgjhcg\nx");
        var a = 23;
        var b = "djnkc";
        var c = 2.344;
        var d = 12;

        System.out.println(addExact(a,d));
        System.out.println(a+b+c);
        System.out.println(incrementExact(a)+"inc");
        System.out.println(negateExact(a)+"ne");
        StringBuilder str1 = new StringBuilder("azeer");
        StringBuilder str2 = str1;
        String ss = "  azeee";
        System.out.println(str1.append(ss));
        str1 = str1.append("azeer ");

        System.out.println(str1);
        int az = str1.length();
        String s = "";
        for(int i = 1; i<=az;i++){
            s += str1.charAt(az-i);
            System.out.println("* ".repeat(az-i));
        }
        System.out.println(s);
        System.out.println(str1);

        System.out.println((str1).append(str2));
    }
}

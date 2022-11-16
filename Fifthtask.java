//Differentiate String == operator and equals() method

public class Fifthtask {
    public static void main(String[] args) {
        String s1 = "Datasirpi";
        String s2 = "datasirpi";
        String s3 =  new String("Datasirpi");
        String s4 =  new String("Datasirpi");



        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
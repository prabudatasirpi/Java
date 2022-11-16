
// Concatenate Two Arrays

public class Firsttask {
    public static void main(String []args) {
        String[] MyName = {"Prabu", "Ram", "Mohamad"};
        String[] FatherName = {"kannappan", "vasudevan", "Ismail"};
        String[] FullName = new String[MyName.length + FatherName.length];
        System.arraycopy(MyName, 0, FullName, 0, MyName.length);
        System.arraycopy(FatherName, 0, FullName, MyName.length, FatherName.length);
        for (String i : FullName) {
            System.out.println(i);
        }
    }
}


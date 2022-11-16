public class Thirdtask {
    public static void main(String[] args) {

        String[] myArray = {"Prabu", "Ram", "Sidhik", "Muthu"};
        String toFind = "Naveen";
        boolean found = false;
        for (int i = 0; i< myArray.length; i++){
            if (myArray[i]==toFind){
                found=true;
            }
        }
        System.out.println(found);
    }
}

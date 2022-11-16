public class Lasttask {
    public static boolean isStringNumeric(String number)
    {
        boolean isNumeric;
        if(number == null)
            isNumeric = false;
        else
        {
            try
            {
                Double num = Double.parseDouble(number);
                isNumeric = true;
            }
            catch(NumberFormatException e)
            {
                isNumeric = false;
            }
        }
        return isNumeric;
    }
    public static void main(String[] args)
    {
        String num1 = "1001";
        String num2 = "-101";
        String num3 = "1a10";
        String num4 = null;

        System.out.println( isStringNumeric(num1));
        System.out.println( isStringNumeric(num2));
        System.out.println(isStringNumeric(num3));
        System.out.println(isStringNumeric(num4));
    }
}


package mini;

public class Calculator {

    public int calculate(String arg){
        if(arg.length() == 0)
        {
            return 0;
        }

        if(arg.contains(",") || arg.contains("\n")) {
            int sum = 0;
            String[] numbers = new String[2];
            arg.replaceAll("\\D", ",");
            while (arg.contains(",")) {
                numbers = arg.split(",");
                sum += Integer.parseInt(numbers[0]);
            }
            return sum += Integer.parseInt(numbers[1]);
        }

        return Integer.parseInt(arg);
    }
}

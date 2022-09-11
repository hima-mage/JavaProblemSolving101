package  PackageA;

class  ConvertStringToInteger {
    public static  int convertStringToInteger(String input) {

        if (input == null || input.trim().length() == 0) {
            return 0;
        }

        input = input.trim();
        // flag to trace if the number is positive or not
        Boolean isPositive = Boolean.TRUE;
        int i = 0;

        if(input.charAt(0) == '-'){
            isPositive = Boolean.FALSE;
        }
        if(input.charAt(0) == '+'){
            isPositive = Boolean.TRUE;
            i++;
        }

        double result = 0;

        while (input.length() > i && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
            result = result*10 + input.charAt(i) - '0';
            i++;
        }

        if (!isPositive) {
            result = -result;
        }

        if (result >= Integer.MAX_VALUE){
            return  Integer.MAX_VALUE;
        }

        if (result <= Integer.MIN_VALUE) {
            return  Integer.MIN_VALUE;
        }

        return (int) result;

    }

    public static void main(String[] args) {
        System.out.println(convertStringToInteger("1016"));
    }
}
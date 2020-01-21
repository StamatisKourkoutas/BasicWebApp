package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("stamatis")) {
            return "You are Stamatios Kourkoutas, the famous SE!!";
        }

        if (query.toLowerCase().contains("plus") && query.toLowerCase().contains("what is")){

            String result = query.substring(8, query.length());
            String[] nums = result.split(" plus ");
            int num0 = Integer.parseInt(nums[0]);
            int num1 = Integer.parseInt(nums[1]);
            return String.valueOf(num0+num1);

        }

        if (query.toLowerCase().contains("city") && query.toLowerCase().contains("eiffel tower")) {
            return "Paris";
        }

        if (query.toLowerCase().contains("largest")) {
            String[] temp = query.toLowerCase().split(":");

            String[] nums = temp[1].split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[0]);
            System.out.println(num1);
            String x = "";
            if(num1>num2){
                x = Integer.toString(num1);
            }
            else if(num2>num1){
                x = Integer.toString(num2);
            }
            return x;
        }
        if (query.toLowerCase().contains("cube") && query.toLowerCase().contains("square")) {
            String[] result = query.split(":");
            String numStr = result[1];
            String[] numbers = numStr.split(",");
            for(int i = 0; i < numbers.length; i++) {
                double number = Double.parseDouble(numbers[i]);
                double sqrt_num = Math.sqrt(number);
                double cbrt_num = Math.cbrt(number);
                int sqrt = (int) sqrt_num;
                int cbrt = (int) cbrt_num;
                if ((sqrt_num - sqrt != 0) && (cbrt_num - cbrt != 0)) {
                    return (i+1) + "";
                }
            }
            return "";
        }
        return "";
    }
}

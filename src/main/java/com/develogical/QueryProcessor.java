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
            return (num0+num1)+"";

        }
        
        return "";


    }
}

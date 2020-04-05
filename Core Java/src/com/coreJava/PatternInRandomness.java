package com.Trading;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PatternInRandomness {
    public static Map<String, String> seqList = new LinkedHashMap<String,String>();

    private static SecureRandom random = new SecureRandom();
    private static final String DATA_FOR_RANDOM_STRING = "WLW";

    public static void main(String[] args) {
        initSeqMap();
        System.out.println("String : " + DATA_FOR_RANDOM_STRING);
        generateRandomString(100);
//        System.out.println("Result : " + generateRandomString(10000000));
        System.out.println("\n");
    }

    public static String generateRandomString(int length) {
        if (length < 1) throw new IllegalArgumentException();
        int winners = 0;
        int losers =0;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
         if (rndChar == 'W')
            winners++;
         else
             losers++;
         sb.append(rndChar);
        }
        System.out.println("Number of Winners : "+winners);
        System.out.println("Number of Losers : "+losers);
 //       patternMonitor(sb);
        seqList.forEach((k,v) -> {
            occurenceChecker(sb.toString(),v,k);
        });
        return sb.toString();
    }
    private static void patternMonitor(StringBuilder sb){
        int longestNumberOfWinnersInSequence = 0;
        int longestNumberOfLosersInSequence = 0;

        CharSequence seq = "WWWWWWWWWWWWWWWWWWWWWWWWW";
        boolean bool = sb.toString().contains(seq);
        System.out.println("Found 25 Winners ?: " + bool);
    }

    private static void occurenceChecker(String str, String pattern, String seq){
        int count = 0, fromIndex = 0;
        while ((fromIndex = str.indexOf(pattern, fromIndex)) != -1 ){
//            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
        }
        System.out.println(seq +" : " + count);
    }
    private static void initSeqMap(){
        seqList.put("ONE_WINNERS_INSEQUENCE","W");
        seqList.put("TWO_WINNERS_INSEQUENCE","WW");
        seqList.put("THREE_WINNERS_INSEQUENCE","WWW");
        seqList.put("FOUR_WINNERS_INSEQUENCE","WWWW");
        seqList.put("FIVE_WINNERS_INSEQUENCE","WWWWW");
        seqList.put("SIX_WINNERS_INSEQUENCE","WWWWWW");
        seqList.put("SEVEN_WINNERS_INSEQUENCE","WWWWWWW");
        seqList.put("EIGHT_WINNERS_INSEQUENCE","WWWWWWWW");
        seqList.put("NINE_WINNERS_INSEQUENCE","WWWWWWWWW");
        seqList.put("TEN_WINNERS_INSEQUENCE","WWWWWWWWWW");
        seqList.put("ELEVEN_WINNERS_INSEQUENCE","WWWWWWWWWWW");
        seqList.put("TWELVE_WINNERS_INSEQUENCE","WWWWWWWWWWWW");
        seqList.put("THIRTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWW");
        seqList.put("FOURTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWW");
        seqList.put("FIFTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWW");
        seqList.put("SIXTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWW");
        seqList.put("SEVENTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWW");
        seqList.put("EIGHTEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWW");
        seqList.put("NINETEEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTY_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYONE_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYTWO_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYTHREE_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYFOUR_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYFIVE_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYSIX_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYSEVEN_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYEIGHT_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("TWENTYNINE_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        seqList.put("THIRTY_WINNERS_INSEQUENCE","WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        seqList.put("ONE_LOSERS_INSEQUENCE","L");
        seqList.put("TWO_LOSERS_INSEQUENCE","LL");
        seqList.put("THREE_LOSERS_INSEQUENCE","LLL");
        seqList.put("FOUR_LOSERS_INSEQUENCE","LLLL");
        seqList.put("FIVE_LOSERS_INSEQUENCE","LLLLL");
        seqList.put("SIX_LOSERS_INSEQUENCE","LLLLLL");
        seqList.put("SEVEN_LOSERS_INSEQUENCE","LLLLLLL");
        seqList.put("EIGHT_LOSERS_INSEQUENCE","LLLLLLLL");
        seqList.put("NINE_LOSERS_INSEQUENCE","LLLLLLLLL");
        seqList.put("TEN_LOSERS_INSEQUENCE","LLLLLLLLLL");
        seqList.put("ELEVEN_LOSERS_INSEQUENCE","LLLLLLLLLLL");
        seqList.put("TWELVE_LOSERS_INSEQUENCE","LLLLLLLLLLLL");
        seqList.put("THIRTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLL");
        seqList.put("FOURTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLL");
        seqList.put("FIFTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLL");
        seqList.put("SIXTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLL");
        seqList.put("SEVENTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLL");
        seqList.put("EIGHTEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLL");
        seqList.put("NINETEEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTY_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYONE_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYTWO_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYTHREE_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYFOUR_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYFIVE_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYSIX_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYSEVEN_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYEIGHT_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("TWENTYNINE_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        seqList.put("THIRTY_LOSERS_INSEQUENCE","LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
    }
}

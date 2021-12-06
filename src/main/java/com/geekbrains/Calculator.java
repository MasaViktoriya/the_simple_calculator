package com.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public String calculate(String parsingString) {
        parsingString = parsingString.replaceAll("x", "*");
        parsingString = parsingString.replaceAll(" =", "");
        if (parsingString.startsWith(" + ") || parsingString.startsWith(" – ") || parsingString.startsWith(" * ") || parsingString.startsWith(" / ")) {
            parsingString = parsingString.substring(3);
        } else if (parsingString.startsWith(".")) {
            parsingString = parsingString.substring(1);
        }
        if (parsingString.endsWith(" + ") || parsingString.endsWith(" – ") || parsingString.endsWith(" * ") || parsingString.endsWith(" / ")) {
            parsingString = parsingString.substring(0, parsingString.length() - 3);
        } else if (parsingString.endsWith(".") || parsingString.endsWith("-")) {
            parsingString = parsingString.substring(0, parsingString.length() - 1);
        }
        String[] parsedString = parsingString.split(" ");
        for (String op : parsedString) {
            System.out.println(op);
        }

            int i = 1;
            while (i < parsedString.length){
                if (parsedString[i].equals("*") || (parsedString[i].equals("/"))) {
                    if (parsedString[i].equals("*")) {
                        double tempResult = (Double.parseDouble(parsedString[i - 1]) * Double.parseDouble(parsedString[i + 1]));
                        parsedString[i - 1] = (String.valueOf(tempResult));
                        List<String> tempList = new ArrayList<>(Arrays.asList(parsedString));
                        tempList.remove(i);
                        tempList.remove(i);
                        parsedString = tempList.toArray(new String[0]);
                        System.out.println(Arrays.toString(parsedString));
                    } else {
                        if (parsedString[i + 1].equals("0")) {
                            return "Деление на ноль запрещено";
                        } else {
                            double tempResult = (Double.parseDouble(parsedString[i - 1]) / Double.parseDouble(parsedString[i + 1]));
                            parsedString[i - 1] = (String.valueOf(tempResult));
                            List<String> tempList = new ArrayList<>(Arrays.asList(parsedString));
                            tempList.remove(i);
                            tempList.remove(i);
                            parsedString = tempList.toArray(new String[0]);
                            System.out.println(Arrays.toString(parsedString));
                        }
                    }
                } else i++;
            }

            int j = 1;
            while (j < parsedString.length){
                if (parsedString[j].equals("+") || (parsedString[j].equals("–"))) {
                    if (parsedString[j].equals("+")) {
                        double tempResult = (Double.parseDouble(parsedString[j - 1]) + Double.parseDouble(parsedString[j + 1]));
                        parsedString[j - 1] = (String.valueOf(tempResult));
                        List<String> tempList = new ArrayList<>(Arrays.asList(parsedString));
                        tempList.remove(j);
                        tempList.remove(j);
                        parsedString = tempList.toArray(new String[0]);
                        System.out.println(Arrays.toString(parsedString));
                    } else {
                        double tempResult = (Double.parseDouble(parsedString[j - 1]) - Double.parseDouble(parsedString[j + 1]));
                        parsedString[j - 1] = (String.valueOf(tempResult));
                        List<String> tempList = new ArrayList<>(Arrays.asList(parsedString));
                        tempList.remove(j);
                        tempList.remove(j);
                        parsedString = tempList.toArray(new String[0]);
                        System.out.println(Arrays.toString(parsedString));
                    }
                } else j++;
        }

        return parsedString[0];

    }
}

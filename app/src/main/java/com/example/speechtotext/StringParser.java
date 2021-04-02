package com.example.speechtotext;

import android.widget.Toast;

import java.io.Console;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    private ArrayList<String> strList;

    public StringParser(ArrayList<String> strList) {
        this.strList = strList;
    }

    private void parse() {
        Pattern pricePattern = Pattern.compile("\\b\\d+(\\.\\d+\\{1,2})\\?");
        Pattern keywordPattern = Pattern.compile("^\\w ");

        for (String s: strList) {
            System.out.print(s);
        }
    }
}

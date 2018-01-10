package com.shoppinglist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    private int i = 1;

    public void createFile(ArrayList<String> shoppinglist) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("shoppinglist.txt"));
        for (String line : shoppinglist) {
            bufferedWriter.write(i + "  " + line + "\n");
            i++;
        }
        bufferedWriter.close();
    }
}


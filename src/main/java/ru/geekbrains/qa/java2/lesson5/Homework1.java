package ru.geekbrains.qa.java2.lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework1 {
    public static void main(String[] args) {
        AppData appData = new AppData();
        readCsvFile(appData, "example.csv");
        System.out.println(appData);
        writeCsvFile(appData, "new-file.csv");
    }

    private static void writeCsvFile(AppData appData, String path) {
        try (PrintWriter out = new PrintWriter(path)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < appData.getHeader().length; i++) {
                sb.append(appData.getHeader()[i]);
                if (i != appData.getHeader().length - 1) {
                    sb.append(";");
                }
            }
            sb.append('\n');
            for (int i = 0; i < appData.getData().length; i++) {
                for (int j = 0; j < appData.getData().length; j++) {
                    sb.append(appData.getData()[i][j]);
                    if (j != appData.getHeader().length - 1) {
                        sb.append(";");
                    }
                }
                sb.append('\n');
            }
            out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readCsvFile(AppData appData, String path) {
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String[] headlines = in.readLine().split(";");
            appData.setHeader(headlines);
            appData.setData(new int[(int) Files.lines(Paths.get(path)).count() - 1][headlines.length]);
            String result;
            int i = 0;
            while ((result = in.readLine()) != null) {
                String[] tokens = result.split(";");
                for (int j = 0; j < tokens.length; j++) {
                    appData.addData(Integer.parseInt(tokens[j]), i, j);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

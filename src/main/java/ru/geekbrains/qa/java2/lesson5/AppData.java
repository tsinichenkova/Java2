package ru.geekbrains.qa.java2.lesson5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void addData(int value, int i, int j) {
        this.data[i][j] = value;
    }

    @Override
    public String toString() {
        return "AppData:" +
                "\nheader=" + Arrays.toString(header) +
                "\ndata=" +Arrays.deepToString(data);
    }
}

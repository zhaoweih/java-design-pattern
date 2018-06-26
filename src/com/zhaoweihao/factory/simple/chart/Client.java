package com.zhaoweihao.factory.simple.chart;

public class Client {
    public static void main(String args[]) {
        Chart chart;
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}

package com.zhaoweihao.factory.simple.chart;

interface Chart {
    public void display();
}

class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建线状图");
    }

    @Override
    public void display() {
        System.out.println("显示线状图");
    }
}

class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");

    }
}

class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}

class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String arg) {
        Chart chart = null;
        if (arg.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置线状图");
        }

        if (arg.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        }

        if (arg.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }

        return chart;
    }
}

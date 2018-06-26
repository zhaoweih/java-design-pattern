package com.zhaoweihao.adapter;

public class Client {
    public static void main(String[] args) {
        ScoreOperation operation; //针对抽象目标接口编程
        operation = (ScoreOperation) XMLUtil.getBean(); //读取配置文件，反射生成对象

        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int result[];
        int score;

        System.out.println("成绩排序结果");
        result = operation.sort(scores);

        for (int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找90分");
        score = operation.search(result, 90);
        System.out.println( score != -1 ? "找到成绩90分的" : "没有找到成绩90的");

        System.out.println("查找92分");
        score = operation.search(result, 92);
        System.out.println( score != -1 ? "找到成绩92分的" : "没有找到成绩92的");
    }
}

package com.github.hcsp.controlflow;


import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end 区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        List<String> list= new ArrayList<>();//先定义一个列表用于存放start至end之间的奇数。
        for (int j = start;j <=end; j++) {
            if ((j&1)==1) {
                list.add(String.valueOf(j));//将Int类型的数据转换为String类型。
            }//将范围内的全部奇数存放至列表中
        }
        System.out.println(String.join(",",list));

    }//将范围内的全部奇数打印出来



    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}

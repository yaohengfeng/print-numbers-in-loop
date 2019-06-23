package com.github.hcsp.controlflow;

import java.util.ArrayList;
import java.util.Arrays;
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
        String result = "";
        for (int i = start; i <= end; i++) {
            if(Math.abs(i) % 2 == 1){
                result = result + (i + ",");
            }
        }
        System.out.println(result.substring(0, result.lastIndexOf(',')));

    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-20, 2);
    }
}

package com.github.hcsp.controlflow;

import java.util.ArrayList;

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
        int add = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(start%2==0){
            add = 1;
        }
        for(int i = start + add ; i <= end;  i+=2 ){
            list.add(i);
        }

        for(Integer number : list){
            System.out.print(number + ",");
        }
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}

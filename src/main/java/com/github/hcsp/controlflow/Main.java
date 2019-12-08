package com.github.hcsp.controlflow;

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
        String str = "";
        while (start <= end) {
            if (start % 2 ==0) {
                start += 1;
                if(start <= end) {
                    continue;
                }else {
                    str = "  ";
                }
            }else {
                //奇数+2还是奇数
                str += String.valueOf(start) + ",";
                start += 2;
                if (start <= end ) {
                    continue;
                }else {
                    break;
                }
            }
        }
        System.out.println(str.substring(0,str.length()-1).trim());
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}

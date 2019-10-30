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
        StringBuffer oddNumbers = new StringBuffer();
        for ( int i = start ; i<= end ; i++){
            if ( i%2 != 0 )
                oddNumbers.append(i).append(",");
        }
        if (oddNumbers.length() > 1){
            if (oddNumbers.charAt(oddNumbers.length()-1) == ',') {
                oddNumbers.deleteCharAt(oddNumbers.length()-1);
            }
            System.out.println(oddNumbers);
        }

    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}

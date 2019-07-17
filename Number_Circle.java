//package com.yuantu.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt()) ;
        }
        Collections.sort(arr);

        if( arr.get(n-1)>=arr.get(n-2)+arr.get(n-3)){
            System.out.println("NO");
        }else{//调换最后三个数字的顺序即可
            System.out.println("YES");
            System.out.print( arr.get(n-3)+" "+arr.get(n-1)+" "+arr.get(n-2)+" ");
            for(int i=n-4;i>=0;i--){
                System.out.print( arr.get(i) + " ");
            }
        }

    }
}
/*
* 分析，规则是环上任意一个数左右两边的数之和大于中间的数。
* 如果进行排序，
* 排序以后，从大到小，那么除了首尾两个数以外
* 中间的任何数都已经满足要求了！这是排序的意义。
* 那么接下来要判断的则是尾部几个数之间的关系
* 如果最后一个数太大，与第二三名相差得太远， 1 >>2,3，那么无论如何调整都不可能满足规则了。
* 如果相差得不大，第二三名的和刚好大于第一名的值，那么还可以考虑调整位置，也就是调整最后三个元素
* 调整最后三个元素的顺序，1，2，3 分别改变位置， 3，1，2 ，调整元素之后，
* 第三大的数3在对接最小数的时候就有第一大的元素支持，无论最小元素是多少，
* 最小元素和第一大数加起来都大于第三大数，这样就可以构成一个完美环了。
*
* */
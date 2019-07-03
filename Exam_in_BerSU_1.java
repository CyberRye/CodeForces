//package com.yuantu.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_in_BerSU_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
//		ArrayList<Integer> temp_arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int M = sc.nextInt();
		int [] input_array = new int[n];
		int temp_int;
		for(int i=0;i<n;i++) {//用数组把输入的数字存储起来
			temp_int = sc.nextInt();
			input_array[i] = temp_int;
//			System.out.println(input_array[i]);
		}
		arrayList.add(input_array[0]);
		ans.add(0);
		for(int i=1;i<n;i++) {
			int count =0;
			ArrayList<Integer> temp_arr = new ArrayList<Integer>();
//			temp_arr = arrayList;//这个写法是错误的
			for(int j=0;j<arrayList.size();j++){
				temp_arr.add(arrayList.get(j));
			}
			temp_arr.sort(null);
			while((Sum(temp_arr)+input_array[i])>M) {
				count++;
				temp_arr.remove(temp_arr.size()-1);
			}
			ans.add(count);
			arrayList.add(input_array[i]);
//			System.out.print("arrayList: ");
//			for(int j=0;j<arrayList.size();j++) {
//				System.out.printf(arrayList.get(j)+"\t");
//			}
//			System.out.print("\n");
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));

		}
	}
	public static int Sum(ArrayList<Integer> temp_arr) {
		int sum = 0;
		for(int i=0;i<temp_arr.size();i++) {//计算临时数组的总和
			sum+=temp_arr.get(i);
//			System.out.printf(temp_arr.get(i)+"\t");
		}
//		System.out.println(sum);
		return sum;
	}
}

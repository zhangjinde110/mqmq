package com.zjd.jimao.controller;


import com.zjd.jimao.entity.ListNode;
import javafx.beans.binding.StringBinding;

import java.lang.reflect.Array;
import java.util.*;

public class ProblemController {

//示例 1：
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//



    public static void main(String[] args){

//        int [] nums = new int[]{1,2,4};
//        int ta = 6;
//        int[] ints = twoSum(nums, ta);
//
//        System.out.println(Arrays.toString(ints));
//
//
//
//        String s = "abcaa";
//        int i = lengthOfLongestSubstring(s);
//        System.out.println(i);




    }




//    public static int[] twoSum(int[] nums, int target) {
//
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i+1; j <nums.length ; j++) {
//
//                if (nums[i]+nums[j] == target){
//
//                    return  new int[]{i,j};
//                }
//            }
//        }
//        return null;
//
//    }



//    public static int[] twoSum(int[] nums, int target) {
//
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i+1; j <nums.length ; j++) {
//
//                if (nums[i]+nums[j] == target){
//
//                    return  new int[]{i,j};
//                }
//            }
//        }
//        return null;
//
//    }



    public static int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])){

                return  new int[]{i,map.get(target-nums[i])};
            }
            else {

                map.put(nums[i],i);

            }


        }

        return null;


    }





//    public static int lengthOfLongestSubstring(String s) {
//
////         String s = "abcaa";
//
//        StringBuilder ss = null ;
//        for (int i = 0; i < s.length(); i++) {
//
//            for (int j = s.length(); j >0; j--) {
//
//
//                String substring = s.substring(i, j);
//
//
//
//            }
//
//
//
//        }
//
//    }








}









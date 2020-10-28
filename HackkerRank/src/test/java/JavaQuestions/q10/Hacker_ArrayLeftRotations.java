package JavaQuestions.q10;

import java.util.Arrays;
import java.util.Scanner;


/*
A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array[1,2,3,4,5] ,
then the array would become [3,4,5,1,2] .

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers a.
An integer d, the number of rotations.
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
The second line contains  space-separated integers .

Constraints

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform d=4 left rotations, the array undergoes the following sequence of changes:
[1,2,3,4,5] [2,3,4,5,1] [3,4,5,1,2] [4,5,1,2,3] [5,1,2,3,4] 

*/

public class Hacker_ArrayLeftRotations {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int numbers=scan.nextInt();
        int rotation= scan.nextInt();
        int[] nums=new int[numbers];
        for (int i = 1; i <=numbers ; i++) {
            nums[i-1]=i;
        }
        int rotationLeft=rotation%numbers;
        int[] nums2=new int[numbers];
        for (int i = 0; i <numbers ; i++) {
            if(i-rotationLeft<0){
                nums2[i-rotationLeft+numbers]=nums[i];
            }else{
                nums2[i-rotationLeft]=nums[i];
            }

        }

        System.out.println(Arrays.toString(nums2));



    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author hp
 */
import java.util.Arrays;
public class MergeSortArray {
    public static void main(String args[]){
        int nums1[]={1,2,3};
        int nums2[]={2,5,6};
        int i=0;
        int j=0;
        int k=0;
        int len=nums1.length+nums2.length;
        int nums3[]=new int[len];
        while(k<len)
        {
           if(i<nums1.length && j<nums2.length)
           {
            if(nums1[i]< nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
                k++;  
            }
            else
            {
                nums3[k]=nums2[j];
                k++;
                j++;
            }
           }
           else if(i==nums1.length)
           {
               nums3[k]=nums2[j];
               k++;
               j++;
           }
           else if(j==nums2.length)
           {
               nums3[k]=nums1[i];
               k++;
               i++;
           }
           
           
        }
        for(int p=0;p<len;p++)
        {
         System.out.print(nums3[p]+" ");   
        }
   
    }
}

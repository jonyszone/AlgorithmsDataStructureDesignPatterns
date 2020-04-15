/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsinjava;

/**
 *
 * @author User
 */
public class CountingSort {
    public static void main(String[] args) {
        int [] intArray = {2,4,5,6,1,8,7,3};
        
        countingSort(intArray,1,8);
        
        
        for(int i =0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    
    public static void countingSort(int [] input,int min,int max){
        
        
        int [] countArray = new int [(max-min)+1];
        
        for(int i =0; i< input.length; i++){
            countArray[input[i] - min]++;
            
        }
        
        int j = 0;
        for (int i = min; i <= max; i++) {
            while(countArray[i - min] > 0){
                input [j++] = i;
                countArray[i - min] --;
            }
        }
    }
    
}

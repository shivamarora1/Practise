/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import java.util.Scanner;

/**
 *
 * @author Shivam
 */
public class BinarySwap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String inputA=s.nextLine();
        String inputB=s.nextLine();
        System.out.print(getNumberOfSwaps(inputA,inputB));
    }

    public static int getNumberOfSwaps(String inputA, String inputB) {
        int numberOfSwap=-1;
        int numberOfZero=0;
        int numberOfOne=0;
        int sizeA=inputA.length();
        int sizeB=inputB.length();
        
        char[] inputAArr=inputA.toCharArray();
        char[] inputBArr=inputB.toCharArray();
        
        if(sizeA==sizeB){
            for(int i=0;i<sizeA;i++ ){
                if(inputAArr[i]!=inputBArr[i]){
                    if(inputAArr[i]=='1')
                        numberOfZero++;
                    else
                        numberOfOne++;
                }
            }
            numberOfSwap=((numberOfZero!=numberOfOne)?-1:numberOfOne);
        }
        return numberOfSwap;
    }
}

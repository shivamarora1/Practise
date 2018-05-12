/*public static String whoWins(double h, double x, double z) {
        double ballSpeed=(h/(0.5*32));//Speed at which Raj drop ball from roof;
        double rahulSpeed=x/z;//Rahuls Speed;
        if(rahulSpeed>ballSpeed)
            return "Raj";
        else
            return "Rahul";
    }
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import java.util.Scanner;

/**
 *
 * @author Shivam
 
 *Raj and Rahul have been friends for a long time. They love playing games in their leisure time.

 *Today they are playing Catch and Win. In this game, Raj is standing at the roof of his house. His house is H feet high. Raj is having a cricket ball with him. Rahul, on the other hand, is standing on the streets at a distance X feet from Raj's house. Raj drops the ball vertically down from his roof and Rahul would run towards Raj's house and try to catch it. Rahul runs at a speed of Z feet per second. If Rahul is able to catch the ball before or at the moment the ball hits the ground he wins else Raj wins.

 *Given H, X and Z determine who wins the game.

Note:

Consider acceleration due to gravity to be 32 feet per second squared.

Input: 

First line contains T denoting the number of test cases. Each test case then contains 3 integers namely H, X and Z respectively.

Output:

For each test case output whether Raj wins or Rahul.

SAMPLE INPUT 
2
5 4 2
16 6 6

SAMPLE OUTPUT 
Raj
Rahul
* */
public class Practise1 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int testCase=s.nextInt();
    double h;//Raj's heigth from ground;
    double x;//Rahul distance from Raj's house;
    double z;//Rahul's speed per second;
    
while(testCase--!=0){    
        h = s.nextFloat();
        x = s.nextFloat();
        z = s.nextFloat();
        System.out.println(whoWins(h,x,z));
        }
    }

    public static String whoWins(double h, double x, double z) {
        double ballSpeed=(h/(0.5*32));//Speed at which Raj drop ball from roof;
        double rahulSpeed=x/z;//Rahuls Speed;
        if(rahulSpeed>ballSpeed)
            return "Raj";
        else
            return "Rahul";
    }
    
}

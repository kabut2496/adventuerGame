/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adventure;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class Adventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        String name,ans;
        
        System.out.println("you have just emparked on a jurney that will change your life but to start you quest pleas enter your name.");
        name=keyInput.next();
        System.out.println(name+" do you want to be a wizzard if yes pres A if no press B");
        ans=keyInput.next();
       switch (ans) {
           case ("A"):case("a"):
           System.out.println("you encounter a flying jeraff do you fight or give up press A to fight or B to give up");
           ans=keyInput.next();
           switch(ans){
               case("a"):case("A"):
               System.out.println(" because you chose to be a wizzerd you got cocy and the flying jeraff zaped you with lightning go back to start");
               ans=keyInput.next();
               break;
               case("b"):case("B"):
               System.out.println("the giant girrafe dicided to  zaps you go back to start");
                   ans=keyInput.next();
                   break;
           }
        break;
        case("B"):case("b"):
            System.out.println("you encounter a wepon smith and he says that he has a sowd that you can test do you test the sowd or keep going\npress A to test the sowd press B to Keep going");
        ans = keyInput.next();
            break;
    }
       switch (ans) {
           case("A"): case("a"):
               System.out.println("you rilly like the sowrd do you steel it or buy it with your last bit of gold \npress A to buy the sowrd or B to steel");
               ans = keyInput.next();
               
           break;
               case("B"): case("b"):
                   System.out.println("you try to battle a skinny rinorserus with out a sowrd and die go back to start");
       break;
       }
       
       switch(ans){
           case("A"):case("a"):
               System.out.println("the store owner takes pity on you and gives you the sowd if you buy a bow as well\nPress A to buy both and B for just the sowrd");
               ans = keyInput.next();
               break;
           case ("B"): case("b"):
               System.out.println("you run face first in to a brick wall and then a anvel gets droped on you ");
               break;
       }
       switch(ans){
           case("a"):case("A"):
               System.out.println("it is to much for you to cary and fall of a clif and die go back to start");
               break;
           case ("b"):case("B"):
               System.out.println("good thing becuse you run in to five bandits that want to rob you.Do you give up and give them every thing or try to fight\n press A to give up Press B to try and Fight");
               ans = keyInput.next();
               break;
       }
       switch(ans){
           case("A"):case("a"):
               System.out.println("they are vary suprised by you giving up so they don't take any thing and ask you to goin their gang Press A to goin Press B to respectfully decline");
               ans = keyInput.next();
               break;
           case("B"):case("b"):
               System.out.println("they have no mercey on you and kill you and take evry thing off of you and leve your body un recignizable go back to start");
               break;
       }
       switch (ans){
           case("A"):case("a"):
               System.out.println("you finaly arive at you friend's house after the grate jurney and he says do you want to play video games\nPress A to play Press B to do some thing else");
               ans = keyInput.next();
               break;
           case("B"):case("b"):
               System.out.println("they were just joking and throw you off a cliff go back to start");
               break;
       }
       switch (ans){
            case("A"):case("a"):
                System.out.println("turns out that he is a lying snake and he eates you hole as soon as you start");
                break;
            case("B"):case("b"):
                System.out.println("you desied to box do you start off with a jab or a right hook or give up \nPress A to jab press B to right hook Press C to give up");
                ans = keyInput.next();
                break;
    }
       switch(ans){
           case("A"):case("a"):case("B"):case("b"):
               System.out.println("he turns out to be a cyclops and kills you go back to start");
               break;
           case ("C"): case ("c"):
               System.out.println("good thing he would have killed you Press A to continue");
               ans = keyInput.next();
               break;
       }
       switch(ans){
           case("A"):case("a"):
               System.out.println("you wake up  and it turns out it was all a dreem\nCongradulations you have completed the game");
       }
    }
}


package game;
import java .util.*;
public class Brain_game {
    
    public static void main(String[] args) throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] emoji = new String[5];
        emoji[0]= "$";
        emoji[1] = "*";
        emoji[2] = "&";
        emoji[3] = "%";       
        emoji[4] = "!";
        System.out.println("******* BRAIN GAMES *********");
        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println(" ");
        Brain_game.display(emoji);
             
    }

    private static void display(String[] emoji) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        List<String> list = Arrays.asList(emoji);
    Collections.shuffle(list);
 
    System.out.println("Here's The Sequence");
    list.forEach((str) -> {
       
        System.out.print(str + " ");
        });
    Thread.sleep(4000);
    System.out.println("\b\b\b\b\b");
    System.out.println("");
    System.out.println("--------------------------- ");
    String[] ans = new String[5];
    for(int j=0; j<5; j++){
        ans[j] = s.nextLine();
    }
    
    if(Arrays.equals(emoji, ans)){
        System.out.println(" ");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("You got the right sequence");
    }else{
        System.out.println(" ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Oppss!! Your answer is wrong");
    }
    System.out.println("WANNA TRY ONCE AGAIN ?????");
        System.out.println("(yes/no)");
        String inp = s.nextLine();
        
            if(null==inp){
                System.out.println("Invalid Data..... Exit#");
            }
            else switch (inp) {
            case "yes":
            case "YES":
                Brain_game.display(emoji);
                break;
            case "no":
            case "NO":
                System.out.println("##EXIT##");
                break;
            default:
                System.out.println("Invalid Data..... Exit#");
                break;
        }
        
    }
    
}

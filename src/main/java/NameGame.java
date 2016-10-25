/**
 * Created by rodsouza9 on 10/24/2016.
 */
import java.util.Scanner;
public class NameGame {

    static String[] vowels = {"a", "e", "i", "o", "u", "y"};

    static String getSecondVowel(String[] name){
        for (int i = 1; i < name.length; i++) {
            if (isVowel(name[i]))
                return name[i];
        }
        return null;
    }

    static int getSecondVowelIndex (String[] name){
        for (int i = 1; i < name.length; i++) {
            if (isVowel(name[i]))
                return i;
        }
        return -1;
    }


    static boolean isVowel (String c) {
        for (String i: vowels) {
            if (c.equals(i))
                return true;
        }
        return false;
    }

    static String getLongName (String name) {
        String[] lets = name.toLowerCase().split("");
        if (isVowel(lets[0])) {
            String sndVowl = getSecondVowel(lets);
            int index = getSecondVowelIndex(lets);
            return name.substring(0,index) + sndVowl + sndVowl + sndVowl + name.substring(index+1);
        }
        return name.substring(0,1) + name.substring(0,1) + name.substring(0,1) + name.substring(1);
    }
    static String nameToGame(String name) {
        String x = name;
        String y = name.substring(1);
        return  x + ", " + x + ", bo-b" + y + "\n" +
                "Banana-fana fo-f" + y + "\n" +
                "Fee-fy-mo-m" + y + "\n" +
                getLongName(name);
    }

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lol I cant believe you are playing this game." +
                "\nthis is mostly a program for me to play around with gradle," +
                "\nbut if you want your name in to a game... I gotchu!!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Well hello there, " + name);
        System.out.println("Here is your game name:\n" + nameToGame(name));
    }
}

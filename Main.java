public class Main
{

    public static void main(String[] args)
    {

        String word = "HANNAH";
        String reversedWord = "";

        for (int s = word.length() - 1; s >= 0; s--)
            reversedWord += word.charAt(s);            
        
        System.out.println(word);
        System.out.println(reversedWord);

        if (word.equals(reversedWord)) 
            System.out.println("Wooo! A palindrome!");
        else  
            System.out.println("nope");

    }
}


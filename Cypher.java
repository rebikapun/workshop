

public class Cypher
{
    public static void main(String[] args)
    {
        String inputText = "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG";
        int cypherKey = 10;
        int startOffset = (int) 'A';

        for (int i = 0; i < inputText.length(); i++)
        {
            int character = (int) inputText.charAt(i);

            if (character != (int) ' ')
            {
                character = ((character - startOffset) + cypherKey) % 26 + startOffset;
            }

            System.out.print((char) character);            
        }

    }
}
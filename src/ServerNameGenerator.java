import java.util.Random;

public class ServerNameGenerator {
    public static String[] acjectives = {"funny", "prompt"};
    public static String[] nouns = {"quiet", "desk"};

    public static String getWord(String[] choices){
        Random random = new Random();
        String randWord = choices[random.nextInt(choices.length)];

        return randWord;
}
    public static void main(String[] args){
        System.out.println(getWord(acjectives)+"\n" + getWord(nouns));
    }
}

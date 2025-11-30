public class A9CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        /*
        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
         */
        String sentence="thequickbrownfoxjumpsoverthelazydo";
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                System.out.println("Not");
                break;
            }
        }
        System.out.println("Panagram");
    }
}

import java.util.Scanner;

class Conversation {
public static void main(String[] args) { 

  String[] cannedResponses = {"Yes", "Hmmm. Please tell me more news", "Of course", "Okay", "Interesting...", "Indeed"};
  int cannedTimes = cannedResponses.length;
 
  Scanner inputRound = new Scanner(System.in);
  System.out.println("\nHow many times do you want to talk with me?");
  
  int round = inputRound.nextInt();
  inputRound.nextLine();

  String[] transcript = new String[2*round+1];
  transcript[0] = ("Hi! How are you today?"); 
  System.out.println(transcript[0]);
  
    for (int i = 0; i < round; i++) {
      String words = inputRound.nextLine();
      String toMirror;

      String newWords = words.replace("I", "you");
      newWords = newWords.replace("me", "you");
      newWords = newWords.replace("am", "are");
      newWords = newWords.replace("my", "your");
      newWords = newWords.replace("your", "my");
      newWords = newWords.replace("my", "you");
      
      if (!newWords.equals(words)) {
          toMirror = newWords;
      } 
      else {
          toMirror = cannedResponses[(int) Math.floor(cannedTimes * Math.random())];
      }
      System.out.println(toMirror);
      
      transcript[2*i+1] = words;
      transcript[2*i+2] = toMirror;
    }

  System.out.println("Good bye! See you later :)");

  System.out.println(" ");
  System.out.println("-----TRANSCRIPT-----");

  for (int i = 0; i < transcript.length; i++) {
    System.out.println(transcript[i]);
  }
  System.exit(0);
} 
}
package service;

public class SkeletonService {
    public String reverseText(String text){
        String [] words = text.split(" ");
        String newText = "";
        for (int i = words.length-1; i>=0; i--){
           newText += words[i]+" ";
        }
        return newText.trim();
    }
}

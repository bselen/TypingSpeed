/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author selenyildirim
 */

import java.util.Random;
import javax.swing.JOptionPane;

public class SentenceProvider {
    
    static String[] words = {"hello", "apple", "the", "went", "bottle", "burger", "special", "two","or","satisfied", "complicated", "misssipi","close"}; 
    private Random random;
    
    
    public SentenceProvider(){ //constructor
        random = new Random();
        
    }
    
    public String getRandomSentence(){
        int wordCount = random.nextInt(6) + 5; //sentence length between 5-10 words
        StringBuilder sentence = new StringBuilder(); //stringbuilder creates mutable strings
         for(int i = 0; i < wordCount; i++){
             sentence.append(words.[random.nextInt(words.length)]).append("");
         }
         return sentence.toString().trim() + ".";
        
    }
           
   
    
   // JOptionPane.showMessageDialog(null, words[random.nextInt(words.length)]);
    



    public static void main(String[] args) {
        
    }

}




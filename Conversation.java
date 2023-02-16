import java.util.Scanner;

import javax.crypto.spec.RC2ParameterSpec;

import java.util.Random;

import java.util.ArrayList;



class Conversation {


    public static void main(String[] arguments) {

        ArrayList<String> transcript = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many rounds?");
        int numRounds = userInput.nextInt();
        transcript.add("How many rounds?");
        transcript.add(Integer.toString(numRounds));
        transcript.add("welcome!what's up?");
       
        System.out.println("welcome!what's up?");


        Random r = new Random();

        String[] randomResponses = {
            "so intresting!",
            "I do not care",
            "Yeah I am listening",
            "hmmmmm!"
        };


        String[] toMirror = {
            "I",
            "me",
            "am",
            "are",
            "you"
        };
        String[] replacement = {
            "you",
            "you",
            "are",
            "am",
            "I"
        };
        // ArrayList<String> transcript = new ArrayList<String>();
       


        for (int n = 0; n < numRounds; n++) {

            Scanner answer = new Scanner(System.in);
            String thoughts = answer.nextLine();
            String[] words = thoughts.split(" ");
            String r2="";
            

            
            int counter = 0;
            String currentWord;
            for (int i = 0; i < words.length; i++) {
              currentWord="";

                for (int j = 0; j < toMirror.length; j++) {
                  //checking to see if we need to mirror the current word
                    if (words[i].equals(toMirror[j])) {
                        counter++;
                        currentWord= replacement[j];
                    }

                }
                //if we did not mirror grab the original
                if (currentWord.equals("")) {
                  r2 += words[i] + " ";
                  

                }
                //if we did mirorr add the replacment word to the sentence
                else{ r2 += currentWord+ " ";}
                
               


            }
            //if we mirrored print the new sentence with the replacement
            if (counter > 0) {
              System.out.println(r2);
              transcript.add(r2);
            
            }
            //if we did not mirror answer with a random response
            else {
               String  computerResponse=(randomResponses[r.nextInt(randomResponses.length)]);
                System.out.println(computerResponse);
                transcript.add(r2);
                transcript.add(computerResponse);
            }   

            
        }

         System.out.println("thanks for chatting!\n");
          transcript.add("thanks for chatting!");
         System.out.println("This is the transcript:\n");
       
      

       
        for( String word : transcript){
            System.out.println(word);
        } 


    }
}


    


    
  



  

       






    



  
    

    
 
 




    





  



   



    


    // You will start the conversation here.
 


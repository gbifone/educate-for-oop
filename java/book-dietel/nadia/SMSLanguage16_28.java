import java.util.Scanner;

public class SMSLanguage16_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] SMS = {"imo"  , "THNX" , "@" , "IDK" , "hh",
                        "NP"   , "IHNI" , "IDC" , "KYS" , "ATM" ,
                        "OMG"  , "MSG"  , "PLZ" , "KISS" , "OTW" , "YW" ,
                        "IMHO" , "FYI"  , "BTW" , "K" , "U"};
        String[] SMSAbrivation = {"In My Opinion" , "Thanks" , "At" , "I don't know" , "Haha" , "No problem",
                                  "I have no idea" , "I don't care" , "Kill yourself" , "At The Moment" ,
                                  "Oh My God" , "Message" , "Please" ,  "Keep It Simple, Stupid" ,"On The Way" ,
                                  "You're Welcome" , "In My Humble Opinion" , "For Your Information" ,"By The Way" , "OK" ,"YOU"};
        System.out.println("Enter your Message");
        String message = in.nextLine();
        String[] token = message.split(" ");
        for(int i = 0; i < token.length; i++){
            for(int j = 0; j < SMS.length; j++){
                if(token[i] .equalsIgnoreCase (SMS[j])) {
                    System.out.print(SMSAbrivation[j] + " ");
                }
            }
        }
    }
}

import java.util.Scanner;
public class EmergencyResponse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Emergency emergency = new Emergency();
        System.out.println ("What is your name?" );
        emergency.setName( input.next ());
        System.out.println("Where are you located? ");
        emergency.setAddress ( input.next ());
        System.out.println("What is your phone number? ");
        emergency.setPhoneNumber ( input.next ());
        System.out.println("What is the nature of your emergency? ");
        emergency.setEmergencyType ( input.next ());
        System.out.println("What is the severity of your emergency? ");
        emergency.setLevelOfEmergency (  input.next ());

        System.out.println("Emergency Report Information: \n");
        System.out.println("Name: " + emergency.getName());
        System.out.println("Location: " + emergency.getAddress());
        System.out.println("Phone Number: "+ emergency.getPhoneNumber());
        System.out.println("Emergency Type: " + emergency.getEmergencyType());
        System.out.println("Severity Level: " + emergency.getLevelOfEmergency ());
        System.out.println ("Response: " + emergency.getResponseType ());
    }
}

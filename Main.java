import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller control = new Controller();

        control.AddPassengersData(new PassengerData(
                215, 50, 30, "Babaev"
        ));

        control.AddPassengersData(new PassengerData(
                215, 25, 14, "Glent"
        ));

        control.AddPassengersData(new PassengerData(
                216, 61, 36, "Milyaev"
        ));

        control.AddPassengersData(new PassengerData(
                216, 20, 16, "Pashkevich"
        ));

        String Answer;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Input:");
            Answer = in.next();
            if(Answer.equals("/break")) break;

           try{
               switch (Answer) {
                   case "/List":
                       control.List();
                       System.out.println("\n");
                       break;
                   case "/Add":
                       String surname;
                       int weight, amount,number;
                       System.out.println("Enter Surname: ");
                       surname = in.next();

                       System.out.println("Enter number: ");
                       number = in.nextInt();

                       System.out.println("Enter weight: ");
                       weight = in.nextInt();

                       System.out.println("Enter amount: ");
                       amount = in.nextInt();

                       control.AddPassengersData(new PassengerData(number, weight,amount, surname));
                       System.out.println("\n");

                       break;

                   case "/Delete":
                       System.out.println("Input Marker");
                       int marker = in.nextInt();

                       control.delete(marker);
                       System.out.println("\n");

                       break;

                   case "/NumInfo":
                       int number1 =in.nextInt();
                       control.GetNumInfo(number1);
                       System.out.println("\n");

                       break;
                   case "/Plane":
                       int NumP =in.nextInt();
                       control.GetPlaneInfo(NumP);
                       System.out.println("\n");

                       break;
               }
           }catch(Exception e) {
               System.out.println("Error!");
               e.printStackTrace();
           }

        }while(!Answer.equals("/break"));
    }
}

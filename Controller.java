import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private ArrayList<PassengerData> ArrayData;

    public Controller() {
        ArrayData = new ArrayList<>();
    }

    public void AddPassengersData(PassengerData Data) {
        ArrayData.add(Data);
    }

    public void delete(int marker) throws Exception{
        if ( marker<= 0|| marker>ArrayData.size())
            throw new Exception("Incorrect marker");
        ArrayData.remove(marker-1);

    }

    public void List() {
        if(ArrayData.isEmpty()) System.out.println("No Data!");
        for(int i = 0; i < ArrayData.size(); i++){
            System.out.println((i+1) +". "+ArrayData.get(i).GetSurname()+" "+" -  " + ArrayData.get(i).GetNum());
        }
    }

    public void GetNumInfo(int number) {
        if (ArrayData.isEmpty()) {
            System.out.println("***Cricket sounds***");
        }else{
            System.out.println("Surname: "+ ArrayData.get(number-1).GetSurname());
            System.out.println("Number: "+ ArrayData.get(number-1).GetNum());
            System.out.println("Weight: "+ ArrayData.get(number-1).GetWeight());
            System.out.println("Amount: "+ ArrayData.get(number-1).GetAmount());
        }
    }

    public void GetPlaneInfo(int number){
        if (ArrayData.isEmpty()) {
            System.out.println("***Cricket sounds***");
        }else{
            for(int i=0;i<ArrayData.size(); i++){
                if(number == ArrayData.get(i).GetNum()){
                    System.out.println((i+1) +". Passenger: "+ArrayData.get(i).GetSurname()+" "+" Weight: " + ArrayData.get(i).GetWeight() +"  Amount: " + ArrayData.get(i).GetAmount());

                }


            }
        }
    }

}

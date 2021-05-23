import java.util.Locale;

public class PassengerData {
        private int num; // номер рейса
        private int weight; // вес багажа
        private int amount; // количество вещей

        private String surname; // фамилия

        //Constructor
        public PassengerData(int num, int weight, int amount, String surname) throws Exception {
            if (num < 0) {
                throw new Exception("Invalid num!");
            }
            this.num = num;

            if (weight < 0) {
                throw new Exception("Invalid weight!");
            }
            this.weight = weight;

            if (amount < 0) {
                throw new Exception("Invalid amount!");
            }
            this.amount = amount;

            surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
            if (surname.equals("")) {
                throw new Exception("Invalid surname!");
            }
            this.surname = surname;
        }

        //Setters
        public void ChangeNum(int num)throws Exception{
            if(num <= 0) {
                throw new Exception("Incorrect number!");
            } else {
                this.num = num;
            }

        }
        public void ChangeWeight(int weight)throws Exception{
            if(weight <= 0) {
                throw new Exception("Incorrect weight!");
            } else {
                this.weight = weight;
            }

        }
        public void ChangeAmount(int amount)throws Exception{
            if(amount <= 0) {
                throw new Exception("Incorrect amount!");
            } else {
                this.amount = amount;
            }

        }
        public void ChangeSurname(String surname)throws Exception{
            if(surname.equals("")) {
                throw new Exception("Incorrect surname!");
            } else {
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
                this.surname = surname;
            }

        }
        //Getters
        public String GetSurname() {return this.surname;}
        public int GetNum() {return this.num;}
        public int GetWeight() {return this.weight;}
        public int GetAmount() {return this.amount;}

    }


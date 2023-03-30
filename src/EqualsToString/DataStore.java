package src.EqualsToString;

public class DataStore {

    private static final int MAX_COMPUTERS= 100;

    private int ilość= 0;
    Computer [] computer = new Computer[MAX_COMPUTERS];


    void add(Computer comp){
        if(ilość < MAX_COMPUTERS && comp != null){
            computer[ilość]= comp;
            ilość++;
        }
    }


    public Computer[] getComputer() {
        Computer [] comp = new Computer[ilość];
        for (int i = 0; i < ilość; i++) {
            comp[i]= computer[i];

        }

        return comp;
    }

    int checkAvailability(Computer find){
        if(find == null)
            return 0;

        int count=0;
        for (int i = 0; i < ilość; i++) {
            if(find.equals(computer[i]))
            count++;

        }

        return count;
    }

}

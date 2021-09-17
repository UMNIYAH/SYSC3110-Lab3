import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyInfoCollection = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo b){
        buddyInfoCollection.add(b);
    }

    public void removeBuddy(BuddyInfo b){
        buddyInfoCollection.remove(b);
    }

    public static void main(String [] args){
        System.out.println("Address Book");
    }

    }
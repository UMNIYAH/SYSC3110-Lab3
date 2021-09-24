public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo() {
        this.name = "Umniyah";
    }

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = getName();
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        System.out.println("Hello ");
        BuddyInfo umniyah = new BuddyInfo();
        System.out.println(umniyah.getName());
    }
}


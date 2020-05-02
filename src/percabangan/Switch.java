package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=2;
        switch(jalanJalan){
            case 1:
                System.out.println("kucing");
                break;
            case 2:
                System.out.println("Beruang");
                break;
            case 3:
                System.out.println("Jerapah");
                break;
            case 4:
                System.out.println("Sapi");
                break;
            default:
                System.out.println("Kambing");
                break;

        }
    }
}
package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai= 'D';
        switch(nilai){
            case 'A':
                System.out.println("pembeli    : \"Berapa sekilo kentang paman ?\"");
                System.out.println("pedagang   : \"Murah ja 10,000\"");
                break;
            case 'B':
                System.out.println("Pembeli    : \"Nukar setengah ja paman !\"");
                System.out.println("pedagang   : \"sekiloan ja nah 9,000 ja !\"");
                break;
            case 'C':
                System.out.println("pembeli	   : \"Duitnya kada cukup paman\"");
                System.out.println("Pedagang   : \"hutangi kah dulu, bawa ja dulu ,esok bayarnya !\"");
                System.out.println("Pembeli	   : \" hihihi ,ayuja mun di hutangi\"");
                break;
            default:
                System.out.println("pembeli    : \"makasih dulu paman lah\"");
                System.out.println("Pedagang   : \"santai ja\"");
                System.out.println("Pedagang   : \"tambahi lagi nukar yang lain\"");
                System.out.println("Pedagang   : \"tanggung behutang sedikit\"");
                System.out.println("pembeli    : \"sudah paman ini aja\"");
                break;
        }
    }
}
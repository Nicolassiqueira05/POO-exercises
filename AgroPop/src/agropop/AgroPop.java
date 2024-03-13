package agropop;

public class AgroPop {

    public static void main(String[] args) {
        
        int[] rebanho = new int[]{120, 330, 200, 160};
        
        System.out.println("A media do peso dos bois é: " + mediaBoi(rebanho));
        System.out.println("O boi mais gordo pesa: " + gordoBoi(rebanho));
        System.out.println("O boi mais magro pesa: " + fitBoi(rebanho));
        
        
    }
    public static double mediaBoi(int[] args){
        double media = 0;
        for(int x = 0; x < args.length; x++){
            media += args[x];
        }
        media = media/args.length;
        return media;
    }
    public static int gordoBoi(int[] args){
        int gordo = 0;
        for(int x = 0; x < args.length; x++){
            gordo = gordo < args[x] ? args[x] : gordo;
        }
        return gordo;
    }
    public static int fitBoi(int[] args){
        int magro = 1000000000;
        for(int x = 0; x < args.length; x++){
//            if(magro > args[x]){
//                magro = args[x];
//            }
            magro = magro > args[x] ? args[x] : magro;
        }
        return magro;
    }
    
}

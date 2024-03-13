package fisica;

public class Fisica {

    public static void main(String[] args) {
        System.out.println(dist(2, 35));
        System.out.println(con(dist(2, 35), 10));
    }
    public static int dist(int time, int speed){
    //speed in km/h
    //time in hours
    return speed * time;
    }
    public static int con(int dist, int litros){
    return dist/litros;
    }
    
}

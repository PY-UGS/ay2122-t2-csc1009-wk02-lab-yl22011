import java.util.Scanner;

class q3{
    public static void main(String[] args){

        double a = System.currentTimeMillis();
        double totals = a/1000;
        int totalcs = (int)totals % 60;
        double totalm = totals/60;
        int totalcm = (int)totalm % 60;
        double totalh = totalm/60;
        int totalch = (int)Math.floor(totalh %24); 
        System.out.println("Current time is " + totalch + ":" + totalcm + ":" + totalcs + " GMT");
    }

} 
package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
         int i;
        int gsd = 1;
        for (i = 1; i <=first && i <= second; i ++) {


            if (first % i == 0 && second % i == 0)
                gsd = i;
        
    }
        System.out.println(gsd);
}
public static void main(String[] args) {
        GreatestCommonDivisor main = new GreatestCommonDivisor();
        main.printGCD(50,60);
    }
}

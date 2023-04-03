package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int sum =0;
        for (sum=0; t!=0; t=t/10 ){
            sum= sum + t % 10;
    }
        System.out.println(sum);
}
public static void main(String[] args) {
        DigitsSum main = new DigitsSum();
        main.printDigitsSum(1235);
    }

}

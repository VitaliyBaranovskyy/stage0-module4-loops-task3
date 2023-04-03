package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
int sum=0;
        int a = 9;
        int i;
        for (i=1; i<=lengthOfLastNumber; i++){
            sum = sum + a;
            System.out.println(a);
            a= a*10+9;
    }
        System.out.println(sum);
}
public static void main(String[] args) {
        NinesSum main = new NinesSum();
        main.calculateSum(3);
    }
}

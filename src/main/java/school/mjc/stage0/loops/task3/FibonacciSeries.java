package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        
        int i = 0;
      int b = 1;
      int c;
        System.out.print(i + " " + b + " ");

        for (int a = 2; a <= lastFibonacci; a++){
            c = i + b;
            System.out.print(c + " ");
            i=b;
            b=c;
    }
}
public static void main(String[] args) {
        FibonacciSeries main = new FibonacciSeries();
        main.printFibonacci(11);
    }
}

package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
    int i = firstBoarder;
        int sum = 0;
        for (i = firstBoarder; i <= secondBoarder; i++){
       sum = sum +i;
        
    }
    
    System.out.println(sum);
}
public static void main(String[] args) {
        RangeSum main = new RangeSum();
        main.printSumInclusive(7,15);
    }
}

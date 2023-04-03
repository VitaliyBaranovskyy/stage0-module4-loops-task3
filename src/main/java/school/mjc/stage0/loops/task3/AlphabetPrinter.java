package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
    char abc ;
        for (abc = 'A'; abc <= 'Z'; abc++) {

            System.out.println(abc);    
        
    }
}
 public static void main(String[] args) {
        AlphabetPrinter main = new AlphabetPrinter();
        main.printAlphabet();
    }
}

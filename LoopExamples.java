public class LoopExamples {
    public static void main(String[] args) {
        // While Loop
        System.out.println("While Loop Output:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Do-While Loop
        System.out.println("\nDo-While Loop Output:");
        count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
        
        // For Loop (Even Numbers)
        System.out.println("\nFor Loop Output (Even Numbers):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
        
        // Nested Loops (3x3 Grid)
        System.out.println("\nNested Loops Output (3x3 Grid):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Loop with Break and Continue
        System.out.println("\nLoop with Break and Continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) continue;
            if (i > 8) break;
            System.out.println("Number: " + i);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentCollections {
    public static void main(String[] args) {
        // Part 1: ArrayList of student names
        System.out.println("Part 1: ArrayList of Student Names ");

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Rajesh Kumar");
        studentNames.add("Priya Sharma");
        studentNames.add("Amit Patel");
        studentNames.add("Sneha Reddy");
        studentNames.add("Vikram Singh");

        System.out.println("Original names:");
        for (String name : studentNames) {
            System.out.println("  - " + name);
        }

        // Sort the names alphabetically
        Collections.sort(studentNames);

        System.out.println("\nSorted names (alphabetically):");
        for (String name : studentNames) {
            System.out.println("  - " + name);
        }

        // Part 2: HashMap of student → marks
        System.out.println("\n Part 2: HashMap of Student → Marks ");

        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Rajesh Kumar", 85);
        studentMarks.put("Priya Sharma", 92);
        studentMarks.put("Amit Patel", 78);
        studentMarks.put("Sneha Reddy", 96);
        studentMarks.put("Vikram Singh", 88);

        System.out.println("All students and their marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("  - " + entry.getKey() + ": " + entry.getValue());
        }

        // Find and print top scorer
        String topScorer = null;
        int highestMarks = 0;

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topScorer = entry.getKey();
            }
        }

        System.out.println("\nTop Scorer:");
        System.out.println("  Name: " + topScorer);
        System.out.println("  Marks: " + highestMarks);
    }
}

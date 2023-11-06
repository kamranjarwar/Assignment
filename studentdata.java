
public class studentdata {

   
     

    public static void main(String[] args) {
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

       
        String[] studentRecords = studentData.split(", ");

        int totalStudents = studentRecords.length;
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        String highestScorer = "";
        int lowestScore = Integer.MAX_VALUE;
        String lowestScorer = "";

        for (String record : studentRecords) {
            String[] parts = record.split(":");
            if (parts.length == 2) {
                String studentName = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());

                totalScore += score;

                if (score > highestScore) {
                    highestScore = score;
                    highestScorer = studentName;
                }

                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScorer = studentName;
                }
            }
        }

        double averageScore = (double) totalScore / totalStudents;

        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Average score of students: " + averageScore);
        System.out.println("Highest scorer: " + highestScorer + " with a score of " + highestScore);
        System.out.println("Lowest scorer: " + lowestScorer + " with a score of " + lowestScore);
    }
}

    
    


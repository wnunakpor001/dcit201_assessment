public class StudentGradeScore{
    public static boolean validateScore(double score){
        return 0<= score && score <= 100;
    }
    //Calculate Letter grade
    public static String calculateLetterGrade(double score){
        if (score >=80){
            return "A";
        } else if (80 >score && score >= 75) {
            return "B+";
        } else if (75 > score && score >= 70) {
            return "B";
        } else if (70 > score && score >= 65) {
            return "C+";
        } else if (65 > score && score >= 60) {
            return "C";
        } else if (60 > score && score >= 55) {
            return "D+";
        } else if (55 > score && score >= 50) {
            return "D";
        } else if (50 > score && score >= 45) {
            return "E";
        }
        else{
            return "F";
        }
    }

    // showcasing the performance grade
    public static void displayPerformanceGrade(String grade){
        switch (grade){
            case "A":
                System.out.println("EXCELLENT"); break;
            case "B+":
                System.out.println("VERY GOOD");break;
            case "B":
                System.out.println("GOOD");break;
            case "C+":
                System.out.println("ABOVE AVERAGE");break;
            case "C":
                System.out.println("AVERAGE");break;
            case "D+":
                System.out.println("PASS");break;
            case "D":
                System.out.println("WEAK PASS");break;
            case "E":
                System.out.println("WEAK FAIL");break;
            case "F":
                System.out.println("FAIL");break;
        }
    }

    public static void executeGradeReport(double score){
        if (!validateScore(score)){
            System.out.println("INVALID SCORE!");
            return;
        }
        String grade = calculateLetterGrade(score);
        displayPerformanceGrade(grade);

    }
    public static void main(String  args[]){
        executeGradeReport(85);
        executeGradeReport(125);
    }
}

class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter Marks Physics Chemistry Biology Mathematics Computer");

        int physics = Integer.parseInt(args[0]);
        int chemistry = Integer.parseInt(args[1]);
        int biology = Integer.parseInt(args[2]);
        int mathematics = Integer.parseInt(args[3]);
        int computer = Integer.parseInt(args[4]);

        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500.0) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

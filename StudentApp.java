public class StudentApp {

    static class Student {
        protected double[] marks;

        public Student(double[] marks) {
            this.marks = marks;
        }

        public double calAvg() {
            double sum = 0;
            for (double mark : marks) {
                sum += mark;
            }
            return sum / marks.length;
        }
    }

    static class SportsStudent extends Student {
        private double sportsScore;

        public SportsStudent(double[] marks, double sportsScore) {
            super(marks);
            this.sportsScore = sportsScore;
        }

        @Override
        public double calAvg() {
            double academicAvg = super.calAvg();
            return (academicAvg + sportsScore) / 2;
        }
    }


    public static void main(String[] args) {
        double[] academicMarks = {85.5, 78.0, 92.0};

        Student student = new Student(academicMarks);
        System.out.printf("Academic Average: %.2f\n", student.calAvg());

        SportsStudent sportsStudent = new SportsStudent(academicMarks, 88.0);
        System.out.printf("Sports Student Average (Academic + Sports): %.2f\n", sportsStudent.calAvg());
    }
}
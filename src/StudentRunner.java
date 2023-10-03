public class StudentRunner {
    public static void main(String args[]) {
        Student student1 = new Student("Charles", "Smith", 2023);
        student1.addTestScore(85.2);
        student1.addTestScore(90.6);
        student1.addTestScore(83.7);
        System.out.println(student1.getHighestTestScore());
        student1.printStudentInfo();
        System.out.println();
        student1.addTestScore(88.0);
        student1.addTestScore(95.9);
        student1.addTestScore(96.3);
        student1.addTestScore(78.5);
        student1.addTestScore(84.3);
        System.out.println(student1.getHighestTestScore());
        student1.printStudentInfo();
        System.out.println();
    }
}

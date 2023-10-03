import java.util.Scanner;
public class StudentRunner {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String studentFirstName;
        String studentLastName;
        int graduationYear;
        int userOption = 0;
        System.out.print("Enter Student First Name: ");
        studentFirstName = scan.nextLine();
        System.out.print("Enter Student Last Name: ");
        studentLastName = scan.nextLine();
        System.out.print("Enter Student's Graduation Year: ");
        graduationYear = scan.nextInt();
        scan.nextLine();
        Student student = new Student(studentFirstName, studentLastName, graduationYear);

        while (userOption != 6) {
            System.out.println("-------------------------");
            System.out.println("------Main Menu----------");
            System.out.println("-------------------------");
            System.out.println("1. Update graduation year");
            System.out.println("2. Add test score");
            System.out.println("3. View test average");
            System.out.println("4. View highest test score");
            System.out.println("5. View all student info");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter Selection: ");
            userOption = scan.nextInt();
            scan.nextLine();

            if ( userOption == 1 ) {
                System.out.print("Enter new graduation year: ");
                student.setGradYear( scan.nextInt() );
            }
            if ( userOption == 2 ) {
                System.out.print("Enter Test Score: ");
                student.addTestScore( scan.nextDouble() );
                scan.nextLine();
            }
            if ( userOption == 3 ) {
                System.out.println("The student's average test score is " + student.averageTestScore());
            }
            if ( userOption == 4 ) {
                System.out.println("The highest test score is " + student.getHighestTestScore());
            }
            if ( userOption == 5 ) {
                student.printStudentInfo();
            }
            if ( ( userOption > 6 ) || ( userOption < 1) ) {
                System.out.println("Invalid Option!");
            }
        }
        System.out.println("Have a nice day!");
    }
}

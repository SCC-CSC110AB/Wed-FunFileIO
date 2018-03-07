package wed.funfileio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class WedFunFileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file = new File("crap.txt");
        Scanner fileInput = new Scanner(file);
        int gradeAggregate = 0;
        int studentCount = 0;

        while (fileInput.hasNext()) {
            String studentName = fileInput.next();
            int studentGrade = fileInput.nextInt();
            fileInput.nextLine();

            gradeAggregate += studentGrade;
            studentCount++;

            System.out.println(
                    "Student: "
                    + studentName
                    + " received a grade of "
                    + studentGrade
            );
        }

        System.out.println(
                "The grade average is: "
                + gradeAggregate / (float)studentCount
        );
    }

}

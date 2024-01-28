import java.util.ArrayList;

public class StudentComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding 10 student objects with Indian names and addresses
        students.add(new Student(101, "Rahul", "15, Gandhi Road, Mumbai"));
        students.add(new Student(102, "Priya", "22, Tagore Street, Delhi"));
        students.add(new Student(103, "Amit", "7, Nehru Lane, Kolkata"));
        students.add(new Student(104, "Anjali", "11, Patel Nagar, Chennai"));
        students.add(new Student(105, "Sandeep", "45, Rajiv Avenue, Bangalore"));
        students.add(new Student(106, "Neha", "29, Indira Heights, Hyderabad"));
        students.add(new Student(107, "Rajesh", "18, Modi Enclave, Pune"));
        students.add(new Student(108, "Smita", "33, Vajpayee Gardens, Ahmedabad"));
        students.add(new Student(109, "Vikram", "25, Advani Street, Jaipur"));
        students.add(new Student(110, "Mitali", "14, Gandhi Nagar, Lucknow"));

        // Sorting by roll number using custom bubble sort
        StudentSorter.sortByRollNumber(students);
        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Sorting by name using custom bubble sort
        StudentSorter.sortByName(students);
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

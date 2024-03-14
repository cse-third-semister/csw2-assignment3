import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;
    
    // Constructor
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Overriding compareTo() method
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.rn, student.rn);
    }

    // Bubble sort method
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j+1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Creating an array of student objects
        Student[] students = {
            new Student("Alice", 101, 85),
            new Student("Bob", 102, 90),
            new Student("Charlie", 103, 80),
            new Student("David", 104, 95)
        };
      

        // Sorting the array using Bubble Sort based on roll number
        bubbleSort(students);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMark());
        }
    }
}



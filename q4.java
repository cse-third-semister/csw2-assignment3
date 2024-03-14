class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;


    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

   
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

  
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.totalMark, student.totalMark);
    }

    
    public static Student linearSearch(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
       
        Student[] students = {
            new Student("Alice", 101, 85),
            new Student("Bob", 102, 90),
            new Student("Charlie", 103, 80),
            new Student("David", 104, 95)
        };

      
        int rollNumberToSearch = 102;
        Student foundStudent = linearSearch(students, rollNumberToSearch);

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Roll Number: " + foundStudent.getRollNumber());
            System.out.println("Total Marks: " + foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}

class Student {

    String name;
    int grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}


public class methodChain {
    public static void main(String[] args) {
        String a = "Money Man";
        String b = "pie";
        int c = b.concat(" is good").chars().toArray()[0];

        Student s = new Student();
        s.setGrade(90).setName("Bob");
        System.out.println(s.name);
        System.out.println(s.grade);

        System.out.println(a.toLowerCase().charAt(3));
        System.out.println(c);
    }
}

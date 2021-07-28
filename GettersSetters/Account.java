public class Account {

    String name;
    int age;
    public static void main(String[] args) {
        Account a = new Account();

        a.setAge(34);
        a.setName("Pablo");
        System.out.println(a.getName());
        System.out.println(a.getAge());

        a.printDetails();

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void printDetails() {
        System.out.println(getName() + ", " + getAge());
    }

}

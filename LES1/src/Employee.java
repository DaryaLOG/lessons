public class Employee {

    private String name;
    private String position;
    private long phonenumber;
    private int salary;
    private int age;
    static int staticId;
    private int id;

    Employee(){
        staticId++;
    };

    Employee (String name, String position, long phonenumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
        staticId++;
        id = staticId;
    }
    public int getId() {
        return id;
    }
    public String getName () {
        return name;
    }
    public String getPosition () {
        return position;

    }
    public long getPhonenumber () {
        return phonenumber;
    }
    public int getSalary () {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public void setName (String name) {
        this.name = name;

    }
    public void setPosition (String position) {
        this.position = position;
    }
    public void setPhonenumber (long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public void setAge (int age) {
        this.age = age;
    }


}

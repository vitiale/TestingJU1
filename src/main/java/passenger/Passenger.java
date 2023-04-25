package passenger;

public class Passenger {
    private String fullName;
    private int age;
    private Sex sex;

    public Passenger(String fullName, int age, Sex sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


}

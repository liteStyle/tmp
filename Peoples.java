package epam;

class Peoples {
    private String name;
    private String lastName;
    private Sex sex;
    private int age;

    public Peoples(String name, String lastName, Sex sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
}

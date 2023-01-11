public class User {
    private int age;
    private String name;
    private String cpf;
    private String email;

    private String course;
    private int period;

    private boolean hasSubscription;
    Address address = new Address();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPeriod() {
        return this.period;
    }

    public boolean hasSubscription() {
        return this.hasSubscription;
    }

    public void startSubscription() {
        this.hasSubscription = true;
    }

    public void finishSubscription() {
        this.hasSubscription = false;
    }
}

package meet3.hw.task10;

/*Класс User:
Поля: id, name, email.
Методы: геттеры/сеттеры, displayUserInfo().*/
public class User {
    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.printf("id = , name = , email = ", this.id, this.name, this.email);
    }
}

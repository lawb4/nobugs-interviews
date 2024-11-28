package meet3.hw.task10;

/*Класс User:
Поля: id, name, email.
Методы: геттеры/сеттеры, displayUserInfo().*/
public class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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

    public void displayUserInfo() {
        System.out.printf("id = %s, name = %s, email = %s\n", id, name, email);
    }
}

package meet7.hw.ui.saucedemo.ui.data;

import lombok.Data;

/*Accepted usernames are:
standard_user
locked_out_user
problem_user
performance_glitch_user
error_user
visual_user

Password for all users:
secret_sauce*/
@Data
public class Account {
    private String username;
    private String password;

    public Account() {
        this.password = "secret_sauce";
    }

    public void setStandardUser() {
        this.username = "standard_user";
    }
}
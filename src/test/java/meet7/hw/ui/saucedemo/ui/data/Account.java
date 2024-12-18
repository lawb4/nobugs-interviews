package meet7.hw.ui.saucedemo.ui.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String username;
    private String password;
}

/*Accepted usernames are:
standard_user
locked_out_user
problem_user
performance_glitch_user
error_user
visual_user

Password for all users:
secret_sauce*/
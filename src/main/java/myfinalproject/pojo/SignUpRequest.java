package myfinalproject.pojo;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class SignUpRequest {
    @Email
    private String email;
    private String name;
    private String username;
}

package myfinalproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PaidDTO {
    private String course;
    private String group;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Integer age;
    private String courseFormat;
    private String courseType;
    private Integer sum;
    private String status;
    private String comment;
    private Integer alreadyPaid;
}

package myfinalproject.filters;

import lombok.Getter;
import lombok.Setter;
import myfinalproject.models.User;
@Getter
@Setter

public class PaidFilter {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Integer age;
    private String course;
    private String courseFormat;
    private String courseType;
    private String status;
    private String group;
    private Integer sum;
    private Integer alreadyPaid;
    private User user;
    private String startDate;
    private String endDate;
    private String comment;
}

package myfinalproject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import myfinalproject.models.enums.ECourse;
import myfinalproject.models.enums.ECourseFormat;
import myfinalproject.models.enums.ECourseType;
import myfinalproject.models.enums.EStatus;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Paid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course")
    private ECourse course;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "age")
    private Integer age;

    @Column(name = "course_format")
    private ECourseFormat courseFormat;

    @Column(name = "course_type")
    private ECourseType courseType;

    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "status")
    private EStatus status;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "group_id")
    private Group group;
    @Column(name = "utm")
    private String utm;

    @Column(name = "msg")
    private String message;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "paid_id")
    private List<Comment> comments;

    @Column(name = "sum")
    private Integer sum;

    @Column(name = "alreadyPaid")
    private Integer alreadyPaid;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private User user;
}

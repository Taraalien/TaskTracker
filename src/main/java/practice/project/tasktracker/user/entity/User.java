package practice.project.tasktracker.user.entity;


import jakarta.persistence.*;
import lombok.Data;
import practice.project.tasktracker.common.entity.BaseEntity;

@Entity
@Table(name = "tbl_user")
@Data
public class User extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "gmail")
    private String gmail;
}

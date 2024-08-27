package practice.project.tasktracker.task.entity;


import jakarta.persistence.*;
import lombok.Data;
import practice.project.tasktracker.common.entity.BaseEntity;
import practice.project.tasktracker.task.enums.Category;
import practice.project.tasktracker.task.enums.Level;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_task")
@Data
public class Task extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "start_date",nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date",nullable = false)
    private LocalDateTime endDate;

    @Column(name = "explain",nullable = false)
    private String explain;

    @Column(name = "done",nullable = false)
    private Boolean done;

    @Column(name = "level",nullable = false)
    @Enumerated(EnumType.STRING)
    private Level level;

    @Column(name = "category",nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;


    //user asign



}

package com.taskproject.taskboss.domain.model;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.*;
import java.time.LocalDateTime;


@Getter // lombok
@Entity // javax.persistence
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Task")
@Builder
public class TaskEntity {
    @Id
    @Column(name = "task_id", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;

    @Column(updatable = false, nullable = false)
    @CreatedDate
    private LocalDateTime creationDate;
    private LocalDateTime finalDate;

    @Column(name = "mother_task_id")
    private Long motherTaskId;
}
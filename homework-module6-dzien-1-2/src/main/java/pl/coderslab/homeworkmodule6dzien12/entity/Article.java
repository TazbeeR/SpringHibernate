package pl.coderslab.homeworkmodule6dzien12.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 200)
    private String title;
    @OneToOne
    private Author author;
    @OneToMany
    private List<Category> categoryList = new ArrayList<>();
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;


    @PrePersist
    public void prePersist() {
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedOn = LocalDateTime.now();
    }

}

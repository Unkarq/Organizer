package com.sda.gda17.organizer.organizer.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 25)
    private String name;

    @CreationTimestamp
    private LocalDateTime created;

    private LocalDateTime completed;

    private boolean archived;

    @OneToMany(mappedBy = "checkList", fetch = FetchType.EAGER)
    private Set<CheckListItem> items;


//    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
//    private List<Ocena> oceny;


}

package com.sda.gda17.organizer.organizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CheckListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Status itemStatus;
    private LocalDateTime completed;
    @Length(max = 45)
    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private CheckList checkList;

    @OneToMany(mappedBy = "checkListItem", fetch = FetchType.EAGER)
    private Set<Notes> notes;


}

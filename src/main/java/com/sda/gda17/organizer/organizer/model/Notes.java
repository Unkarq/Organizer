package com.sda.gda17.organizer.organizer.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;


    @ManyToOne(fetch = FetchType.LAZY)
private CheckListItem checkListItem;



}

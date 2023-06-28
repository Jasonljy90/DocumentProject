package com.jason.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mark class as an Entity 
@Entity
// defining class name as Table name
@Table(name = "Document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    // mark id as primary key
    @Id

    // defining id as column name
    @Column
    private int id;

    // defining title as column name
    @Column
    private String title;

    // defining description as column name
    @Column
    private String description;

    // defining author as column name
    @Column
    private String author;

    // defining creation timestamp as column name
    @Column
    private Timestamp creationTimestamp;

    // defining last update timestamp as column name
    @Column
    private Timestamp lastUpdateTimestamp;

    // defining data as column name
    @Column
    private String data;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocumentVersion> docVersion = new ArrayList<>();
}
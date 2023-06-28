package com.jason.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mark class as an Entity 
@Entity
// defining class name as Table name
@Table
@Getter
@Setter
@NoArgsConstructor
public class DocumentWithVersion {
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

    // defining versions as column name
    @Column
    private DocumentVersion[] docVersions;
}

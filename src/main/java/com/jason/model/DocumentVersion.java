package com.jason.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mark class as an Entity 
@Entity
// defining class name as Table name
@Table(name = "DocumentVersion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentVersion {
    // mark id as primary key
    @Id
    // defining versionNumber as column name
    @Column
    private int versionNumber;

    // defining id as column name
    @Column
    private int id;

    // defining comments as column name
    @Column
    private String comments;
}
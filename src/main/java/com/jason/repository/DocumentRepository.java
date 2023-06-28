package com.jason.repository;

import org.springframework.data.repository.CrudRepository;

import com.jason.model.Document;

public interface DocumentRepository extends CrudRepository<Document, Integer> {
}

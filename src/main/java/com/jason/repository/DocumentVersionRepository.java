package com.jason.repository;

import org.springframework.data.repository.CrudRepository;

import com.jason.model.DocumentVersion;

public interface DocumentVersionRepository extends CrudRepository<DocumentVersion, Integer> {

}

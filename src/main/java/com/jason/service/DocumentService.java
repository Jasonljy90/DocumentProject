package com.jason.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.model.Document;
import com.jason.repository.DocumentRepository;

//defining the business logic
@Service
public class DocumentService {
    @Autowired
    DocumentRepository documentRepository;

    // getting all student records
    public List<Document> getAllDocument() {
        List<Document> documents = new ArrayList<Document>();
        documentRepository.findAll().forEach(document -> documents.add(document));
        return documents;
    }

    // getting a specific record
    public Document getDocumentById(int id) {
        return documentRepository.findById(id).get();
    }

    // create and save document to record
    public void saveOrUpdate(Document document) {
        documentRepository.save(document);
    }

    // deleting a specific record
    public void delete(int id) {
        documentRepository.deleteById(id);
    }
}
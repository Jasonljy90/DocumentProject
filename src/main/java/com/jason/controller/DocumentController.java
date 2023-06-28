package com.jason.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.model.Document;
import com.jason.model.DocumentVersion;
import com.jason.service.DocumentService;
import com.jason.service.DocumentVersionService;

//creating RestController
@RestController
@RequestMapping(path = "/document")
public class DocumentController {
    // autowired the StudentService class
    @Autowired
    DocumentService documentService;

    @Autowired
    DocumentVersionService documentVersionService;

    // creating post mapping that post the document detail in the database
    @PostMapping(path = "/create")
    private int createDocument(@RequestBody Document document) {
        // Get TimeStamp
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        document.setCreationTimestamp(timestamp);
        System.out.println(document.getCreationTimestamp());
        documentService.saveOrUpdate(document);
        return document.getId();
    }

    // Done
    // creating a get mapping that retrieves the detail of a specific document with
    // versions
    @GetMapping(path = "/{id}")
    private Document getStudent(@PathVariable("id") int id) {
        return documentService.getDocumentById(id);
    }

    // creating post mapping that post the document detail in the database
    @PostMapping(path = "/update")
    private int updateDocument(@RequestBody Document document) {
        // Get TimeStamp
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        document.setLastUpdateTimestamp(timestamp);
        Document oldDocument = documentService.getDocumentById(document.getId());
        document.setCreationTimestamp(oldDocument.getCreationTimestamp());
        documentService.saveOrUpdate(document);
        return document.getId();
    }

    // creating a get mapping that retrieves all the documents detail from the
    // database
    // Done
    @GetMapping(path = "/viewall")
    private List<Document> getAllDocument() {
        return documentService.getAllDocument();
    }

    // Done
    // creating a delete mapping that deletes a specific document
    @DeleteMapping(path = "/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        documentService.delete(id);
    }

    // creating post mapping that post the document detail in the database
    @PostMapping(path = "/create/version")
    private void createDocumentVersion(@RequestBody DocumentVersion documentVersion) {
        documentVersionService.createNewDocumentVersion(documentVersion);
    }
}

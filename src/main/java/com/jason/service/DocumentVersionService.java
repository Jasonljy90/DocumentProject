package com.jason.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.model.DocumentVersion;
import com.jason.repository.DocumentRepository;
import com.jason.repository.DocumentVersionRepository;

@Service
public class DocumentVersionService {
    @Autowired
    DocumentVersionRepository documentVersionRepository;

    @Autowired
    DocumentRepository documentRepository;

    // create and save document to record
    public void createNewDocumentVersion(DocumentVersion documentVersion) {
        documentVersionRepository.save(documentVersion);
    }
}

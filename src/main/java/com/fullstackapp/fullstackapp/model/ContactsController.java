package com.fullstackapp.fullstackapp.model;

import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
class ContactsController {
0
    private ContactRepository contactRepository;

    public ContactsController(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @GetMapping("/contacts")
    Collection<Contact> contracts(){
        return (Collection<Contact>)  contactRepository.findAll();    
    }

    @PostMappin("/contacts")
    ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) throws URISyntaxException{
        Contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }


    
}

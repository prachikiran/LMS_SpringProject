package com.javaproject.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.springboot.design.BookStack;
import com.javaproject.springboot.services.ServiceClass;

import java.util.List;

@RestController
public class ControllerClass {

    @Autowired
    private ServiceClass libService;

    @GetMapping("/get/display")
    public ResponseEntity<List<BookStack>> displayList() {

        List<BookStack> bookList = libService.getBookList();
        return new ResponseEntity<List<BookStack>>(bookList, HttpStatus.OK);
    }

    @PostMapping(value = "/insertBook")
    public BookStack insertBook(@ModelAttribute("Book") BookStack bookName) {
        libService.insertBook(bookName);
        System.out.print("Inserted successfully!");
        return bookName;
    }

    @PutMapping(value = "/updateList")
    public BookStack updateBook(@ModelAttribute("Book") BookStack bookName) {
        libService.insertBook(bookName);
        System.out.print("Updated Library!");
        return bookName;
    }

    @DeleteMapping("/deleteBook")
    public String deleteBook(@RequestParam int id) {
        BookStack book = libService.getId(id);
        String bookName = book.getTitle();
        libService.removeBook(id);

        return "Book #" + id + " " + bookName + " is successfully removed from the Library";
    }
}
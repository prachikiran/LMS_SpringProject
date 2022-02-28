package com.javaproject.springboot.design;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issuedBookList")
public class BookIssueDesign {

    @Id
    @Column(name = "BookID")
    private int bookID;

    @Column(name = "Title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "MRP")
    private double price;

    @Column(name = "Issued_date")
    private LocalDate issueDate;

    @Column(name = "Return_date")
    private LocalDate returnDate;

    public BookIssueDesign() {
        super();
    }

    public BookIssueDesign(int bookID, String title, String author, double price, LocalDate issueDate,
            LocalDate returnDate) {
        
        super();
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getbookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCost(double price) {
        this.price = price;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookIssueDesign [BookID=" + bookID + ", Title=" + title + ", Author=" + author + ", MRP=" + price
                + ", Issue Date=" + issueDate + ", Return Date=" + returnDate + "]";
    }

}

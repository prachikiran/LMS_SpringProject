package com.javaproject.springboot.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaproject.springboot.design.BookIssueDesign;
import com.javaproject.springboot.design.BookStack;

public interface BookIssueRepo extends JpaRepository<BookStack, Integer> {
    @Query(nativeQuery = true, value = "select * from librarydatabase.issuedbooks "
            + "where issuedbooks.Issued_Date between :start and :end")
    List<BookIssueDesign> findByIssued_dateBetween(@Param("start") LocalDate start, @Param("end") LocalDate end);

}

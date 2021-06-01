package com.johnmendes.crudspringbootrestjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnmendes.crudspringbootrestjpa.entity.Book;

public interface BooksRepository extends JpaRepository<Book, Long> {

}

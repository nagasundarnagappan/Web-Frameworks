package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="bo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(name="ID")
    // @GeneratedValue
    private int id;

    @Column(name="BOOK")
    private String bookName;

    @Column(name="PRICE")
    private float price;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="AUTHOR")
    private String authorName;
}

//writre query to create the table book

//create table book(ID int primary key auto_increment,BOOK varchar(20),PRICE float,QUANTITY int,AUTHOR varchar(20));
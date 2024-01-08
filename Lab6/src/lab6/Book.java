/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Objects;



public class Book {
    String bookID,bookTitle,author,yearPublished;

    public Book(String bookID, String bookTitle, String author, String yearPublished) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", author=" + author + ", yearPublished=" + yearPublished + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.bookID, other.bookID)) {
            return false;
        }
        if (!Objects.equals(this.bookTitle, other.bookTitle)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return Objects.equals(this.yearPublished, other.yearPublished);
    }
}

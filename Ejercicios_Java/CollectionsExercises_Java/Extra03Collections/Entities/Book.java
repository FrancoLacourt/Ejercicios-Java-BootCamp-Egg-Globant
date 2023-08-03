
package Entities;

import java.util.Objects;

public class Book {
    
    private String title;
    private String author;
    private int copiesCount;
    private int borrowedCopiesCount;

    public Book() {
    }

    public Book(String title, String author, int copiesCount) {
        this.title = title;
        this.author = author;
        this.copiesCount = copiesCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopiesCount() {
        return copiesCount;
    }

    public void setCopiesCount(int copiesCount) {
        this.copiesCount = copiesCount;
    }

    public int getBorrowedCopiesCount() {
        return borrowedCopiesCount;
    }

    public void setBorrowedCopiesCount(int borrowedCopiesCount) {
        this.borrowedCopiesCount = borrowedCopiesCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.title);
        return hash;
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
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }   
    

    @Override
    public String toString() {
        return "Title: " + title + ". Author: " + author + ". Copies available: " + copiesCount + ". Borrowed copies: " + borrowedCopiesCount;
    }   
}
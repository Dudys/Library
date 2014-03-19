/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author jduda
 */
public class Borrowing {
    Long BorrowingId;
    Calendar startTime;
    Calendar endTime;
    Calendar expectedEndTime;
    Book book;
    Reader reader;

    public Long getBorrowingId() {
        return BorrowingId;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public Calendar getExpectedEndTime() {
        return expectedEndTime;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setBorrowingId(Long BorrowingId) {
        this.BorrowingId = BorrowingId;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public void setExpectedEndTime(Calendar expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.BorrowingId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Borrowing other = (Borrowing) obj;
        if (!Objects.equals(this.BorrowingId, other.BorrowingId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Borrowing{" + "BorrowingId=" + BorrowingId + ", startTime=" + startTime + ", endTime=" + endTime + ", expectedEndTime=" + expectedEndTime + ", book=" + book + ", reader=" + reader + '}';
    }
    
    
}

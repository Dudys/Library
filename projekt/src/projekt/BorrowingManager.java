/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt;

import java.util.List;

/**
 *
 * @author jduda
 */
public interface BorrowingManager {
    void addBorrowing(Borrowing borrowing);
    void deleteBorrowing(Borrowing borrowing);
    void editBorrowing(Borrowing borrowing);
    Borrowing getBorrowingById(Long borrowindId);
    List<Borrowing> findBorrowingByReader(Reader reader);
    List<Borrowing> findAllBorrowings();
}

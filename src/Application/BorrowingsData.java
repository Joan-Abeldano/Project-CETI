/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.List;

/**
 *
 * @author labso20
 */
public class BorrowingsData {
    private List<Borrowing> borrowings;

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public void setBorrowings(List<Borrowing> borrowings) {
        this.borrowings = borrowings;
    }
    
    public void addBorrowing(Borrowing borrowing) {
        borrowings.add(borrowing);
    }
}

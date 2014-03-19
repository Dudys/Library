/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  create Java db 
 */

package projekt;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jduda
 */
public class BorrowingManagerImplTest {
    
    ReaderManager manager;
    
    @Before
    public void setUp() {
        manager = new ReaderManagerImpl();
    }

    @Test
    public void testAddBorrowing() {
        System.out.println("addReader");
        
        assertTrue("Database isn't empty", manager.findAllReaders().isEmpty());
        
        Reader reader = createBorrowing("Petr", "Botanicka 1", 123456789);
        manager.addReader(reader);
        
        Long readerId = reader.getId();
        assertNotNull(readerId);
        
        List<Reader> readers = manager.findAllReaders();
        assertEquals("Count of readers isn't same!", 1, readers.size());
        Reader returnReader = manager.findReaderById(readerId);
        assertEquals("Reader isn't same!", reader, returnReader);
        assertNotSame(reader, returnReader);
        assertAllParametrsEquals(reader, returnReader);
        
        try{
           manager.addReader(null);
           fail("You can add null.");
        } catch(NullPointerException npe){}
        
        try{
            manager.addReader(reader);
            fail("You can input same reader two times!");
        } catch(IllegalArgumentException iae){}
        
        try{
            reader = createReader(null, "Kounicova 4", 234987651);
            manager.addReader(reader);
            fail("Name can't be null!");
        } catch(IllegalArgumentException iae){}
        
        try{
            reader = createReader("Karel", null, 234987651);
            manager.addReader(reader);
            fail("Adress can't be null!");
        } catch(IllegalArgumentException iae){}
        
        try{
            reader = createReader("Karel", "Kounicova 4", -234987651);
            manager.addReader(reader);
            fail("Phone number can't be negative!");
        } catch(IllegalArgumentException iae){}
        
        try{
            reader = createReader("Karel", "Kounicova 4", 43215);
            manager.addReader(reader);
            fail("Phone number must have 9 digits!");
        } catch(IllegalArgumentException iae){}
        
        try{
            reader = createReader("Karel", "Kounicova 4", 0);
            manager.addReader(reader);
            fail("Phone number can't be zero!");
        } catch(IllegalArgumentException iae){}
        
        reader = createReader("Pepa", "Rusna 12", null);
        manager.addReader(reader);
        Reader result = manager.findReaderById(reader.getId()); 
        assertNotNull(result);
    }

    @Test
    public void testDeleteBorrowing() {
        System.out.println("deleteBorrowing");
        Borrowing borrowing = null;
        BorrowingManagerImpl instance = new BorrowingManagerImpl();
        instance.deleteBorrowing(borrowing);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEditBorrowing() {
        System.out.println("editBorrowing");
        Borrowing borrowing = null;
        BorrowingManagerImpl instance = new BorrowingManagerImpl();
        instance.editBorrowing(borrowing);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBorrowingById() {
        System.out.println("getBorrowingById");
        Long borrowindId = null;
        BorrowingManagerImpl instance = new BorrowingManagerImpl();
        Borrowing expResult = null;
        Borrowing result = instance.getBorrowingById(borrowindId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindBorrowingByReader() {
        System.out.println("findBorrowingByReader");
        Reader reader = null;
        BorrowingManagerImpl instance = new BorrowingManagerImpl();
        List<Borrowing> expResult = null;
        List<Borrowing> result = instance.findBorrowingByReader(reader);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAllBorrowings() {
        System.out.println("findAllBorrowings");
        BorrowingManagerImpl instance = new BorrowingManagerImpl();
        List<Borrowing> expResult = null;
        List<Borrowing> result = instance.findAllBorrowings();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

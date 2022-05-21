package Puissance4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    @Test
    void grid_should_be_empty_when_initialized() {
        Grid grille = new Grid();
//    Act : should contain one single fct
        boolean actual = grille.isEmpty();

//    Assert
        assertTrue(actual);
    }

    @Test
    void grid_should_not_be_empty_when_a_token_is_inserted() {
        Grid grille = new Grid();
//    Act : should contain one single fct
        grille.addToken("x", 1);
        boolean actual = grille.isEmpty();

//    Assert
        assertFalse(actual);
    }

    @Test
    void grid_should_have_7_column() {
        Grid grille = new Grid();//    Act : should contain one single fct
        int actual = grille.getColumnsCount();

//    Assert

        assertEquals(7, actual);
    }

    @Test
    void grid_should_have_6_rows() {
        Grid grille = new Grid();//    Act : should contain one single fct
        int actual = grille.getRowsCount();

//    Assert

        assertEquals(6, actual);
    }

    @Test
    void token_should_be_inserted_in_first_line_when_column_is_empty() {
        Grid grille = new Grid();
        String[] column = grille.getColumn(2);

        for (int i = 0; i < column.length; i++) {
            assertNull(column[i]);
        }

        grille.addToken("o", 2);

        column = grille.getColumn(2);

        for (int i = 0; i < column.length; i++) {
            if (i == 0)
                assertEquals("o", column[i]);
            else
                assertNull(column[i]);

        }
    }

    @Test
    void token_should_be_inserted_in_the_first_empty_row() {
        Grid grille = new Grid();
        String[] column = grille.getColumn(2);

        for (int i = 0; i < column.length; i++) {
            assertNull(column[i]);
        }

        grille.addToken("o", 2);
        grille.addToken("o", 2);
        grille.addToken("o", 2);

        column = grille.getColumn(2);

        for (int i = 0; i < column.length; i++) {
            if (i == 0 || i==1 || i == 2)
                assertEquals("o", column[i]);
            else
                assertNull(column[i]);

        }
    }

    @Test
    void token_should_not_be_inserted_when_column() {
        Grid grille = new Grid();
        String[] column = grille.getColumn(2);

        for (int i = 0; i < column.length; i++) {
            assertNull(column[i]);
        }

        grille.addToken("o", 2);
        grille.addToken("o", 2);
        grille.addToken("o", 2);
        grille.addToken("o", 2);
        grille.addToken("o", 2);
        grille.addToken("o", 2);



        assertThrows(IndexOutOfBoundsException.class,()->grille.addToken("o", 2));
    }


    @Test
    void token_should_not_be_inserted_on_invalid_colomn() {
        Grid grille = new Grid();
        assertThrows(InvalidColomnException.class,()->grille.addToken("o", 8));
        assertThrows(InvalidColomnException.class,()->grille.addToken("o", -1));
    }
//
//    @Test
//    void grid_should_have_7_columns(){
//        Grille grille=new Grille();
////    Act : should contain one single fct
//        int  actual=grille.getColumnsLength();
////    Assert
//        assertEquals(7,actual);
//
//    }
//    @Test
//    void should_have_6_rows(){
//        Grille grille=new Grille();
////    Act : should contain one single fct
//        int  actual=grille.getRowsLength();
////    Assert
//        assertEquals(6,actual);
//
//    }
//    @Test
//    void should_put_jeton_in_first_rows_when_grille_is_empty(){
//        Grille grille=new Grille();
////    Act : should contain one single fct
//        int  actual=grille.addJeton(1);
////    Assert
//        assertEquals(1,actual);
//
//
//    }
}


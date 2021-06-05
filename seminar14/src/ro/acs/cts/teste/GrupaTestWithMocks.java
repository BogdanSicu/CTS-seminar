package ro.acs.cts.teste;

import org.junit.BeforeClass;
import org.junit.Test;
import ro.acs.cts.clase.Grupa;
import ro.acs.cts.mock.StudentDummy;

import static junit.framework.TestCase.assertEquals;


public class GrupaTestWithMocks {
    private static Grupa grupa;

    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1,grupa.getStudenti().size());
    }

    @Test
    public void adaugaStudentBoundarySuperior(){
        assertEquals(35,grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1086);
        for(int i=0;i<35;i++){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudentExceptie(){
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
    }

}

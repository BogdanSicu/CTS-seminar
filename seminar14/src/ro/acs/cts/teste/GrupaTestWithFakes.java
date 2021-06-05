package ro.acs.cts.teste;

import org.junit.Test;
import ro.acs.cts.clase.Grupa;
import ro.acs.cts.mock.StudentFake;

import static junit.framework.TestCase.assertEquals;

public class GrupaTestWithFakes {
    @Test
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1086);
        for (int i = 0; i < 7; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for (int i = 0; i < 3; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(true);
            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.7,grupa.getPromovabilitate(), 0.001);
    }

}

package ro.acs.cts.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.acs.cts.categories.TesteRight;
import ro.acs.cts.categories.TesteUrgente;
import ro.acs.cts.clase.Grupa;
import ro.acs.cts.mock.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithStubs {

    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void testGetPromovabilitateRight() {
        Grupa grupa = new Grupa(1086);
        for (int i = 0; i < 5; i++)
        {
            StudentStub studentStub = new StudentStub();
            grupa.adaugaStudent(studentStub);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.1);
    }
}
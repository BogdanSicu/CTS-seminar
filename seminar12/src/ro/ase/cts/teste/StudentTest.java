package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructorWorksForName(){
        String nume = "Alex";
        Student student = new Student(nume);
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testSetNume() {
        String nume = "Alex";
        Student student = new Student();
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testDefaultConstructorList(){
        Student student = new Student();
        assertNotNull("Lista de note nu a fost initializata",student.getNote());
        assertNotNull("Numele studentului nu a fost initializat",student.getNume());
    }

    @Test
    public void testAdaugaNota(){
        int nota = 5;
        Student student = new Student();
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }


}
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

    @Test
    public void testGetNotaForMoreNota(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(9);
        student.adaugaNota(7);
        student.adaugaNota(3);
        assertEquals(5, student.getNota(0));
        assertEquals(9, student.getNota(1));
        assertEquals(7, student.getNota(2));
        assertEquals(3, student.getNota(3));
    }

    @Test
    public void testAdaugaOSinguraNota(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorecta(){
        Student student = new Student();
        try{
            student.adaugaNota(-1);
            fail("S-a introdus o valoare incorecta");
        }catch(IllegalArgumentException e){

        }catch(Exception e){
            fail("Nu arunca o exceptie de tipul IllegalArgumentException");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJunit4(){
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @Test
    public void testStudentAreRestanta(){
        Student student = new Student();
        student.adaugaNota(3);
        boolean rezultat = student.areRestante();
        assertTrue(rezultat);
    }

    @Test
    public void testStudentNuAreRestanta(){
        Student student = new Student();
        student.adaugaNota(5);
        boolean rezultat = student.areRestante();
        assertFalse(rezultat);
    }

    @Test
    public void testCalculeazaMedieCorect(){
        Student student = new Student();
        student.adaugaNota(4);
        student.adaugaNota(5);
        assertEquals(4.5, student.calculeazaMedie(), 0.0001);
    }

}
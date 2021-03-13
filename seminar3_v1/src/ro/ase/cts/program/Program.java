package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AplicantReadable;
import ro.ase.cts.clase.readers.ElevReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicant(AplicantReadable aplicantReadable) throws FileNotFoundException{
		return aplicantReadable.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicant(new ElevReader("elevi.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

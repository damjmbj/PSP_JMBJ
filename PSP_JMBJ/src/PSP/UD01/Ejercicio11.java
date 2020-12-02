package PSP.UD01;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author JMBJ
 * 
 * 
 *	Realiza una clase Java cuyo método main lance un proceso ejecutando la
 *  clase del Ejercicio10.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		List<String> lCmd = new ArrayList<String>();
		lCmd.add("java");
		lCmd.add("/home/DAM-2/git/PSP_JMBJ/PSP_JMBJ/src/PSP/UD01/Ejercicio10.java");
		
		ProcessBuilder pb = new ProcessBuilder(lCmd);
		String classPath = Ejercicio10.class.getClassLoader().getResource("").getPath();
		pb.environment().put("CLASSPATH", classPath);
		pb.inheritIO();
		
		try {
			pb.start();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

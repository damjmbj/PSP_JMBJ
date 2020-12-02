package PSP.UD01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 
 * @author JMBJ
 *
 */
public class Ejercicio10 {

	private static final String NOMBRE_VARIABLE = "MI_NOMBRE";
	private static final String NOMBRE = "JOSE MANUEL";

	public static void main(String[] args) {

		List<String> lCmdLinux = new ArrayList<String>();
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");

		List<String> lCmdWin = new ArrayList<String>();
		lCmdWin.add("cmd");
		lCmdWin.add("/C");
		lCmdWin.add("echo");
		lCmdWin.add("%MI_NOMBRE");

		List<String> lCommand = null;
		if (System.getProperty("os.name").contains("Windows")) {
			lCommand = lCmdWin;
		} else {
			lCommand = lCmdLinux;
		}

		ProcessBuilder pb = new ProcessBuilder(lCommand);
		pb.environment().put(NOMBRE_VARIABLE, NOMBRE);
		pb.inheritIO();
		try {
			pb.start();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}

import java.io.File;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Executor {
	private final static String SCRIPT_TO_RUN = "es6" + File.separator + "out" + File.separator + "modules.consume.js"; // Transpiled
//private final static String SCRIPT_TO_RUN = "es6" + File.separator + "modules.consume.js"; // Not transpiled

	private final static String NASHORN_ARGS = "nashorn.args";
	private final static String ES_6 = "--language=es6";


	public static void main(String... args) throws Exception {

		System.out.println(String.format("Running from [%s]", System.getProperty("user.dir")));

		String script =  SCRIPT_TO_RUN;
		if (args.length > 0) {
			script = args[0];
		}
		System.setProperty(NASHORN_ARGS, ES_6);
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("nashorn");
		FileReader reader = new FileReader(script);
		try {
			engine.eval(reader);
		} catch (Exception ex) {
			System.err.println("Ooops:" + ex.toString());
		} finally {
			reader.close();
		}
		// Another approach
		try {
			String command = String.format("load('%s');", script);
			System.out.println(String.format("Executing [%s]", command));
			engine.eval(command);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		engine.eval("print('Bye now.');");
	}
}
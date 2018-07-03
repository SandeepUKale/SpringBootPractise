
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestProperties {
	public static void main(String[] args) {
		Map<String, String> dePropertiesMap = readFileInList(
				"C:/sandeep/SDOS_GUI/worldline-gui/worldline-gui-web/src/main/resources/app.properties");

		Map<String, String> enPropertiesMap = readFileInList(
				"C:/sandeep/SDOS_GUI/worldline-gui/worldline-gui-web/src/main/resources/app_en.properties");

		Map<String, String> propertiesMap = new LinkedHashMap<>();
		for (String key : enPropertiesMap.keySet()) {
			propertiesMap.put(key, (dePropertiesMap.get(key) == null ? ("[DE]" + enPropertiesMap.get(key))
					: dePropertiesMap.get(key)));
			// System.out.println(key+":"+ dePropertiesMap.get(key));
		}
		
		for (String key : dePropertiesMap.keySet()) {
		if(enPropertiesMap.get(key)==null)			
			System.out.println(key+":"+ dePropertiesMap.get(key));
		}
		
		//createFileUsingFileOutputStreamClass(
			//	"C:/sandeep/SDOS_GUI/worldline-gui/worldline-gui-web/src/main/resources/app_test.properties",
				//propertiesMap);
	}

	private static void createFileUsingFileOutputStreamClass(String filePath, Map<String, String> dePropertiesMap) {
		FileOutputStream out;
		try {
			out = new FileOutputStream(filePath);
			for (String key : dePropertiesMap.keySet()) {
				out.write((key + "=" + dePropertiesMap.get(key) + "\n").getBytes());
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Map<String, String> readFileInList(String fileName) {
		Map<String, String> propertiesMap = new LinkedHashMap<>();
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			for (String line : lines) {
				String[] entries = line.split("=");
				if (entries.length > 1)
					propertiesMap.put(entries[0], entries[1]);
				else
					propertiesMap.put(entries[0], "");
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return propertiesMap;
	}
}

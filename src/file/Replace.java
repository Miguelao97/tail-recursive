package file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Replace {

	public static void main(String[] args) {
		Path path = Paths.get("resource/JavaClass.java");
		Path out = Paths.get("outFiles/Main.java");
		Charset charset = StandardCharsets.UTF_8;

		try {
			String content = new String(Files.readAllBytes(path));
			content = content.replaceAll("\\$className", "Main");

			Files.write(out , content.getBytes(charset));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package project.generator;

import java.util.regex.Pattern;

public class Constants {


	// GENERATION CONSTANTS

	public static final String JAVA_VERSION = "1.8";

	public static final Pattern REGEX = Pattern.compile("/\\|:([\\s\\S]+?)%\\|/g");

	public static final String MAIN_DIR = "src/main/";
	public static final String TEST_DIR = "src/test/";
	public static final String CLIENT_DIST_DIR = "static/";
	public static final String FILE_EXT = ".ccft"; //Cool Custom File Template

	public static final String DOCKER_DIR = MAIN_DIR + "src/test/";

	public static final Integer LINE_LENGTH = 180;



	public static final String CLIENT_MAIN_SRC_DIR = MAIN_DIR + "webapp/";
	public static final String CLIENT_TEST_SRC_DIR = TEST_DIR + "javascript/";
	public static final String CLIENT_WEBPACK_DIR = MAIN_DIR + "webpack/";

	public static final String ANGULAR_DIR = MAIN_DIR + "webapp/app/";
	public static final String REACT_DIR = MAIN_DIR + "webapp/app/";

	public static final String SERVER_MAIN_SRC_DIR = MAIN_DIR + "java/";
	public static final String SERVER_MAIN_RES_DIR = MAIN_DIR + "resources/";
	public static final String SERVER_TEST_SRC_DIR = TEST_DIR + "java/";
	public static final String SERVER_TEST_RES_DIR = TEST_DIR + "resources/";

}

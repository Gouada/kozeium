package core;

// this is a helper class for loading properties files at run time
// depending of return value of the getDeviceLang-Method of ADB-class a properties file is loaded
// i.e if device lang is german, then the file "de-DE is loaded for english USA the file en-US is loaded
// this class is a sigleton-class

import static core.constants.Constants.PROPERTIES_FILE_FOLDER;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Level;

public class PropertiesFilesLoader {

	// path to the properties-file (which is
	// /src/main/resources/properties_files) but here we will refer the relative
	// path /properties_files
	private static String file_path;
	public static Properties properties;
	private static InputStream fileInput;

	private static PropertiesFilesLoader singletonInstance;

	// constructor
	public PropertiesFilesLoader(String filename) {
		file_path = "/" + PROPERTIES_FILE_FOLDER + "/" + filename;
		// this.filename = filename;
	}

	public synchronized static PropertiesFilesLoader getInstance(String filename) {
		if (singletonInstance == null) {
			singletonInstance = new PropertiesFilesLoader(filename);
		}
		return singletonInstance;
	}

	// this method load the properties-file
	public synchronized Properties loadPropertiesFile() {
		MyLogger.logger.setLevel(Level.DEBUG);
		try { // return the properties-file as InputStream
			fileInput = getClass().getResourceAsStream(file_path);
			// fileInput =
			// Class.forName("PropertiesFilesLoader").getResourceAsStream(file_path);

			properties = new Properties();
			if (fileInput == null) {
				MyLogger.logger.error("properties-file " + file_path + "could not be loaded");
				throw new FileNotFoundException();
			} else {
				MyLogger.logger.info("succes loading properties-file " + file_path);
			}
			// loading properties-file
			properties.load(fileInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	// return a property by the key
	public String getPropertyByKey(String propertyKey) {
		Properties proP = loadPropertiesFile();

		MyLogger.logger.info("getting property with following key..." + propertyKey);
		if (proP == null) {
			MyLogger.logger.info("properties is null............");
		} else {
			MyLogger.logger.info(" found corresponding property " + proP.getProperty(propertyKey));
		}
		return proP.getProperty(propertyKey);
	}
}

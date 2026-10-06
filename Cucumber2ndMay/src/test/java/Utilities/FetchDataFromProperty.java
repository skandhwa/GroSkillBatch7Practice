package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantsData.ConstantsData;

public class FetchDataFromProperty {
	
	public static Properties getDataProperty() throws IOException
	{
		FileReader reader=new FileReader(ConstantsData.PROP_FILE_PATH);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
	}
	
	

}

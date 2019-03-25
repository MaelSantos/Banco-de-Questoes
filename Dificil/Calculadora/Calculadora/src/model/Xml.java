package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class Xml {

	private static XStream xStream = new XStream(new Dom4JDriver());
	private static File file = new File("res/calculo.xml");
	
	public static void salvar(String texto)
	{
		try {
			if(!file.exists())
				file.createNewFile();
			else 
			{
				file.delete();
				file.createNewFile();
			}
			
			OutputStream outputStream = new FileOutputStream(file);
			xStream.alias("Calculo", String.class);
			xStream.toXML(texto, outputStream);
			
		} catch (IOException e) {
		}
		
	}
	
}

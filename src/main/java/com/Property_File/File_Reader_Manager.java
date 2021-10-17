package com.Property_File;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
	}
	
	public static File_Reader_Manager getInstanceFRM() {
		//create an object for File_Reader_Manager
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;

	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
       //create an object for Configuration Reader
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}

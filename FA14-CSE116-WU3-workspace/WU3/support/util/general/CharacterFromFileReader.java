package util.general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class CharacterFromFileReader implements Iterator<Character> {

	private final static int EOF_VALUE = -1; 

	private InputStreamReader inputStream;
	private int lastRead;
//	private String newLine;

	public CharacterFromFileReader(String path) {
//		newLine = System.getProperty("line.separator");
		try {
			inputStream = new InputStreamReader(new FileInputStream(path),"UTF-8");
			read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			finish();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void finish() {
		lastRead = EOF_VALUE;
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void read() {
		try {
			lastRead = inputStream.read();
		} catch (IOException e) {
			finish();
		}
	}

	@Override
	public boolean hasNext() {
		return lastRead != EOF_VALUE;
	}

	@Override
	public Character next() {
		char c = (char) lastRead;
		read();
		return c;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}

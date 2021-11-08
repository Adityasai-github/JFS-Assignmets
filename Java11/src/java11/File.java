package java11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class File {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		var path=("C:\\Users\\Adityasai\\file1\\hii.txt");
		List<String> str = Files.readAllLines(Path.of(path));
		 
		  long count =   str.stream().filter(l -> !(l.isBlank())).count();
		 System.out.println(str.stream().filter(l -> !(l.isBlank())).map(l-> l.strip()).collect(Collectors.toList()) + "\nThere are " +count + " Students");  
	}

}

package com.fileio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.StandardWatchEventKinds.*;

public class EmployeePayrollService {
	public void listFilesDirectory() throws IOException, InterruptedException  {
        
		List<String> line=	Files.readAllLines(Paths.get("C:\\Users\\Amar\\Desktop\\RFP-Java-Basics\\FileIO\\src\\main\\java\\com\\fileio\\TestDemo.txt"));
				for(String lines:line) {
					System.out.println(lines);
				}
		}
	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj=new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}

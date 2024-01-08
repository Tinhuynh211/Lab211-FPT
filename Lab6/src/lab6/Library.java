/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	private ArrayList<Book> list;
	
	
	public Library() {
		this.list = new ArrayList<Book>();
	}
	public Library(ArrayList<Book> list) {
		
		this.list = list;
	}
	
	public void readFile() throws FileNotFoundException, IOException {
		String pathFile = "/Users/ADMIN//Searches/lib.txt";
               
	    File file = new File(pathFile);
	    String line = "";
	    // lop bufferreader de doc du lieu string trong file
	    try(BufferedReader br = new BufferedReader(new FileReader(file))){
	    	line = br.readLine();
	    // doc tung dong 1
	    	while ((line = br.readLine()) != null && !line.isEmpty()) {
	    		String[] fields = line.split("-");
	    		String bookID = fields[0];
	    		String bookTitle = fields [1];
	    		String author= fields [2];
	    		int yearPublished = Integer.parseInt(fields[3]);
	    //se duoc ep kieu thanh parseInt doi thanh string
	    		Book newBook = new Book(bookID, bookTitle, author, yearPublished);
	    		list.add(newBook);
	    		
			}
	    } catch(FileNotFoundException e){
	        e.printStackTrace();
	        
	    }catch(IOException e){
	        e.printStackTrace();
	    }
		
    
}

package chapter13;

import java.util.Scanner;

public class URL {
	
	public static void extractFromURL(String url){
		String[] newUrl = url.split("[/:]+");
		String protocol = newUrl[0];
		String server = newUrl[1];
		String resource = "";
		
		if(newUrl.length > 2){
			for(int i = 2; i < newUrl.length; i++){
				resource += "/" + newUrl[i];
			}
		} else {
			resource = "no resouce found";
		}
		
		System.out.printf("[protocol]=\"%s\"\n[server]=\"%s\"\n[resource]=\"%s\"", protocol, server, resource);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter URL: ");
		String url = scan.nextLine();
		
		extractFromURL(url);
		
		scan.close();
		//test without Scanner - https://domino2.musala.com/mail/elizabetrp.nsf/
	}
}

package treeeeeeeees;

import java.io.File;
import java.util.Scanner;

public class HuffmanTester {

	
	public static void main(String[] args) throws Exception {
		File f=new File(args[0]);
		Scanner file=new Scanner(f);
		HuffmanTree huffDaddy=new HuffmanTree();
		while(file.hasNext()){
			String s=file.nextLine();
			char c=s.charAt(0);
			s=s.substring(1);
			huffDaddy.insert(c,s);
		}
		Scanner scan=new Scanner(new File(args[1]));
		String st=new String();
		while (scan.hasNext())
			st+=scan.next();
		scan.close();
		String message="";
		for(int i = 2; 1<st.length();i++)
		{
			Character c = huffDaddy.decode(st.substring(0,i), huffDaddy.getRoot());
			if (c!=null){
				message+=c;
				i=2;
			}
		}
		System.out.println(message);
	}

}

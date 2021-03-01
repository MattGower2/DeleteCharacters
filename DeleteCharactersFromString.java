package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	

	public void run() {
		
		println(removeAllOccurrences("This is a test", 't'));  //returns "This is a es"
		println(removeAllOccurrences("Summer is here!", 'e'));  // returns "Summr is hr"
		println(removeAllOccurrences("---0---", '-')); //returns //"0"
		println(removeAllOccurrences("Im Pickle Rick", 'i'));
		
	}
		public String removeAllOccurrences(String str, char ch) {
		
			String takefrom = Character.toString(ch);
			String bigfinale = str.replace(takefrom, "");
			return bigfinale;
		}
		
	}



		
				
				

				
				
			

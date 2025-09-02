import java.util.*;
public class St {
    public static void main(String[] args) {
        		Scanner sc=new Scanner(System.in);
		
//      QUESTION 1
//        String s1= sc.nextLine();
//        String s2=sc.nextLine();
        // Case Sensitive
        // if(s1.equals(s2)){
        //     System.out.println("equale string");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }

        // Case Insensitive
//        if(s1.toUpperCase().equals(s2.toUpperCase())){
//            System.out.println("equale string");
//        }
//        else{
//            System.out.println("Not Equal");
//        }
        
		
//		question 2
//		String s=sc.nextLine();
//		StringBuilder res=new StringBuilder();
//		for(char i:s.toCharArray()) {
//			if(i>='a' && i<='z') {
//				i=(char)(i-32);
//			}
//			res.append(i);
//		}
//        System.out.print(res);
        
		
//		Question 3
//		String s=sc.nextLine();
//		int count=0;
//		for(char i:s.toCharArray()) {
//			if(i=='a'||i=='e' || i=='i'|| i=='o'|| i=='u'|| i=='A'||i=='E' || i=='I'|| i=='O'|| i=='U') {
//				count++;
//			}
//		}
//        System.out.println(count+" vowels");
        
//        Find the length of string without using length()
//		String s=sc.nextLine();
//		int length=0;
//		for(char i:s.toCharArray()) {
//			length=length+1;
//		}
//		System.out.print(length+" length");
			
//		Q4. Check if a string is a palindrome.
//		String s=sc.next();
//		boolean isPalindrome=true;
//		int left=0;
//		int right=s.length()-1;
//		while(left<right) {
//			if(s.charAt(left)!=s.charAt(right)) {
//				isPalindrome=false;
//				break;
//			}
//			left++;
//			right--;
//		}
//		if(isPalindrome) {
//			System.out.print(true);
//		}
//		else {
//			System.out.print(false);
//		}
		
//		Q5. Find the first non-repeating character in a string.
//		String s=sc.next();
//		int freq[]=new int[256];
//		for(int i=0;i<s.length();i++) {
//			freq[s.charAt(i)]++;
//		}
//		for(int i=0;i<s.length();i++) {
//			if(freq[s.charAt(i)]==1) {
//				System.out.print("first non repeating number is:"+s.charAt(i));
//				return;
//			}
//		}
//		System.out.print("No repeating character");
		
//		Q6.Count the number of words in a string (use StringTokenizer).
//		String s=sc.nextLine();
//		StringTokenizer token=new StringTokenizer(s);
//		int count=token.countTokens();
//		System.out.print("number of words "+count);
		
//		Q7.Replace all spaces with hyphens in a string.
//		String s=sc.nextLine();
//		String res=s.replace(" ","-");
//		System.out.print(res);
		
//		Q8.Find the ASCII value of each character in a string.
//		String s=sc.nextLine();
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			int ascii=(int)c;
//			System.out.println(s.charAt(i)+" ascii value is "+ascii);
//		}

//		Q9.Reverse each word in a sentence (e.g., "Hello World" → "olleH dlroW").
//		String s=sc.nextLine();
//		StringBuilder res=new StringBuilder();
//		String words[]=s.split(" ");
//		for(String i:words) {
//			StringBuilder rev=new StringBuilder(i);
//			res.append(rev.reverse()).append(" ");
//		}
//		System.out.println(res);
		
//		Q10.Remove duplicate characters from a string.
//		String s=sc.nextLine();
//		 Set<Character> seen = new LinkedHashSet<>();
//	        for (char ch : s.toCharArray()) {
//	            seen.add(ch);
//	        }
//
//	        StringBuilder result = new StringBuilder();
//	        for (char ch : seen) {
//	            result.append(ch);
//	        }
//
//	        System.out.println("String after removing duplicates: " + result);
//	    
		
//		Q11.Check if two strings are anagrams.
		

        sc.close();
     

    }
}

/*
 * Written by Savanna Shaver
 */
public class StringHelperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the String Helper Tester!");
		System.out.println("");
		System.out.println("Testing Has All Unique Characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		System.out.println("Testing Has All Unique Characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		System.out.println("");
		System.out.println("Testing Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshString("harp","fiddle"));
		System.out.println("");
		System.out.println("Testing Replace Vowels with Oodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		System.out.println("");
		System.out.println("Testing Weight with \"heavy\"");
		System.out.println(StringHelper.weight("heavy"));
		System.out.println("");
		System.out.println("Testing Weight with \"light\"");
		System.out.println(StringHelper.weight("light"));
	}
	

}

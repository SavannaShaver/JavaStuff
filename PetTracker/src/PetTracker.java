/*
 * Written by Savanna Shaver
 */
public class PetTracker {

	public static void main(String[] args) {
		Pet pet01;//null
		pet01 = new Pet();
		
		Pet pet02 = new Pet("Fluffy", 20.0,PetType.cat);
		System.out.println(pet01);
		System.out.println(pet02);
		Pet pet03 = Pet.createPet(PetType.dog);
		System.out.println(pet03);
		Pet pet04 = Pet.splice(pet02, pet03);
		System.out.println(pet04);
		

	}
	

}

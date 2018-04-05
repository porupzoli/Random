import java.util.Random;


public class RandomClass {
	
	
	public static void main(String[] args) {
		
		int[] array= new int[10];
		int[] array2= new int[10];
		Random randomizer = new Random();
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=randomizer.nextInt(50)+1;
			System.out.println(array[i]);
		}
		for (int i : array) {
			System.out.println(i);
		}
		for(int i=0; i<array2.length; i++)
		{
			array2[i]=(int)(Math.random()*50)+1;
			System.out.println(array2[i]);
		}
		
	}

}

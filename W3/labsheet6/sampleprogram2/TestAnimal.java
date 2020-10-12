package W3.labsheet6.sampleprogram2;

//TestAnimal.java
/*A driver (test) class that contains the main() method for
testing the functionality of the Animal class. This version of the driver is
also to demonstrate the creation of an array of Animal objects*/


import labsheet6.sampleprogram2.Animal;

public class TestAnimal {
    public static void main( String args[]) {

        labsheet6.sampleprogram2.Animal allAnimals[] = new labsheet6.sampleprogram2.Animal[10];

        System.out.println("Calling the no-argument constructor to create the first animal....");
        labsheet6.sampleprogram2.Animal animal1 = new labsheet6.sampleprogram2.Animal(); //tests no-arg constructor

        String lionContinents[] = {"Africa","Asia"}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\nCalling the 4-argument constructor to create a lion object....");
        labsheet6.sampleprogram2.Animal animal2  = new labsheet6.sampleprogram2.Animal("Lion",lionContinents,200,40);

        System.out.println("\nCalling the 4-argument constructor to create a rat object....");
        labsheet6.sampleprogram2.Animal animal3  = new labsheet6.sampleprogram2.Animal("Rat",new String[]{"Europe","America","Africa","Asia"},0.2,5);

        System.out.println("\nCalling the 4-argument constructor to create a polar bear object....");
        labsheet6.sampleprogram2.Animal animal4  = new Animal("Polar Bear",new String[]{"Antarctica"},450,15);

        allAnimals[0] = animal1;
        allAnimals[1] = animal2;
        allAnimals[2] = animal3;
        allAnimals[3] = animal4;

        System.out.println("\n\nThe details of all the animals in the Animal array are:\n\n");

        for(int i=0;i<allAnimals.length;i++)
            System.out.println(allAnimals[i]+"\n\n");

    }
}

public class Mammal extends Animal {
    
    public static void main(String[] args){

        Animal mam = new Animal();
       
        //it is an object of the animal class
        mam.name = "Musa isa";
        mam.age = 34;
        
         System.out.println("his name is " + name + " and he is " + age);
        mam.makeSound();
    }
}

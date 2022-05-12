import Display.*;
import Animals.Hamster;
import Animals.Rabbit;
import Animals.Dog;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean chosenPet = false;
        String pet = "";
        while(!chosenPet){
            try{
                pet = JOptionPane.showInputDialog("Chosen pet:");
                if(pet.equals("Hamster") || pet.equals("Dog") || pet.equals("Rabbit")) {
                    chosenPet = true;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Invalid input");
            }
        }

        if(pet.equals("Hamster")){
            String name = JOptionPane.showInputDialog("Pet's name:");
            new Display(new Hamster(name));
        } else if(pet.equals("Dog")){
            String name = JOptionPane.showInputDialog("Pet's name:");
            new Display(new Dog(name));
        } else if(pet.equals("Rabbit")){
            String name = JOptionPane.showInputDialog("Pet's name:");
            new Display(new Rabbit(name));
        }

    }
}

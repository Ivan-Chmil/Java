/**
 * Клас "тварина" з вибором трьох можливих видів та їх описом
 * @autor Чміль Іван 302 група
 * @version 1.0
*/

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDate;

public class main {
    public static void main(String[] args)

    {
       Dog Dog1=new Dog();

       Dog1.setBreed(Dog_Breed.DALMATIAN);
       Dog1.setId(777);
       Dog1.setType(Type.MAMMAL);
       Dog1.setSex(Sex.MALE);
       Dog1.setName("Jack");
       Dog1.setBirthdate(LocalDate.of(2010, 2, 13));

       System.out.println(Dog1.toString());


       Cat Cat1=new Cat();

       Cat1.setBreed(Cat_Breed.PERSIAN);
       Cat1.setId(543);
       Cat1.setType(Type.MAMMAL);
       Cat1.setSex(Sex.FEMALE);
       Cat1.setName("Murchal");
       Cat1.setBirthdate(LocalDate.of(2015, 4, 17));

       System.out.println(Cat1.toString());

       Parrot Par1=new Parrot();

       Par1.setBreed(Parrot_Breed.RED_BLUE_MACAW);
       Par1.setId(228);
       Par1.setType(Type.BIRDS);
       Par1.setSex(Sex.MALE);
       Par1.setName("NeKesha");
       Par1.setBirthdate(LocalDate.of(2019, 11, 7));

       System.out.println(Par1.toString());

       System.out.print("\nId1:" + Par1.hashCode() + " = Id2:" + Dog1.hashCode() + " - " +Par1.equals(Dog1) + "\n");

       Dog Dog2 = new Dog().new Implem().setId(12).setName("Vasia").setSex(Sex.MALE).build();

       System.out.println(Dog2.toString());



    }
}
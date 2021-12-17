/**
 * Клас "тварина" з вибором трьох можливих видів та їх описом
 * @autor Чміль Іван 302 група
 * @version 1.0
*/

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args)

    {

       Cat Cat1=new Cat();

       Cat1.setBreed(Cat_Breed.PERSIAN);
       Cat1.setId(543);
       Cat1.setType(Type.MAMMAL);
       Cat1.setSex(Sex.FEMALE);
       Cat1.setName("Murchal");
       Cat1.setAge(11);

       System.out.println(Cat1.toString());

       Cat Cat2=new Cat();

       Cat2.setBreed(Cat_Breed.BOMBAY);
       Cat2.setId(53);
       Cat2.setType(Type.MAMMAL);
       Cat2.setSex(Sex.MALE);
       Cat2.setName("Vasia");
       Cat2.setAge(6);

       System.out.println(Cat2.toString());

       Cat Cat3=new Cat();

       Cat3.setBreed(Cat_Breed.SPHYNX);
       Cat3.setId(28);
       Cat3.setType(Type.MAMMAL);
       Cat3.setSex(Sex.FEMALE);
       Cat3.setName("Murka");
       Cat3.setAge(8);

       System.out.println(Cat3.toString());

       List<Cat> ListOfAnimals = new ArrayList<Cat>();
       Cat1.addToList(ListOfAnimals);
       Cat2.addToList(ListOfAnimals);
       Cat3.addToList(ListOfAnimals);

       Cat2.removefList(ListOfAnimals);





       new Cat().printList(ListOfAnimals);

       System.out.println(Cat1.compareToo(Cat2));

       ComparaToR compare = new ComparaToR();

       System.out.println(compare.compare(Cat1, Cat2));

    }
}
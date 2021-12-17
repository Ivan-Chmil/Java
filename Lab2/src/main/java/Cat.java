import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cat extends Animal implements Comparable
{
    private String cawt="Cat";
    private Cat_Breed breed;
    private int age;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public Cat_Breed getBreed() {
        return breed;
    }

    public void setBreed(Cat_Breed breed) {
        this.breed = breed;
    }



    public int compareToo(Cat a)
    {
        System.out.println("Різниця у віці:");
        return this.age-a.age;
    }

    @Override
    public String toString()
    {
        return "\n Animal(" + cawt + "):" +
                "\n id:" + id +
                "\n name:" + name +
                "\n type:" + type +
                "\n sex:" + sex +
                "\n age:" + age +
                "\n breed:" + breed;
    }



    //Присутні 3 методи для роботи із колекціями
    public List<Cat> addToList(List<Cat> List1)
    {
        List1.add(this);
        return List1;
    }

    public void removefList(List<Cat> List2)
    {
        List2.remove(this);
    }


    public void printList(List<Cat> List3) {
        System.out.println("\n List of cats:");
        for (Cat elem : List3) {
            System.out.println(elem.toString());
        }
    }

//    public List<Cat> sortList(List<Cat> List4)
//    {
//        return Collections.sort(List4, Cat::compareTo);
//    }

    }











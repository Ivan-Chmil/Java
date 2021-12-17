import java.util.Comparator;

public class ComparaToR implements Comparator<Cat>
{

    @Override
    public int compare(Cat o1, Cat o2)
    {
        System.out.println("Різниця у віці:");
        return o1.getAge()-o2.getAge();
    }
}

import java.awt.event.PaintEvent;
import java.time.LocalDate;
import java.util.*;

public class Animal implements Comparable
{
  protected int id;
  protected Type type;
  protected String name;
  protected Sex sex;
  protected LocalDate birthdate;


//    public int compareTo(Animal o)
//    {
//        return this.birthdate.compareTo(o.birthdate);
//    }


  public boolean equals (Animal animal)
  {
      return this.id == animal.id;
  }

  public int hashCode()
  {
      return id;
  }

//    public String toString()
//    {
//        return "\n Animal:" +
//                "\n name:" + name +
//                "\n type:" + type +
//                "\n sex:" + sex +
//                "\n BirthDate:" + birthdate;
//
//    }



    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Sex getSex()
    {
        return sex;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

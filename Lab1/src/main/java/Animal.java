import java.awt.event.PaintEvent;
import java.time.LocalDate;

public class Animal
{
  protected int id;
  protected Type type;
  protected String name;
  protected Sex sex;
  protected LocalDate birthdate;


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
//                "\n birthDate:" + birthdate;
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


//    public interface AnimalBuilder
//    {
//        AnimalBuilder setId(int id);
//        AnimalBuilder setType(Type type);
//        AnimalBuilder setName(String name);
//        AnimalBuilder setSex(Sex sex);
//        AnimalBuilder setDate(LocalDate bday);
//        Dog build();
//    }
//
//    public class Implem implements AnimalBuilder
//    {
//        Animal animal = new Animal();
//
//        @Override
//        public AnimalBuilder setId(int id) {
//            animal.id = id;
//            return this;
//        }
//
//        @Override
//        public AnimalBuilder setType(Type type) {
//            animal.type = type;
//            return this;
//        }
//
//        @Override
//        public AnimalBuilder setName(String name) {
//            animal.name = name;
//            return this;
//        }
//
//        @Override
//        public AnimalBuilder setSex(Sex sex) {
//            animal.sex = sex;
//            return this;
//        }
//
//        @Override
//        public AnimalBuilder setDate(LocalDate bday) {
//            animal.birthdate = bday;
//            return this;
//        }
//
//        @Override
//        public Animal build() {
//            return animal;
//        }
//    }
}

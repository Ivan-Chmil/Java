import java.time.LocalDate;

public class Dog extends Animal
{
    private String dawg="Dog";
    private Dog_Breed breed;

    public Dog_Breed getBreed() {
        return breed;
    }

    public void setBreed(Dog_Breed breed) {
        this.breed = breed;
    }

    @Override

    public String toString()
    {
        return "\n Animal(" + dawg + "):" +
                "\n name:" + name +
                "\n type:" + type +
                "\n sex:" + sex +
                "\n birthDate:" + birthdate +
                "\n breed:" + breed;
    }

    public interface AnimalBuilder
    {
        AnimalBuilder setId(int id);
        AnimalBuilder setType(Type type);
        AnimalBuilder setName(String name);
        AnimalBuilder setSex(Sex sex);
        AnimalBuilder setDate(LocalDate bday);
        Dog build();
    }

    public class Implem implements AnimalBuilder
    {
        Dog animal = new Dog();

        @Override
        public AnimalBuilder setId(int id) {
            animal.id = id;
            return this;
        }

        @Override
        public AnimalBuilder setType(Type type) {
            animal.type = type;
            return this;
        }

        @Override
        public AnimalBuilder setName(String name) {
            animal.name = name;
            return this;
        }

        @Override
        public AnimalBuilder setSex(Sex sex) {
            animal.sex = sex;
            return this;
        }

        @Override
        public AnimalBuilder setDate(LocalDate bday) {
            animal.birthdate = bday;
            return this;
        }

        @Override
        public Dog build() {
            return animal;
        }
    }
}

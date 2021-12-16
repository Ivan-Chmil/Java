public class Cat extends Animal
{
    private String cawt="Cat";
    private Cat_Breed breed;

    public Cat_Breed getBreed() {
        return breed;
    }

    public void setBreed(Cat_Breed breed) {
        this.breed = breed;
    }

    @Override

    public String toString()
    {
        return "\n Animal(" + cawt + "):" +
                "\n name:" + name +
                "\n type:" + type +
                "\n sex:" + sex +
                "\n birthDate:" + birthdate +
                "\n breed:" + breed;
    }
}


public class Parrot extends Animal
{
    private String pawt="Carrot";
    private Parrot_Breed breed;

    public Parrot_Breed getBreed() {
        return breed;
    }

    public void setBreed(Parrot_Breed breed) {
        this.breed = breed;
    }

    @Override

    public String toString()
    {
        return "\n Animal(" + pawt + "):" +
                "\n name:" + name +
                "\n type:" + type +
                "\n sex:" + sex +
                "\n birthDate:" + birthdate +
                "\n breed:" + breed;
    }

}

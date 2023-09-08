public class Owner implements SoundEffect {
    private String ownerName;

    public Owner(String name) {
        this.ownerName = name;
    }

    public Owner() {
        this(null);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void makeSound() {
        System.out.println(getOwnerName() + " зовет Коржика кушать.");
    }
}

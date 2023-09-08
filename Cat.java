class Cat extends Owner {
    private String name;
    private Integer age;

    public Cat(String name, Integer age, String ownerName) {
        super(ownerName);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " лет";
    }

    public Cat(String name, Integer age) {
        this("", null, null);
    }

    public Cat(String name) {
        this("", null);
    }

    public Cat() {
        this("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    
    
    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getOwnerName() + "!");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " мяукнул!");
    }
    
}
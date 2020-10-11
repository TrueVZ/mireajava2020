package ru.mirea.lab12;

public enum Planets {
    Mercury ("Меркурий", 11111, 4900),
    Venus ("Венера", 1111, 12100),
    Earth("Земля", 1111, 12760),
    Mars("Марс", 1111, 6800),
    Jupiter("Юпитер", 1111, 143000),
    Saturn("Сатурн", 1111, 120600),
    Uranus("Уран", 1111, 51000),
    Neptune("Нептун", 1111, 50000);


    private String name;
    private int massa;
    private int radius;

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", massa=" + massa +
                ", radius=" + radius +
                '}';
    }

    Planets(String text, int massa, int radius) {
        this.name = text;
        this.massa = massa;
        this.radius = radius;
    }

}

package ru.mirea.lab22.task1;

public class Client {
    private final String name;
    private final String inn;

    public Client(String name, String inn) throws InnException {
        this.name = name;
        if (inn.length() != 11) throw new InnException();
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", inn=" + inn +
                '}';
    }
}


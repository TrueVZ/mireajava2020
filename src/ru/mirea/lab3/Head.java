package ru.mirea.lab3;

public class Head {
    private String hairColor;
    private String eysColor;

    public Head(String hairColor, String eysColor){
        this.hairColor = hairColor;
        this.eysColor = eysColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEysColor() {
        return eysColor;
    }

    public void setEysColor(String eysColor) {
        this.eysColor = eysColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", eysColor='" + eysColor + '\'' +
                '}';
    }
}

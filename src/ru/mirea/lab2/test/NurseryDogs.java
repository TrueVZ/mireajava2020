package ru.mirea.lab2.test;

import ru.mirea.lab2.Dog;

public class NurseryDogs {
    private Dog[] dogs = new Dog[0];


    public void AddDogs(Dog ... new_dogs){
        Dog []tempdogs = new Dog[dogs.length+ new_dogs.length];

        System.arraycopy(dogs, 0, tempdogs, 0, dogs.length);
        System.arraycopy(new_dogs, 0, tempdogs, dogs.length, new_dogs.length);

        this.dogs = tempdogs;
    }

}

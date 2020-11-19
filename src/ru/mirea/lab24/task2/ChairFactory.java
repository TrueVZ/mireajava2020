package ru.mirea.lab24.task2;

public class ChairFactory implements ChairAbstractFactory {
    @Override
    public FuncChair creatFuncChair() {
        return new FuncChair();
    }

    @Override
    public MagicChair creatMagicChair(String material) {
        return new MagicChair(material);
    }

    @Override
    public VictorianChair creatVictorianChair(String owner) {
        return new VictorianChair(owner);
    }
}

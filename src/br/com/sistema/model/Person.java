package br.com.sistema.model;

public class Person {

    private int register;
    private String name;
    private char sex;
    private String level;

    public Person() {
    }

    public Person(int register, String name, char sex, String level) {
        this.register = register;
        this.name = name;
        this.sex = sex;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "* ID: " + getRegister()
                + " \tNome: " + getName()
                + " \tSexo: " + getSex()
                + " \tNível: " + getLevel();
    }
}

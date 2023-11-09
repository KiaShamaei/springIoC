package org.example;

public class MiladChildImp implements MiladChild{

    // pojo  default constructor


    public MiladChildImp() {
    }

    public MiladChildImp(String name) {
        this.name = name;
    }

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("test run");
    }

    public void eat() {
        System.out.println("test eat");
    }

    public void done() {
        System.out.println("test done");

    }
}

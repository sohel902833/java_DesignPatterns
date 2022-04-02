package FactoryDesignPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
       OperatingSystemFactory systemFactory=new OperatingSystemFactory();
       OS os=systemFactory.getInstance("closed");
       os.spec();
       //test git from terminal
    }
}

package FirstPackage;

public class MyClass {

    private String name;

    public MyClass(String word, int number){
        System.out.println(word + number+"7");
    }

    public MyClass(String name){
        this.setName(name);
    }

    public static void print (String frase) {
        System.out.println(frase);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

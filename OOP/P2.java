class Dog{
    String name;
    String Breed;
    Dog(String name,String Breed){
        this.name=name;
        this.Breed=Breed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getBreed(){
        return Breed;
    }
    public void SetBreed(String Breed){
        this.Breed=Breed;
    }
}
public class P2{
    public static void main(String[] args)
    {
        Dog d=new Dog("sunny","labra");
            System.out.println(d.getName());
            System.out.println(d.getBreed());
            d.setName("aman");
            d.SetBreed("human");
            System.out.println(d.getName());
            System.out.println(d.getBreed());
    }
}
package innerclass;

public class People {
    public String name = "Lisa";
    
    public People() {
        
    }
    public static void main(String[] args) {
        Man martin = new Man();
        System.out.println(martin.getWife().name);
    }
}

class Man{
    public Man() {
        
    }
    
    public People getWife() {
        class Wife extends People{
            {
                super.name = "Rebecca";
            }
        }
        return new Wife();
    }
}

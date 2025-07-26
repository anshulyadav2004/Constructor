public class cat {
   String name;
   private int age;
   private String breed;
   private int weight;
     
    public cat(String name,int age,String breed,int weight){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.weight=weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setname_age_breed(String name,int age,String breed){
        this.name=name;
        this.age=age;
        if(age<1){
            System.out.println("this cat is kitten ");
        }
        this.breed=breed;
        
    }

    public String compareage(cat othercat){

        if(this.age<othercat.age){
            return this.name+"is younger than"+othercat.name;
        }
        else{
            return this.name +"is older than "+othercat.name;
        }

    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String breed(){
        return breed;
    }
    
    
}

public class Patient {
    
    //member variable
    private String name;
    private char gender;
    private double weight;
    private double height;
    
    //normal constructor
    public Patient(String name, char gender, double weight, double height){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    
    //setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    public char getGender(){
        return gender;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
    
    public String findCategory(){
        double bmi = weight / (height * height);
      //  String category;
        
         if (bmi < 18.5 ){
           return "Underweight";
        }else if (bmi >= 18.5 && bmi <= 24.9){
             return "Normal Weight";
        }else if (bmi >= 25 && bmi <= 29.9){
            return  "Overweight";
        }else{
            return "Obesity";
        }        
    }
    
     public void printList() {
        double bmi = weight / (height * height);
        String category = findCategory();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + String.format("%.2f", weight) + " kg");
        System.out.println("Height: " + String.format("%.2f", height) + " m");
        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Category: " + category);
    }
}

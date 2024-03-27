public class Lab1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        Patient[] patients = new Patient[5];
        
        //user enter value for each patient
        for(int i = 0; i < 5; i++){
            System.out.println("Enter details for patient" + (i+1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter gender M/F: ");
            char gender = scanner.nextLine().charAt(0);
            
            System.out.print("Enter weight in kg: ");
            double weight = scanner.nextDouble();
            
            System.out.print("Enter height in m: ");
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("------------------------");
            
            //create new patient object
           patients[i] = new Patient(name,gender,weight,height);
        }
        
            //display all patients whose bmi category is overweight and obesity
            System.out.println("Patient with BMI category is overweight and obesity");
            System.out.println("-------------------------------------------------------");
            
            for(Patient patient: patients ){
                if(patient.findCategory().equals("Overweight") || 
                        patient.findCategory().equals("Obesity")){
                  patient.printList();
                  System.out.println();         
                }
                           
            }
    }   
        }

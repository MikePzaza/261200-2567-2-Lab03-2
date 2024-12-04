public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height ;
    private double weight;
    private String bloodGroup ;
    private String phoneNumber ;


    public Patient(int id, String name, int birthYear, double height, double weight ,String bloodGroup , String phoneNumber ) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber ;

            if( weight <= 0) {
                System.out.println("invalid weight ");
                this.weight = 0.0;
            }
            else {
                this.weight = weight;
            }

            if( height <= 0) {
                System.out.println("invalid height ");
                this.height = 0.0;
            }
            else{
                this.height = height;
            }

    }

    public int getAge(int currentYear) {
        if(currentYear > birthYear ){
            return currentYear - this.birthYear;

        }
       else {
            System.out.println("invalid year");
            return 0 ;
        }



    }
    public String getphoneNumber(){
        return  this.phoneNumber ;
    }

    public String getbloodGroup() {
        if(bloodGroup .equals("A")  || bloodGroup .equals("B") || bloodGroup .equals("O") || bloodGroup .equals("AB"))
        {
            return this.bloodGroup ;
        }
        else {
            return "invalid bloodGroup" ;
        }
    }



    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("bloodGroup: " +getbloodGroup() );
        System.out.println("phoneNumber: " +getphoneNumber() );
        System.out.println("Patient BMI: " + getBMI());
    }
    public double getBMI(){
        if( weight <= 0) {
            return 0.0 ;
        }
        if( height <= 0) {
            return 0.0 ;
        }
    return  weight/((height/100)*(height/100)) ;


    }



    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0 ,"A" , "123456");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "O" , "234567");
        invalidPatient.displayDetails(currentYear);

    }
}


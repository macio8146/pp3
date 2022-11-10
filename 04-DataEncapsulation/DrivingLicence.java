public class DrivingLicence {

    // Attributes

    private String driversName;
    private String driversSurName;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenceNumber;
    private int yearOfIssue;
    private String licenceCategory;

    // Methods

    // name
    public String getDriversName(){
        return driversName;
    }

    public void setDriversName(String driversName){

        driversName = driversName.substring(0, 1).toUpperCase() + driversName.substring(1).toLowerCase();
        this.driversName = driversName;
    }


    //surname
    public String getDriversSurName(){
        return driversSurName;
    }

    public void setDriversSurName(String surName){
        this.driversSurName = surName;
    }


    // address
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }


    // postalcode
    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }


    // city
    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }


    // licence number
    public String getdrivingLicenceNumber(){
        return drivingLicenceNumber;
    }

    public void setdrivingLicenceNumber(String drivingLicenceNumber){
        this.drivingLicenceNumber = drivingLicenceNumber;
    }


    // year of issue
    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue){
        if(yearOfIssue > 1980 && yearOfIssue < 2022){
            this.yearOfIssue = yearOfIssue;
        }
    }


    // category 
    public String getLicenceCategory(){
        return licenceCategory;
    }

    public void setLicenceCategory(String licenceCategory){
        this.licenceCategory = licenceCategory;
    }


    public void displayData(){
        System.out.println(getDriversName());
        System.out.println(getDriversSurName());
        System.out.println(getAddress());
        System.out.println(getPostalCode());
        System.out.println(getCity());
        System.out.println(getYearOfIssue());
        System.out.println(getdrivingLicenceNumber());
    }

    public String toString(){
        return getDriversName() + " " + getDriversSurName() + " "+ getAddress()+ " " +
            getCity()+ " " + getPostalCode()+ " " + getYearOfIssue()+ " " + getdrivingLicenceNumber();
    }
}


import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

//    @JsonProperty("userId")
    public String userId;
    public String jobTitleName;
    public String firstName;
    public String lastName;
    public String preferredFullName;
    public String employeeCode;
    public String region;
    public String phoneNumber;
    public String emailAddress;

//    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getRegion() {
        return region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userId='" + userId + '\'' +
                ", jobTitleName='" + jobTitleName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preferredFullName='" + preferredFullName + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", region='" + region + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPreferredFullName(String preferredFullName) {
        this.preferredFullName = preferredFullName;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}




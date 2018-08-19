import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    public List<Employee> employee;

    public void setEmployee(List<Employee>  employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employee +
                '}';
    }

    public List<Employee> getEmployee() {
        return employee;
    }
}

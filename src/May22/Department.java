package May22;

public class Department {
    private int deptId;
    private String deptName;
    private double deptSalary;
    private String deptAddress;

    // setter method
    public void setDeptId(int deptId){
        this.deptId = deptId;
    }
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    public void setDeptSalary(double deptSalary){
        this.deptSalary = deptSalary;
    }
    public void setDeptAddress(String deptAddress){
        this.deptAddress = deptAddress;
    }

    // gettter
    public int getDeptId(){
        return deptId;
    }
    public String getDeptName(){
        return deptName;
    }
    public double getDeptSalary(){
        return deptSalary;
    }
    public String getDeptAddress(){
        return deptAddress;
    }

    static void main() {
        Department department = new Department();
        // setter
        department.setDeptId(101);
        department.setDeptName("IT");
        department.setDeptSalary(100000);
        department.setDeptAddress("Jaipur");

        // getter
        System.out.println("Department ID: " + department.getDeptId());
        System.out.println("Department Name: " + department.getDeptName());
        System.out.println("Department Salary: " + department.getDeptSalary());
        System.out.println("Department Address: " + department.getDeptAddress());
    }
}
// Output:
//Department ID: 101
//Department Name: IT
//Department Salary: 100000.0
//Department Address: Jaipur
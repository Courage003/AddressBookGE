public class BusinessContact {
    String CompanyName;
    String EmployeeName;
    String OfficialMail;

    public BusinessContact(String companyName, String employeeName, String officialMail) {

        CompanyName = companyName;
        EmployeeName = employeeName;
        OfficialMail = officialMail;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "CompanyName='" + CompanyName + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", OfficialMail='" + OfficialMail + '\'' +
                '}';
    }
}

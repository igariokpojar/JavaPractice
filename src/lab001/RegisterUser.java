package lab001;

public class RegisterUser {
    public static void main(String[] args) {
        String firstName = "Igor";
        String lastName = "Pojar";
        String montOfBirth = "October";
        int dateOfBirth = 27;
        int yearOfBirth = 1983;

        boolean isHealthPlanId = true;
        boolean isSSNumber = false;

        int memberId = 123456;
        int policyNumber = 12468435;

        int lastDigitsOfSsn = 1245567;
        String zipCode = "60177";
        /* Igor who born in October wants health insurance from United; */
        System.out.println(firstName + " " + lastName + " " + " birth on " +   montOfBirth +
                " "+ dateOfBirth + " " +
                yearOfBirth + " " +
                "wants health insurance from United.");

    }
}

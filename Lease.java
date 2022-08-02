public class Lease {
    String tenantsName;
    String apartmentNumber;
    int monthlyRentAmount;
    int monthsOfLease;

    public Lease() {
        tenantsName = "XXX";
        apartmentNumber = "0";
        monthlyRentAmount = 1000;
        monthsOfLease = 12;
    }

    private void addPetFee() {
        monthlyRentAmount += 10;
        explainPetPolicy();
    }

    private static void explainPetPolicy() {
        System.out.println("We charge an extra $10 a month for pets.");
    }
    // Getters And Setters
    public String getTenantsName() {
        return tenantsName;
    }

    public void setTenantsName(String tenantsName) {
        this.tenantsName = tenantsName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getMonthlyRentAmount() {
        return monthlyRentAmount;
    }

    public void setMonthlyRentAmount(int monthlyRentAmount) {
        this.monthlyRentAmount = monthlyRentAmount;
    }

    public int getMonthsOfLease() {
        return monthsOfLease;
    }

    public void setMonthsOfLease(int monthsOfLease) {
        this.monthsOfLease = monthsOfLease;
    }
}

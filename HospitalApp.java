public class HospitalApp {

    public static void main(String[] args) {
        Doctor mcDreamy = new Doctor(90000.00, "Derek Shepherd", 1, "Neurology");
        System.out.println(mcDreamy);

        int mcDreamyEmployeeNum = mcDreamy.getEmployeeNumber();
        System.out.println("McDreamy's employee number is " + mcDreamyEmployeeNum);

        Janitor mcCleany = new Janitor(40000.00, "Glenn Matthews", 2, true);
        System.out.println(mcCleany);
        int mcCleanyEmployeeNum = mcCleany.getEmployeeNumber();
        System.out.println("McCleany's employee number is " + mcCleanyEmployeeNum);

        mcCleany.setIsSweeping(false);

        mcCleany.setPatientHealth(4);

        double mcCleanyFinalPay = mcCleany.calculatePay();
        System.out.println("McCleany's final annual pay is $" + mcCleanyFinalPay);

        mcDreamy.setPatientHealth(8);

        double mcDreamyFinalPay = mcDreamy.calculatePay();
        System.out.println("McDreamy's final annual pay is $" + mcDreamyFinalPay);

    }
}

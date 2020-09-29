public class Main {

    public static void main(String[] args) {
        LabGradingManager labGradingManager = new LabGradingManager();

        labGradingManager.CalculateGrades("Lab", "FA12-BSE-324");
        labGradingManager.CalculateGrades("CovidLab", "FA12-BSE-324");
        labGradingManager.CalculateGrades("CovidNonLab", "FA12-BSE-324");

        labGradingManager.CalculateGrades("Covid Lab without lab", "FA12-BSE-324");


    }
}

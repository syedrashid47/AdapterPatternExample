public class LabGradingManager implements  GradingManager{
    GradingCovidAdapter covidAdapter;

    @Override
    public void CalculateGrades(String courseType, String StudentID) {


        if(courseType.equalsIgnoreCase("LAB")){
            System.out.println("Calculated for LAB course for student  " + StudentID);
        }

        else if(courseType.equalsIgnoreCase("CovidNonLab") || courseType.equalsIgnoreCase("CovidLab")){
            covidAdapter = new GradingCovidAdapter(courseType);
            covidAdapter.CalculateGrades(courseType, StudentID);
        }

        else{
            System.out.println("Invalid Calculation model . " + courseType);
        }
    }
}

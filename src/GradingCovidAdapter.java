public class GradingCovidAdapter  implements  GradingManager{
    CovidGradingManager covidGradingManager;

    public GradingCovidAdapter(String courseType){

        if(courseType.equalsIgnoreCase("CovidNonLab") ){
            covidGradingManager = new CovidNonLabGradingManager();

        }else if (courseType.equalsIgnoreCase("CovidLab")){
            covidGradingManager = new CovidLabGradingManager();
        }
    }

    @Override
    public void CalculateGrades(String courseType, String StudentID) {

        if(courseType.equalsIgnoreCase("CovidNonLab")){
            covidGradingManager.calculateCovidNonLab(StudentID);
        }
        else if(courseType.equalsIgnoreCase("CovidLab")){
            covidGradingManager.calculateCovidLab(StudentID);
        }
    }
}

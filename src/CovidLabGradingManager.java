public class CovidLabGradingManager implements CovidGradingManager{
    @Override
    public void calculateCovidNonLab(String StudentID) {
        //do nothing
    }

    @Override
    public void calculateCovidLab(String StudentID) {

        System.out.println("Calculating Covid  LAB for "+ StudentID);
    }
}

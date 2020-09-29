public class CovidNonLabGradingManager implements CovidGradingManager{
    @Override
    public void calculateCovidNonLab(String StudentID) {
        System.out.println("Calculating Covid NON LAB for "+ StudentID);
    }

    @Override
    public void calculateCovidLab(String StudentID) {
        //do nothing
    }
}

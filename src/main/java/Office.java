public class Office extends Building {
    private float coeffCount;
    private float coeffProcess;
    private int workPlaces;

    public Office() {
    }

    public Office(float length, float shirina, int id, float coeffCount, float coeffProcess, int workPlaces) {
        super( length, shirina, id);
        this.coeffCount = coeffCount;
        this.coeffProcess = coeffProcess;
        this.workPlaces = workPlaces;
    }

    public float getCoefCount() {
        return coeffCount;
    }

    public void setCoefCount(float coefCount) {
        this.coeffCount = coefCount;
    }

    public float getCoefProcess() {
        return coeffProcess;
    }

    public void setCoefProcess(float coefProcess) {
        this.coeffProcess = coefProcess;
    }

    public int getWorkPlaces() {
        return workPlaces;
    }

    public void setWorkPlaces(int workPlaces) {
        this.workPlaces = workPlaces;
    }
    public String toString() {
        return  super.toString() + "work places: " + workPlaces + "\n" ;
    }
}

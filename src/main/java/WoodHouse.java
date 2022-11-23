public class WoodHouse extends Building{
    private float coeffCount;
    private float coeffProcess;
    private int lifeArea;

    public WoodHouse() {
    }

    public WoodHouse(float length, float width, int id,float coeffCount, float coeffProcess, int lifeArea) {
        super(length, width, id);
        this.coeffCount = coeffCount;
        this.coeffProcess = coeffProcess;
        this.lifeArea = lifeArea;
    }

    public float getCoeffCount() {
        return coeffCount;
    }

    public void setCoeffCount(float coeffCount) {
        this.coeffCount = coeffCount;
    }

    public float getCoeffProcess() {
        return coeffProcess;
    }

    public void setCoeffProcess(float coeffProcess) {
        this.coeffProcess = coeffProcess;
    }

    public int getLifeArea() {
        return lifeArea;
    }

    public void setLifeArea(int lifeArea) {
        this.lifeArea = lifeArea;
    }

    public String toString() {
        return "My life area is: " + lifeArea + " m2"+"\n";
    }
}

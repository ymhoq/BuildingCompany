import java.util.List;

public class BuildProces {
    private int dateStart;
    private int dateFinish;
    private Building building;
    private List<Builder> builderList;
    private List<Instrument> instrumentList;
    private int statusReady;

    public BuildProces() {
    }

    public BuildProces(int dateStart, int dateFinish, Building building, List<Builder> builderList, List<Instrument> instrumentList, int statusReady) {
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.building = building;
        this.builderList = builderList;
        this.instrumentList = instrumentList;
        this.statusReady = statusReady;
    }

    public int getDateStart() {
        return dateStart;
    }

    public void setDateStart(int dateStart) {
        this.dateStart = dateStart;
    }

    public int getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(int dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<Builder> getBuilderList() {
        return builderList;
    }

    public void setBuilderList(List<Builder> builderList) {
        this.builderList = builderList;
    }

    public List<Instrument> getInstrumentList() {
        return instrumentList;
    }

    public void setInstrumentList(List<Instrument> instrumentList) {
        this.instrumentList = instrumentList;
    }

    public int getStatusReady() {
        return statusReady;
    }

    public void setStatusReady(int statusReady) {
        this.statusReady = statusReady;
    }
}

package BuildProcessItems;

import BuildProcessItems.Instrument;
import Buildings.Building;
import Interfaces.IMessege;
import People.Builder;
import People.Customer;
import People.Employee;
import People.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class BuildProces implements IMessege {

    private static final Logger LOGGER = LogManager.getLogger(BuildProces.class);
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

    public int hashCode() {
        int result = 1;
        result = 29 * result + (building == null ? 0 : building.hashCode())
                + (builderList == null ? 0 : builderList.hashCode())
                + (instrumentList == null ? 0 : instrumentList.hashCode());
        return result;
    }

    @Override
    public void sendSms(Employee employee) {
        LOGGER.info(employee.getPhoneNumber() + this.toString());
    }

    @Override
    public void sendSms(Customer customer) {
        LOGGER.info(customer.getPhoneNumber() + this.toString());
    }
}

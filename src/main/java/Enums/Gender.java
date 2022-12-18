package Enums;

public enum Gender {
    male("male"), female("female");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

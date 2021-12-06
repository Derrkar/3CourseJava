package lab1;

import java.util.Objects;

public class Programmer extends Worker{
    private String programmingLanguage;
    private int contractNumber;

    /*public Programmer(String programmingLanguage, String projectName, int contractNumber) {
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
        this.contractNumber = contractNumber;
    }*/

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public static class Builder {
        private Programmer newProgrammer;

        public Builder() {
            newProgrammer = new Programmer();
        }

        public Builder withName(String name){
            newProgrammer.name = name;
            return this;
        }

        public Builder withSurname(String surName){
            newProgrammer.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newProgrammer.middleName = middleName;
            return this;
        }

        public Builder withPhoneNumber(int phoneNumber){
            newProgrammer.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withDateOfBirth(int dateOfBirth){
            newProgrammer.dateOfBirth = dateOfBirth;
            return this;
        }

        public Programmer build(){
            return newProgrammer;
        }

    }

    @Override
    public String toString() {
        return surName + " " + name + " " + middleName + " " + programmingLanguage + " " + contractNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return contractNumber == that.contractNumber && programmingLanguage.equals(that.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguage, contractNumber);
    }
}

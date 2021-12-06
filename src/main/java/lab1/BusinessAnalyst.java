package lab1;

import java.util.Objects;

public class BusinessAnalyst extends Worker{
    private int FacilitationSkill;
    private int OrganizationalSkill;
    private int oralSkill;

    /*public BusinessAnalyst(int facilitationSkill, int organizationalSkill, int oralSkill) {
        FacilitationSkill = facilitationSkill;
        OrganizationalSkill = organizationalSkill;
        this.oralSkill = oralSkill;
    }*/

    public int getFacilitationSkill() {
        return FacilitationSkill;
    }

    public void setFacilitationSkill(int facilitationSkill) {
        FacilitationSkill = facilitationSkill;
    }

    public int getOrganizationalSkill() {
        return OrganizationalSkill;
    }

    public void setOrganizationalSkill(int organizationalSkill) {
        OrganizationalSkill = organizationalSkill;
    }

    public int getOralSkill() {
        return oralSkill;
    }

    public void setOralSkill(int oralSkill) {
        this.oralSkill = oralSkill;
    }

    public static class Builder {
        private BusinessAnalyst newBusinessAnalyst;

        public Builder() {
            newBusinessAnalyst = new BusinessAnalyst();
        }

        public Builder withName(String name){
            newBusinessAnalyst.name = name;
            return this;
        }

        public Builder withSurname(String surName){
            newBusinessAnalyst.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newBusinessAnalyst.middleName = middleName;
            return this;
        }

        public Builder withPhoneNumber(int phoneNumber){
            newBusinessAnalyst.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withDateOfBirth(int dateOfBirth){
            newBusinessAnalyst.dateOfBirth = dateOfBirth;
            return this;
        }

        public BusinessAnalyst build(){
            return newBusinessAnalyst;
        }

    }

    @Override
    public String toString() {
        return surName + " " + name + " " + middleName + "\nMarks: " + FacilitationSkill + " " + OrganizationalSkill + " " + oralSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessAnalyst that = (BusinessAnalyst) o;
        return FacilitationSkill == that.FacilitationSkill && OrganizationalSkill == that.OrganizationalSkill && oralSkill == that.oralSkill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), FacilitationSkill, OrganizationalSkill, oralSkill);
    }
}

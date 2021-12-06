package lab1;

import java.util.Objects;

public class Worker {
    protected String name;
    protected String surName;
    protected String middleName;
    protected int phoneNumber;
    protected int dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static class Builder {
        private Worker newWorker;

        public Builder() {
            newWorker = new Worker();
        }

        public Builder withName(String name){
            newWorker.name = name;
            return this;
        }

        public Builder withSurname(String surName){
            newWorker.surName = surName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newWorker.middleName = middleName;
            return this;
        }

        public Builder withPhoneNumber(int phoneNumber){
            newWorker.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withDateOfBirth(int dateOfBirth){
            newWorker.dateOfBirth = dateOfBirth;
            return this;
        }

        public Worker build(){
            return newWorker;
        }

    }

    @Override
    public String toString() {
        return surName + " " + name + " " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return name.equals(worker.name) && surName.equals(worker.surName) && middleName.equals(worker.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, middleName, phoneNumber, dateOfBirth);
    }
}

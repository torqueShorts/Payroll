package za.acCPUT.Domain;

import java.util.Objects;

public class SaveEmployee {

    private String userId;
    private String name;
    private String surname;
    private String genderId;
    private String raceId;


    private SaveEmployee() {}

    private SaveEmployee(Builder builder)
    {
        this.userId = builder.userId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.genderId = builder.genderId;
        this.raceId = builder.raceId;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getGenderId()
    {
        return genderId;
    }

    public String getRaceId()
    {
        return raceId;
    }

    public static class Builder
    {
        private String genderId;
        private String raceId;
        private String userId;
        private String name;
        private String surname;

        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public Builder userId(String userId)
        {
            this.userId = userId;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }


        public SaveEmployee build()
        {
            return new SaveEmployee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee details: ID: " + userId + " firstName: " + name + " surname: " + surname
                + " gender: " + genderId + " race: " + raceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveEmployee employee = (SaveEmployee) o;
        return userId.equals(employee.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }


}

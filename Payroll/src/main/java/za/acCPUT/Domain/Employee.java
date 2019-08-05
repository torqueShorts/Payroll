package za.acCPUT.Domain;

import java.util.Objects;

public class Employee
{
    private String userId;
    private String name;
    private String surname;
    private Gender gender;
    private Race race;


    private Employee() {}

    private Employee(Builder builder)
    {
        this.userId = builder.userId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.gender = builder.gender;
        this.race = builder.race;
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

    public Gender getGender()
    {
        return gender;
    }

    public Race getRace()
    {
        return race;
    }

    public static class Builder
    {
        private Gender gender;
        private Race race;
        private String userId;
        private String name;
        private String surname;

        public Builder gender(Gender gender)
        {
            this.gender = gender;
            return this;
        }

        public Builder race(Race race)
        {
            this.race = race;
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

        public Builder copy(Employee employee)
        {
            this.userId = employee.userId;
            this.name = employee.name;
            this.surname = employee.surname;
            this.gender = employee.gender;

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return userId.equals(employee.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

}

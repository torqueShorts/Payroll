package za.acCPUT.Domain.Employee;


import java.util.Objects;

public class EmployeeRace {

    private String userId;
    private String raceId;

    private EmployeeRace(){}

    private EmployeeRace(Builder builder)
    {
        this.raceId = builder.raceId;
        this.userId = builder.userId;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getRaceId()
    {
        return raceId;
    }

    public static class Builder
    {
        private String userId;
        private String raceId;

        public Builder userId(String userId)
        {
            this.userId = userId;
            return this;
        }

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build()
        {
            return new EmployeeRace(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRace employee = (EmployeeRace) o;
        return raceId.equals(employee.raceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId);
    }

}

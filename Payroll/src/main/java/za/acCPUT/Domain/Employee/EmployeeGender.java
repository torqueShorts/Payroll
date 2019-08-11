package za.acCPUT.Domain.Employee;

import java.util.Objects;

public class EmployeeGender {
    private String userId;
    private String genderId;

    private EmployeeGender() {
    }

    private EmployeeGender(Builder builder) {
        this.genderId = builder.genderId;
        this.userId = builder.userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getGenderId() {
        return genderId;
    }

    public static class Builder {
        private String userId;
        private String genderId;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder genderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeGender employee = (EmployeeGender) o;
        return genderId.equals(employee.genderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId);
    }
}

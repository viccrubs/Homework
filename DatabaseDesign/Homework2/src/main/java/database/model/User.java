package database.model;

public class User {
    private String userId;
    private String name;
    private int basicCost;

    public User(String name, int basicCost) {
        this.name = name;
        this.basicCost = basicCost;
    }

    public User() {
    }

    public int getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(int basicCost) {
        this.basicCost = basicCost;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

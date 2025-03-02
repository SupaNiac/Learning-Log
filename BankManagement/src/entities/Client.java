package entities;

public class Client {

    private String name;
    private Integer ID;

    public Client(String name, Integer ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return ID;
    }

    public void setNumber(Integer ID) {
        this.ID = ID;
    }

}




package entities;

public class Client {

    private String name;
    private Integer number;

    public Client(String name, Integer number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }
}



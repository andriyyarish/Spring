
class Client {


    private String name;
    private String id;
    private String greating;

    public String getGreating() {
        return greating;
    }

    public void setGreating(String greating) {
        this.greating = greating;
    }



    public Client(String id, String name) {
        setId(id);
        setName(name);
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

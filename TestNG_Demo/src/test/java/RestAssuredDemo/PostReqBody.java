package RestAssuredDemo;

public class PostReqBody {

    private String Description;
    private String name;

    public PostReqBody(String description, String name){
        this.Description =description;
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}

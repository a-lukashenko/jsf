import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {
 
    private String name;
 
    public String sayHello() {
        if (name != null && !name.trim().equals("")) {
            return "Hello, " + name + "!";
        } else {
            return null;
        }
    }

    public String getProducts2() {
        return "products";
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
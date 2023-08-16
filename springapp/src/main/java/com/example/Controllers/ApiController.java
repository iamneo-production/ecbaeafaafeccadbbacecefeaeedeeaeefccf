@RestController
public class ApiController {
    @Getmapping("show")
    public String display(){
        return "Welcome";
    }
}

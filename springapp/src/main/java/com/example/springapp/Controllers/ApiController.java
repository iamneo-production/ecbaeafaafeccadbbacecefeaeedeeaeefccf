@RestController
public class ApiController {
    @Getmapping("show")
    public String Welcome(){
        return "Welcome String Boot!";
    }
}

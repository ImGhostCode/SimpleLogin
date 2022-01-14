import java.util.HashMap;

public class InfoUser {
    
    HashMap<String, String> userInfo = new HashMap<String,String>();

    InfoUser (){
        userInfo.put("ghost", "imghost");
        userInfo.put("admin", "admin");
        userInfo.put("usename", "pass");
    }

    protected HashMap getUserInfo (){
        return userInfo;
    }

}

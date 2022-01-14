public class App {
    public static void main(String[] args) throws Exception {
       InfoUser  infoUser = new InfoUser();
       LoginPage loginPage =  new LoginPage(infoUser.getUserInfo());
    }
}

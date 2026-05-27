public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;
    //Violación del principio LSP, en este caso userIsAdmin extiende de LogIn pero si en algun momento logInAdmin
    //pasa a sustituir a su clase padre creara errores por la logica que no tiene que ver una con la otra
    @Override
    public void log (User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }
}


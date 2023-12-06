import controllers.AlunoController;
import presenters.AlunoFormPresenter;
import services.MySQLService;

public class Main {
    public static void main(String[] args) {
        final MySQLService mySQLService = new MySQLService();
        final AlunoController alunoController = new AlunoController(mySQLService);

        final AlunoFormPresenter formPresenter = new AlunoFormPresenter(alunoController);

        formPresenter.setVisible(true);
    }
}
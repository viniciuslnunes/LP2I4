package controllers;

import entities.AlunoEntity;
import services.MySQLService;

import java.sql.SQLException;

public class AlunoController {
    private final MySQLService mySQLService;

    public AlunoController(MySQLService mySQLService) {
        this.mySQLService = mySQLService;
    }

    public boolean addAluno(AlunoEntity aluno) {
        try {
            final int affectedLines = mySQLService.insertAluno(aluno);

            return affectedLines != 0;
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}

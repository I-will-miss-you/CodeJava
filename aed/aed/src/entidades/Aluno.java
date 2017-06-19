/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author code36u4r60
 */
public class Aluno extends Pessoa{

    private String idAluno;

    public Aluno() {
    }

    public Aluno(String idAluno, String idCard, String lastName, String fullName, LocalDate birthDate) {
        super(idCard, lastName, fullName, birthDate);
        this.idAluno = idAluno;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }
    
}

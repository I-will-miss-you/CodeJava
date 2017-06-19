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
public class Pessoa implements Comparable<Pessoa> {

    private String idCard;
    private String lastName;
    private String fullName;
    private LocalDate birthDate;

    public Pessoa() {
    }

    public Pessoa(String idCard, String lastName, String fullName, LocalDate birthDate) {
        this.idCard = idCard;
        this.lastName = lastName;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idCard=" + idCard + ", lastName=" + lastName + ", fullName=" + fullName + ", birthDate=" + birthDate + '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        if (p == null) {
            throw new IllegalArgumentException("O valor p não pode ser null");
        }
        return idCard.compareTo(p.idCard);
    }

}

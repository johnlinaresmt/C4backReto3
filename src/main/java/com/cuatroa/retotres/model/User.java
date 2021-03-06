package com.cuatroa.retotres.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Modela una coleccion de usuarios, para anticiparnos a los retos que se avecinan se agregaròn los campos birthtDay y monthBirthtDay, que
 * corresponden a la fecha de cumpleaños y mes de cumpleaños del usuario respectivamente
 * @author desaextremo
 */

@Document(collection = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String identification;
    private String name;
    private Date birthtDay;
    private String monthBirthtDay;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthtDay() {
        return birthtDay;
    }
    public void setBirthtDay(Date birthtDay) {
        this.birthtDay = birthtDay;
    }
    public String getMonthBirthtDay() {
        return monthBirthtDay;
    }
    public void setMonthBirthtDay(String monthBirthtDay) {
        this.monthBirthtDay = monthBirthtDay;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCellPhone() {
        return cellPhone;
    }
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getZone() {
        return zone;
    }
    public void setZone(String zone) {
        this.zone = zone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

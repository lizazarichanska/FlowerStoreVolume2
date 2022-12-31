package ua.edu.ucu.demo.Flowers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.demo.Item;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    private double sepalLength;
    private String color;
    private double price;
    Flower(int id, String descript, double pr, String col, double sepalLen){
        super(descript);
        color=col;
        this.id=id;
        sepalLength=sepalLen;
        price=pr;
    }
    @Override
    public double price(){
        return price;
    }
}
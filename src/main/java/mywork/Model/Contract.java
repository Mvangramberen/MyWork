package mywork.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Micky on 15/09/2017.
 */
@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contractId;

    private String naam;
    private int maxUrenPerWeek;
    private int minUrenPerWeek;

    public Contract() {    }

    public Contract(String naam, int maxUrenPerWeek, int minUrenPerWeek) {
        this.naam = naam;
        this.maxUrenPerWeek = maxUrenPerWeek;
        this.minUrenPerWeek = minUrenPerWeek;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getMaxUrenPerWeek() {
        return maxUrenPerWeek;
    }

    public void setMaxUrenPerWeek(int maxUrenPerWeek) {
        this.maxUrenPerWeek = maxUrenPerWeek;
    }

    public int getMinUrenPerWeek() {
        return minUrenPerWeek;
    }

    public void setMinUrenPerWeek(int minUrenPerWeek) {
        this.minUrenPerWeek = minUrenPerWeek;
    }
}

package mywork.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Micky on 15/09/2017.
 */

@Entity
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shiftId;

    private String naam;

    private SimpleDateFormat uurFormat = new SimpleDateFormat("HH:mm");
    private Date beginUur;
    private Date eindUur;

    private Date beginPauze;
    private Date eindPauze;

    public Shift() {    }

    public Shift(String naam, SimpleDateFormat uurFormat, Date beginUur, Date eindUur, Date beginPauze, Date eindPauze) {
        this.naam = naam;
        this.uurFormat = uurFormat;
        this.beginUur = beginUur;
        this.eindUur = eindUur;
        this.beginPauze = beginPauze;
        this.eindPauze = eindPauze;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getBeginUur() {
        return beginUur;
    }

    public void setBeginUur(int uur, int minuten) throws ParseException {
        this.beginUur = uurFormat.parse(uur+":"+minuten);
    }

    public Date getEindUur() {
        return eindUur;
    }

    public void setEindUur(int uur, int minuten) throws ParseException {
        this.eindUur = uurFormat.parse(uur+":"+minuten);;
    }

    public Date getBeginPauze() {
        return beginPauze;
    }

    public void setBeginPauze(int uur, int minuten) throws ParseException {
        this.beginPauze = uurFormat.parse(uur+":"+minuten);;
    }

    public Date getEindPauze() {
        return eindPauze;
    }

    public void setEindPauze(int uur, int minuten) throws ParseException{
        this.eindPauze = uurFormat.parse(uur+":"+minuten);;
    }
}

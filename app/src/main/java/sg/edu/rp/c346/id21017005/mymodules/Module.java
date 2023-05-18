package sg.edu.rp.c346.id21017005.mymodules;

import java.io.Serializable;

public class Module implements Serializable {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    private String code;
    private String name;
    private int year;
    private int semester;
    private int credit;
    private String venue;

    public Module(String code, String name, int year, int semester, int credit, String venue){
        this.code=code;
        this.name=name;
        this.year=year;
        this.semester=semester;
        this.credit=credit;
        this.venue=venue;
    }
}

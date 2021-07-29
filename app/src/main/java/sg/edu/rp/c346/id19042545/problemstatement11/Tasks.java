package sg.edu.rp.c346.id19042545.problemstatement11;

import java.io.Serializable;

public class Tasks  implements Serializable {
    private String name;
    private String description;
    private int time;

    public Tasks(String name, String description, int time) {
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

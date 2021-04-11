package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private Object mon;
    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Object getMon() {
        return mon;
    }

    public Race(Stage... stages) {
                this.stages = new ArrayList<>(Arrays.asList(stages));
                this.mon = new Object();
    }
}

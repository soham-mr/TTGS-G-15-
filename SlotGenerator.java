package TimeTable;

import java.awt.event.ActionListener;

public abstract class SlotGenerator implements ActionListener {

    public static Slot[] slot;

    SlotGenerator(int GrpId) {
        DatabaseConnection db = new DatabaseConnection();

        int k = 0;
        int subjectno = 0;
        int hourcount = 1;
        int days = AssignTeacher.daysperweek;
        int hours = AssignTeacher.hoursperday;
        int nostgrp = AssignTeacher.nostudentgroup;
        slot = new Slot[hours * days * nostgrp];
        for (int i = 0; i < nostgrp; i++) {
            subjectno = 0;
            int hr = 0;
            if (AssignTeacher.studentgroup[i].id == GrpId) {
                for (int j = 0; j < hours * days; j++) {
                    StudentGroup sg = AssignTeacher.studentgroup[i];
                    if (subjectno >= sg.nosubject) {
                        hr++;
                        slot[k++] = new Slot(sg, -1, "FR-0000");
                    }
                    else {

                        slot[k++] = new Slot(sg, sg.teacherid[subjectno], sg.subjectid[subjectno]);
                        if (hourcount < sg.hours[subjectno]) {
                            hourcount++;
                        } else {
                            hourcount = 1;
                            subjectno++;
                        }
                    }
                }
            }
        }
    }

    public static Slot[] returnSlots() {
        return slot;
    }
}
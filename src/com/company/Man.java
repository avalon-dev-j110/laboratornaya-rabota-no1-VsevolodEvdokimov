package com.company;

public class Man {
    private Text Surname;
    private Text Name;
    private Text ParentName;
    private Date Birthdate;
    private Number PassportNo;

    protected Man() {
        this(null, null, null, null, null);
    }
    protected Man(Text surname, Text name, Text parentName) {
        this(surname, name, parentName, null, null);
    }
    protected Man(Text surname, Text name, Text parentName, Date birthdate, Number passportNo) {
        Surname = surname;
        Name = name;
        ParentName = parentName;
        Birthdate = birthdate;
        PassportNo = passportNo;
    }

    public void setDocument(Number passportNo) {
        System.out.println("Man:setDocument()");
        PassportNo = passportNo;
    }

    final public void setDate(Date birthdate) {
        System.out.println("Man:setDate()");
        Birthdate = birthdate;
    }
}

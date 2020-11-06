package com.company;

final public class Student extends Man {
    private Number gradebook;

    public Student(){
        super();
    }
    public Student(Text surname, Text name, Text parentName){
        super(surname, name, parentName);
    }
    public Student(Text surname, Text name, Text parentName, Date birthdate, Number passportNo, Number gradebook) {
        super(surname, name, parentName, birthdate, passportNo);
        this.gradebook = gradebook;
    }

    public void setDocument(Number passportNo){
        System.out.println("Student:setDocument()");
    }
}

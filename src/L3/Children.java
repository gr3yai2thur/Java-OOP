package L3;

public class Children extends People implements GoodChild {
    private People father;
    private People mother;
    private String school;

    Children(String name, char gender, People father, People mother){
        super(name, gender);
        this.father = father;
        this.mother = mother;
    }

    Children(String name, char gender, String school, People father, People mother){
        this(name, gender, father, mother);
        this.school = school;
    }

    @Override
    public String toString() {
        if (gender == 'M') {
            return name + " (Boy)";
        } else {
            return name + " (Girl)";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this.mother) {
            System.out.println("I luv u mom");
            return true;
        } else {
            System.out.println("you are NOT my mom");
            return false;
        }
    }

    @Override
    public String respectTo(People people) {
        String politeSuffix = (gender == 'M') ? "kub" : "ka";

        if (people == this.father) {
            return "Hello" + politeSuffix + " dad";
        } else if (people == this.mother) {
            return "Hello" + politeSuffix + " mom";
        } else {
            return "Hello" + politeSuffix;
        }
    }

    public People getFather(){
        return father;
    }

    public People getMother(){
        return mother;
    }

    @Override
    public String getWorkplace() {
        return "Student at " + school;
    }
}

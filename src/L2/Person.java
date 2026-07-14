public class Person {
    public String name;
    public char gender;
    private String telno;
    public Person fan;
    public Person[] gig = new Person[2];

    Person(String name) {
        this.name = name;
    }

    Person(String name, char gender, String telno) {
        this.name = name;
        this.gender = gender;
        this.telno = telno;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getPhone(Person p) {
        if (p.gender != this.gender) {
            return this.telno;
        } else {
            return "Access denied";
        }
    }

    public String setFan(Person fan) {
        if (fan.gender == this.gender) {
            return "No gay.";
        }
        if (this.fan != null) {
            return "Can't change fan now.";
        }
        this.fan = fan;
        return null;
    }

    public String getFan(Person p) {
        if (this.fan != null && this.fan.name.equals(p.name)) return "I luv u";
        else return "I'm single";
    }

    public String setGig(Person g) {
        for (int i = 0; i < gig.length; i++) {
            if (gig[i] == null) {
                gig[i] = g;
                return null;
            }
        }
        return "2 is enough";
    }

    public String getGig(Person p) {
        if (p.gender == this.gender) {
            String result = "";
            for (int i = 0; i < p.gig.length; i++) {
                if (p.gig[i] != null) {
                    result += p.gig[i].name + " ";
                }
            }
            return result;
        } else {
            return "No gigs";
        }
    }

    public void removeGig(Person g) {
        for (int i = 0; i < gig.length; i++) {
            if (gig[i] == g) {
                gig[i] = null;
            }
        }
    }

    public void removeGig() {
        for (int i = 0; i < gig.length; i++) {
            gig[i] = null;
        }
    }

    public void getPersonInfo(Person requester) {
        String fanName;
        if (requester.fan != null) {
            fanName = requester.fan.name;
        } else {
            fanName = "No fan";
        }

        System.out.println("=====================");
        System.out.println("Name: " + requester.name);
        System.out.println("Gender: " + requester.gender);
        System.out.println("Phone: " + this.getPhone(requester));
        System.out.println("Fan: " + fanName);
        System.out.println("Gigs: " + this.getGig(requester));
        System.out.println("=====================");
    }
}
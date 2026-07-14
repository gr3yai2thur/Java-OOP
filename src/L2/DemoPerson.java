public record DemoPerson() {
    public static void main(String[] args) {
        Person p1 = new Person("dome", 'M', "123-456-7890");
        Person p2 = new Person("ken", 'M', "098-765-4321");
        Person p3 = new Person("ploy", 'F', "555-555-5555");
        Person p4 = new Person("may", 'F', "111-222-3333");
        Person p5 = new Person("ann", 'F', "444-555-6666");
        Person p6 = new Person("fon", 'F', "777-888-9999");

        p1.gender = 'M';
        p1.setTelno("123-456-7890");

        p3.gender = 'F';
        p3.setTelno("555-555-5555");


        p1.setFan(p3);

        p1.setGig(p4);
        p1.setGig(p5);
        p1.removeGig(p5);
        p2.getPersonInfo(p1);
    }
        
}

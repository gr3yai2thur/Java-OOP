package L3;

public class Family {
    public static void main(String[] args) {
        People beckham  = new People("Beckham",  'M', "Manchester United");
        People victoria = new People("Victoria", 'F', "Spice Girls");
        Children brooklyn = new Children("Brooklyn", 'M',
                                         "Beckham Academy",
                                         beckham, victoria);
        Children harper   = new Children("Harper", 'F',
                                         "Harper's School",
                                         beckham, victoria);
        System.out.println(brooklyn.getFather());
        System.out.println(brooklyn.getMother());
        System.out.println(brooklyn.getWorkplace());
        System.out.println(harper.getWorkplace());
        harper.equals(victoria);
        harper.equals(beckham);

        System.out.println(brooklyn.respectTo(beckham));    // "Hellokub dad"
        System.out.println(brooklyn.respectTo(victoria));   // "Hellokub mom"
        System.out.println(brooklyn.respectTo(new People("ครูสมศรี", 'F')));  // "Hellokub"
        System.out.println(harper.respectTo(victoria));     // "Helloka mom"
        System.out.println(harper.respectTo(beckham));      // "Helloka dad"
    }
}
    
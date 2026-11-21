public enum Day {

    MONDAY("BAD",1),
    TUESDAY("HMMM STILL BAD",2);

    private String description;
    private int number ;

    private Day (String description,int number){
        this.description=description;
        this.number=number;
    }

}

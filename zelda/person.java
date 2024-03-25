/*
 * the person class should have a public talk method.
 * the person class should have a publuc eat method.
 * the person class should have a public sleep method. 
 * the person classs hsould have a private property location
 * the person class should have public methods to get and set the private property location
 */



package zelda;
// this is a simpl eclass to repesent a person
//it will be used as a base/parent class for other classes
//this person class will be out parent class
// we could but we will NOT be making an object of this class
//we will be making objects of the child classes.
public class person {
    //create a constructor to initally set the location prperty of the person
public person(String location, String name){
 m_location = location;
 m_name = name;
}

    //this is a pricate propety that cna only be accessed by this class
    private String m_location; 
    //add a name for the person
    private String m_name;

//create a [ublic method to get ht elocation of the person
public String getLocation(){
    return m_location;
}
//create a public method to set the location of the person
public void setLocation(String location){
    m_location = location;
}

public void displayLocation(){
    System.out.println(m_name + "is at:" + m_location);
}

    //the person class should have a publick talk method
    public void talk(String words){
        System.out.println(m_name + "says: " + words);
    }
    //teh person class should have a public eat method
    //TODO: increase the persons health property if they eat.
    public void eat(String food){
        System.out.println(m_name + "eats: " + food);
    }
    //the person class should have a public eat method.
    public void sleep(){
        System.out.println(m_name + "is sleeping.");
    } 
}

package zelda;

public class Enemy extends person{
    //create a constructor to set teh properties of the parent class and teh properties of this class
public Enemy(String location, String name, int anger) {
//super class means parent class
//using the new to us keyword super to call the constructor of the parent class
//set the local property andger to the value of the parameter anger that is passed in


    super(location, name);
    m_anger =anger;
}




    // create a private property called anger
    private int m_anger;

    //creat an attack method
    public void attack() {
        //based on the value of the anger property we will dispaly a different message
        //if anger prperty is greter than 5
        if(m_anger > 5) {

            System.out.println(getName() + " attacks with gusto and fury!");
            }    else {
                System.out.println(getName() + "attacks!");
            } 
      
    }

}

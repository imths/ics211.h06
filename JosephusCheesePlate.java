/**
 * 
 */
package imths.edu.ics211.h06;

import java.util.List;

import imths.edu.ics211.h02.Cheese;

/**
 * @author isaacsegawa
 *
 */
public class JosephusCheesePlate implements ICheeseTasting {

  private Cheese[] theCheese;
  
  public JosephusCheesePlate(Cheese[] theCheese) {
    
  }
  
  @Override
  public List<Cheese> tasteCheeses(int start, int step, boolean isClockwise) {
    //create CircularDoublyLinkedList<Cheese>
    //create a List to return
    //get the ListIterator from cheeseList
    //go to right place either before or after start
    //while cheeseList.hasNext() or .hasPrev()
    // either go next or previous steps times remember the Cheese
    // add the last Cheese to the returnList
    // call iterator.remove()
    //return returnList
    return null;
  }

}

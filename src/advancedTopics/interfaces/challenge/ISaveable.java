package advancedTopics.interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();       //changed from ArrayList to List as to allow maximum flexibility
                                //populate the object's fields from an ArrayList

    void read(List<String> savedValues);  //return an ArrayList of values to be saved
}

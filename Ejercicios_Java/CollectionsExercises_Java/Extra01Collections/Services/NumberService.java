
package Services;

import java.util.ArrayList;
import Entities.Number;

public class NumberService {
    
    private ArrayList<Integer> numbers = new ArrayList();
    
    public Number createNumber(Integer number) {
        return new Number(number);
    }
    
    public void addNumberToTheList(Integer number) {
        numbers.add(number);
    }
    
    public void createAndAdd(Integer number) {
        createNumber(number);
        numbers.add(number);
    }
    
    public int listSize() {
        return numbers.size();
    }
    
    public ArrayList<Integer> getListOfNumbers() {
        return numbers;
    }
    
    public int sum() {
        int sum = 0;
        
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
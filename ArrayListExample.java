import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Write a description of class ArrayListExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListExample
{
    // instance variables - replace the example below with your own
    private ArrayList<String> list;
    /**
     * Constructor for objects of class ArrayListExample
     */
    public ArrayListExample()
    {
        list = new ArrayList<String>();
    }
    public void addWord(String str)
    {
        list.add(str);
    }
    public void display ()
    {
        System.out.println(list);
    }
    public void addWords(int num)
    {
        for(int i = 0; i < num; i++)
        {
            String str = JOptionPane.showInputDialog("Enter a word: ");
            list.add(str);
        }
        
        
    }
    
    public int search(String str)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equalsIgnoreCase(str))
            {
                return i;
            }
        }
        return -1;
    }
    
    public void diplayElementPerLine()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
    
    public void removeEveryOther()
    {
        for(int i = 0; i < list.size(); i++)
        {
            list.remove(i);
        }
    }
}
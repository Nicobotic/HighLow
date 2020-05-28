import javax.swing.JOptionPane;

public class Window {

	//method that displays a message
    public void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    //method that requests input from the user and displays a message
    public String in(String msg) {
        return JOptionPane.showInputDialog(msg);
    }
    
    //method that displays a method and multiple options 
    public static int option(String[] options, String msg) {
        return JOptionPane.showOptionDialog(
                null,
                msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, // possible options
                options[0]); // default option
    }
    
    //method that prints a string and skips a line
    public void println(String msg) {
        System.out.println(msg);
    }

    //method that prints a string
    public void print(String msg) {
        System.out.println(msg);
    }
    
    //these three methods are the same as the three above with the same name but these use objects instead of strings
    public void msg(Object msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public String in(Object msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public int option(Object[] options, Object msg) {
        return JOptionPane.showOptionDialog(
                null,
                msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, // possible options
                options[0]); // default option
    }
    
    //method that returns null when given a string
    public String showInputDialog(String evaluateQuestion) {
        // TODO Auto-generated method stub
        return null;
    }
}
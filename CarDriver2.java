import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JButton;

/**
 * The class CarDriver2 utilizes methods from the Car2 class to record user entered data regarding cars and creates objects based on that data.
 * This class uses JOptionPane GUI to interact with users and store data.
 * email: email
 * Created: 29NOV2017
 * @author sapper
 * @version1.0
 */
public class CarDriver2 {

	/**
	 * The main() method is the entry point of the application and is a void method so this method does something other than return a value.
	 * This method prompts the user to enter car information which serve as car object attributes defined in the Car2 class.
	 * The user is prompted with JOptionPane GUI windows and data is displayed using JOptionPane GUI windows as well.
	 * @param args, arguments passed from the command line.
	 */
	public static void main(String[] args) {

		//introductory window
		JOptionPane.showMessageDialog(null,"Hello, I am going to prompt you to enter information for three cars.\nI will display what you entered and create a car of my own that will equal the last car entered.");

		//prompting for attributes of car object 1
		String color1 = JOptionPane.showInputDialog(null,"Enter the color of the car");
		int horsePower1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the horsepower of the car"));
		double engineSize1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the engine size"));
		String make1 = JOptionPane.showInputDialog(null,"Enter the make of the car");
		
		//prompting for attributes of car object 2
		String color2 = JOptionPane.showInputDialog(null,"Enter the color of the car");
		int horsePower2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the horsepower of the car"));
		double engineSize2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the engine size"));
		String make2 = JOptionPane.showInputDialog(null,"Enter the make of the car");
		
		//prompting for attributes of car object 3
		String color3 = JOptionPane.showInputDialog(null,"Enter the color of the car");
		int horsePower3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the horsepower of the car"));
		double engineSize3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the engine size"));
		String make3 = JOptionPane.showInputDialog(null,"Enter the make of the car");

		//car objects created and assigned attributes utilizing overloaded constructors
		Car2 myCar = new Car2(color1, horsePower1, engineSize1, make1);
		Car2 hisCar = new Car2(color2,horsePower2,engineSize2,make2);
		Car2 herCar = new Car2(color3,horsePower3,engineSize3,make3);
		//car object created to test equality method doesEqual()
		Car2 equalTest = new Car2(color3,horsePower3,engineSize3,make3);

		//testing equality of two car objects
		if(herCar.doesEqual(equalTest)) {
			JOptionPane.showMessageDialog(null,"herCar is equal to the equalTest car\n\n" + "herCar: " + herCar + "\n\nequalTest car: " + equalTest);
		} else {
			JOptionPane.showMessageDialog(null,"herCar and the equalTest car are not equal, method failed.");
		}
		//number of car objects created
		int number = Car2.getCount();

		//details of all car objects displayed
		JOptionPane.showMessageDialog(null,"The number of cars created is: " + number + "\n\nThe details of all car objects are: " + myCar + "\n" + hisCar + "\n" + herCar + "\n" + equalTest);

	}
}

		/*
		JPanel panel = new JPanel();
		JLabel colorLbl = new JLabel("Enter color: ");
		JLabel horsePowerLbl = new JLabel("Enter Horsepower: ");
		JLabel engineSizeLbl = new JLabel("Enter the engine size: ");
		JLabel makeLbl = new JLabel("Enter the make: ");
		JTextField colorTxt = new JTextField("type color here");
		JTextField horsePowerTxt = new JTextField("type horsepower here");
		JTextField engineSizeTxt = new JTextField("type engine size here");
		JTextField makeTxt = new JTextField("type make here");
		JButton button = new JButton("Submit");

		panel.add(colorLbl);
		panel.add(colorTxt);
		panel.add(horsePowerLbl);
		panel.add(horsePowerTxt);
		panel.add(engineSizeLbl);
		panel.add(engineSizeTxt);
		panel.add(makeLbl);
		panel.add(makeTxt);
		panel.add(button);
		*/

		//JOptionPane.showMessageDialog(null,panel,"Car Information",JOptionPane.INFORMATION_MESSAGE);

		//System.out.println("number of cars: " + Car2.getCount());

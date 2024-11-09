import java.awt.*;
import java.awt.event.*;

public class AWTEventHandlingExample extends Frame implements ActionListener {

    private TextField nameTextField;
    private Label displayLabel;

    public AWTEventHandlingExample() {
        setTitle("AWT Event Handling Example");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // North Panel with GridLayout for TextField and Button
        Panel northPanel = new Panel();
        northPanel.setLayout(new GridLayout(2, 2));

        Label nameLabel = new Label("Enter your name:");
        northPanel.add(nameLabel);

        nameTextField = new TextField(20);
        northPanel.add(nameTextField);

        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        northPanel.add(new Label("")); // Empty cell for alignment
        northPanel.add(submitButton);

        add(northPanel, BorderLayout.NORTH);

        // Center Panel for Display Label
        displayLabel = new Label("Your name will be displayed here.");
        add(displayLabel, BorderLayout.CENTER);

        // South Panel with FlowLayout for Radio Buttons and Check Boxes
        Panel southPanel = new Panel(new FlowLayout());
        Label preferenceLabel = new Label("Choose your preferences:");
        southPanel.add(preferenceLabel);

        Checkbox sportsCheckBox = new Checkbox("Sports");
        Checkbox musicCheckBox = new Checkbox("Music");
        southPanel.add(sportsCheckBox);
        southPanel.add(musicCheckBox);

        CheckboxGroup languageGroup = new CheckboxGroup();
        Checkbox english = new Checkbox("English", languageGroup, true);
        Checkbox spanish = new Checkbox("Spanish", languageGroup, false);
        southPanel.add(english);
        southPanel.add(spanish);

        add(southPanel, BorderLayout.SOUTH);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText();
        displayLabel.setText("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        AWTEventHandlingExample frame = new AWTEventHandlingExample();
        frame.setVisible(true);
    }
}

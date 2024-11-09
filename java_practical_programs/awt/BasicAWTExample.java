import java.awt.*;
import java.awt.event.*;

public class BasicAWTExample extends Frame {
    
    public BasicAWTExample() {
        setTitle("Basic AWT Components");
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Label
        Label nameLabel = new Label("Name:");
        add(nameLabel);

        // TextBox
        TextField nameTextField = new TextField(20);
        add(nameTextField);

        // TextArea
        Label commentLabel = new Label("Comments:");
        add(commentLabel);
        TextArea commentTextArea = new TextArea(5, 30);
        add(commentTextArea);

        // CheckBox
        Label genderLabel = new Label("Gender:");
        add(genderLabel);
        Checkbox male = new Checkbox("Male");
        Checkbox female = new Checkbox("Female");
        add(male);
        add(female);

        // Radio Buttons (Checkbox in a Group)
        Label ageGroupLabel = new Label("Age Group:");
        add(ageGroupLabel);
        CheckboxGroup ageGroup = new CheckboxGroup();
        Checkbox below18 = new Checkbox("Below 18", ageGroup, false);
        Checkbox above18 = new Checkbox("Above 18", ageGroup, true);
        add(below18);
        add(above18);

        // Choice list
        Label cityLabel = new Label("City:");
        add(cityLabel);
        Choice cityChoice = new Choice();
        cityChoice.add("Punjab");
        cityChoice.add("Lahore");
        cityChoice.add("Patna");
        add(cityChoice);

        // Closing the window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        BasicAWTExample frame = new BasicAWTExample();
        frame.setVisible(true);
    }
}

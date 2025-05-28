package ui;

import model.Resource;
import dao.ResourceDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class MainUI extends JFrame {
    JTextField ngoField, typeField, quantityField;
    JTextArea descField;
    JTextArea displayArea;
    ResourceDAO dao = new ResourceDAO();

    public MainUI() {
        setTitle("NGO Resource Sharing Network");
        setSize(600, 600);
        setLayout(new BorderLayout());

        // Top Panel: Form
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));

        ngoField = new JTextField();
        typeField = new JTextField();
        quantityField = new JTextField();
        descField = new JTextArea(3, 20);

        inputPanel.add(new JLabel("NGO Name:"));
        inputPanel.add(ngoField);
        inputPanel.add(new JLabel("Resource Type:"));
        inputPanel.add(typeField);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);
        inputPanel.add(new JLabel("Description:"));
        inputPanel.add(new JScrollPane(descField));

        JButton addBtn = new JButton("Add Resource");
        JButton viewBtn = new JButton("View All Resources");
        inputPanel.add(addBtn);
        inputPanel.add(viewBtn);

        // Bottom Panel: Display Area
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Button Actions
        addBtn.addActionListener(e -> addResource());
        viewBtn.addActionListener(e -> displayResources());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addResource() {
        String ngo = ngoField.getText();
        String type = typeField.getText();
        int qty = Integer.parseInt(quantityField.getText());
        String desc = descField.getText();

        Resource r = new Resource(ngo, type, qty, desc);
        dao.addResource(r);

        JOptionPane.showMessageDialog(this, "Resource Added!");
        ngoField.setText("");
        typeField.setText("");
        quantityField.setText("");
        descField.setText("");
    }

    private void displayResources() {
        List<Resource> list = dao.getAllResources();
        displayArea.setText("");
        for (Resource r : list) {
            displayArea.append("ID: " + r.getId() + ", NGO: " + r.getNgoName() +
                    ", Type: " + r.getResourceType() + ", Qty: " + r.getQuantity() +
                    ", Desc: " + r.getDescription() + "\n");
        }
    }
}

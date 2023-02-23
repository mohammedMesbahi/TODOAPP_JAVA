package com.estf.todoapp.presentation.views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.estf.todoapp.utils.InputBuilder;

public class TodoForm extends JPanel{
	
	private JButton addBtn;
	private JButton resetBtn;
	
	private BoxLayout boxLayout;
	
	private InputBuilder titleInputBuilder;
	private InputBuilder completedInputBuilder;
	
	public TodoForm() {
		boxLayout= new BoxLayout(this, boxLayout.Y_AXIS);
		this.setLayout(boxLayout);
		titleInputBuilder=new InputBuilder("title");
		completedInputBuilder=new InputBuilder("completed");
		
		add(titleInputBuilder);
		add(completedInputBuilder);
		
		JPanel panelBtns= new JPanel();
		addBtn=new JButton("add");
		resetBtn=new JButton("reset");
		panelBtns.add(resetBtn);
		panelBtns.add(addBtn);
		
		add(panelBtns);
	}
}

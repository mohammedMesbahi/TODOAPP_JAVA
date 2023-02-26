package com.estf.todoapp.presentation.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;  
public class TodoJframe extends JFrame{

	private JPanel rootPanel;
	private TodoForm todoForm;
	private TodoList todoList;
	
	public TodoJframe() {
		super("Todo App");
		setSize(1000, 700);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    
	    rootPanel = new JPanel();
	    rootPanel.setLayout(new FlowLayout());
	    
	    todoList=new TodoList();
	    todoForm=new TodoForm(todoList);
	    
	    rootPanel.add(todoForm);
	    rootPanel.add(todoList);
	    
	    setContentPane(rootPanel);
	    setVisible(true);
	}
}

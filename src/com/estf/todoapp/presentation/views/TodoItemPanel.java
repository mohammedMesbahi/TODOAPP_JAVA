package com.estf.todoapp.presentation.views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

import com.estf.todoapp.beans.Todo;

public class TodoItemPanel extends JPanel{
	private Todo todo;
	private JLabel titleLabel;
	private JLabel completedLabel;
	private JButton deleteBtn;
	
	public TodoItemPanel(Todo todo) {
		this.todo=todo;
		setLayout(new FlowLayout());
		titleLabel=new JLabel(this.todo.getTitle());
		completedLabel=new JLabel(this.todo.isCompleted()+"");
		deleteBtn=new JButton("Delete");
		add(titleLabel);
		add(completedLabel);
		add(deleteBtn);
		
	}

}

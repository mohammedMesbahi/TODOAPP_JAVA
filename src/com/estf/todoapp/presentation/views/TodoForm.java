package com.estf.todoapp.presentation.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.estf.todoapp.beans.Todo;
import com.estf.todoapp.utils.InputBuilder;

public class TodoForm extends JPanel{
	private TodoList todoList;
	private JButton addBtn;
	private JButton resetBtn;
	
	private BoxLayout boxLayout;
	
	private InputBuilder titleInputBuilder;
	private InputBuilder completedInputBuilder;
	
	public TodoForm(TodoList todoList) {
		this.todoList = todoList;
		boxLayout= new BoxLayout(this, boxLayout.Y_AXIS);
		this.setLayout(boxLayout);
		titleInputBuilder=new InputBuilder("title");
		completedInputBuilder=new InputBuilder("completed");
		
		add(titleInputBuilder);
		add(completedInputBuilder);
		
		JPanel panelBtns= new JPanel();
		addBtn=new JButton("add");
		addBtn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean completed = false;
				if (completedInputBuilder.getText().equals("true")) {
					completed = true;
				}
				todoList.addNewTodo(new Todo(titleInputBuilder.getText(),completed));
			}  
			});  
		resetBtn=new JButton("reset");
		resetBtn.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				titleInputBuilder.setText("");
				completedInputBuilder.setText("");
			}  
			});  
		panelBtns.add(resetBtn);
		panelBtns.add(addBtn);
		
		add(panelBtns);
	}
	  
}

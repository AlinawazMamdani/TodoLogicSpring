package com.qa.TodoLogicSpring.model;
import javax.persistence.*;
@Entity
public class TodoItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTodo;
    private String todo;
    
    @ManyToOne
   private User user;
   

    public TodoItem(Long idTodo,String todo,Long userID) {
    	this.idTodo=idTodo;
    	this.todo=todo;
    	
	   
	}
	public TodoItem() {
	}
public String getTodo() {
	return todo;
}
public void setTodo(String todo) {
	this.todo = todo;
}
public Long getIdTodo() {
	return idTodo;
}
public void setIdTodo(Long idTodo) {
	this.idTodo = idTodo;
}

}

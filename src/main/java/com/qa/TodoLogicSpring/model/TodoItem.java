package com.qa.TodoLogicSpring.model;
import javax.persistence.*;
@Entity
public class TodoItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTodo;
    private String todo;
    private Long userID;
    private boolean completed=false;
   

    public TodoItem(Long idTodo,String todo,Long userID,boolean completed) {
    	this.idTodo=idTodo;
    	this.todo=todo;
    	this.userID=(userID);
	    this.completed=false;
	    
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
public Long getUserID() {
	return userID;
}
public void setUserID(Long userID) {
	this.userID = userID;
}
public boolean isCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}

}

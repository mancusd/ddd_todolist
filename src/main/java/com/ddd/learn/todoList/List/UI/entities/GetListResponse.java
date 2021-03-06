package com.ddd.learn.todoList.List.UI.entities;

import com.ddd.learn.todoList.List.model.entities.TodoList;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@Generated
public class GetListResponse {
    @JsonProperty
    TodoList list;

    @JsonProperty
    ArrayList<String> errors;
}

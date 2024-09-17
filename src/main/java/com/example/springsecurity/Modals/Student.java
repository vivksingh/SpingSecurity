package com.example.springsecurity.Modals;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Student {
    
    private int id;
    private String name;
    private String marks;
}

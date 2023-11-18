package com.drawyourcom.webapp;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    public MockMvc mockMvc;


    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containsString("Laurent")));
    }
    @Test
    public void testUpdateEmployees() throws Exception{
        mockMvc.perform(get("/updateEmployee/3"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("formUpdateEmployee"));
    }
    @Test
    public void testCreateEmployee() throws Exception {
        mockMvc.perform(get("/createEmployee"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("formNewEmployee"));
    }


}

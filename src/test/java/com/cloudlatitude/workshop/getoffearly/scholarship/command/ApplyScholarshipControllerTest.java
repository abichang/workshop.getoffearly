package com.cloudlatitude.workshop.getoffearly.scholarship.command;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplyScholarshipControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void all_ok() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders
                                .post("/scholarship/apply")
                                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(HttpStatus.OK.value()));
    }
}

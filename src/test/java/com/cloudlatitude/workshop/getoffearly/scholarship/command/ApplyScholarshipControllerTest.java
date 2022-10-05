package com.cloudlatitude.workshop.getoffearly.scholarship.command;

import com.cloudlatitude.workshop.getoffearly.scholarship.command.service.ApplyScholarshipService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplyScholarshipControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ApplyScholarshipService applyScholarshipService;

    @Test
    void all_ok() throws Exception {
        ApplicationForm applicationForm = new ApplicationForm(9888L, 55688L);

        mockMvc.perform(
                        MockMvcRequestBuilders
                                .post("/scholarship/apply")
                                .content(objectMapper.writeValueAsString(applicationForm))
                                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(HttpStatus.OK.value()));

        verify(applyScholarshipService, times(1)).apply(applicationForm);
    }
}

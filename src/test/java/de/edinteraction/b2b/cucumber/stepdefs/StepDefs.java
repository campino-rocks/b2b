package de.edinteraction.b2b.cucumber.stepdefs;

import de.edinteraction.b2b.B2BApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = B2BApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

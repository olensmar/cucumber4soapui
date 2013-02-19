package com.smartbear.cucumber.fest.soapui

import org.junit.Assert

import static org.fest.swing.finder.WindowFinder.findDialog

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)

World {
    new SoapUIWorld()
}

Given(~'^SoapUI is running$') {->
    startSoapUI()
}

Given(~'^no dialogs are visible$') {->

    closeOpenDialogs()
}

When(~'I select (.*) from the (.*) menu') { String menuItem, String menu ->
    getFrame().menuItemWithPath(menu, menuItem).click();
}

Then(~'the (.*) dialog is shown') { String dialogName ->
    Assert.assertNotNull(findDialog(dialogName));
}

After()
{
    shutdown()
}
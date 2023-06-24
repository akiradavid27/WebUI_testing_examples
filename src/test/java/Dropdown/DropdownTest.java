package Dropdown;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropdown();
        Assert.assertTrue(dropdownPage.isDropdownPageOpen());
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptionsList = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptionsList.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptionsList.contains(option), "Option not selected");
    }

}

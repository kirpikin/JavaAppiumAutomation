import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class HomeworkNine extends CoreTestCase {

    @Test
    public void testHomeworkFive() {
        //    Ex9*: Рефакторинг темплейта

        String name_of_folder = "Learning programming";

        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");

        SearchPageObject.waitForElementByTitleAndDescription(
                "Java",
                "Island of Indonesia"
        );

        SearchPageObject.waitForElementByTitleAndDescription(
                "Java (programming language)",
                "Object-oriented programming language"
        );

        SearchPageObject.waitForElementByTitleAndDescription(
                "JavaScript",
                "Programming language"
        );
    }
}

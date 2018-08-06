import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class HomeworkThree extends CoreTestCase {

    @Test
    public void testCancelSearchResults() {
        //    Ex3: Тест: отмена поиска

        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForResultsListsPresent();
        SearchPageObject.clickCancelSearch();
        SearchPageObject.waitForResultsListsNotPresent();

    }

}

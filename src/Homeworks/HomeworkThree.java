package Homeworks;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Test;

public class HomeworkThree extends CoreTestCase {

    @Test
    public void testCancelSearchResults() {
        //    Ex3: Тест: отмена поиска

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForResultsListsPresent();
        SearchPageObject.clickCancelSearch();
        SearchPageObject.waitForResultsListsNotPresent();

    }

}

package Homeworks;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Assert;
import org.junit.Test;

public class HomeworkEleven extends CoreTestCase {

    @Test
    public void testVerify() {

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForSearchResult("Object-oriented programming language");

        Assert.assertTrue(SearchPageObject.isSearchResultsContainsString("Java"));

        SearchPageObject.clickCancelSearch();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Microsoft");
        SearchPageObject.waitForSearchResult("American multinational technology corporat");

        Assert.assertTrue(SearchPageObject.isSearchResultsContainsString("Microsoft"));

        SearchPageObject.clickCancelSearch();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Google");
        SearchPageObject.waitForSearchResult("Web browser developed by Google");

        Assert.assertTrue(SearchPageObject.isSearchResultsContainsString("Google"));
    }

}

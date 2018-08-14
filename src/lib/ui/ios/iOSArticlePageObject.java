package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "id:Java (programming language)";
        FOOTER_ELEMENT = "id:View article in browser";
        OPTIONS_ADD_TO_MY_LIST = "xpath://XCUIElementTypeButton[@name='Save for later']";
        CLOSE_ARTICLE_BUTTON = "id:Back";

        //String SAVED_LIST_NAME_TLP = "xpath://android.widget.TextView[@text='{LIST_NAME}']";
    }

    public iOSArticlePageObject(AppiumDriver driver) {
        super(driver);
    }
}

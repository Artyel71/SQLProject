package page;

import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.google.common.base.Verify.verify;

public class VerificationPage {

    private final SelenideElement codeField = $("[data-test-id=code] input");
    private final SelenideElement verifyButton = $("[data-test-id=action-verify]");
    private final SelenideElement errorNotification = $("[data-test-id=`error-notification`]");

    public void verificationPageVisibility() {
        codeField.shouldBe(visible);
    }
    public void errorNotificationVisibility() {
        errorNotification.shouldBe(visible);
    }
    public DashboardPage validVerify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
       // verify(verificationCode);
        return new DashboardPage();
    }

   // public void verify(String verificationCode) {
    //    codeField.setValue(verificationCode);
     //   verifyButton.click();
   // }
}


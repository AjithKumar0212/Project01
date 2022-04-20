package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends BaseClass {
	public FirstPage() {
Pagefactor();	}
@FindBy(xpath="(//button)[2]")
private WebElement btnclose;
public  void btnclose() {
btnclick(btnclose);
}
}

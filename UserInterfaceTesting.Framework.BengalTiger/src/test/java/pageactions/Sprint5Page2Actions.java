package pageactions;

import org.openqa.selenium.WebDriver;

import pages.Sprint5Page2;
import resources.Animal;

public class Sprint5Page2Actions 
{
	public Sprint5Page2 Sprint5Page2;
	
    public Sprint5Page2Actions(WebDriver driver)
    {
    	Sprint5Page2 = new Sprint5Page2(driver);
    }
    
    public void FillOutRadioButtonAndSubmit(Animal animal) throws Exception
    {
    	SetAnimal(animal);
    	Sprint5Page2.getSubmitButton().click();
    }
    
    private void SetAnimal(Animal animalType) throws Exception
    {
        switch (animalType)
        {
            case Wolves:
                break;
            case Crocodiles:
                Sprint5Page2.getCrocodilesRadioButton().click();;
                break;
            case Bunnies:
                Sprint5Page2.getBunniesRadioButton().click();;
                break;
            case None:
                throw new Exception("Request type: None is invalid.");
            default:
                throw new UnsupportedOperationException("Request type is not supported.");
        }
    }
}
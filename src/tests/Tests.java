package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.NameGenerator;

public class Tests {
    @Test
    public void Test1() {
        int stringLength = 5; // Number of characters of SonVu is 5.
        String SonVu = NameGenerator.generateRandomName(stringLength);
//        System.out.println(SonVu);
        Assert.assertEquals(SonVu.length(), stringLength);
    }

}

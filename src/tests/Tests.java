package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.NameGenerator;

public class Tests {
    @Test
    public void Test1() {
        String SonVu = NameGenerator.generateRandomName(12);
    }

}

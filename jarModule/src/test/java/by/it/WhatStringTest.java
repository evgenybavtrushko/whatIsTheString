package by.it;

import org.junit.jupiter.api.Test;


import static by.it.WhatString.what;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhatStringTest {
    @Test
    public void whatTest() {
        System.out.println("whatTest");
        String str = "Строка является номером телефона!!!";
        String str1 = what("8029-234-44-21");
        assertEquals(str, str1);
         str = "Строка является e-mail !!!";
         str1 = what("nimf.87@mail.ru");
        assertEquals(str, str1);
         str = "Строка является Фамилией!!!";
         str1 = what("Иванов");
        assertEquals(str, str1);
         str = "Строка является номером социального страхования!!!";
         str1 = what("23423432432");
        assertEquals(str, str1);
        str = "Вы ни чего не ввели!!!";
         str1 = what("");
        assertEquals(str, str1);
        str = "Неизвестная строка";
         str1 = what("чвап5346");
        assertEquals(str, str1);
    }
    @Test
    public void WhatStringTest(){
        WhatString whatString = new WhatString();
    }
}

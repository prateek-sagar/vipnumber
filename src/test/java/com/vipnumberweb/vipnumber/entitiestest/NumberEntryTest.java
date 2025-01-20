package com.vipnumberweb.vipnumber.entitiestest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.vipnumberweb.vipnumber.model.entities.NumberEntry;

@SpringBootTest
public class NumberEntryTest {
    private NumberEntry numberEntry = new NumberEntry();

    @Test
    public void existenceOfClass() {
        assertInstanceOf(NumberEntry.class, numberEntry);
    }

    @Test
    public void setEntryNumber_doesNotThrowException() {
        int[] arr = new int[10];
        assertDoesNotThrow(() -> numberEntry.setEntryNumber(arr));
    }

    @Test
    public void setEntryNumber_throwException() {
        int[] arr = new int[9];
        assertThrows(IllegalArgumentException.class, () -> numberEntry.setEntryNumber(arr));
    }

    @Test
    public void setEntry_getEntry() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 0, 7, 8, 9 };
        numberEntry.setEntryNumber(arr);
        int[] newArray = numberEntry.getEntryNumber();

        assertEquals(arr, newArray);
    }

    
}

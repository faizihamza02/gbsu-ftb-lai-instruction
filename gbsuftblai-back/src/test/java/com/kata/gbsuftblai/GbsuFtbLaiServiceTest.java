package com.kata.gbsuftblai;

import com.kata.gbsuftblai.services.GbsuFtbLaiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GbsuFtbLaiServiceTest {

    @Autowired
    private GbsuFtbLaiService gbsuFtbLaiService;

    @Test
    public void testgetStrResultDivisibleByNumber() {
        assertEquals("Gbsu", GbsuFtbLaiService.getStrResultDivisibleByNumber(33,3));
        assertEquals("Ftb", GbsuFtbLaiService.getStrResultDivisibleByNumber(55,5));
        assertEquals("", GbsuFtbLaiService.getStrResultDivisibleByNumber(8,5));
    }
    @Test
    public void testgetStrResultContainingCharacter() {
        assertEquals("GbsuGbsu", GbsuFtbLaiService.getStrResultContainingCharacter("337",'3'));
        assertEquals("FtbFtb", GbsuFtbLaiService.getStrResultContainingCharacter("55",'5'));
        assertEquals("Lai", GbsuFtbLaiService.getStrResultContainingCharacter("337",'7'));
        assertEquals("", GbsuFtbLaiService.getStrResultContainingCharacter("",'5'));
    }
    @Test
    public void testconvertNumber() {
        assertEquals("GbsuGbsuGbsu", gbsuFtbLaiService.convertNumber(33));
        assertEquals("1", gbsuFtbLaiService.convertNumber(1));
        assertEquals("GbsuFtb", gbsuFtbLaiService.convertNumber(51));
        assertEquals("FtbGbsu", gbsuFtbLaiService.convertNumber(53));
        assertEquals("GbsuLai", gbsuFtbLaiService.convertNumber(27));
    }
}

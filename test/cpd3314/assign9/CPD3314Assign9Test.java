/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cpd3314.assign9;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314Assign9Test {
    
    public CPD3314Assign9Test() {
    }

    /**
     * Test of reverseString method, of class CPD3314Assign9.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String str = "Pineapple";
        String expResult = "elppaeniP";
        String result = CPD3314Assign9.reverseString(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of wordCount method, of class CPD3314Assign9.
     */
    @Test
    public void testWordCount() {
        System.out.println("wordCount");
        String str = "This is some sort of lengthy sample string.";
        int expResult = 8;
        int result = CPD3314Assign9.wordCount(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of capitalize method, of class CPD3314Assign9.
     */
    @Test
    public void testCapitalize() {
        System.out.println("capitalize");
        String str = "this is. SOME SORT. of lengthy. SAMPLE string.";
        String expResult = "This is. Some sort. Of lengthy. Sample string.";
        String result = CPD3314Assign9.capitalize(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumOfDigits method, of class CPD3314Assign9.
     */
    @Test
    public void testSumOfDigits() {
        System.out.println("sumOfDigits");
        String str = "555-GET-FOOD";
        int expResult = 15;
        int result = CPD3314Assign9.sumOfDigits(str);
        assertEquals(expResult, result);        
    }

    /**
     * Test of phoneTranslator method, of class CPD3314Assign9.
     */
    @Test
    public void testPhoneTranslatorGood() {
        System.out.println("phoneTranslator");
        String str = "800-CAL-LSAM";
        String expResult = "800-225-5726";
        String result = CPD3314Assign9.phoneTranslator(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of phoneTranslator method, of class CPD3314Assign9.
     */
    @Test
    public void testPhoneTranslatorBad() {
        System.out.println("phoneTranslator");
        String str = "800-CALL-SAM";
        String expResult = null;
        String result = CPD3314Assign9.phoneTranslator(str);
        assertEquals(expResult, result);
    }
}

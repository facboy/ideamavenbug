package org.facboy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author Christopher Ng
 */
public class MoreAsserts {
    public static void assert1is1() {
        assertThat(1, equalTo(1));
    }
}

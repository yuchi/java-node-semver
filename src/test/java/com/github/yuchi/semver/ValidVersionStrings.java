package com.github.yuchi.semver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidVersionStrings {

    protected String version;

    @Test
    public void valid() {
        new Version(this.version);
    }

    public ValidVersionStrings(String version) {
        this.version = version;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                {"1.2.3"},
                {"1000000000000.2000000000000.30000000000000"},
                {"1.2.3-alpha"},
                {"1.2.3-alpha.1234567890"},
                {"1.2.3-beta.1234567890123"},
                {"1.2.3-4.5.6"},
                {"1.2.3-x.4.y.5.z"},
                {"1.2.3-alpha+1"},
                {"1.2.3-beta+1234567890123"},
                {"1.2.3-gamma+x.y.z.1234567890"},
                {"1.2.3+1234567890123"}
        });
    }
}

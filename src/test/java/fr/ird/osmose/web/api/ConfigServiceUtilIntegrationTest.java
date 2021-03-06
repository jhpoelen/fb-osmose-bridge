package fr.ird.osmose.web.api;

import fr.ird.osmose.web.api.domain.Group;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConfigServiceUtilIntegrationTest {
    @Test
    public void getValueFactory() {
        Group groupWithBlueCrabOnly = TestGroups.getGroupWithBlueCrabOnly();
        ValueFactory valueFactory = ConfigServiceUtil.getValueFactory(Collections.singletonList(groupWithBlueCrabOnly));

        String name = "species.lInf.sp";
        assertThat(Double.parseDouble(valueFactory.groupValueFor(name, groupWithBlueCrabOnly)), is(19.61d));
    }
}

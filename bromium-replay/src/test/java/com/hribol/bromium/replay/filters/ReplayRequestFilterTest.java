package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 31.07.17.
 */
public class ReplayRequestFilterTest {

    ReplayingState replayingState = mock(ReplayingState.class);

    HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);

    HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class, RETURNS_DEEP_STUBS);

    HttpRequest httpRequest = mock(HttpRequest.class, RETURNS_MOCKS);

    private final String EXAMPLE_CONDITION = "9890013";

    private final String RANDOM_URL = "http://something.com/?" + EXAMPLE_CONDITION;


    StateConditionsUpdater stateConditionsUpdater = mock(StateConditionsUpdater.class);

    @Test
    public void invokesConditionsUpdatersThatShouldAndDoesNotThoseWhoShouldNot() {
        baseTest(RANDOM_URL);
        verify(stateConditionsUpdater).update(replayingState, EXAMPLE_CONDITION);
    }

    @Test
    public void throwsExceptionIfUrlIsMalformed() {
        baseTest("a" + RANDOM_URL);
        verify(stateConditionsUpdater, never()).update(replayingState, EXAMPLE_CONDITION);
    }

    private void baseTest(String url) {
        when(httpRequest.getUri()).thenReturn(url);
        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(replayingState, getConditionUpdaters());
        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
    }

    private List<ConditionsUpdater> getConditionUpdaters() {
        return Arrays.asList(getConditionsUpdaterThatShouldNotBe(), getConditionsUpdaterThatShouldBeTriggered());
    }

    private ConditionsUpdater getConditionsUpdaterThatShouldNotBe() {
        ConditionsUpdater conditionsUpdater = mock(ConditionsUpdater.class);
        when(conditionsUpdater.shouldUpdate()).thenReturn(request -> false);
        return conditionsUpdater;
    }

    private ConditionsUpdater getConditionsUpdaterThatShouldBeTriggered() {
        ConditionsUpdater conditionsUpdater = mock(ConditionsUpdater.class);
        when(conditionsUpdater.shouldUpdate()).thenReturn(request -> true);
        when(conditionsUpdater.updater()).thenReturn(stateConditionsUpdater);
        return conditionsUpdater;
    }
}

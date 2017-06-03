package com.hribol.bromium.replay.execution.synchronization;

/**
 * Created by hvrigazov on 03.06.17.
 */
public interface SynchronizationEvent {
    String getName();
    boolean isAlreadySatisfied();
    void setLock(Object lock);
    void signalizeIsDone();
}

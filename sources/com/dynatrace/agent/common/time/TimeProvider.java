package com.dynatrace.agent.common.time;

/* JADX INFO: loaded from: classes2.dex */
public interface TimeProvider {
    long millisSinceEpoch();

    long nanosSinceEpoch();
}

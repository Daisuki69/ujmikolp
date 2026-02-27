package com.dynatrace.android.lifecycle;

import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public interface SegmentFactory<T, R extends CustomSegment> {
    R createSegment(T t5, Session session, int i);
}

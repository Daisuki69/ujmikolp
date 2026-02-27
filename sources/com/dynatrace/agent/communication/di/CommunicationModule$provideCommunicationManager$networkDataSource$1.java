package com.dynatrace.agent.communication.di;

import com.dynatrace.agent.common.time.TimeProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class CommunicationModule$provideCommunicationManager$networkDataSource$1 extends i implements Function0<Long> {
    public CommunicationModule$provideCommunicationManager$networkDataSource$1(Object obj) {
        super(obj, "millisSinceEpoch", 0, "millisSinceEpoch()J", 0, TimeProvider.class);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((TimeProvider) this.receiver).millisSinceEpoch());
    }
}

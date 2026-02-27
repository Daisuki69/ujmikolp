package com.dynatrace.agent.storage.db;

import gj.InterfaceC1526a;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface EventDatabaseDataSource {
    Object delete(List<EventRecord> list, InterfaceC1526a<? super Unit> interfaceC1526a);

    Object deleteAll(InterfaceC1526a<? super Unit> interfaceC1526a);

    Object deleteAllBefore(long j, long j6, InterfaceC1526a<? super Unit> interfaceC1526a);

    Object deleteIds(List<Long> list, InterfaceC1526a<? super Unit> interfaceC1526a);

    Object fetchEventMetadata(boolean z4, int i, InterfaceC1526a<? super List<EventMetadata>> interfaceC1526a);

    Object fetchEventRecordByIds(List<Long> list, InterfaceC1526a<? super List<EventRecord>> interfaceC1526a);

    Object getAll(InterfaceC1526a<? super List<EventRecord>> interfaceC1526a);

    Object put(EventRecord eventRecord, InterfaceC1526a<? super Unit> interfaceC1526a);
}

package com.dynatrace.agent.communication.preprocessing;

import cj.C1110A;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.filter.EventRecordSizeFilter;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatchableDataProvider {
    private final EndPointInfo activeEndpoint;
    private final EventDatabaseDataSource databaseDataSource;
    private final int envelopeSize;
    private final EventRecordSizeFilter eventRecordSizeFilter;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$selectData$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider", f = "DispatchableDataProvider.kt", l = {53, 76, 81, 99}, m = "selectData")
    public static final class AnonymousClass1 extends AbstractC1609c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DispatchableDataProvider.this.selectData(0L, this);
        }
    }

    public DispatchableDataProvider(EndPointInfo activeEndpoint, EventDatabaseDataSource databaseDataSource, int i, TimeProvider timeProvider) {
        j.g(activeEndpoint, "activeEndpoint");
        j.g(databaseDataSource, "databaseDataSource");
        j.g(timeProvider, "timeProvider");
        this.activeEndpoint = activeEndpoint;
        this.databaseDataSource = databaseDataSource;
        this.envelopeSize = i;
        this.timeProvider = timeProvider;
        this.eventRecordSizeFilter = new EventRecordSizeFilter(i);
    }

    public static /* synthetic */ Object preSelectData$com_dynatrace_agent_release$default(DispatchableDataProvider dispatchableDataProvider, EventDatabaseDataSource eventDatabaseDataSource, int i, InterfaceC1526a interfaceC1526a, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 1000;
        }
        return dispatchableDataProvider.preSelectData$com_dynatrace_agent_release(eventDatabaseDataSource, i, interfaceC1526a);
    }

    private final DispatchableData toDispatchableData(List<EventRecord> list, EndPointInfo endPointInfo) {
        return new DispatchableData(endPointInfo, list, ((EventRecord) C1110A.A(list)).isPriorityData());
    }

    public final EndPointInfo getActiveEndpoint() {
        return this.activeEndpoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadEventData$com_dynatrace_agent_release(java.util.List<com.dynatrace.agent.storage.db.EventMetadata> r8, com.dynatrace.agent.storage.db.EventDatabaseDataSource r9, gj.InterfaceC1526a<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1
            if (r0 == 0) goto L13
            r0 = r10
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1 r0 = (com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1 r0 = new com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$loadEventData$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            bj.AbstractC1039j.b(r10)
            goto L75
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            bj.AbstractC1039j.b(r10)
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L3f
            cj.C r8 = cj.C1112C.f9377a
            return r8
        L3f:
            r10 = r8
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = cj.t.l(r10, r4)
            r2.<init>(r4)
            java.util.Iterator r10 = r10.iterator()
        L51:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r10.next()
            com.dynatrace.agent.storage.db.EventMetadata r4 = (com.dynatrace.agent.storage.db.EventMetadata) r4
            long r4 = r4.getId()
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r2.add(r6)
            goto L51
        L6a:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r10 = r9.fetchEventRecordByIds(r2, r0)
            if (r10 != r1) goto L75
            return r1
        L75:
            java.util.List r10 = (java.util.List) r10
            int r9 = r10.size()
            int r8 = r8.size()
            if (r9 == r8) goto L88
            java.lang.String r8 = "dtxCommunication"
            java.lang.String r9 = "ALERT! actual record size does not match metadata size"
            com.dynatrace.android.agent.util.Utility.devLog(r8, r9)
        L88:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.loadEventData$com_dynatrace_agent_release(java.util.List, com.dynatrace.agent.storage.db.EventDatabaseDataSource, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preSelectData$com_dynatrace_agent_release(com.dynatrace.agent.storage.db.EventDatabaseDataSource r8, int r9, gj.InterfaceC1526a<? super kotlin.Pair<java.lang.Boolean, ? extends java.util.List<com.dynatrace.agent.storage.db.EventMetadata>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1
            if (r0 == 0) goto L13
            r0 = r10
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1 r0 = (com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1 r0 = new com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider$preSelectData$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$0
            kotlin.jvm.internal.u r9 = (kotlin.jvm.internal.u) r9
            bj.AbstractC1039j.b(r10)
            goto L80
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            int r9 = r0.I$0
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.u r8 = (kotlin.jvm.internal.u) r8
            java.lang.Object r2 = r0.L$0
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r2 = (com.dynatrace.agent.storage.db.EventDatabaseDataSource) r2
            bj.AbstractC1039j.b(r10)
            r6 = r10
            r10 = r8
            r8 = r2
            r2 = r6
            goto L64
        L4b:
            bj.AbstractC1039j.b(r10)
            kotlin.jvm.internal.u r10 = new kotlin.jvm.internal.u
            r10.<init>()
            r10.f18191a = r5
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r5
            java.lang.Object r2 = r8.fetchEventMetadata(r5, r9, r0)
            if (r2 != r1) goto L64
            goto L7b
        L64:
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L8c
            r0.L$0 = r10
            r2 = 0
            r0.L$1 = r2
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r8 = r8.fetchEventMetadata(r3, r9, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r6 = r10
            r10 = r8
            r8 = r9
            r9 = r6
        L80:
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            int r10 = r2.size()
            if (r10 >= r8) goto L8b
            r9.f18191a = r3
        L8b:
            r10 = r9
        L8c:
            java.util.List r2 = (java.util.List) r2
            kotlin.Pair r8 = new kotlin.Pair
            boolean r9 = r10.f18191a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.<init>(r9, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.preSelectData$com_dynatrace_agent_release(com.dynatrace.agent.storage.db.EventDatabaseDataSource, int, gj.a):java.lang.Object");
    }

    public final Object sanitizeDataSource(InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objDeleteAllBefore = this.databaseDataSource.deleteAllBefore(this.timeProvider.millisSinceEpoch(), a.d(DispatchableDataProviderKt.RETENTION_TIME), interfaceC1526a);
        return objDeleteAllBefore == EnumC1578a.f17050a ? objDeleteAllBefore : Unit.f18162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0164 A[PHI: r1 r4 r6 r11 r12 r13 r14
  0x0164: PHI (r1v18 java.lang.Object) = (r1v15 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r4v7 boolean) = (r4v5 boolean), (r4v11 boolean) binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r6v7 long) = (r6v5 long), (r6v8 long) binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r11v6 java.util.List) = (r11v3 java.util.List), (r11v10 java.util.List) binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r12v1 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>) = 
  (r12v0 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>)
  (r12v3 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>)
 binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r13v5 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>) = 
  (r13v3 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>)
  (r13v9 java.util.List<com.dynatrace.agent.storage.db.EventMetadata>)
 binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r14v5 com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider) = 
  (r14v3 com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider)
  (r14v9 com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider)
 binds: [B:43:0x0161, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectData(long r20, gj.InterfaceC1526a<? super kotlin.Pair<com.dynatrace.agent.communication.preprocessing.DispatchableData, java.lang.Boolean>> r22) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider.selectData(long, gj.a):java.lang.Object");
    }
}

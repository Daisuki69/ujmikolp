package com.dynatrace.agent.storage.db;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EventDatabaseDataSourceImpl implements EventDatabaseDataSource {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EXCEPTION_LOG_MESSAGE = "operation was not completed for DB: ";
    private final EventDao dao;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {90}, m = "delete")
    public static final class AnonymousClass1 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.delete(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {116}, m = "deleteAll")
    public static final class C11451 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11451(InterfaceC1526a<? super C11451> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.deleteAll(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {77}, m = "deleteAllBefore")
    public static final class C11461 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11461(InterfaceC1526a<? super C11461> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.deleteAllBefore(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {103}, m = "deleteIds")
    public static final class C11471 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11471(InterfaceC1526a<? super C11471> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.deleteIds(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {44}, m = "fetchEventMetadata")
    public static final class C11481 extends AbstractC1609c {
        int I$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11481(InterfaceC1526a<? super C11481> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.fetchEventMetadata(false, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {59}, m = "fetchEventRecordByIds")
    public static final class C11491 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11491(InterfaceC1526a<? super C11491> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.fetchEventRecordByIds(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {32}, m = "getAll")
    public static final class C11501 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11501(InterfaceC1526a<? super C11501> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.getAll(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {23}, m = "put")
    public static final class C11511 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public C11511(InterfaceC1526a<? super C11511> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDatabaseDataSourceImpl.this.put(null, this);
        }
    }

    public EventDatabaseDataSourceImpl(EventDao dao) {
        j.g(dao, "dao");
        this.dao = dao;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object delete(java.util.List<com.dynatrace.agent.storage.db.EventRecord> r6, gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1 r0 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1 r0 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$delete$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Exception -> L29
            goto L57
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            bj.AbstractC1039j.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "db event delete, eventRecords: "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7)
            com.dynatrace.agent.storage.db.EventDao r7 = r5.dao     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r7.delete(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L57
            return r1
        L52:
            java.lang.String r7 = "operation was not completed for DB: delete"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7, r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.delete(java.util.List, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteAll(gj.InterfaceC1526a<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11451
            if (r0 == 0) goto L13
            r0 = r6
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1 r0 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1 r0 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r6)     // Catch: java.lang.Exception -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            bj.AbstractC1039j.b(r6)
            java.lang.String r6 = "db event deleteAll"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r6)
            com.dynatrace.agent.storage.db.EventDao r6 = r5.dao     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r6.deleteAll(r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L4b
            return r1
        L46:
            java.lang.String r0 = "operation was not completed for DB: deleteAll"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r0, r6)
        L4b:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteAll(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteAllBefore(long r9, long r11, gj.InterfaceC1526a<? super kotlin.Unit> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11461
            if (r0 == 0) goto L14
            r0 = r13
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1 r0 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1 r0 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteAllBefore$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.label
            java.lang.String r7 = "dtxStorage"
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            bj.AbstractC1039j.b(r13)     // Catch: java.lang.Exception -> L2b
            goto L64
        L2b:
            r0 = move-exception
            r9 = r0
            goto L5f
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            bj.AbstractC1039j.b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "db event deleteAllBefore, now: "
            r13.<init>(r1)
            r13.append(r9)
            java.lang.String r1 = ", retentionTime: "
            r13.append(r1)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r7, r13)
            com.dynatrace.agent.storage.db.EventDao r1 = r8.dao     // Catch: java.lang.Exception -> L2b
            r6.label = r2     // Catch: java.lang.Exception -> L2b
            r2 = r9
            r4 = r11
            java.lang.Object r9 = r1.deleteOutdated(r2, r4, r6)     // Catch: java.lang.Exception -> L2b
            if (r9 != r0) goto L64
            return r0
        L5f:
            java.lang.String r10 = "operation was not completed for DB: deleteAllBefore"
            com.dynatrace.android.agent.util.Utility.devLog(r7, r10, r9)
        L64:
            kotlin.Unit r9 = kotlin.Unit.f18162a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteAllBefore(long, long, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteIds(java.util.List<java.lang.Long> r6, gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11471
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1 r0 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1 r0 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$deleteIds$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Exception -> L29
            goto L57
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            bj.AbstractC1039j.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "db event deleteIds, recordIds: "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7)
            com.dynatrace.agent.storage.db.EventDao r7 = r5.dao     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r7.deleteById(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L57
            return r1
        L52:
            java.lang.String r7 = "operation was not completed for DB: deleteIds"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7, r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.deleteIds(java.util.List, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchEventMetadata(boolean r8, int r9, gj.InterfaceC1526a<? super java.util.List<com.dynatrace.agent.storage.db.EventMetadata>> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "db event fetchEventMetadata: "
            boolean r1 = r10 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11481
            if (r1 == 0) goto L15
            r1 = r10
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1 r1 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11481) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1 r1 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventMetadata$1
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.result
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r1.label
            java.lang.String r4 = "dtxStorage"
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 != r5) goto L35
            int r9 = r1.I$0
            boolean r8 = r1.Z$0
            java.lang.Object r1 = r1.L$0
            java.util.List r1 = (java.util.List) r1
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Exception -> L33
            goto L56
        L33:
            r8 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            bj.AbstractC1039j.b(r10)
            cj.C r10 = cj.C1112C.f9377a
            com.dynatrace.agent.storage.db.EventDao r3 = r7.dao     // Catch: java.lang.Exception -> L78
            r1.L$0 = r10     // Catch: java.lang.Exception -> L78
            r1.Z$0 = r8     // Catch: java.lang.Exception -> L78
            r1.I$0 = r9     // Catch: java.lang.Exception -> L78
            r1.label = r5     // Catch: java.lang.Exception -> L78
            java.lang.Object r1 = r3.fetchEventMetadata(r8, r9, r1)     // Catch: java.lang.Exception -> L78
            if (r1 != r2) goto L53
            return r2
        L53:
            r6 = r1
            r1 = r10
            r10 = r6
        L56:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L78
            r1.<init>(r0)     // Catch: java.lang.Exception -> L78
            r1.append(r10)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = ", isPriority: "
            r1.append(r0)     // Catch: java.lang.Exception -> L78
            r1.append(r8)     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = ", limitRows: "
            r1.append(r8)     // Catch: java.lang.Exception -> L78
            r1.append(r9)     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> L78
            com.dynatrace.android.agent.util.Utility.devLog(r4, r8)     // Catch: java.lang.Exception -> L78
            return r10
        L78:
            r8 = move-exception
            r1 = r10
        L7a:
            java.lang.String r9 = "operation was not completed for DB: fetchEventMetadata"
            com.dynatrace.android.agent.util.Utility.devLog(r4, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.fetchEventMetadata(boolean, int, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchEventRecordByIds(java.util.List<java.lang.Long> r8, gj.InterfaceC1526a<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "db event fetchEventRecordByIds: "
            boolean r1 = r9 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11491
            if (r1 == 0) goto L15
            r1 = r9
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1 r1 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11491) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1 r1 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$fetchEventRecordByIds$1
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.result
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r1.label
            java.lang.String r4 = "dtxStorage"
            r5 = 1
            if (r3 == 0) goto L41
            if (r3 != r5) goto L39
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r1.L$0
            java.util.List r1 = (java.util.List) r1
            bj.AbstractC1039j.b(r9)     // Catch: java.lang.Exception -> L37
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L55
        L37:
            r9 = move-exception
            goto L76
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            bj.AbstractC1039j.b(r9)
            cj.C r9 = cj.C1112C.f9377a
            com.dynatrace.agent.storage.db.EventDao r3 = r7.dao     // Catch: java.lang.Exception -> L72
            r1.L$0 = r8     // Catch: java.lang.Exception -> L72
            r1.L$1 = r9     // Catch: java.lang.Exception -> L72
            r1.label = r5     // Catch: java.lang.Exception -> L72
            java.lang.Object r1 = r3.fetchEventRecordByIds(r8, r1)     // Catch: java.lang.Exception -> L72
            if (r1 != r2) goto L55
            return r2
        L55:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r9.<init>(r0)     // Catch: java.lang.Exception -> L6f
            r9.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = ", recordIds: "
            r9.append(r0)     // Catch: java.lang.Exception -> L6f
            r9.append(r8)     // Catch: java.lang.Exception -> L6f
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L6f
            com.dynatrace.android.agent.util.Utility.devLog(r4, r8)     // Catch: java.lang.Exception -> L6f
            return r1
        L6f:
            r9 = move-exception
            r8 = r1
            goto L76
        L72:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L76:
            java.lang.String r0 = "operation was not completed for DB: fetchEventRecordByIds"
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.fetchEventRecordByIds(java.util.List, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAll(gj.InterfaceC1526a<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "db event getAll: "
            boolean r1 = r8 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11501
            if (r1 == 0) goto L15
            r1 = r8
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1 r1 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11501) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1 r1 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$getAll$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r1.label
            java.lang.String r4 = "dtxStorage"
            r5 = 1
            if (r3 == 0) goto L39
            if (r3 != r5) goto L31
            java.lang.Object r1 = r1.L$0
            java.util.List r1 = (java.util.List) r1
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L4e
        L2f:
            r8 = move-exception
            goto L63
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            bj.AbstractC1039j.b(r8)
            cj.C r8 = cj.C1112C.f9377a
            com.dynatrace.agent.storage.db.EventDao r3 = r7.dao     // Catch: java.lang.Exception -> L60
            r1.L$0 = r8     // Catch: java.lang.Exception -> L60
            r1.label = r5     // Catch: java.lang.Exception -> L60
            java.lang.Object r1 = r3.getAll(r1)     // Catch: java.lang.Exception -> L60
            if (r1 != r2) goto L4b
            return r2
        L4b:
            r6 = r1
            r1 = r8
            r8 = r6
        L4e:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r1.<init>(r0)     // Catch: java.lang.Exception -> L60
            r1.append(r8)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L60
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0)     // Catch: java.lang.Exception -> L60
            return r8
        L60:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L63:
            java.lang.String r0 = "operation was not completed for DB: getAll"
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.getAll(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.db.EventDatabaseDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object put(com.dynatrace.agent.storage.db.EventRecord r6, gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11511
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1 r0 = (com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.C11511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1 r0 = new com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl$put$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            bj.AbstractC1039j.b(r7)     // Catch: java.lang.Exception -> L29
            goto L57
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            bj.AbstractC1039j.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "db event put: "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7)
            com.dynatrace.agent.storage.db.EventDao r7 = r5.dao     // Catch: java.lang.Exception -> L29
            r0.label = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r7.put(r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L57
            return r1
        L52:
            java.lang.String r7 = "operation was not completed for DB: put"
            com.dynatrace.android.agent.util.Utility.devLog(r3, r7, r6)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl.put(com.dynatrace.agent.storage.db.EventRecord, gj.a):java.lang.Object");
    }
}

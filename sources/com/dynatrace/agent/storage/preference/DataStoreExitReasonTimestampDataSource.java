package com.dynatrace.agent.storage.preference;

import Ej.C0241t;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import bj.AbstractC1039j;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import qj.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DataStoreExitReasonTimestampDataSource {
    private final DataStore<Preferences> dataStore;

    public static final class Keys {
        public static final long DEFAULT_TIMESTAMP = -1;
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Long> LATEST_CRASH_TIMESTAMP_KEY = PreferencesKeys.longKey("reason_crash");

        private Keys() {
        }

        public final Preferences.Key<Long> getLATEST_CRASH_TIMESTAMP_KEY() {
            return LATEST_CRASH_TIMESTAMP_KEY;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$clearPreferences$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$clearPreferences$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            ((MutablePreferences) this.L$0).remove(Keys.INSTANCE.getLATEST_CRASH_TIMESTAMP_KEY());
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {36}, m = "invokeSuspend")
    public static final class C11522 extends AbstractC1616j implements n {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C11522(InterfaceC1526a<? super C11522> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            C11522 c11522 = new C11522(interfaceC1526a);
            c11522.L$0 = interfaceC0231i;
            c11522.L$1 = th2;
            return c11522.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: anr timestamp could not be retrieved", (Throwable) this.L$1);
                Preferences preferencesCreateEmpty = PreferencesFactory.createEmpty();
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0231i.emit(preferencesCreateEmpty, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$4, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$4", f = "DataStoreExitReasonTimestampDataSource.kt", l = {43}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends AbstractC1616j implements n {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass4(InterfaceC1526a<? super AnonymousClass4> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(interfaceC1526a);
            anonymousClass4.L$0 = interfaceC0231i;
            anonymousClass4.L$1 = th2;
            return anonymousClass4.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: anr timestamp could not be retrieved", (Throwable) this.L$1);
                Long l6 = new Long(-1L);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0231i.emit(l6, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$saveCrashTimestamp$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$saveCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C11532 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ long $timestamp;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11532(long j, InterfaceC1526a<? super C11532> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$timestamp = j;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11532 c11532 = new C11532(this.$timestamp, interfaceC1526a);
            c11532.L$0 = obj;
            return c11532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11532) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            ((MutablePreferences) this.L$0).set(Keys.INSTANCE.getLATEST_CRASH_TIMESTAMP_KEY(), new Long(this.$timestamp));
            return Unit.f18162a;
        }
    }

    public DataStoreExitReasonTimestampDataSource(DataStore<Preferences> dataStore) {
        j.g(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final Object clearPreferences(InterfaceC1526a<? super Unit> interfaceC1526a) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "exit reason preferences are cleared");
        Object objEdit = PreferencesKt.edit(this.dataStore, new AnonymousClass2(null), interfaceC1526a);
        return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
    }

    public final Object getCrashTimestamp(InterfaceC1526a<? super Long> interfaceC1526a) {
        final C0241t c0241t = new C0241t(this.dataStore.getData(), new C11522(null));
        return W.j(new C0241t(new InterfaceC0230h() { // from class: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1

            /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0231i {
                final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC1609c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                        super(interfaceC1526a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0231i interfaceC0231i) {
                    this.$this_unsafeFlow = interfaceC0231i;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Ej.InterfaceC0231i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, gj.InterfaceC1526a r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1 r0 = (com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1 r0 = new com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        hj.a r1 = hj.EnumC1578a.f17050a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        bj.AbstractC1039j.b(r8)
                        goto L59
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        bj.AbstractC1039j.b(r8)
                        Ej.i r8 = r6.$this_unsafeFlow
                        androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
                        com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$Keys r2 = com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource.Keys.INSTANCE
                        androidx.datastore.preferences.core.Preferences$Key r2 = r2.getLATEST_CRASH_TIMESTAMP_KEY()
                        java.lang.Object r7 = r7.get(r2)
                        java.lang.Long r7 = (java.lang.Long) r7
                        if (r7 == 0) goto L49
                        long r4 = r7.longValue()
                        goto L4b
                    L49:
                        r4 = -1
                    L4b:
                        java.lang.Long r7 = new java.lang.Long
                        r7.<init>(r4)
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L59
                        return r1
                    L59:
                        kotlin.Unit r7 = kotlin.Unit.f18162a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                }
            }

            @Override // Ej.InterfaceC0230h
            public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a2) {
                Object objCollect = c0241t.collect(new AnonymousClass2(interfaceC0231i), interfaceC1526a2);
                return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
            }
        }, new AnonymousClass4(null)), interfaceC1526a);
    }

    public final Object saveCrashTimestamp(long j, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "anr timestamp is updated: " + j);
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11532(j, null), interfaceC1526a);
        return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
    }
}

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
import com.dynatrace.agent.storage.db.EndPointInfo;
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
public final class EndPointInfoDataSourceImpl implements EndPointInfoDataSource {
    private final DataStore<Preferences> dataStore;

    public static final class Keys {
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<String> APP_ID = PreferencesKeys.stringKey("ep_app_id");
        private static final Preferences.Key<String> BEACON_URL = PreferencesKeys.stringKey("ep_beacon_url");

        private Keys() {
        }

        public final Preferences.Key<String> getAPP_ID() {
            return APP_ID;
        }

        public final Preferences.Key<String> getBEACON_URL() {
            return BEACON_URL;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$clearPreferences$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$clearPreferences$2", f = "EndPointInfoDataSourceImpl.kt", l = {}, m = "invokeSuspend")
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
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            Keys keys = Keys.INSTANCE;
            mutablePreferences.remove(keys.getAPP_ID());
            mutablePreferences.remove(keys.getBEACON_URL());
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {32}, m = "invokeSuspend")
    public static final class C11542 extends AbstractC1616j implements n {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C11542(InterfaceC1526a<? super C11542> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            C11542 c11542 = new C11542(interfaceC1526a);
            c11542.L$0 = interfaceC0231i;
            c11542.L$1 = th2;
            return c11542.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: endpoint info could not be retrieved", (Throwable) this.L$1);
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$4, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$4", f = "EndPointInfoDataSourceImpl.kt", l = {42}, m = "invokeSuspend")
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
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: endpoint info could not be retrieved", (Throwable) this.L$1);
                EndPointInfo endPointInfo = new EndPointInfo("", "");
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0231i.emit(endPointInfo, this) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$setEndPointInfo$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$setEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    public static final class C11552 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ EndPointInfo $endPointInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11552(EndPointInfo endPointInfo, InterfaceC1526a<? super C11552> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$endPointInfo = endPointInfo;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11552 c11552 = new C11552(this.$endPointInfo, interfaceC1526a);
            c11552.L$0 = obj;
            return c11552;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11552) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            Keys keys = Keys.INSTANCE;
            mutablePreferences.set(keys.getAPP_ID(), this.$endPointInfo.getApplicationId());
            mutablePreferences.set(keys.getBEACON_URL(), this.$endPointInfo.getUrl());
            return Unit.f18162a;
        }
    }

    public EndPointInfoDataSourceImpl(DataStore<Preferences> dataStore) {
        j.g(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object clearPreferences(InterfaceC1526a<? super Unit> interfaceC1526a) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "endpoint preferences are cleared");
        Object objEdit = PreferencesKt.edit(this.dataStore, new AnonymousClass2(null), interfaceC1526a);
        return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object getEndPointInfo(InterfaceC1526a<? super EndPointInfo> interfaceC1526a) {
        final C0241t c0241t = new C0241t(this.dataStore.getData(), new C11542(null));
        return W.j(new C0241t(new InterfaceC0230h() { // from class: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0231i {
                final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2", f = "EndPointInfoDataSourceImpl.kt", l = {50}, m = "emit")
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
                        boolean r0 = r8 instanceof com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1 r0 = (com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1 r0 = new com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        hj.a r1 = hj.EnumC1578a.f17050a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        bj.AbstractC1039j.b(r8)
                        goto L63
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        bj.AbstractC1039j.b(r8)
                        Ej.i r8 = r6.$this_unsafeFlow
                        androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
                        com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$Keys r2 = com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl.Keys.INSTANCE
                        androidx.datastore.preferences.core.Preferences$Key r4 = r2.getAPP_ID()
                        java.lang.Object r4 = r7.get(r4)
                        java.lang.String r4 = (java.lang.String) r4
                        java.lang.String r5 = ""
                        if (r4 != 0) goto L47
                        r4 = r5
                    L47:
                        androidx.datastore.preferences.core.Preferences$Key r2 = r2.getBEACON_URL()
                        java.lang.Object r7 = r7.get(r2)
                        java.lang.String r7 = (java.lang.String) r7
                        if (r7 != 0) goto L54
                        goto L55
                    L54:
                        r5 = r7
                    L55:
                        com.dynatrace.agent.storage.db.EndPointInfo r7 = new com.dynatrace.agent.storage.db.EndPointInfo
                        r7.<init>(r4, r5)
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L63
                        return r1
                    L63:
                        kotlin.Unit r7 = kotlin.Unit.f18162a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                }
            }

            @Override // Ej.InterfaceC0230h
            public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a2) {
                Object objCollect = c0241t.collect(new AnonymousClass2(interfaceC0231i), interfaceC1526a2);
                return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
            }
        }, new AnonymousClass4(null)), interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.preference.EndPointInfoDataSource
    public Object setEndPointInfo(EndPointInfo endPointInfo, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "endpoint info is updated: " + endPointInfo);
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11552(endPointInfo, null), interfaceC1526a);
        return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
    }
}

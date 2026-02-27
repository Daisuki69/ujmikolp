package com.dynatrace.agent.storage.preference;

import Ej.InterfaceC0231i;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import bj.AbstractC1039j;
import cj.C1110A;
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
public final class ServerConfigurationDataSourceImpl implements ServerConfigurationDataSource {
    private final DataStore<Preferences> dataStore;
    private volatile ServerConfigurationV4 serverConfiguration;

    public static final class Keys {
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Long> REVISION = PreferencesKeys.longKey("sc_revision");
        private static final Preferences.Key<Integer> MAX_BEACON_SIZE_KIB = PreferencesKeys.intKey("sc_max_beacon_size_kib");
        private static final Preferences.Key<Integer> MAX_EVENT_SIZE_KIB = PreferencesKeys.intKey("sc_max_event_size_kib");
        private static final Preferences.Key<Boolean> CAPTURE = PreferencesKeys.booleanKey("sc_capture");
        private static final Preferences.Key<String> USER_INTERACTION_CAPTURE = PreferencesKeys.stringKey("sc_user_interaction_capture");

        private Keys() {
        }

        public final Preferences.Key<Boolean> getCAPTURE() {
            return CAPTURE;
        }

        public final Preferences.Key<Integer> getMAX_BEACON_SIZE_KIB() {
            return MAX_BEACON_SIZE_KIB;
        }

        public final Preferences.Key<Integer> getMAX_EVENT_SIZE_KIB() {
            return MAX_EVENT_SIZE_KIB;
        }

        public final Preferences.Key<Long> getREVISION() {
            return REVISION;
        }

        public final Preferences.Key<String> getUSER_INTERACTION_CAPTURE() {
            return USER_INTERACTION_CAPTURE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl", f = "ServerConfigurationDataSourceImpl.kt", l = {75}, m = "preloadServerConfiguration")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerConfigurationDataSourceImpl.this.preloadServerConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements n {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = interfaceC0231i;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: Configuration could not be retrieved", (Throwable) this.L$1);
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4", f = "ServerConfigurationDataSourceImpl.kt", l = {71}, m = "invokeSuspend")
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
                Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: Configuration could not be retrieved", (Throwable) this.L$1);
                ServerConfigurationV4 default_config = ServerConfigurationV4.Companion.getDEFAULT_CONFIG();
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0231i.emit(default_config, this) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl", f = "ServerConfigurationDataSourceImpl.kt", l = {100}, m = "resetServerConfiguration")
    public static final class C11601 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11601(InterfaceC1526a<? super C11601> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerConfigurationDataSourceImpl.this.resetServerConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    public static final class C11612 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C11612(InterfaceC1526a<? super C11612> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11612 c11612 = new C11612(interfaceC1526a);
            c11612.L$0 = obj;
            return c11612;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11612) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
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
            mutablePreferences.remove(keys.getREVISION());
            mutablePreferences.remove(keys.getMAX_BEACON_SIZE_KIB());
            mutablePreferences.remove(keys.getMAX_EVENT_SIZE_KIB());
            mutablePreferences.remove(keys.getCAPTURE());
            mutablePreferences.remove(keys.getUSER_INTERACTION_CAPTURE());
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    public static final class C11622 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ ServerConfigurationV4 $configurationV4;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11622(ServerConfigurationV4 serverConfigurationV4, InterfaceC1526a<? super C11622> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$configurationV4 = serverConfigurationV4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(String str) {
            return str;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11622 c11622 = new C11622(this.$configurationV4, interfaceC1526a);
            c11622.L$0 = obj;
            return c11622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11622) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
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
            mutablePreferences.set(keys.getREVISION(), new Long(this.$configurationV4.getRevision()));
            mutablePreferences.set(keys.getMAX_BEACON_SIZE_KIB(), new Integer(this.$configurationV4.getMaxBeaconSizeKib()));
            mutablePreferences.set(keys.getMAX_EVENT_SIZE_KIB(), new Integer(this.$configurationV4.getMaxEventSizeKib()));
            mutablePreferences.set(keys.getCAPTURE(), Boolean.valueOf(this.$configurationV4.getCapture()));
            mutablePreferences.set(keys.getUSER_INTERACTION_CAPTURE(), C1110A.F(this.$configurationV4.getUserInteractionsCapture(), ",", null, null, new a(), 30));
            return Unit.f18162a;
        }
    }

    public ServerConfigurationDataSourceImpl(DataStore<Preferences> dataStore) {
        j.g(dataStore, "dataStore");
        this.dataStore = dataStore;
        this.serverConfiguration = ServerConfigurationV4.Companion.getDEFAULT_CONFIG();
    }

    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    public ServerConfigurationV4 getServerConfiguration() {
        return this.serverConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preloadServerConfiguration(gj.InterfaceC1526a<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1 r0 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1 r0 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r1 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r1
            java.lang.Object r0 = r0.L$0
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r0 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r0
            bj.AbstractC1039j.b(r7)
            goto L69
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            bj.AbstractC1039j.b(r7)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r7 = r6.dataStore
            Ej.h r7 = r7.getData()
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2 r2 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$2
            r4 = 0
            r2.<init>(r4)
            Ej.t r5 = new Ej.t
            r5.<init>(r7, r2)
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$$inlined$map$1 r7 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$$inlined$map$1
            r7.<init>()
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4 r2 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$preloadServerConfiguration$4
            r2.<init>(r4)
            Ej.t r4 = new Ej.t
            r4.<init>(r7, r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = Ej.W.j(r4, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            r0 = r6
            r1 = r0
        L69:
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r7 = (com.dynatrace.agent.storage.preference.ServerConfigurationV4) r7
            r1.serverConfiguration = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "preloading of ServerConfiguration complete: "
            r7.<init>(r1)
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r0 = r0.getServerConfiguration()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "dtxStorage"
            com.dynatrace.android.agent.util.Utility.devLog(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.preloadServerConfiguration(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resetServerConfiguration(gj.InterfaceC1526a<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.C11601
            if (r0 == 0) goto L13
            r0 = r6
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1 r0 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.C11601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1 r0 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl r0 = (com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl) r0
            bj.AbstractC1039j.b(r6)
            goto L51
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            bj.AbstractC1039j.b(r6)
            java.lang.String r6 = "dtxStorage"
            java.lang.String r2 = "configuration preferences are cleared"
            com.dynatrace.android.agent.util.Utility.devLog(r6, r2)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r6 = r5.dataStore
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2 r2 = new com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$resetServerConfiguration$2
            r4 = 0
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            com.dynatrace.agent.storage.preference.ServerConfigurationV4$Companion r6 = com.dynatrace.agent.storage.preference.ServerConfigurationV4.Companion
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r6 = r6.getDEFAULT_CONFIG()
            r0.serverConfiguration = r6
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl.resetServerConfiguration(gj.a):java.lang.Object");
    }

    @Override // com.dynatrace.agent.storage.preference.ServerConfigurationDataSource
    public Object setServerConfiguration(ServerConfigurationV4 serverConfigurationV4, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Utility.devLog(StorageModuleKt.TAG_STORAGE, "configuration is updated: " + serverConfigurationV4);
        this.serverConfiguration = serverConfigurationV4;
        Object objEdit = PreferencesKt.edit(this.dataStore, new C11622(serverConfigurationV4, null), interfaceC1526a);
        return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
    }
}

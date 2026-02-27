package com.dynatrace.android.agent.data;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.U;
import Ej.C0241t;
import Ej.W;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import bj.AbstractC1039j;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionParameterStore {
    public static final Companion Companion = new Companion(null);
    private static final Preferences.Key<Integer> KEY_SESSION_ID = PreferencesKeys.intKey("session_id");
    private static final Preferences.Key<Long> KEY_VISITOR_ID = PreferencesKeys.longKey("visitor_id");
    private final DataStore<Preferences> dataStore;
    private final AtomicBoolean preloadInProgress;
    private InterfaceC0156n0 preloadJob;
    private final E scope;
    private volatile Integer sessionId;
    private volatile Long visitorId;
    private InterfaceC0156n0 writeJob;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$ensurePreloadComplete$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$ensurePreloadComplete$1", f = "SessionParameterStore.kt", l = {103}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SessionParameterStore.this.new AnonymousClass1(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0156n0 interfaceC0156n0 = SessionParameterStore.this.preloadJob;
                if (interfaceC0156n0 == null) {
                    return null;
                }
                this.label = 1;
                if (interfaceC0156n0.z(this) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$preload$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$preload$1", f = "SessionParameterStore.kt", l = {86}, m = "invokeSuspend")
    public static final class C11651 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public C11651(InterfaceC1526a<? super C11651> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SessionParameterStore.this.new C11651(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11651) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                C0241t c0241t = new C0241t(SessionParameterStore.this.dataStore.getData(), new SessionParameterStore$preload$1$sessionParameters$1(null));
                this.label = 1;
                obj = W.j(c0241t, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            Preferences preferences = (Preferences) obj;
            SessionParameterStore sessionParameterStore = SessionParameterStore.this;
            Integer num = (Integer) preferences.get(SessionParameterStore.KEY_SESSION_ID);
            sessionParameterStore.sessionId = num != null ? new Integer(SessionParameterStore.this.sanitizeSessionId(num.intValue())) : new Integer(0);
            SessionParameterStore sessionParameterStore2 = SessionParameterStore.this;
            Long l6 = (Long) preferences.get(SessionParameterStore.KEY_VISITOR_ID);
            if (l6 == null) {
                l6 = new Long(0L);
            }
            sessionParameterStore2.visitorId = l6;
            Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "preloading completed: sessionId: " + SessionParameterStore.this.sessionId + ", visitorId: " + SessionParameterStore.this.visitorId);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$update$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$update$1", f = "SessionParameterStore.kt", l = {123}, m = "invokeSuspend")
    public static final class C11661 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ long $newVisitorId;
        final /* synthetic */ int $sanitizedSessionId;
        int label;

        /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$update$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$update$1$1", f = "SessionParameterStore.kt", l = {}, m = "invokeSuspend")
        public static final class C00251 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ long $newVisitorId;
            final /* synthetic */ int $sanitizedSessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(int i, long j, InterfaceC1526a<? super C00251> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$sanitizedSessionId = i;
                this.$newVisitorId = j;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                C00251 c00251 = new C00251(this.$sanitizedSessionId, this.$newVisitorId, interfaceC1526a);
                c00251.L$0 = obj;
                return c00251;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00251) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                mutablePreferences.set(SessionParameterStore.KEY_SESSION_ID, new Integer(this.$sanitizedSessionId));
                mutablePreferences.set(SessionParameterStore.KEY_VISITOR_ID, new Long(this.$newVisitorId));
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11661(int i, long j, InterfaceC1526a<? super C11661> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$sanitizedSessionId = i;
            this.$newVisitorId = j;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SessionParameterStore.this.new C11661(this.$sanitizedSessionId, this.$newVisitorId, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11661) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    DataStore dataStore = SessionParameterStore.this.dataStore;
                    C00251 c00251 = new C00251(this.$sanitizedSessionId, this.$newVisitorId, null);
                    this.label = 1;
                    if (PreferencesKt.edit(dataStore, c00251, this) == enumC1578a) {
                        return enumC1578a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
            } catch (IOException e) {
                Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "failed to write to data store", e);
            }
            return Unit.f18162a;
        }
    }

    public SessionParameterStore(DataStore<Preferences> dataStore, E scope) {
        j.g(dataStore, "dataStore");
        j.g(scope, "scope");
        this.dataStore = dataStore;
        this.scope = scope;
        this.preloadInProgress = new AtomicBoolean(false);
    }

    private final void ensurePreloadComplete() throws Throwable {
        preload();
        H.x(g.f18170a, new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sanitizeSessionId(int i) {
        if (i < Integer.MAX_VALUE && i >= 0) {
            return i;
        }
        Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "session id is out of range and will be reset to 0");
        return 0;
    }

    public final void flush() throws Throwable {
        InterfaceC0156n0 interfaceC0156n0 = this.writeJob;
        if (interfaceC0156n0 == null || !interfaceC0156n0.isActive()) {
            return;
        }
        Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "need to wait for updates to be written to data store");
        H.x(g.f18170a, new SessionParameterStore$flush$1$1(interfaceC0156n0, null));
    }

    public final int getSessionId() throws Throwable {
        Integer num = this.sessionId;
        if (num != null) {
            return num.intValue();
        }
        ensurePreloadComplete();
        Integer num2 = this.sessionId;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final long getVisitorId() throws Throwable {
        Long l6 = this.visitorId;
        if (l6 != null) {
            return l6.longValue();
        }
        ensurePreloadComplete();
        Long l8 = this.visitorId;
        if (l8 != null) {
            return l8.longValue();
        }
        return 0L;
    }

    public final void preload() {
        if (this.preloadInProgress.compareAndSet(false, true)) {
            this.preloadJob = H.w(this.scope, null, null, new C11651(null), 3);
        }
    }

    public final void reset$agent_core_release() throws Throwable {
        H.x(g.f18170a, new SessionParameterStore$reset$1(this, null));
    }

    public final synchronized void update(int i, long j) throws Throwable {
        Throwable th2;
        try {
            try {
                int iSanitizeSessionId = sanitizeSessionId(i);
                this.sessionId = Integer.valueOf(iSanitizeSessionId);
                this.visitorId = Long.valueOf(j);
                InterfaceC0156n0 interfaceC0156n0 = this.writeJob;
                if (interfaceC0156n0 != null) {
                    try {
                        interfaceC0156n0.b(null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.writeJob = H.w(this.scope, null, null, new C11661(iSanitizeSessionId, j, null), 3);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionParameterStore(Context context) {
        this(SessionParameterStoreKt.getDataStore(context), H.c(e.d(H.e(1), U.f603a)));
        j.g(context, "context");
    }
}

package com.dynatrace.agent;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import bj.AbstractC1039j;
import com.dynatrace.agent.common.InstrumentationFlavor;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentStartupEventDispatcher {
    private final long cacheTimeMillis;
    private SessionInformationMetrics cachedMetrics;
    private final RumEventDispatcher dispatcher;
    private boolean isFirstStartupEventDispatched;
    private JSONObject pendingEvent;
    private InterfaceC0156n0 pendingJob;
    private final boolean requiresMergedAppStart;
    private final E scope;
    private final SelfMonitoringComponent selfMonitoring;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentationFlavor.values().length];
            try {
                iArr[InstrumentationFlavor.REACT_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentationFlavor.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher", f = "OneAgentStartupEventDispatcher.kt", l = {207}, m = "shutdown")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OneAgentStartupEventDispatcher.this.shutdown(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupEventDispatcher$verifyDataPrivacyAndSendEvent$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher$verifyDataPrivacyAndSendEvent$1", f = "OneAgentStartupEventDispatcher.kt", l = {}, m = "invokeSuspend")
    public static final class C11381 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ JSONObject $jsonObject;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11381(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, InterfaceC1526a<? super C11381> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$jsonObject = jSONObject;
            this.$sessionInformationMetrics = sessionInformationMetrics;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentStartupEventDispatcher.this.new C11381(this.$jsonObject, this.$sessionInformationMetrics, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11381) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            OneAgentStartupEventDispatcher.this.dispatcher.dispatchEvent(this.$jsonObject, this.$sessionInformationMetrics, null);
            return Unit.f18162a;
        }
    }

    public OneAgentStartupEventDispatcher(long j, OneAgentConfiguration oneAgentConfiguration, E scope, RumEventDispatcher dispatcher, SelfMonitoringComponent selfMonitoring) {
        j.g(oneAgentConfiguration, "oneAgentConfiguration");
        j.g(scope, "scope");
        j.g(dispatcher, "dispatcher");
        j.g(selfMonitoring, "selfMonitoring");
        this.cacheTimeMillis = j;
        this.scope = scope;
        this.dispatcher = dispatcher;
        this.selfMonitoring = selfMonitoring;
        int i = WhenMappings.$EnumSwitchMapping$0[oneAgentConfiguration.getInstrumentationFlavor().ordinal()];
        boolean z4 = true;
        if (i != 1 && i != 2) {
            z4 = false;
        }
        this.requiresMergedAppStart = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPendingEvent() {
        this.pendingEvent = null;
        this.pendingJob = null;
        this.cachedMetrics = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyDataPrivacyAndSendEvent(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics) {
        if (sessionInformationMetrics.getEventReporting()) {
            H.w(this.scope, null, null, new C11381(jSONObject, sessionInformationMetrics, null), 3);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "startup shouldn't be collected, DataCollectionLevel is Off");
        }
    }

    public final void dispatchCrossPlatformEvent(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, List<String> cpKeys) {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        j.g(cpKeys, "cpKeys");
        Object objOpt = jsonObject.opt(EventKeys.START_TIME);
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Invalid start_time in JSON: " + jsonObject);
            return;
        }
        if (!(objOpt2 instanceof Long) && !(objOpt2 instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Invalid duration in JSON: " + jsonObject);
            return;
        }
        synchronized (this) {
            InterfaceC0156n0 interfaceC0156n0 = this.pendingJob;
            JSONObject mergedStartupEventOrNative = null;
            if (interfaceC0156n0 != null) {
                interfaceC0156n0.b(null);
            }
            JSONObject jSONObject = this.pendingEvent;
            if (jSONObject != null) {
                try {
                    mergedStartupEventOrNative = JsonObjectExtensionsKt.getMergedStartupEventOrNative(jSONObject, jsonObject, cpKeys, this.selfMonitoring);
                } catch (Exception e) {
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "CP event merge failed: " + e.getMessage());
                }
                if (mergedStartupEventOrNative != null) {
                    verifyDataPrivacyAndSendEvent(mergedStartupEventOrNative, sessionInformationMetrics);
                }
                resetPendingEvent();
                Unit unit = Unit.f18162a;
            } else {
                resetPendingEvent();
                Unit unit2 = Unit.f18162a;
            }
        }
    }

    public final void dispatchNativeEvent(JSONObject jsonObject, long j, long j6, SessionInformationMetrics sessionInformationMetrics) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        JSONObject jSONObjectDeepCopy = JsonObjectExtensionsKt.deepCopy(jsonObject);
        jSONObjectDeepCopy.put(EventKeys.START_TIME, j);
        jSONObjectDeepCopy.put("duration", j6);
        synchronized (this) {
            try {
                if (!this.requiresMergedAppStart || this.isFirstStartupEventDispatched) {
                    verifyDataPrivacyAndSendEvent(jSONObjectDeepCopy, sessionInformationMetrics);
                } else {
                    this.isFirstStartupEventDispatched = true;
                    this.cachedMetrics = sessionInformationMetrics;
                    this.pendingEvent = jSONObjectDeepCopy;
                    this.pendingJob = H.w(this.scope, null, null, new OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1(this, sessionInformationMetrics, null), 3);
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forceDispatchingEventIfExists() {
        SessionInformationMetrics sessionInformationMetrics;
        synchronized (this) {
            try {
                InterfaceC0156n0 interfaceC0156n0 = this.pendingJob;
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(null);
                }
                try {
                    JSONObject jSONObject = this.pendingEvent;
                    if (jSONObject == null || (sessionInformationMetrics = this.cachedMetrics) == null) {
                        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Event cannot be forced, pendingEvent: " + this.pendingEvent + " and cachedMetrics: " + this.cachedMetrics);
                    } else {
                        this.isFirstStartupEventDispatched = true;
                        verifyDataPrivacyAndSendEvent(jSONObject, sessionInformationMetrics);
                    }
                } catch (Exception unused) {
                    Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "Not possible to force native event to be send: " + this.pendingEvent + ", " + this.cachedMetrics);
                }
                resetPendingEvent();
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean getRequiresMergedAppStart() {
        return this.requiresMergedAppStart;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shutdown(gj.InterfaceC1526a<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.dynatrace.agent.OneAgentStartupEventDispatcher.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1 r0 = (com.dynatrace.agent.OneAgentStartupEventDispatcher.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1 r0 = new com.dynatrace.agent.OneAgentStartupEventDispatcher$shutdown$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.dynatrace.agent.OneAgentStartupEventDispatcher r0 = (com.dynatrace.agent.OneAgentStartupEventDispatcher) r0
            bj.AbstractC1039j.b(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            bj.AbstractC1039j.b(r5)
            Bj.n0 r5 = r4.pendingJob
            if (r5 == 0) goto L45
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = Bj.H.k(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.pendingEvent = r5
            r0.pendingJob = r5
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.OneAgentStartupEventDispatcher.shutdown(gj.a):java.lang.Object");
    }

    public /* synthetic */ OneAgentStartupEventDispatcher(long j, OneAgentConfiguration oneAgentConfiguration, E e, RumEventDispatcher rumEventDispatcher, SelfMonitoringComponent selfMonitoringComponent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 10000L : j, oneAgentConfiguration, e, rumEventDispatcher, selfMonitoringComponent);
    }
}

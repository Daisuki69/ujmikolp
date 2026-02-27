package com.dynatrace.agent;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.U;
import Ij.e;
import bj.AbstractC1039j;
import cj.C1112C;
import cj.C1132s;
import cj.r;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.agent.events.EventModifier;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.AttributeAggregator;
import com.dynatrace.agent.events.enrichment.AttributeSupplier;
import com.dynatrace.agent.events.enrichment.AttributeSupplierKt;
import com.dynatrace.agent.events.enrichment.EnrichmentPipelineKt;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.events.enrichment.ProtectedAttributesSupplier;
import com.dynatrace.agent.events.enrichment.SessionInformationSupplier;
import com.dynatrace.agent.events.enrichment.TimeMetrics;
import com.dynatrace.agent.events.enrichment.TimeMetricsSupplier;
import com.dynatrace.agent.events.enrichment.TimeMetricsSupplierKt;
import com.dynatrace.agent.events.enrichment.ViewContextSupplier;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationContext;
import com.dynatrace.agent.events.enrichment.sanitation.SanitationStrategiesKt;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.agent.view.ViewContext;
import com.dynatrace.agent.view.ViewSummarizer;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.paymaya.domain.model.MfaTencentErrorResult;
import dj.C1406d;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentEventDispatcher implements RumEventDispatcher {
    private final E coroutineScope;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final EventDatabaseDataSource eventDatabase;
    private final EventFlowGovernor eventFlowGovernor;
    private final EventThrottler eventThrottler;
    private final MetricsRepository metricsRepository;
    private final ConcurrentLinkedQueue<EventModifier> modifiers;
    private final OneAgentConfiguration oneAgentConfiguration;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private final ViewSummarizer viewSummarizer;

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$1", f = "OneAgentEventDispatcher.kt", l = {181}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ JSONObject $completedJsonObject;
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ long $startTimestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONObject jSONObject, long j, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$completedJsonObject = jSONObject;
            this.$startTimestamp = j;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentEventDispatcher.this.new AnonymousClass1(this.$completedJsonObject, this.$startTimestamp, this.$sessionInformationMetrics, this.$eventContext, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject jSONObject = this.$completedJsonObject;
                long j = this.$startTimestamp;
                C1112C c1112c = C1112C.f9377a;
                List listC = r.c(new SessionInformationSupplier(this.$sessionInformationMetrics));
                Object[] objArr = this.$eventContext;
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(oneAgentEventDispatcher, jSONObject, j, c1112c, listC, objArr, null, this, 32, null) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$2", f = "OneAgentEventDispatcher.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ JSONObject $jsonObject;
        final /* synthetic */ Object $recordTimestamp;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, Object obj, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$jsonObject = jSONObject;
            this.$recordTimestamp = obj;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentEventDispatcher.this.new AnonymousClass2(this.$jsonObject, this.$recordTimestamp, this.$sessionInformationMetrics, this.$eventContext, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject jSONObject = this.$jsonObject;
                Object obj2 = this.$recordTimestamp;
                j.e(obj2, "null cannot be cast to non-null type kotlin.Number");
                long jLongValue = ((Number) obj2).longValue();
                C1112C c1112c = C1112C.f9377a;
                List listC = r.c(new SessionInformationSupplier(this.$sessionInformationMetrics));
                Object[] objArr = this.$eventContext;
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(oneAgentEventDispatcher, jSONObject, jLongValue, c1112c, listC, objArr, null, this, 32, null) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3", f = "OneAgentEventDispatcher.kt", l = {243}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ JSONObject $completedJsonObject;
        final /* synthetic */ MetricsData $metricsData;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ long $startTimestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(JSONObject jSONObject, long j, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData, InterfaceC1526a<? super AnonymousClass3> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$completedJsonObject = jSONObject;
            this.$startTimestamp = j;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$metricsData = metricsData;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentEventDispatcher.this.new AnonymousClass3(this.$completedJsonObject, this.$startTimestamp, this.$sessionInformationMetrics, this.$metricsData, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass3) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject jSONObject = this.$completedJsonObject;
                long j = this.$startTimestamp;
                C1112C c1112c = C1112C.f9377a;
                List listC = r.c(new SessionInformationSupplier(this.$sessionInformationMetrics));
                c cVar = new c(this.$metricsData, 0);
                this.label = 1;
                if (oneAgentEventDispatcher.dispatchInternalEvent(jSONObject, j, c1112c, listC, null, cVar, this) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithRestrictions$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C11331 extends i implements Function1<JSONObject, SanitationContext> {
        public static final C11331 INSTANCE = new C11331();

        public C11331() {
            super(1, SanitationStrategiesKt.class, "sanitizeRumEvent", "sanitizeRumEvent(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            j.g(p02, "p0");
            return SanitationStrategiesKt.sanitizeRumEvent(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithRestrictions$3, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C11343 extends i implements Function1<JSONObject, SanitationContext> {
        public static final C11343 INSTANCE = new C11343();

        public C11343() {
            super(1, SanitationStrategiesKt.class, "sanitizeRumEvent", "sanitizeRumEvent(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            j.g(p02, "p0");
            return SanitationStrategiesKt.sanitizeRumEvent(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithStrategy$3, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEventWithStrategy$3", f = "OneAgentEventDispatcher.kt", l = {301}, m = "invokeSuspend")
    public static final class C11353 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Object[] $eventContext;
        final /* synthetic */ long $recordTimestamp;
        final /* synthetic */ SanitationContext $sanitationContext;
        final /* synthetic */ SessionInformationMetrics $sessionInformationMetrics;
        final /* synthetic */ TimeMetrics $timeMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11353(SanitationContext sanitationContext, long j, TimeMetrics timeMetrics, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, InterfaceC1526a<? super C11353> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$sanitationContext = sanitationContext;
            this.$recordTimestamp = j;
            this.$timeMetrics = timeMetrics;
            this.$sessionInformationMetrics = sessionInformationMetrics;
            this.$eventContext = objArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invokeSuspend$lambda$1() {
            C1406d c1406dB = r.b();
            AttributeSupplierKt.addAttribute(c1406dB, EventKeys.Characteristics.IS_API_REPORTED, Boolean.TRUE);
            return r.a(c1406dB);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentEventDispatcher.this.new C11353(this.$sanitationContext, this.$recordTimestamp, this.$timeMetrics, this.$sessionInformationMetrics, this.$eventContext, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11353) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                OneAgentEventDispatcher oneAgentEventDispatcher = OneAgentEventDispatcher.this;
                JSONObject sanitizedJson = this.$sanitationContext.getSanitizedJson();
                long j = this.$recordTimestamp;
                List listG = C1132s.g(new TimeMetricsSupplier(this.$timeMetrics), new d());
                List listC = r.c(new SessionInformationSupplier(this.$sessionInformationMetrics));
                Object[] objArr = this.$eventContext;
                this.label = 1;
                if (OneAgentEventDispatcher.dispatchInternalEvent$default(oneAgentEventDispatcher, sanitizedJson, j, listG, listC, objArr, null, this, 32, null) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$dispatchSessionPropertiesWithRestrictions$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C11361 extends i implements Function1<JSONObject, SanitationContext> {
        public static final C11361 INSTANCE = new C11361();

        public C11361() {
            super(1, SanitationStrategiesKt.class, "sanitizeSessionProperties", "sanitizeSessionProperties(Lorg/json/JSONObject;)Lcom/dynatrace/agent/events/enrichment/sanitation/SanitationContext;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SanitationContext invoke(JSONObject p02) {
            j.g(p02, "p0");
            return SanitationStrategiesKt.sanitizeSessionProperties(p02);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentEventDispatcher$storeEvent$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.OneAgentEventDispatcher$storeEvent$1", f = "OneAgentEventDispatcher.kt", l = {444}, m = "invokeSuspend")
    public static final class C11371 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ EventRecord $eventRecord;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11371(EventRecord eventRecord, InterfaceC1526a<? super C11371> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$eventRecord = eventRecord;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return OneAgentEventDispatcher.this.new C11371(this.$eventRecord, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11371) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                EventDatabaseDataSource eventDatabaseDataSource = OneAgentEventDispatcher.this.eventDatabase;
                EventRecord eventRecord = this.$eventRecord;
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "storing event: " + eventRecord);
                this.label = 1;
                if (eventDatabaseDataSource.put(eventRecord, this) == enumC1578a) {
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

    public OneAgentEventDispatcher(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, EventDatabaseDataSource eventDatabase, MetricsRepository metricsRepository, E coroutineScope, ViewSummarizer viewSummarizer, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, EventThrottler eventThrottler, EventFlowGovernor eventFlowGovernor, SessionInformationProvider sessionInformationProvider) {
        j.g(oneAgentConfiguration, "oneAgentConfiguration");
        j.g(timeProvider, "timeProvider");
        j.g(eventDatabase, "eventDatabase");
        j.g(metricsRepository, "metricsRepository");
        j.g(coroutineScope, "coroutineScope");
        j.g(viewSummarizer, "viewSummarizer");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        j.g(dynamicConfigDataSource, "dynamicConfigDataSource");
        j.g(eventThrottler, "eventThrottler");
        j.g(eventFlowGovernor, "eventFlowGovernor");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        this.oneAgentConfiguration = oneAgentConfiguration;
        this.timeProvider = timeProvider;
        this.eventDatabase = eventDatabase;
        this.metricsRepository = metricsRepository;
        this.coroutineScope = coroutineScope;
        this.viewSummarizer = viewSummarizer;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
        this.eventThrottler = eventThrottler;
        this.eventFlowGovernor = eventFlowGovernor;
        this.sessionInformationProvider = sessionInformationProvider;
        this.modifiers = new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchEventWithRestrictions$lambda$1(JSONObject sanitizedJson) throws JSONException {
        j.g(sanitizedJson, "sanitizedJson");
        if (JsonObjectExtensionsKt.hasKeyIn(sanitizedJson, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
            sanitizedJson.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        }
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchEventWithRestrictions$lambda$2(JSONObject jSONObject, JSONObject sanitizedJson) throws JSONException {
        j.g(sanitizedJson, "sanitizedJson");
        if (JsonObjectExtensionsKt.hasKeyIn(sanitizedJson, EventKeys.EVENT_PROPERTIES.NAMESPACE)) {
            sanitizedJson.put(EventKeys.Characteristics.HAS_EVENT_PROPERTIES, true);
        }
        JsonObjectExtensionsKt.putAllAttributesOf(sanitizedJson, jSONObject);
        return Unit.f18162a;
    }

    private final void dispatchEventWithStrategy(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Function1<? super JSONObject, SanitationContext> function1, Function1<? super JSONObject, Unit> function12) throws JSONException {
        long jMillisSinceEpoch = this.timeProvider.millisSinceEpoch();
        kotlin.time.a.f18208b.getClass();
        TimeMetrics timeMetrics = new TimeMetrics(jMillisSinceEpoch, 0L, null);
        SanitationContext sanitationContext = (SanitationContext) function1.invoke(jSONObject);
        function12.invoke(sanitationContext.getSanitizedJson());
        long startTime = timeMetrics.getStartTime();
        JSONObject sanitizedJson = sanitationContext.getSanitizedJson();
        if (sanitizedJson.has("duration")) {
            sanitizedJson.put(EventKeys.START_TIME, startTime - sanitizedJson.getLong("duration"));
        }
        if (TimeMetricsSupplierKt.hasInvalidTimeMetrics(sanitationContext.getSanitizedJson())) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped because either 'start_time' or 'duration' have invalid type or value");
        } else {
            this.eventFlowGovernor.enqueue(new C11353(sanitationContext, startTime, timeMetrics, sessionInformationMetrics, objArr, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dispatchEventWithStrategy$default(OneAgentEventDispatcher oneAgentEventDispatcher, JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Function1 function1, Function1 function12, int i, Object obj) throws JSONException {
        if ((i & 16) != 0) {
            function12 = new a(0);
        }
        oneAgentEventDispatcher.dispatchEventWithStrategy(jSONObject, sessionInformationMetrics, objArr, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchEventWithStrategy$lambda$5(JSONObject it) {
        j.g(it, "it");
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatchInternalEvent(JSONObject jSONObject, long j, List<? extends AttributeSupplier> list, List<? extends AttributeSupplier> list2, Object[] objArr, Function0<? extends List<? extends AttributeSupplier>> function0, InterfaceC1526a<? super Unit> interfaceC1526a) {
        ServerConfigurationV4 serverConfiguration = this.serverConfigurationDataSource.getServerConfiguration();
        AgentState agentState = this.dynamicConfigDataSource.getAgentState();
        if (serverConfiguration.getCapture() && (agentState instanceof AgentState.Enabled) && !((AgentState.Enabled) agentState).getOnlyHighPriorityEvents()) {
            C1406d c1406dB = r.b();
            c1406dB.addAll((Collection) function0.invoke());
            c1406dB.addAll(list);
            ViewContext viewContextObtainViewContext = this.viewSummarizer.obtainViewContext();
            if (viewContextObtainViewContext != null) {
                c1406dB.add(new ViewContextSupplier(viewContextObtainViewContext));
            }
            AttributeAggregator attributeAggregator = new AttributeAggregator(r.a(c1406dB));
            C1406d c1406dB2 = r.b();
            c1406dB2.add(new ProtectedAttributesSupplier(this.oneAgentConfiguration.getApplicationId(), this.oneAgentConfiguration.getVersion()));
            c1406dB2.addAll(list2);
            JSONObject jSONObjectEnrichRumEvent = EnrichmentPipelineKt.enrichRumEvent(jSONObject, attributeAggregator, new AttributeAggregator(r.a(c1406dB2)), this.modifiers, objArr);
            if (jSONObjectEnrichRumEvent == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event has been dropped during enrichment");
                return Unit.f18162a;
            }
            this.viewSummarizer.incorporateEvent(jSONObjectEnrichRumEvent);
            if (!this.eventThrottler.acceptEvent(jSONObjectEnrichRumEvent)) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped by throttling");
                return Unit.f18162a;
            }
            String string = jSONObjectEnrichRumEvent.toString();
            j.f(string, "toString(...)");
            byte[] bytes = string.getBytes(C2581c.f21468b);
            j.f(bytes, "getBytes(...)");
            int length = bytes.length;
            if (length <= serverConfiguration.getMaxEventSizeKib() * 1024) {
                storeEvent(new EventRecord(0L, string, j, false, length, 1, null));
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped because its too big: " + length + " bytes");
            }
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event not dispatched because capture is off: " + serverConfiguration);
        }
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object dispatchInternalEvent$default(OneAgentEventDispatcher oneAgentEventDispatcher, JSONObject jSONObject, long j, List list, List list2, Object[] objArr, Function0 function0, InterfaceC1526a interfaceC1526a, int i, Object obj) {
        return oneAgentEventDispatcher.dispatchInternalEvent(jSONObject, j, list, list2, objArr, (i & 32) != 0 ? new c(oneAgentEventDispatcher, 1) : function0, interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dispatchInternalEvent$lambda$7(OneAgentEventDispatcher oneAgentEventDispatcher) {
        return EnrichmentPipelineKt.collectCachedMetricsSuppliers(oneAgentEventDispatcher.metricsRepository.getCachedMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchSessionPropertiesWithRestrictions$lambda$0(JSONObject sanitizedJson) throws JSONException {
        j.g(sanitizedJson, "sanitizedJson");
        sanitizedJson.put(EventKeys.Characteristics.HAS_SESSION_PROPERTIES, true);
        return Unit.f18162a;
    }

    private final InterfaceC0156n0 storeEvent(EventRecord eventRecord) {
        return H.w(this.coroutineScope, null, null, new C11371(eventRecord, null), 3);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public boolean addEventModifier(EventModifier eventModifier) {
        j.g(eventModifier, "eventModifier");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "add event modifier: " + eventModifier);
        return this.modifiers.add(eventModifier);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, long j, long j6, SessionInformationMetrics sessionInformationMetrics, boolean z4, Object[] objArr) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        jsonObject.put(EventKeys.START_TIME, j);
        jsonObject.put("duration", j6);
        if (z4) {
            jsonObject.put(EventKeys.Characteristics.IS_API_REPORTED, true);
        } else {
            jsonObject.remove(EventKeys.Characteristics.IS_API_REPORTED);
        }
        this.eventFlowGovernor.enqueue(new AnonymousClass1(jsonObject, j, sessionInformationMetrics, objArr, null));
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEventWithRestrictions(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, objArr, C11331.INSTANCE, new a(1));
    }

    public final Object dispatchInternalEvent$com_dynatrace_agent_release(JSONObject jSONObject, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objDispatchInternalEvent$default = dispatchInternalEvent$default(this, jSONObject, jSONObject.getLong(EventKeys.START_TIME), C1112C.f9377a, r.c(new SessionInformationSupplier(this.sessionInformationProvider.collectSessionInfo())), null, null, interfaceC1526a, 32, null);
        return objDispatchInternalEvent$default == EnumC1578a.f17050a ? objDispatchInternalEvent$default : Unit.f18162a;
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchSessionPropertiesWithRestrictions(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, null, C11361.INSTANCE, new a(2));
    }

    public final ConcurrentLinkedQueue<EventModifier> getModifiers$com_dynatrace_agent_release() {
        return this.modifiers;
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public boolean removeEventModifier(EventModifier eventModifier) {
        j.g(eventModifier, "eventModifier");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "remove event modifier: " + eventModifier);
        return this.modifiers.remove(eventModifier);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEventWithRestrictions(JSONObject jsonObject, final JSONObject agentJson, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(agentJson, "agentJson");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        dispatchEventWithStrategy(jsonObject, sessionInformationMetrics, objArr, C11343.INSTANCE, new Function1() { // from class: com.dynatrace.agent.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneAgentEventDispatcher.dispatchEventWithRestrictions$lambda$2(agentJson, (JSONObject) obj);
            }
        });
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] objArr) {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        Object objOpt = jsonObject.opt(EventKeys.START_TIME);
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "The given JSON event must have a valid start_time! json: " + jsonObject);
        } else {
            if (!(objOpt2 instanceof Long) && !(objOpt2 instanceof Integer)) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "The given JSON event must have a valid duration! json: " + jsonObject);
                return;
            }
            this.eventFlowGovernor.enqueue(new AnonymousClass2(jsonObject, objOpt, sessionInformationMetrics, objArr, null));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OneAgentEventDispatcher(OneAgentConfiguration oneAgentConfiguration, TimeProvider timeProvider, EventDatabaseDataSource eventDatabaseDataSource, MetricsRepository metricsRepository, E e, ViewSummarizer viewSummarizer, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, EventThrottler eventThrottler, EventFlowGovernor eventFlowGovernor, SessionInformationProvider sessionInformationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        E eC;
        if ((i & 16) != 0) {
            e eVar = U.f603a;
            eC = H.c(Ij.d.f2362a);
        } else {
            eC = e;
        }
        this(oneAgentConfiguration, timeProvider, eventDatabaseDataSource, metricsRepository, eC, viewSummarizer, serverConfigurationDataSource, dynamicConfigDataSource, eventThrottler, eventFlowGovernor, sessionInformationProvider);
    }

    @Override // com.dynatrace.agent.RumEventDispatcher
    public void dispatchEvent(JSONObject jsonObject, long j, SessionInformationMetrics sessionInformationMetrics, MetricsData metricsData) throws JSONException {
        j.g(jsonObject, "jsonObject");
        j.g(sessionInformationMetrics, "sessionInformationMetrics");
        j.g(metricsData, "metricsData");
        jsonObject.put(EventKeys.START_TIME, j);
        jsonObject.put("duration", 0);
        jsonObject.remove(EventKeys.Characteristics.IS_API_REPORTED);
        this.eventFlowGovernor.enqueue(new AnonymousClass3(jsonObject, j, sessionInformationMetrics, metricsData, null));
    }
}

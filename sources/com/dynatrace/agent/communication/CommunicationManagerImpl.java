package com.dynatrace.agent.communication;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Ej.InterfaceC0231i;
import Ej.S;
import androidx.media3.extractor.ts.PsExtractor;
import bj.AbstractC1039j;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.connectivity.NetworkState;
import com.dynatrace.agent.communication.CommunicationState;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapperImpl;
import com.dynatrace.agent.communication.network.datasource.NetworkDataSource;
import com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider;
import com.dynatrace.agent.communication.preprocessing.ToDataRequestMapper;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.paymaya.domain.model.MfaTencentErrorResult;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CommunicationManagerImpl implements CommunicationManager {
    private InterfaceC0156n0 connectionStateJob;
    private final NetworkConnectivityChecker connectivityChecker;
    private final E coroutineScope;
    private CommunicationState currentCommunicationState;
    private final RequestScheduler dispatchScheduler;
    private final DispatchableDataProvider dispatchableDataProvider;
    private final NetworkDataSource networkDataSource;
    private final CommunicationContextTaskScheduler repetitiveTaskScheduler;
    private final DbRecordsToRequestBodyMapperImpl requestBodyMapper;
    private final ResponseProcessor responseProcessor;
    private final RetryManager retryManager;
    private final ServerDataListener serverDataListener;
    private ServerDataMaintainer serverDataMaintainer;
    private volatile Integer serverId;
    private final ToDataRequestMapper toDataRequestMapper;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$dispatchData$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 246, 248}, m = "dispatchData")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return CommunicationManagerImpl.this.dispatchData(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {224, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "obtainConfiguration")
    public static final class C11401 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11401(InterfaceC1526a<? super C11401> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunicationManagerImpl.this.obtainConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$start$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$start$2", f = "CommunicationManagerImpl.kt", l = {92}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return CommunicationManagerImpl.this.new AnonymousClass2(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                S networkState = CommunicationManagerImpl.this.connectivityChecker.getNetworkState();
                final CommunicationManagerImpl communicationManagerImpl = CommunicationManagerImpl.this;
                InterfaceC0231i interfaceC0231i = new InterfaceC0231i() { // from class: com.dynatrace.agent.communication.CommunicationManagerImpl.start.2.1
                    @Override // Ej.InterfaceC0231i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC1526a interfaceC1526a) {
                        return emit((NetworkState) obj2, (InterfaceC1526a<? super Unit>) interfaceC1526a);
                    }

                    public final Object emit(NetworkState networkState2, InterfaceC1526a<? super Unit> interfaceC1526a) {
                        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "communication woken up by network state change to " + networkState2 + " while in communication state " + communicationManagerImpl.currentCommunicationState);
                        if (j.b(communicationManagerImpl.currentCommunicationState, CommunicationState.Offline.INSTANCE) && networkState2.isConnected()) {
                            CommunicationManagerImpl communicationManagerImpl2 = communicationManagerImpl;
                            a.f18208b.getClass();
                            communicationManagerImpl2.scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(0L, new CommunicationState.ConfigAwaiting(null, 1, null), null, null));
                        }
                        return Unit.f18162a;
                    }
                };
                this.label = 1;
                if (networkState.collect(interfaceC0231i, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$stopCommunication$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$stopCommunication$1", f = "CommunicationManagerImpl.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH}, m = "invokeSuspend")
    public static final class C11411 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public C11411(InterfaceC1526a<? super C11411> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return CommunicationManagerImpl.this.new C11411(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11411) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0156n0 interfaceC0156n0 = CommunicationManagerImpl.this.connectionStateJob;
                if (interfaceC0156n0 != null) {
                    interfaceC0156n0.b(null);
                }
                RequestScheduler requestScheduler = CommunicationManagerImpl.this.dispatchScheduler;
                this.label = 1;
                if (requestScheduler.stopExecution(this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            CommunicationManagerImpl.this.repetitiveTaskScheduler.stopExecution$com_dynatrace_agent_release();
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$updateV3Config$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$updateV3Config$1", f = "CommunicationManagerImpl.kt", l = {115}, m = "invokeSuspend")
    public static final class C11421 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ ServerConfiguration $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11421(ServerConfiguration serverConfiguration, InterfaceC1526a<? super C11421> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$config = serverConfiguration;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return CommunicationManagerImpl.this.new C11421(this.$config, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11421) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                ServerDataMaintainer serverDataMaintainer = CommunicationManagerImpl.this.serverDataMaintainer;
                if (serverDataMaintainer == null) {
                    j.n("serverDataMaintainer");
                    throw null;
                }
                ServerConfiguration serverConfiguration = this.$config;
                this.label = 1;
                if (serverDataMaintainer.updateV3Config$com_dynatrace_agent_release(serverConfiguration, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "received external config v3 update: " + this.$config);
            return Unit.f18162a;
        }
    }

    public CommunicationManagerImpl(NetworkDataSource networkDataSource, DispatchableDataProvider dispatchableDataProvider, ResponseProcessor responseProcessor, ServerDataListener serverDataListener, E coroutineScope, NetworkConnectivityChecker connectivityChecker) {
        j.g(networkDataSource, "networkDataSource");
        j.g(dispatchableDataProvider, "dispatchableDataProvider");
        j.g(responseProcessor, "responseProcessor");
        j.g(serverDataListener, "serverDataListener");
        j.g(coroutineScope, "coroutineScope");
        j.g(connectivityChecker, "connectivityChecker");
        this.networkDataSource = networkDataSource;
        this.dispatchableDataProvider = dispatchableDataProvider;
        this.responseProcessor = responseProcessor;
        this.serverDataListener = serverDataListener;
        this.coroutineScope = coroutineScope;
        this.connectivityChecker = connectivityChecker;
        this.dispatchScheduler = new RequestScheduler(coroutineScope);
        this.repetitiveTaskScheduler = new CommunicationContextTaskScheduler(coroutineScope, 0L, 2, null);
        RetryManager retryManager = new RetryManager();
        this.retryManager = retryManager;
        DbRecordsToRequestBodyMapperImpl dbRecordsToRequestBodyMapperImpl = new DbRecordsToRequestBodyMapperImpl(1);
        this.requestBodyMapper = dbRecordsToRequestBodyMapperImpl;
        this.toDataRequestMapper = new ToDataRequestMapper(dbRecordsToRequestBodyMapperImpl, retryManager);
        this.currentCommunicationState = CommunicationState.Off.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchData(gj.InterfaceC1526a<? super com.dynatrace.agent.communication.CommunicationContext> r14) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationManagerImpl.dispatchData(gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object obtainConfiguration(gj.InterfaceC1526a<? super com.dynatrace.agent.communication.CommunicationContext> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.dynatrace.agent.communication.CommunicationManagerImpl.C11401
            if (r0 == 0) goto L13
            r0 = r12
            com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1 r0 = (com.dynatrace.agent.communication.CommunicationManagerImpl.C11401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1 r0 = new com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            bj.AbstractC1039j.b(r12)
            return r12
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            java.lang.Object r2 = r0.L$2
            com.dynatrace.agent.communication.ResponseProcessor r2 = (com.dynatrace.agent.communication.ResponseProcessor) r2
            java.lang.Object r4 = r0.L$1
            com.dynatrace.agent.storage.db.EndPointInfo r4 = (com.dynatrace.agent.storage.db.EndPointInfo) r4
            java.lang.Object r6 = r0.L$0
            com.dynatrace.agent.communication.CommunicationManagerImpl r6 = (com.dynatrace.agent.communication.CommunicationManagerImpl) r6
            bj.AbstractC1039j.b(r12)
            goto L7a
        L43:
            bj.AbstractC1039j.b(r12)
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider r12 = r11.dispatchableDataProvider
            com.dynatrace.agent.storage.db.EndPointInfo r12 = r12.getActiveEndpoint()
            com.dynatrace.agent.communication.ResponseProcessor r2 = r11.responseProcessor
            com.dynatrace.agent.communication.network.datasource.NetworkDataSource r6 = r11.networkDataSource
            com.dynatrace.agent.communication.network.datasource.ConfigRequest r7 = new com.dynatrace.agent.communication.network.datasource.ConfigRequest
            com.dynatrace.agent.communication.ServerDataMaintainer r8 = r11.serverDataMaintainer
            if (r8 == 0) goto L8e
            com.dynatrace.agent.communication.LocalServerData r8 = r8.localServerData$com_dynatrace_agent_release()
            com.dynatrace.agent.communication.RetryManager r9 = r11.retryManager
            com.dynatrace.agent.communication.network.model.RetryInfo r9 = r9.get(r12)
            java.lang.Integer r10 = r11.getServerId()
            r7.<init>(r12, r8, r9, r10)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r4 = r6.executeConfigRequest(r7, r0)
            if (r4 != r1) goto L76
            goto L8c
        L76:
            r6 = r4
            r4 = r12
            r12 = r6
            r6 = r11
        L7a:
            com.dynatrace.agent.communication.network.response.ResponseResult r12 = (com.dynatrace.agent.communication.network.response.ResponseResult) r12
            com.dynatrace.agent.communication.RetryManager r6 = r6.retryManager
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r12 = r2.handleConfigResponse(r12, r4, r6, r0)
            if (r12 != r1) goto L8d
        L8c:
            return r1
        L8d:
            return r12
        L8e:
            java.lang.String r12 = "serverDataMaintainer"
            kotlin.jvm.internal.j.n(r12)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationManagerImpl.obtainConfiguration(gj.a):java.lang.Object");
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void flush() {
        CommunicationState communicationState = this.currentCommunicationState;
        if (!(communicationState instanceof CommunicationState.Waiting) || ((CommunicationState.Waiting) communicationState).getConnectionStatus() == CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "flush rejected because of state: " + communicationState);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "flush invoked");
            a.f18208b.getClass();
            scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(0L, communicationState, null, null));
        }
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public Integer getServerId() {
        return this.serverId;
    }

    public final void scheduleNextCommunicationAttempt$com_dynatrace_agent_release(CommunicationContext communicationContext) {
        j.g(communicationContext, "communicationContext");
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "heartbeat: next communication attempt scheduled with " + communicationContext);
        this.currentCommunicationState = communicationContext.getCommState();
        this.repetitiveTaskScheduler.scheduleTask$com_dynatrace_agent_release(communicationContext.getCommState(), new CommunicationManagerImpl$scheduleNextCommunicationAttempt$1(this, null));
        if (communicationContext.getCommState() instanceof CommunicationState.Off) {
            return;
        }
        H.w(this.coroutineScope, null, null, new CommunicationManagerImpl$scheduleNextCommunicationAttempt$2(this, communicationContext, null), 3);
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void setServerId(Integer num) {
        this.serverId = num;
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public Object start(ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, InterfaceC1526a<? super Unit> interfaceC1526a) {
        LocalServerData localServerData = new LocalServerData(AgentState.Disabled.INSTANCE, serverConfigurationV4, serverConfiguration);
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "launching BPv4 communication with initial " + localServerData);
        this.serverDataMaintainer = new ServerDataMaintainer(localServerData, this.serverDataListener);
        this.connectionStateJob = H.w(this.coroutineScope, null, null, new AnonymousClass2(null), 3);
        a.f18208b.getClass();
        scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(0L, new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.READY), null, null));
        return Unit.f18162a;
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void stopCommunication() {
        H.w(this.coroutineScope, null, null, new C11411(null), 3);
        this.currentCommunicationState = CommunicationState.Off.INSTANCE;
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "terminated agent communication");
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void updateV3Config(ServerConfiguration config) {
        j.g(config, "config");
        if (this.serverDataMaintainer != null) {
            H.w(this.coroutineScope, null, null, new C11421(config, null), 3);
        }
    }
}

package com.dynatrace.agent.communication;

import Aj.b;
import androidx.media3.extractor.ts.TsExtractor;
import bj.AbstractC1039j;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationState;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.db.EventRecord;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ResponseProcessorImpl implements ResponseProcessor {
    private final EventDatabaseDataSource eventDatabase;
    private long lastConfigurationReceptionTimeMs;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.ResponseProcessorImpl", f = "ResponseProcessorImpl.kt", l = {186}, m = "contextForValidDataRequestResponse")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
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
            return ResponseProcessorImpl.this.contextForValidDataRequestResponse(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$handleConfigResponse$2, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleConfigResponse$2", f = "ResponseProcessorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<ServerDataUpdate, InterfaceC1526a<? super CommunicationContext>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = ResponseProcessorImpl.this.new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ServerDataUpdate serverDataUpdate, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
            return ((AnonymousClass2) create(serverDataUpdate, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return ResponseProcessorImpl.this.contextForValidConfigRequestResponse((ServerDataUpdate) this.L$0);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ResponseProcessorImpl$handleDataResponse$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleDataResponse$2", f = "ResponseProcessorImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
    public static final class C11432 extends AbstractC1616j implements Function2<ServerDataUpdate, InterfaceC1526a<? super CommunicationContext>, Object> {
        final /* synthetic */ boolean $moreDataPending;
        final /* synthetic */ List<EventRecord> $sentData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11432(List<EventRecord> list, boolean z4, InterfaceC1526a<? super C11432> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$sentData = list;
            this.$moreDataPending = z4;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11432 c11432 = ResponseProcessorImpl.this.new C11432(this.$sentData, this.$moreDataPending, interfaceC1526a);
            c11432.L$0 = obj;
            return c11432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ServerDataUpdate serverDataUpdate, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
            return ((C11432) create(serverDataUpdate, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            ServerDataUpdate serverDataUpdate = (ServerDataUpdate) this.L$0;
            ResponseProcessorImpl responseProcessorImpl = ResponseProcessorImpl.this;
            List<EventRecord> list = this.$sentData;
            boolean z4 = this.$moreDataPending;
            this.label = 1;
            Object objContextForValidDataRequestResponse = responseProcessorImpl.contextForValidDataRequestResponse(serverDataUpdate, list, z4, this);
            return objContextForValidDataRequestResponse == enumC1578a ? enumC1578a : objContextForValidDataRequestResponse;
        }
    }

    public ResponseProcessorImpl(EventDatabaseDataSource eventDatabase, TimeProvider timeProvider) {
        j.g(eventDatabase, "eventDatabase");
        j.g(timeProvider, "timeProvider");
        this.eventDatabase = eventDatabase;
        this.timeProvider = timeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommunicationContext contextForValidConfigRequestResponse(ServerDataUpdate serverDataUpdate) {
        if (j.b(serverDataUpdate.getState(), AgentState.Disabled.INSTANCE)) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to AgentState in config response");
            return new CommunicationContext(RetryManagerKt.getDISABLE_AGENT_TIME(), CommunicationState.Inactive.INSTANCE, serverDataUpdate, null);
        }
        a.f18208b.getClass();
        return new CommunicationContext(0L, new CommunicationState.Waiting(null, 1, null), serverDataUpdate, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object contextForValidDataRequestResponse(com.dynatrace.agent.communication.api.ServerDataUpdate r11, java.util.List<com.dynatrace.agent.storage.db.EventRecord> r12, boolean r13, gj.InterfaceC1526a<? super com.dynatrace.agent.communication.CommunicationContext> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.dynatrace.agent.communication.ResponseProcessorImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1 r0 = (com.dynatrace.agent.communication.ResponseProcessorImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1 r0 = new com.dynatrace.agent.communication.ResponseProcessorImpl$contextForValidDataRequestResponse$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r13 = r0.Z$0
            java.lang.Object r11 = r0.L$0
            com.dynatrace.agent.communication.api.ServerDataUpdate r11 = (com.dynatrace.agent.communication.api.ServerDataUpdate) r11
            bj.AbstractC1039j.b(r14)
        L2c:
            r8 = r11
            goto L48
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            bj.AbstractC1039j.b(r14)
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r14 = r10.eventDatabase
            r0.L$0 = r11
            r0.Z$0 = r13
            r0.label = r3
            java.lang.Object r12 = r14.delete(r12, r0)
            if (r12 != r1) goto L2c
            return r1
        L48:
            com.dynatrace.agent.communication.api.AgentState r11 = r8.getState()
            com.dynatrace.agent.communication.api.AgentState$Disabled r12 = com.dynatrace.agent.communication.api.AgentState.Disabled.INSTANCE
            boolean r11 = kotlin.jvm.internal.j.b(r11, r12)
            if (r11 == 0) goto L68
            java.lang.String r11 = "dtxCommunication"
            java.lang.String r12 = "response handling: disable agent due to AgentState in data response"
            com.dynatrace.android.agent.util.Utility.devLog(r11, r12)
            com.dynatrace.agent.communication.CommunicationContext r4 = new com.dynatrace.agent.communication.CommunicationContext
            long r5 = com.dynatrace.agent.communication.RetryManagerKt.getDISABLE_AGENT_TIME()
            com.dynatrace.agent.communication.CommunicationState$Inactive r7 = com.dynatrace.agent.communication.CommunicationState.Inactive.INSTANCE
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L68:
            if (r13 == 0) goto L7a
            com.dynatrace.agent.communication.CommunicationContext r4 = new com.dynatrace.agent.communication.CommunicationContext
            kotlin.time.a$a r11 = kotlin.time.a.f18208b
            r11.getClass()
            com.dynatrace.agent.communication.CommunicationState$PendingData r7 = com.dynatrace.agent.communication.CommunicationState.PendingData.INSTANCE
            r9 = 0
            r5 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L7a:
            com.dynatrace.agent.communication.CommunicationContext r4 = new com.dynatrace.agent.communication.CommunicationContext
            long r5 = com.dynatrace.agent.communication.CommunicationManagerImplKt.getDEFAULT_SCHEDULING_TIME()
            com.dynatrace.agent.communication.CommunicationState$Waiting r7 = new com.dynatrace.agent.communication.CommunicationState$Waiting
            r11 = 0
            r7.<init>(r11, r3, r11)
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ResponseProcessorImpl.contextForValidDataRequestResponse(com.dynatrace.agent.communication.api.ServerDataUpdate, java.util.List, boolean, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object obtainContextForError(ResponseResult.Retry retry, EndPointInfo endPointInfo, RetryManager retryManager, CommunicationState communicationState, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
        ServerDataUpdate serverDataUpdate = retry.getServerDataUpdate();
        AgentState state = serverDataUpdate != null ? serverDataUpdate.getState() : null;
        AgentState.Disabled disabled = AgentState.Disabled.INSTANCE;
        if (j.b(state, disabled)) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to AgentState in " + retry);
            return m159obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, retry.getServerDataUpdate(), interfaceC1526a, 3, null);
        }
        RetryInfo incrementedRetryInfo = retryManager.getIncrementedRetryInfo(endPointInfo, retry.getRetryReason());
        if (!RetryManagerKt.isMaxRetryAttempt(incrementedRetryInfo)) {
            return new CommunicationContext(RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo), communicationState, retry.getServerDataUpdate(), null);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: disable agent due to max retry attempts reached");
        return m159obtainDisabledContextbz6L7rs$default(this, RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo), null, endPointInfo, retryManager, retry.getServerDataUpdate() != null ? ServerDataUpdate.copy$default(retry.getServerDataUpdate(), disabled, null, null, 6, null) : null, interfaceC1526a, 2, null);
    }

    private final CommunicationContext obtainContextForNoConnectivity(RetryManager retryManager, EndPointInfo endPointInfo, ResponseResult.RetryNoConnectivity retryNoConnectivity, CommunicationState communicationState) {
        RetryInfo incrementedRetryInfo = retryManager.getIncrementedRetryInfo(endPointInfo, retryNoConnectivity.getRetryReason());
        long associatedRetryTime = RetryManagerKt.getAssociatedRetryTime(incrementedRetryInfo);
        if (!RetryManagerKt.isMaxRetryAttempt(incrementedRetryInfo)) {
            return new CommunicationContext(associatedRetryTime, communicationState, null, null);
        }
        retryManager.clearRetryState(endPointInfo);
        return new CommunicationContext(associatedRetryTime, CommunicationState.Offline.INSTANCE, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object obtainContextForSuccess(ResponseResult.Success success, EndPointInfo endPointInfo, RetryManager retryManager, Function2<? super ServerDataUpdate, ? super InterfaceC1526a<? super CommunicationContext>, ? extends Object> function2, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
        retryManager.clearRetryState(endPointInfo);
        this.lastConfigurationReceptionTimeMs = this.timeProvider.millisSinceEpoch();
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "response handling: updated last config reception time: " + this.lastConfigurationReceptionTimeMs);
        return function2.invoke(success.getServerDataUpdate(), interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: obtainDisabledContext-bz6L7rs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m158obtainDisabledContextbz6L7rs(long r6, com.dynatrace.agent.communication.CommunicationState r8, com.dynatrace.agent.storage.db.EndPointInfo r9, com.dynatrace.agent.communication.RetryManager r10, com.dynatrace.agent.communication.api.ServerDataUpdate r11, gj.InterfaceC1526a<? super com.dynatrace.agent.communication.CommunicationContext> r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1
            if (r0 == 0) goto L13
            r0 = r12
            com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1 r0 = (com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1 r0 = new com.dynatrace.agent.communication.ResponseProcessorImpl$obtainDisabledContext$1
            r0.<init>(r5, r12)
        L18:
            java.lang.Object r12 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$3
            r11 = r8
            com.dynatrace.agent.communication.api.ServerDataUpdate r11 = (com.dynatrace.agent.communication.api.ServerDataUpdate) r11
            java.lang.Object r8 = r0.L$2
            r10 = r8
            com.dynatrace.agent.communication.RetryManager r10 = (com.dynatrace.agent.communication.RetryManager) r10
            java.lang.Object r8 = r0.L$1
            r9 = r8
            com.dynatrace.agent.storage.db.EndPointInfo r9 = (com.dynatrace.agent.storage.db.EndPointInfo) r9
            java.lang.Object r8 = r0.L$0
            com.dynatrace.agent.communication.CommunicationState r8 = (com.dynatrace.agent.communication.CommunicationState) r8
            bj.AbstractC1039j.b(r12)
        L3b:
            r4 = r9
            r9 = r8
            r7 = r6
            r6 = r4
            goto L60
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L48:
            bj.AbstractC1039j.b(r12)
            com.dynatrace.agent.storage.db.EventDatabaseDataSource r12 = r5.eventDatabase
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r12 = r12.deleteAll(r0)
            if (r12 != r1) goto L3b
            return r1
        L60:
            r10.clearRetryState(r6)
            com.dynatrace.agent.communication.CommunicationContext r6 = new com.dynatrace.agent.communication.CommunicationContext
            r10 = r11
            r11 = 0
            r6.<init>(r7, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ResponseProcessorImpl.m158obtainDisabledContextbz6L7rs(long, com.dynatrace.agent.communication.CommunicationState, com.dynatrace.agent.storage.db.EndPointInfo, com.dynatrace.agent.communication.RetryManager, com.dynatrace.agent.communication.api.ServerDataUpdate, gj.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: obtainDisabledContext-bz6L7rs$default, reason: not valid java name */
    public static /* synthetic */ Object m159obtainDisabledContextbz6L7rs$default(ResponseProcessorImpl responseProcessorImpl, long j, CommunicationState communicationState, EndPointInfo endPointInfo, RetryManager retryManager, ServerDataUpdate serverDataUpdate, InterfaceC1526a interfaceC1526a, int i, Object obj) {
        if ((i & 1) != 0) {
            j = RetryManagerKt.getDISABLE_AGENT_TIME();
        }
        long j6 = j;
        if ((i & 2) != 0) {
            communicationState = CommunicationState.Inactive.INSTANCE;
        }
        return responseProcessorImpl.m158obtainDisabledContextbz6L7rs(j6, communicationState, endPointInfo, retryManager, (i & 16) != 0 ? new ServerDataUpdate(AgentState.Disabled.INSTANCE, null, null) : serverDataUpdate, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    /* JADX INFO: renamed from: ageOfLastConfig-UwyO8pc */
    public long mo156ageOfLastConfigUwyO8pc() {
        a.C0097a c0097a = a.f18208b;
        long jMillisSinceEpoch = this.timeProvider.millisSinceEpoch();
        b bVar = b.c;
        long jF = kotlin.time.b.f(jMillisSinceEpoch, bVar);
        long jF2 = kotlin.time.b.f(this.lastConfigurationReceptionTimeMs, bVar);
        long j = ((-(jF2 >> 1)) << 1) + ((long) (((int) jF2) & 1));
        int i = Aj.a.f329a;
        return a.f(jF, j);
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    public Object handleConfigResponse(ResponseResult responseResult, EndPointInfo endPointInfo, RetryManager retryManager, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
        if (responseResult instanceof ResponseResult.Retry) {
            return obtainContextForError((ResponseResult.Retry) responseResult, endPointInfo, retryManager, new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.RETRYING), interfaceC1526a);
        }
        if (responseResult instanceof ResponseResult.TooManyRequests) {
            return m159obtainDisabledContextbz6L7rs$default(this, ((ResponseResult.TooManyRequests) responseResult).m163getDelayUwyO8pc(), new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS), endPointInfo, retryManager, null, interfaceC1526a, 16, null);
        }
        if (responseResult instanceof ResponseResult.Success) {
            return obtainContextForSuccess((ResponseResult.Success) responseResult, endPointInfo, retryManager, new AnonymousClass2(null), interfaceC1526a);
        }
        if (responseResult instanceof ResponseResult.UnexpectedError) {
            return m159obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, null, interfaceC1526a, 19, null);
        }
        if (responseResult instanceof ResponseResult.RetryNoConnectivity) {
            return obtainContextForNoConnectivity(retryManager, endPointInfo, (ResponseResult.RetryNoConnectivity) responseResult, new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.RETRYING));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.dynatrace.agent.communication.ResponseProcessor
    public Object handleDataResponse(ResponseResult responseResult, EndPointInfo endPointInfo, List<EventRecord> list, RetryManager retryManager, boolean z4, InterfaceC1526a<? super CommunicationContext> interfaceC1526a) {
        if (responseResult instanceof ResponseResult.Retry) {
            return obtainContextForError((ResponseResult.Retry) responseResult, endPointInfo, retryManager, new CommunicationState.Waiting(CommunicationState.ConnectionStatus.RETRYING), interfaceC1526a);
        }
        if (responseResult instanceof ResponseResult.TooManyRequests) {
            return m159obtainDisabledContextbz6L7rs$default(this, ((ResponseResult.TooManyRequests) responseResult).m163getDelayUwyO8pc(), new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS), endPointInfo, retryManager, null, interfaceC1526a, 16, null);
        }
        if (responseResult instanceof ResponseResult.Success) {
            return obtainContextForSuccess((ResponseResult.Success) responseResult, endPointInfo, retryManager, new C11432(list, z4, null), interfaceC1526a);
        }
        if (responseResult instanceof ResponseResult.UnexpectedError) {
            return m159obtainDisabledContextbz6L7rs$default(this, 0L, null, endPointInfo, retryManager, null, interfaceC1526a, 19, null);
        }
        if (responseResult instanceof ResponseResult.RetryNoConnectivity) {
            return obtainContextForNoConnectivity(retryManager, endPointInfo, (ResponseResult.RetryNoConnectivity) responseResult, new CommunicationState.Waiting(CommunicationState.ConnectionStatus.RETRYING));
        }
        throw new NoWhenBranchMatchedException();
    }
}

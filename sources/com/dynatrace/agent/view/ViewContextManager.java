package com.dynatrace.agent.view;

import bj.AbstractC1039j;
import com.dynatrace.agent.OneAgentEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.events.EventFlowGovernor;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewContextManager {
    private final OneAgentEventDispatcher eventDispatcher;
    private final EventFlowGovernor flowGovernor;
    private final TimeProvider timeProvider;
    private final ViewSummarizer viewSummarizer;

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$clearContext$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.view.ViewContextManager$clearContext$1", f = "ViewContextManager.kt", l = {59}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(1, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return ViewContextManager.this.new AnonymousClass1(interfaceC1526a);
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
                ViewContextManager viewContextManager = ViewContextManager.this;
                this.label = 1;
                if (viewContextManager.summarizeAndResetViewContext(this) == enumC1578a) {
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

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$storeContext$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.view.ViewContextManager$storeContext$1", f = "ViewContextManager.kt", l = {44}, m = "invokeSuspend")
    public static final class C11631 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11631(String str, InterfaceC1526a<? super C11631> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$name = str;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return ViewContextManager.this.new C11631(this.$name, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11631) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                ViewContextManager viewContextManager = ViewContextManager.this;
                this.label = 1;
                if (viewContextManager.summarizeAndResetViewContext(this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            ViewContextManager.this.createViewContext(this.$name);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.view.ViewContextManager", f = "ViewContextManager.kt", l = {86}, m = "summarizeAndResetViewContext")
    public static final class C11641 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11641(InterfaceC1526a<? super C11641> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ViewContextManager.this.summarizeAndResetViewContext(this);
        }
    }

    public ViewContextManager(EventFlowGovernor flowGovernor, TimeProvider timeProvider, ViewSummarizer viewSummarizer, OneAgentEventDispatcher eventDispatcher) {
        j.g(flowGovernor, "flowGovernor");
        j.g(timeProvider, "timeProvider");
        j.g(viewSummarizer, "viewSummarizer");
        j.g(eventDispatcher, "eventDispatcher");
        this.flowGovernor = flowGovernor;
        this.timeProvider = timeProvider;
        this.viewSummarizer = viewSummarizer;
        this.eventDispatcher = eventDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createViewContext(String str) {
        this.viewSummarizer.openViewSummary(str, this.timeProvider.millisSinceEpoch());
        Utility.devLog(OneAgentLoggingKt.TAG_VIEW, "view context for view " + str + " is created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object summarizeAndResetViewContext(gj.InterfaceC1526a<? super kotlin.Unit> r7) throws org.json.JSONException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.view.ViewContextManager.C11641
            if (r0 == 0) goto L13
            r0 = r7
            com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1 r0 = (com.dynatrace.agent.view.ViewContextManager.C11641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1 r0 = new com.dynatrace.agent.view.ViewContextManager$summarizeAndResetViewContext$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.dynatrace.agent.view.ViewContextManager r0 = (com.dynatrace.agent.view.ViewContextManager) r0
            bj.AbstractC1039j.b(r7)
            goto L5c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            bj.AbstractC1039j.b(r7)
            com.dynatrace.agent.view.ViewSummarizer r7 = r6.viewSummarizer
            com.dynatrace.agent.view.ViewContext r7 = r7.obtainViewContext()
            if (r7 == 0) goto L68
            com.dynatrace.agent.view.ViewSummarizer r7 = r6.viewSummarizer
            com.dynatrace.agent.common.time.TimeProvider r2 = r6.timeProvider
            long r4 = r2.millisSinceEpoch()
            com.dynatrace.agent.view.ViewSummary r7 = r7.generateViewSummary(r4)
            com.dynatrace.agent.OneAgentEventDispatcher r2 = r6.eventDispatcher
            org.json.JSONObject r7 = r7.toJson()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.dispatchInternalEvent$com_dynatrace_agent_release(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r0 = r6
        L5c:
            com.dynatrace.agent.view.ViewSummarizer r7 = r0.viewSummarizer
            r7.resetViewSummary()
            java.lang.String r7 = "dtxViewContext"
            java.lang.String r0 = "created a view summary and closed the current view context"
            com.dynatrace.android.agent.util.Utility.devLog(r7, r0)
        L68:
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.view.ViewContextManager.summarizeAndResetViewContext(gj.a):java.lang.Object");
    }

    public final void clearContext() {
        this.flowGovernor.enqueue(new AnonymousClass1(null));
    }

    public final void storeContext(String name) {
        j.g(name, "name");
        this.flowGovernor.enqueue(new C11631(name, null));
    }
}

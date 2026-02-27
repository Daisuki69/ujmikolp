package androidx.work.impl.model;

import Bj.A;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import cj.r;
import com.paymaya.domain.model.MfaTencentErrorResult;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final InterfaceC0230h dedup(final InterfaceC0230h interfaceC0230h, A dispatcher) {
        j.g(interfaceC0230h, "<this>");
        j.g(dispatcher, "dispatcher");
        return W.n(W.h(new InterfaceC0230h() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0231i {
                final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC1611e(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
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
                public final java.lang.Object emit(java.lang.Object r6, gj.InterfaceC1526a r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        hj.a r1 = hj.EnumC1578a.f17050a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        bj.AbstractC1039j.b(r7)
                        goto L64
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        bj.AbstractC1039j.b(r7)
                        Ej.i r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = cj.t.l(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r4 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r4
                        androidx.work.WorkInfo r4 = r4.toWorkInfo()
                        r2.add(r4)
                        goto L47
                    L5b:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L64
                        return r1
                    L64:
                        kotlin.Unit r6 = kotlin.Unit.f18162a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                }
            }

            @Override // Ej.InterfaceC0230h
            public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                Object objCollect = interfaceC0230h.collect(new AnonymousClass2(interfaceC0231i), interfaceC1526a);
                return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
            }
        }), dispatcher);
    }

    public static final InterfaceC0230h getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID id) {
        j.g(workSpecDao, "<this>");
        j.g(id, "id");
        final InterfaceC0230h workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(r.c(String.valueOf(id)));
        return W.h(new InterfaceC0230h() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0231i {
                final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC1611e(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
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
                public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        hj.a r1 = hj.EnumC1578a.f17050a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        bj.AbstractC1039j.b(r6)
                        goto L4d
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        bj.AbstractC1039j.b(r6)
                        Ej.i r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = cj.C1110A.B(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L43
                        androidx.work.WorkInfo r5 = r5.toWorkInfo()
                        goto L44
                    L43:
                        r5 = 0
                    L44:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        kotlin.Unit r5 = kotlin.Unit.f18162a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                }
            }

            @Override // Ej.InterfaceC0230h
            public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new AnonymousClass2(interfaceC0231i), interfaceC1526a);
                return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
            }
        });
    }

    public static final InterfaceC0230h getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, A dispatcher, String name) {
        j.g(workSpecDao, "<this>");
        j.g(dispatcher, "dispatcher");
        j.g(name, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    public static final InterfaceC0230h getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, A dispatcher, String tag) {
        j.g(workSpecDao, "<this>");
        j.g(dispatcher, "dispatcher");
        j.g(tag, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}

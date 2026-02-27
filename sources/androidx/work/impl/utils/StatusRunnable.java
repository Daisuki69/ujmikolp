package androidx.work.impl.utils;

import S1.y;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class StatusRunnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forStringIds$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<WorkDatabase, List<? extends WorkInfo>> {
        final /* synthetic */ List<String> $ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list) {
            super(1);
            this.$ids = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<WorkInfo> invoke(WorkDatabase db2) {
            j.g(db2, "db");
            List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForIds(this.$ids));
            j.f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
            return listApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forTag$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08351 extends k implements Function1<WorkDatabase, List<? extends WorkInfo>> {
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08351(String str) {
            super(1);
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<WorkInfo> invoke(WorkDatabase db2) {
            j.g(db2, "db");
            List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForTag(this.$tag));
            j.f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
            return listApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forUUID$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08361 extends k implements Function1<WorkDatabase, WorkInfo> {
        final /* synthetic */ UUID $id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08361(UUID uuid) {
            super(1);
            this.$id = uuid;
        }

        @Override // kotlin.jvm.functions.Function1
        public final WorkInfo invoke(WorkDatabase db2) {
            j.g(db2, "db");
            WorkSpecDao workSpecDao = db2.workSpecDao();
            String string = this.$id.toString();
            j.f(string, "id.toString()");
            WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forUniqueWork$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08371 extends k implements Function1<WorkDatabase, List<? extends WorkInfo>> {
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08371(String str) {
            super(1);
            this.$name = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<WorkInfo> invoke(WorkDatabase db2) {
            j.g(db2, "db");
            List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForName(this.$name));
            j.f(listApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
            return listApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forWorkQuerySpec$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08381 extends k implements Function1<WorkDatabase, List<? extends WorkInfo>> {
        final /* synthetic */ WorkQuery $querySpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08381(WorkQuery workQuery) {
            super(1);
            this.$querySpec = workQuery;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<WorkInfo> invoke(WorkDatabase db2) {
            j.g(db2, "db");
            List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(this.$querySpec)));
            j.f(listApply, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
            return listApply;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$loadStatusFuture$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08391<T> extends k implements Function0<T> {
        final /* synthetic */ Function1<WorkDatabase, T> $block;
        final /* synthetic */ WorkDatabase $this_loadStatusFuture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08391(Function1<? super WorkDatabase, ? extends T> function1, WorkDatabase workDatabase) {
            super(0);
            this.$block = function1;
            this.$this_loadStatusFuture = workDatabase;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.$block.invoke(this.$this_loadStatusFuture);
        }
    }

    public static final y forStringIds(WorkDatabase workDatabase, TaskExecutor executor, List<String> ids) {
        j.g(workDatabase, "<this>");
        j.g(executor, "executor");
        j.g(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new AnonymousClass1(ids));
    }

    public static final y forTag(WorkDatabase workDatabase, TaskExecutor executor, String tag) {
        j.g(workDatabase, "<this>");
        j.g(executor, "executor");
        j.g(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new C08351(tag));
    }

    public static final y forUUID(WorkDatabase workDatabase, TaskExecutor executor, UUID id) {
        j.g(workDatabase, "<this>");
        j.g(executor, "executor");
        j.g(id, "id");
        return loadStatusFuture(workDatabase, executor, new C08361(id));
    }

    public static final y forUniqueWork(WorkDatabase workDatabase, TaskExecutor executor, String name) {
        j.g(workDatabase, "<this>");
        j.g(executor, "executor");
        j.g(name, "name");
        return loadStatusFuture(workDatabase, executor, new C08371(name));
    }

    public static final y forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor executor, WorkQuery querySpec) {
        j.g(workDatabase, "<this>");
        j.g(executor, "executor");
        j.g(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new C08381(querySpec));
    }

    private static final <T> y loadStatusFuture(WorkDatabase workDatabase, TaskExecutor taskExecutor, Function1<? super WorkDatabase, ? extends T> function1) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        j.f(serialTaskExecutor, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new C08391(function1, workDatabase));
    }
}

package androidx.room;

import Bj.AbstractC0129a;
import Bj.C0151l;
import Bj.E;
import Bj.H;
import Bj.InterfaceC0147j;
import Bj.InterfaceC0156n0;
import Dj.q;
import Dj.r;
import Ej.InterfaceC0230h;
import Ej.W;
import Gj.w;
import androidx.room.InvalidationTracker;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class RoomDatabaseKt {

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", l = {235}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ boolean $emitInitialState;
        final /* synthetic */ String[] $tables;
        final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00161 extends k implements Function0<Unit> {
            final /* synthetic */ InterfaceC0156n0 $job;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00161(InterfaceC0156n0 interfaceC0156n0) {
                super(0);
                this.$job = interfaceC0156n0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m130invoke();
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m130invoke() {
                this.$job.b(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z4, RoomDatabase roomDatabase, String[] strArr, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$emitInitialState = z4;
            this.$this_invalidationTrackerFlow = roomDatabase;
            this.$tables = strArr;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$emitInitialState, this.$this_invalidationTrackerFlow, this.$tables, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1] */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.d queryDispatcher;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final r rVar = (r) this.L$0;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(this.$emitInitialState);
                final String[] strArr = this.$tables;
                ?? r52 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        ((q) rVar).j(set);
                    }
                };
                TransactionElement transactionElement = (TransactionElement) ((AbstractC0129a) rVar).c.get(TransactionElement.Key);
                if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$this_invalidationTrackerFlow);
                }
                C00161 c00161 = new C00161(H.w(rVar, queryDispatcher, null, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, r52, this.$emitInitialState, rVar, this.$tables, atomicBoolean, null), 2));
                this.label = 1;
                if (x3.d.b(rVar, c00161, this) == enumC1578a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext createTransactionContext(RoomDatabase roomDatabase, kotlin.coroutines.d dVar) {
        TransactionElement transactionElement = new TransactionElement(dVar);
        return dVar.plus(transactionElement).plus(new w(Integer.valueOf(System.identityHashCode(transactionElement)), roomDatabase.getSuspendingTransactionId()));
    }

    public static final InterfaceC0230h invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z4) {
        return W.f(new AnonymousClass1(z4, roomDatabase, strArr, null));
    }

    public static /* synthetic */ InterfaceC0230h invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = true;
        }
        return invalidationTrackerFlow(roomDatabase, strArr, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final CoroutineContext coroutineContext, final Function2<? super E, ? super InterfaceC1526a<? super R>, ? extends Object> function2, InterfaceC1526a<? super R> interfaceC1526a) {
        final C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                @InterfaceC1611e(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
                    final /* synthetic */ InterfaceC0147j $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ Function2<E, InterfaceC1526a<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(RoomDatabase roomDatabase, InterfaceC0147j interfaceC0147j, Function2<? super E, ? super InterfaceC1526a<? super R>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                        super(2, interfaceC1526a);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = interfaceC0147j;
                        this.$transactionBlock = function2;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, interfaceC1526a);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                        return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        InterfaceC1526a interfaceC1526a;
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC1039j.b(obj);
                            CoroutineContext.Element element = ((E) this.L$0).getCoroutineContext().get(kotlin.coroutines.d.f18169N);
                            j.d(element);
                            CoroutineContext coroutineContextCreateTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (kotlin.coroutines.d) element);
                            InterfaceC0147j interfaceC0147j = this.$continuation;
                            C1037h.a aVar = C1037h.f9166b;
                            Function2<E, InterfaceC1526a<? super R>, Object> function2 = this.$transactionBlock;
                            this.L$0 = interfaceC0147j;
                            this.label = 1;
                            obj = H.C(function2, coroutineContextCreateTransactionContext, this);
                            if (obj == enumC1578a) {
                                return enumC1578a;
                            }
                            interfaceC1526a = interfaceC0147j;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1526a = (InterfaceC1526a) this.L$0;
                            AbstractC1039j.b(obj);
                        }
                        C1037h.a aVar2 = C1037h.f9166b;
                        interfaceC1526a.resumeWith(obj);
                        return Unit.f18162a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        H.x(coroutineContext.minusKey(kotlin.coroutines.d.f18169N), new AnonymousClass1(roomDatabase, c0151l, function2, null));
                    } catch (Throwable th2) {
                        c0151l.a(th2);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            c0151l.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, Function1<? super InterfaceC1526a<? super R>, ? extends Object> function1, InterfaceC1526a<? super R> interfaceC1526a) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, function1, null);
        TransactionElement transactionElement = (TransactionElement) interfaceC1526a.getContext().get(TransactionElement.Key);
        kotlin.coroutines.d transactionDispatcher$room_ktx_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_ktx_release() : null;
        return transactionDispatcher$room_ktx_release != null ? H.C(roomDatabaseKt$withTransaction$transactionBlock$1, transactionDispatcher$room_ktx_release, interfaceC1526a) : startTransactionCoroutine(roomDatabase, interfaceC1526a.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, interfaceC1526a);
    }
}

package androidx.room;

import Bj.E;
import Bj.H;
import Dj.i;
import Ej.InterfaceC0231i;
import Ej.W;
import androidx.room.InvalidationTracker;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import of.p;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
public final class CoroutinesRoom$Companion$createFlow$1 extends AbstractC1616j implements Function2<InterfaceC0231i, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ InterfaceC0231i $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
        public static final class C00151 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ i $observerChannel;
            final /* synthetic */ i $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, i iVar, Callable callable, i iVar2, InterfaceC1526a interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = iVar;
                this.$callable = callable;
                this.$resultChannel = iVar2;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new C00151(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00151) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
            
                if (r4.m(r6, r7) == r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0010, B:18:0x003b, B:22:0x0049, B:24:0x0051, B:14:0x0023, B:17:0x0035), top: B:31:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:8:0x0013). Please report as a decompilation issue!!! */
            @Override // ij.AbstractC1607a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    hj.a r0 = hj.EnumC1578a.f17050a
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r6.L$0
                    Dj.b r1 = (Dj.b) r1
                    bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L15
                L13:
                    r7 = r1
                    goto L3b
                L15:
                    r7 = move-exception
                    goto L75
                L17:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1f:
                    java.lang.Object r1 = r6.L$0
                    Dj.b r1 = (Dj.b) r1
                    bj.AbstractC1039j.b(r7)     // Catch: java.lang.Throwable -> L15
                    goto L49
                L27:
                    bj.AbstractC1039j.b(r7)
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r6.$observer
                    r7.addObserver(r1)
                    Dj.i r7 = r6.$observerChannel     // Catch: java.lang.Throwable -> L15
                    Dj.b r7 = r7.iterator()     // Catch: java.lang.Throwable -> L15
                L3b:
                    r6.L$0 = r7     // Catch: java.lang.Throwable -> L15
                    r6.label = r3     // Catch: java.lang.Throwable -> L15
                    java.lang.Object r1 = r7.a(r6)     // Catch: java.lang.Throwable -> L15
                    if (r1 != r0) goto L46
                    goto L66
                L46:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L49:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L15
                    boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L15
                    if (r7 == 0) goto L67
                    r1.c()     // Catch: java.lang.Throwable -> L15
                    java.util.concurrent.Callable<R> r7 = r6.$callable     // Catch: java.lang.Throwable -> L15
                    java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L15
                    Dj.i r4 = r6.$resultChannel     // Catch: java.lang.Throwable -> L15
                    r6.L$0 = r1     // Catch: java.lang.Throwable -> L15
                    r6.label = r2     // Catch: java.lang.Throwable -> L15
                    java.lang.Object r7 = r4.m(r6, r7)     // Catch: java.lang.Throwable -> L15
                    if (r7 != r0) goto L13
                L66:
                    return r0
                L67:
                    androidx.room.RoomDatabase r7 = r6.$db
                    androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r0 = r6.$observer
                    r7.removeObserver(r0)
                    kotlin.Unit r7 = kotlin.Unit.f18162a
                    return r7
                L75:
                    androidx.room.RoomDatabase r0 = r6.$db
                    androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r6.$observer
                    r0.removeObserver(r1)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z4, RoomDatabase roomDatabase, InterfaceC0231i interfaceC0231i, String[] strArr, Callable<R> callable, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$inTransaction = z4;
            this.$db = roomDatabase;
            this.$$this$flow = interfaceC0231i;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.coroutines.d transactionDispatcher;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                E e = (E) this.L$0;
                final Dj.e eVarA = p.a(-1, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r72 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(Set<String> set) {
                        eVarA.j(Unit.f18162a);
                    }
                };
                Object obj2 = Unit.f18162a;
                eVarA.j(obj2);
                TransactionElement transactionElement = (TransactionElement) e.getCoroutineContext().get(TransactionElement.Key);
                if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    transactionDispatcher = this.$inTransaction ? CoroutinesRoomKt.getTransactionDispatcher(this.$db) : CoroutinesRoomKt.getQueryDispatcher(this.$db);
                }
                Dj.e eVarA2 = p.a(0, 7, null);
                H.w(e, transactionDispatcher, null, new C00151(this.$db, r72, eVarA, this.$callable, eVarA2, null), 2);
                InterfaceC0231i interfaceC0231i = this.$$this$flow;
                this.label = 1;
                Object objI = W.i(interfaceC0231i, eVarA2, true, this);
                if (objI == enumC1578a) {
                    obj2 = objI;
                }
                if (obj2 == enumC1578a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z4, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, InterfaceC1526a<? super CoroutinesRoom$Companion$createFlow$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$inTransaction = z4;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, interfaceC1526a);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC0231i interfaceC0231i, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(interfaceC0231i, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, (InterfaceC0231i) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (H.l(anonymousClass1, this) == enumC1578a) {
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

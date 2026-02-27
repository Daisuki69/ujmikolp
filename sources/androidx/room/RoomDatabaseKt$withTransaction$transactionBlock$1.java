package androidx.room;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
public final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super R>, Object> {
    final /* synthetic */ Function1<InterfaceC1526a<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, Function1<? super InterfaceC1526a<? super R>, ? extends Object> function1, InterfaceC1526a<? super RoomDatabaseKt$withTransaction$transactionBlock$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$this_withTransaction = roomDatabase;
        this.$block = function1;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, interfaceC1526a);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super R> interfaceC1526a) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hj.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        TransactionElement transactionElement;
        TransactionElement transactionElement2 = EnumC1578a.f17050a;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                CoroutineContext.Element element = ((E) this.L$0).getCoroutineContext().get(TransactionElement.Key);
                j.d(element);
                TransactionElement transactionElement3 = (TransactionElement) element;
                transactionElement3.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        Function1<InterfaceC1526a<? super R>, Object> function1 = this.$block;
                        this.L$0 = transactionElement3;
                        this.label = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == transactionElement2) {
                            return transactionElement2;
                        }
                        transactionElement = transactionElement3;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        this.$this_withTransaction.endTransaction();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    transactionElement2 = transactionElement3;
                    th = th4;
                    transactionElement2.release();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.L$0;
                try {
                    AbstractC1039j.b(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    this.$this_withTransaction.endTransaction();
                    throw th2;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th6) {
            th = th6;
        }
    }
}

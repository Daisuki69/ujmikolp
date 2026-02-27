package androidx.room;

import Bj.E;
import Bj.O;
import Dj.q;
import Dj.r;
import bj.AbstractC1039j;
import cj.C1129o;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", l = {230}, m = "invokeSuspend")
public final class RoomDatabaseKt$invalidationTrackerFlow$1$job$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ r $$this$callbackFlow;
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ AtomicBoolean $ignoreInvalidation;
    final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 $observer;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1$job$1(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1, boolean z4, r rVar, String[] strArr, AtomicBoolean atomicBoolean, InterfaceC1526a<? super RoomDatabaseKt$invalidationTrackerFlow$1$job$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$observer = roomDatabaseKt$invalidationTrackerFlow$1$observer$1;
        this.$emitInitialState = z4;
        this.$$this$callbackFlow = rVar;
        this.$tables = strArr;
        this.$ignoreInvalidation = atomicBoolean;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, this.$observer, this.$emitInitialState, this.$$this$callbackFlow, this.$tables, this.$ignoreInvalidation, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1$job$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                throw new KotlinNothingValueException();
            }
            AbstractC1039j.b(obj);
            this.$this_invalidationTrackerFlow.getInvalidationTracker().addObserver(this.$observer);
            if (this.$emitInitialState) {
                ((q) this.$$this$callbackFlow).j(C1129o.C(this.$tables));
            }
            this.$ignoreInvalidation.set(false);
            this.label = 1;
            O.a(this);
            return enumC1578a;
        } catch (Throwable th2) {
            this.$this_invalidationTrackerFlow.getInvalidationTracker().removeObserver(this.$observer);
            throw th2;
        }
    }
}

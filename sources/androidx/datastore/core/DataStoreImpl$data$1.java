package androidx.datastore.core;

import Ej.InterfaceC0231i;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qj.n;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
public final class DataStoreImpl$data$1 extends AbstractC1616j implements Function2<InterfaceC0231i, InterfaceC1526a<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<InterfaceC0231i, InterfaceC1526a<? super Unit>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass1(this.this$0, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0231i interfaceC0231i, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(interfaceC0231i, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == enumC1578a) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends AbstractC1616j implements Function2<State<T>, InterfaceC1526a<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State<T> state, InterfaceC1526a<? super Boolean> interfaceC1526a) {
            return ((AnonymousClass2) create(state, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3<T> extends AbstractC1616j implements Function2<State<T>, InterfaceC1526a<? super Boolean>, Object> {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(State<T> state, InterfaceC1526a<? super AnonymousClass3> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$startState = state;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, interfaceC1526a);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State<T> state, InterfaceC1526a<? super Boolean> interfaceC1526a) {
            return ((AnonymousClass3) create(state, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            State state = (State) this.L$0;
            return Boolean.valueOf((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends AbstractC1616j implements n {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super AnonymousClass5> interfaceC1526a) {
            super(3, interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // qj.n
        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return new AnonymousClass5(this.this$0, interfaceC1526a).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == enumC1578a) {
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
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super DataStoreImpl$data$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = dataStoreImpl;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, interfaceC1526a);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC0231i interfaceC0231i, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((DataStoreImpl$data$1) create(interfaceC0231i, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r10 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1] */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

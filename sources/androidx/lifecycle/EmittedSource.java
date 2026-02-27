package androidx.lifecycle;

import Bj.E;
import Bj.H;
import Bj.U;
import Bj.W;
import Gj.m;
import androidx.annotation.MainThread;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class EmittedSource implements W {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return EmittedSource.this.new AnonymousClass1(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            EmittedSource.this.removeSource();
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$disposeNow$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return EmittedSource.this.new AnonymousClass2(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            EmittedSource.this.removeSource();
            return Unit.f18162a;
        }
    }

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        j.g(source, "source");
        j.g(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // Bj.W
    public void dispose() {
        Ij.e eVar = U.f603a;
        H.w(H.c(m.f2024a.c), null, null, new AnonymousClass1(null), 3);
    }

    public final Object disposeNow(InterfaceC1526a<? super Unit> interfaceC1526a) throws Throwable {
        Ij.e eVar = U.f603a;
        Object objC = H.C(new AnonymousClass2(null), m.f2024a.c, interfaceC1526a);
        return objC == EnumC1578a.f17050a ? objC : Unit.f18162a;
    }
}

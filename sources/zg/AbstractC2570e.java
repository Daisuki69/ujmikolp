package zg;

import Bj.A;
import Bj.C0154m0;
import Bj.D;
import Bj.InterfaceC0160s;
import Bj.U;
import Bj.o0;
import S1.s;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1114E;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: zg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2570e implements InterfaceC2568c, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21430d = AtomicIntegerFieldUpdater.newUpdater(AbstractC2570e.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1033d f21432b;
    public final InterfaceC1033d c;
    private volatile /* synthetic */ int closed = 0;

    public AbstractC2570e(String str) {
        this.f21431a = str;
        final int i = 0;
        this.f21432b = C1034e.b(new Function0(this) { // from class: zg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC2570e f21429b;

            {
                this.f21429b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AbstractC2570e abstractC2570e = this.f21429b;
                switch (i) {
                    case 0:
                        abstractC2570e.getConfig().getClass();
                        Ij.e eVar = U.f603a;
                        return Ij.d.f2362a;
                    default:
                        return s.b(null).plus((A) abstractC2570e.f21432b.getValue()).plus(new D(abstractC2570e.f21431a.concat("-context")));
                }
            }
        });
        final int i4 = 1;
        this.c = C1034e.b(new Function0(this) { // from class: zg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC2570e f21429b;

            {
                this.f21429b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AbstractC2570e abstractC2570e = this.f21429b;
                switch (i4) {
                    case 0:
                        abstractC2570e.getConfig().getClass();
                        Ij.e eVar = U.f603a;
                        return Ij.d.f2362a;
                    default:
                        return s.b(null).plus((A) abstractC2570e.f21432b.getValue()).plus(new D(abstractC2570e.f21431a.concat("-context")));
                }
            }
        });
    }

    public void close() {
        if (f21430d.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(C0154m0.f630a);
            InterfaceC0160s interfaceC0160s = element instanceof InterfaceC0160s ? (InterfaceC0160s) element : null;
            if (interfaceC0160s == null) {
                return;
            }
            ((o0) interfaceC0160s).h0();
        }
    }

    @Override // Bj.E
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.c.getValue();
    }

    @Override // zg.InterfaceC2568c
    public Set p() {
        return C1114E.f9379a;
    }
}

package Bj;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Bj.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0143h implements InterfaceC0145i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f622b;

    public /* synthetic */ C0143h(Object obj, int i) {
        this.f621a = i;
        this.f622b = obj;
    }

    @Override // Bj.InterfaceC0145i
    public final void a(Throwable th2) {
        switch (this.f621a) {
            case 0:
                ((ScheduledFuture) this.f622b).cancel(false);
                break;
            case 1:
                ((Function1) this.f622b).invoke(th2);
                break;
            default:
                ((W) this.f622b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f621a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f622b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f622b).getClass().getSimpleName() + '@' + H.o(this) + ']';
            default:
                return "DisposeOnCancel[" + ((W) this.f622b) + ']';
        }
    }
}

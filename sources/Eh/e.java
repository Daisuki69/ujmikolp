package eh;

import Nh.j;
import android.os.Handler;
import android.os.Message;
import ch.u;
import ch.v;
import fh.InterfaceC1486b;
import java.util.concurrent.TimeUnit;
import lg.C1828a;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends v {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16679d;

    public /* synthetic */ e(Object obj, int i) {
        this.c = i;
        this.f16679d = obj;
    }

    @Override // ch.v
    public final u b() {
        switch (this.c) {
            case 0:
                return new C1444c((Handler) this.f16679d);
            default:
                return new lg.c(((j) this.f16679d).a());
        }
    }

    @Override // ch.v
    public long c(TimeUnit timeUnit) {
        switch (this.c) {
            case 1:
                ((j) this.f16679d).getClass();
                return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            default:
                return super.c(timeUnit);
        }
    }

    @Override // ch.v
    public InterfaceC1486b d(Runnable runnable) {
        switch (this.c) {
            case 1:
                return C1828a.a(((j) this.f16679d).b(runnable));
            default:
                return super.d(runnable);
        }
    }

    @Override // ch.v
    public final InterfaceC1486b e(Runnable runnable, long j, TimeUnit timeUnit) {
        switch (this.c) {
            case 0:
                if (timeUnit == null) {
                    throw new NullPointerException("unit == null");
                }
                Handler handler = (Handler) this.f16679d;
                RunnableC1445d runnableC1445d = new RunnableC1445d(handler, runnable);
                handler.sendMessageDelayed(Message.obtain(handler, runnableC1445d), timeUnit.toMillis(j));
                return runnableC1445d;
            default:
                return C1828a.a(((j) this.f16679d).c(runnable, j, timeUnit));
        }
    }

    @Override // ch.v
    public InterfaceC1486b f(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        switch (this.c) {
            case 1:
                return C1828a.a(((j) this.f16679d).d(runnable, j, j6, timeUnit));
            default:
                return super.f(runnable, j, j6, timeUnit);
        }
    }
}

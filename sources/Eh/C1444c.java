package eh;

import android.os.Handler;
import android.os.Message;
import ch.u;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: eh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1444c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f16676b;

    public C1444c(Handler handler) {
        this.f16675a = handler;
    }

    @Override // ch.u
    public final InterfaceC1486b b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z4 = this.f16676b;
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        if (z4) {
            return enumC1605c;
        }
        Handler handler = this.f16675a;
        RunnableC1445d runnableC1445d = new RunnableC1445d(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC1445d);
        messageObtain.obj = this;
        this.f16675a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.f16676b) {
            return runnableC1445d;
        }
        this.f16675a.removeCallbacks(runnableC1445d);
        return enumC1605c;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f16676b = true;
        this.f16675a.removeCallbacksAndMessages(this);
    }
}

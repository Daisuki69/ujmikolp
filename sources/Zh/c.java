package zh;

import Ah.n;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f21441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f21442b;

    public c(Handler handler) {
        this.f21441a = handler;
    }

    @Override // Ah.n
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z4 = this.f21442b;
        Dh.b bVar = Dh.b.f1156a;
        if (z4) {
            return bVar;
        }
        Handler handler = this.f21441a;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        messageObtain.setAsynchronous(true);
        this.f21441a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.f21442b) {
            return dVar;
        }
        this.f21441a.removeCallbacks(dVar);
        return bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f21442b = true;
        this.f21441a.removeCallbacksAndMessages(this);
    }
}

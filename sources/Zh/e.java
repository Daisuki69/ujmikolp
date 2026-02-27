package zh;

import Ah.n;
import Ah.o;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f21445b;

    public e(Handler handler) {
        this.f21445b = handler;
    }

    @Override // Ah.o
    public final n a() {
        return new c(this.f21445b);
    }

    @Override // Ah.o
    public final io.reactivex.rxjava3.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f21445b;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return dVar;
    }
}

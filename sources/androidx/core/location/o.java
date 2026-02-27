package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f7794b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ o(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f7793a = i;
        this.f7794b = preRGnssStatusTransport;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7793a) {
            case 0:
                this.f7794b.lambda$onStopped$1(this.c);
                break;
            default:
                this.f7794b.lambda$onStarted$0(this.c);
                break;
        }
    }
}

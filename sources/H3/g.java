package H3;

import android.app.Activity;
import android.os.Handler;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f2092a;
    public final m4.f e;
    public boolean f;
    public boolean c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E5.b f2093b = new E5.b(2, this, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f2094d = new Handler();

    public g(Activity activity, m4.f fVar) {
        this.f2092a = activity;
        this.e = fVar;
    }

    public final void a() {
        this.f2094d.removeCallbacksAndMessages(null);
        if (this.c) {
            ht2aO8.unregisterReceiver(this.f2092a, this.f2093b);
            this.c = false;
        }
    }
}

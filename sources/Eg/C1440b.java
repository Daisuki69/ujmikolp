package eg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.g;
import com.paymaya.domain.store.T;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.ht2aO8;
import pg.k;
import pg.l;
import pg.m;

/* JADX INFO: renamed from: eg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1440b extends BroadcastReceiver implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f16669b;
    public l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f16670d = new Handler(Looper.getMainLooper());
    public C1439a e;

    public C1440b(Context context, T t5) {
        this.f16668a = context;
        this.f16669b = t5;
    }

    @Override // pg.m
    public final void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                ht2aO8.unregisterReceiver(this.f16668a, this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        C1439a c1439a = this.e;
        if (c1439a != null) {
            ((ConnectivityManager) this.f16669b.f11391b).unregisterNetworkCallback(c1439a);
            this.e = null;
        }
    }

    @Override // pg.m
    public final void onListen(Object obj, k kVar) {
        this.c = (l) kVar;
        int i = Build.VERSION.SDK_INT;
        T t5 = this.f16669b;
        if (i >= 24) {
            C1439a c1439a = new C1439a(this);
            this.e = c1439a;
            ((ConnectivityManager) t5.f11391b).registerDefaultNetworkCallback(c1439a);
        } else {
            ht2aO8.registerReceiver(this.f16668a, this, new IntentFilter(numX49.tnTj78("biLP")));
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) t5.f11391b;
        this.f16670d.post(new g(23, this, T.c(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l lVar = this.c;
        if (lVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f16669b.f11391b;
            lVar.success(T.c(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}

package eg;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.media3.common.util.g;
import com.paymaya.domain.store.T;

/* JADX INFO: renamed from: eg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1439a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1440b f16667a;

    public C1439a(C1440b c1440b) {
        this.f16667a = c1440b;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C1440b c1440b = this.f16667a;
        c1440b.f16670d.post(new g(23, c1440b, T.c(((ConnectivityManager) c1440b.f16669b.f11391b).getNetworkCapabilities(network))));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C1440b c1440b = this.f16667a;
        c1440b.f16669b.getClass();
        c1440b.f16670d.post(new g(23, c1440b, T.c(networkCapabilities)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C1440b c1440b = this.f16667a;
        c1440b.getClass();
        c1440b.f16670d.postDelayed(new androidx.window.layout.adapter.extensions.a(c1440b, 12), 500L);
    }
}

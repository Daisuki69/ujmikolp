package androidx.window.embedding;

import android.app.ApplicationExitInfo;
import android.content.res.loader.ResourcesLoader;
import android.media.RouteDiscoveryPreference;
import android.view.WindowMetrics;
import com.google.android.gms.internal.ads.zzgjz;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo e(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ ResourcesLoader g() {
        return new ResourcesLoader();
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder j(zzgjz zzgjzVar) {
        return new RouteDiscoveryPreference.Builder(zzgjzVar, false);
    }

    public static /* bridge */ /* synthetic */ WindowMetrics n(Object obj) {
        return (WindowMetrics) obj;
    }

    public static /* synthetic */ void t() {
    }
}

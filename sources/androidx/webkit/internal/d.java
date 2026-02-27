package androidx.webkit.internal;

import android.os.Binder;
import android.telephony.CellInfoTdscdma;
import android.webkit.WebViewRenderProcess;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ Binder i() {
        return new Binder("WINDOW_AREA_REAR_DISPLAY");
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma j(Object obj) {
        return (CellInfoTdscdma) obj;
    }

    public static /* bridge */ /* synthetic */ WebViewRenderProcess m(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof CellInfoTdscdma;
    }
}

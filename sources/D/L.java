package D;

import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class L {
    public static /* bridge */ /* synthetic */ HttpEngine h(Object obj) {
        return (HttpEngine) obj;
    }

    public static /* bridge */ /* synthetic */ NetworkException i(Object obj) {
        return (NetworkException) obj;
    }

    public static /* bridge */ /* synthetic */ UrlResponseInfo n(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof NetworkException;
    }
}

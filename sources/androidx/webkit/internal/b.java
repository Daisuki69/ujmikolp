package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import dalvik.system.DelegateLastClassLoader;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse b(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader c(String str, ClassLoader classLoader) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ void d() {
    }
}

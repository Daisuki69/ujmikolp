package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@AnyThread
public abstract class ServiceWorkerWebSettingsCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CacheMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ServiceWorkerWebSettingsCompat() {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    public abstract Set<String> getRequestedWithHeaderOriginAllowList();

    public abstract void setAllowContentAccess(boolean z4);

    public abstract void setAllowFileAccess(boolean z4);

    public abstract void setBlockNetworkLoads(boolean z4);

    public abstract void setCacheMode(int i);

    public abstract void setRequestedWithHeaderOriginAllowList(Set<String> set);
}

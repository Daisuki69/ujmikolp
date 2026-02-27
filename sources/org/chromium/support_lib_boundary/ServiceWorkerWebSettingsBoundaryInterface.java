package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z4);

    void setAllowFileAccess(boolean z4);

    void setBlockNetworkLoads(boolean z4);

    void setCacheMode(int i);

    void setIncludeCookiesOnIntercept(boolean z4);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}

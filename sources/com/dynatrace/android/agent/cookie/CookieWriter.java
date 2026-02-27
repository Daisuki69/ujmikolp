package com.dynatrace.android.agent.cookie;

import We.s;
import android.webkit.CookieManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class CookieWriter {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CookieWriter");
    private CookieManager cookieManager;

    public CookieWriter(boolean z4) {
        init(z4);
    }

    private void init(boolean z4) {
        if (z4) {
            try {
                CookieManager.setAcceptFileSchemeCookies(true);
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOG_TAG, "unable to access CookieManager", e);
                    return;
                }
                return;
            }
        }
        if (!CookieManager.getInstance().acceptCookie()) {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.cookieManager = CookieManager.getInstance();
    }

    public void removeCookies(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next() + "=; Max-Age=-1");
            }
        }
        this.cookieManager.flush();
        writeCookies(set, arrayList, false);
    }

    public void writeCookies(Set<String> set, Collection<String> collection, boolean z4) {
        if (this.cookieManager == null) {
            return;
        }
        if (Global.DEBUG) {
            String str = LOG_TAG;
            Utility.zlogD(str, "domains: " + set.toString());
            Utility.zlogD(str, "cookies: " + collection.toString());
        }
        for (String str2 : set) {
            for (String strI : collection) {
                CookieManager cookieManager = this.cookieManager;
                if (z4) {
                    strI = s.i(strI, "; secure");
                }
                cookieManager.setCookie(str2, strI);
            }
        }
        this.cookieManager.flush();
    }
}

package com.dynatrace.android.agent.cookie;

import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.data.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class CookieHandler {
    private static final String ADK = "dtAdk";
    private static final String ADK_SETTINGS = "dtAdkSettings";

    @Deprecated
    private static final String DT_COOKIE = "dtCookie";
    private AgentMode agentMode;
    private CookieWriter cookieWriter;
    private Map<String, String> cookies;
    private Set<String> domains;
    private final boolean fileDomainCookiesEnabled;
    private Set<String> httpsDomains;
    private CookieProducer producer = new CookieProducer();

    public CookieHandler(Set<String> set, Set<String> set2, boolean z4, AgentMode agentMode) {
        this.domains = set;
        this.httpsDomains = set2;
        this.agentMode = agentMode;
        this.fileDomainCookiesEnabled = z4;
    }

    public void onAgentStart() {
        this.cookieWriter = new CookieWriter(this.fileDomainCookiesEnabled);
    }

    public synchronized void onSessionStart(Session session, String str) {
        try {
            HashMap map = new HashMap();
            this.cookies = map;
            if (this.agentMode == AgentMode.SAAS) {
                map.put(ADK_SETTINGS, "dtAdkSettings=" + this.producer.createAdkSettingsCookie(session));
            }
            if (session.getPrivacyRules().allowUserRelatedCookies()) {
                this.cookies.put(ADK, "dtAdk=" + this.producer.createAdkCookie(session, str));
                if (this.agentMode == AgentMode.APP_MON) {
                    this.cookies.put(DT_COOKIE, "dtCookie=" + this.producer.createDtCookie(session.visitorId, session.sessionId));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ADK);
                if (this.agentMode == AgentMode.APP_MON) {
                    arrayList.add(DT_COOKIE);
                }
                this.cookieWriter.removeCookies(this.domains, arrayList);
                this.cookieWriter.removeCookies(this.httpsDomains, arrayList);
            }
            if (!this.cookies.isEmpty()) {
                this.cookieWriter.writeCookies(this.domains, this.cookies.values(), false);
                this.cookieWriter.writeCookies(this.httpsDomains, this.cookies.values(), true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void onTrafficControlUpdate(Session session) {
        if (this.agentMode == AgentMode.SAAS) {
            String str = "dtAdkSettings=" + this.producer.createAdkSettingsCookie(session);
            this.cookies.put(ADK_SETTINGS, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.cookieWriter.writeCookies(this.domains, arrayList, false);
            this.cookieWriter.writeCookies(this.httpsDomains, arrayList, true);
        }
    }

    public synchronized void restoreCookies() {
        Map<String, String> map = this.cookies;
        if (map != null && !map.isEmpty()) {
            this.cookieWriter.writeCookies(this.domains, this.cookies.values(), false);
            this.cookieWriter.writeCookies(this.httpsDomains, this.cookies.values(), true);
        }
    }

    public void setCookieWriter(CookieWriter cookieWriter) {
        this.cookieWriter = cookieWriter;
    }
}

package com.dynatrace.android.agent;

import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public final class WebRequestUtils {

    public static class FormattedUrl {
        public String legacyAgentUrl;
        public String oneAgentUrl;

        public FormattedUrl(String str, String str2) {
            this.oneAgentUrl = str;
            this.legacyAgentUrl = str2;
        }
    }

    public static FormattedUrl removeUrlCredentials(String str) {
        try {
            URI uri = new URI(str);
            URI uri2 = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            return new FormattedUrl(uri2.toString(), uri2.toString());
        } catch (Exception unused) {
            return new FormattedUrl(null, str);
        }
    }
}

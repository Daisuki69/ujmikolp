package androidx.media3.exoplayer.rtsp;

import O1.AbstractC0529x;
import O1.C;
import O1.S;
import O1.T;
import O1.U;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k2.v0;

/* JADX INFO: loaded from: classes2.dex */
final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = new Builder().build();
    public static final String EXPIRES = "Expires";
    public static final String LOCATION = "Location";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final U namesAndValues;

    public static final class Builder {
        private final T namesAndValuesBuilder;

        public Builder add(String str, String str2) {
            T t5 = this.namesAndValuesBuilder;
            String strConvertToStandardHeaderName = RtspHeaders.convertToStandardHeaderName(str.trim());
            String strTrim = str2.trim();
            t5.getClass();
            AbstractC0529x.c(strConvertToStandardHeaderName, strTrim);
            C c = t5.f4556a;
            Collection arrayList = (Collection) c.get(strConvertToStandardHeaderName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c.put(strConvertToStandardHeaderName, arrayList);
            }
            arrayList.add(strTrim);
            return this;
        }

        public Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrSplitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (strArrSplitAtFirst.length == 2) {
                    add(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
                }
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }

        public Builder() {
            this.namesAndValuesBuilder = new T();
        }

        public Builder(String str, @Nullable String str2, int i) {
            this();
            add(RtspHeaders.USER_AGENT, str);
            add(RtspHeaders.CSEQ, String.valueOf(i));
            if (str2 != null) {
                add(RtspHeaders.SESSION, str2);
            }
        }

        public Builder addAll(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }

        private Builder(T t5) {
            this.namesAndValuesBuilder = t5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToStandardHeaderName(String str) {
        return v0.i(str, ACCEPT) ? ACCEPT : v0.i(str, ALLOW) ? ALLOW : v0.i(str, AUTHORIZATION) ? AUTHORIZATION : v0.i(str, BANDWIDTH) ? BANDWIDTH : v0.i(str, BLOCKSIZE) ? BLOCKSIZE : v0.i(str, CACHE_CONTROL) ? CACHE_CONTROL : v0.i(str, CONNECTION) ? CONNECTION : v0.i(str, CONTENT_BASE) ? CONTENT_BASE : v0.i(str, CONTENT_ENCODING) ? CONTENT_ENCODING : v0.i(str, CONTENT_LANGUAGE) ? CONTENT_LANGUAGE : v0.i(str, CONTENT_LENGTH) ? CONTENT_LENGTH : v0.i(str, CONTENT_LOCATION) ? CONTENT_LOCATION : v0.i(str, CONTENT_TYPE) ? CONTENT_TYPE : v0.i(str, CSEQ) ? CSEQ : v0.i(str, DATE) ? DATE : v0.i(str, EXPIRES) ? EXPIRES : v0.i(str, LOCATION) ? LOCATION : v0.i(str, PROXY_AUTHENTICATE) ? PROXY_AUTHENTICATE : v0.i(str, PROXY_REQUIRE) ? PROXY_REQUIRE : v0.i(str, PUBLIC) ? PUBLIC : v0.i(str, RANGE) ? RANGE : v0.i(str, RTP_INFO) ? RTP_INFO : v0.i(str, RTCP_INTERVAL) ? RTCP_INTERVAL : v0.i(str, SCALE) ? SCALE : v0.i(str, SESSION) ? SESSION : v0.i(str, SPEED) ? SPEED : v0.i(str, SUPPORTED) ? SUPPORTED : v0.i(str, TIMESTAMP) ? TIMESTAMP : v0.i(str, TRANSPORT) ? TRANSPORT : v0.i(str, USER_AGENT) ? USER_AGENT : v0.i(str, VIA) ? VIA : v0.i(str, WWW_AUTHENTICATE) ? WWW_AUTHENTICATE : str;
    }

    public U asMultiMap() {
        return this.namesAndValues;
    }

    public Builder buildUpon() {
        T t5 = new T();
        for (Map.Entry entry : this.namesAndValues.b().entrySet()) {
            t5.c((Iterable) entry.getValue(), entry.getKey());
        }
        return new Builder(t5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.namesAndValues.equals(((RtspHeaders) obj).namesAndValues);
        }
        return false;
    }

    @Nullable
    public String get(String str) {
        S sValues = values(str);
        if (sValues.isEmpty()) {
            return null;
        }
        return (String) AbstractC0529x.k(sValues);
    }

    public int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public S values(String str) {
        return this.namesAndValues.get(convertToStandardHeaderName(str));
    }

    private RtspHeaders(Builder builder) {
        this.namesAndValues = builder.namesAndValuesBuilder.a();
    }
}

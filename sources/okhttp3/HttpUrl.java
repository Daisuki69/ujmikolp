package okhttp3;

import We.s;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.webkit.ProxyConfig;
import cj.C1112C;
import cj.C1114E;
import cj.t;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MfaTencentErrorResult;
import defpackage.AbstractC1414e;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kj.AbstractC1785b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.c;
import kotlin.ranges.d;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import okio.Utf8;
import zj.C2576A;
import zj.C2578C;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i4) {
                int i6;
                try {
                    i6 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i4, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i6 || i6 >= 65536) {
                    return -1;
                }
                return i6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i4) {
                while (i < i4) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i4) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i4) {
                if (i4 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((j.i(cCharAt, 97) >= 0 && j.i(cCharAt, 122) <= 0) || (j.i(cCharAt, 65) >= 0 && j.i(cCharAt, 90) <= 0)) {
                    while (true) {
                        i++;
                        if (i >= i4) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i4) {
                int i6 = 0;
                while (i < i4) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i6++;
                    i++;
                }
                return i6;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            j.d(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return j.b(str, ".") || z.o(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return j.b(str, "..") || z.o(str, "%2e.", true) || z.o(str, ".%2e", true) || z.o(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i, int i4, boolean z4, boolean z5) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i4, HttpUrl.PATH_SEGMENT_ENCODE_SET, z5, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (((CharSequence) s.e(1, this.encodedPathSegments)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z4) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            j.d(list);
            int size = list.size() - 2;
            int iA = AbstractC1785b.a(size, 0, -2);
            if (iA > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                j.d(list2);
                if (j.b(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    j.d(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    j.d(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    j.d(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iA) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i, int i4) {
            if (i == i4) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i6 = i;
            while (i6 < i4) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i6, i4);
                boolean z4 = iDelimiterOffset < i4;
                String str2 = str;
                push(str2, i6, iDelimiterOffset, z4, true);
                if (z4) {
                    i6 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i6 = iDelimiterOffset;
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            j.g(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            j.g(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            j.g(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            j.d(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            j.d(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            j.g(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            j.g(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String str) {
            j.g(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            j.d(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_APP_STOP, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            j.d(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_APP_STOP, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(t.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(t.l(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            j.g(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            j.g(encodedPath, "encodedPath");
            if (!z.w(encodedPath, 2, "/", false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            j.g(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            j.g(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            int i;
            int i4;
            boolean z4;
            int i6;
            int i10;
            char c;
            int i11;
            String input = str;
            j.g(input, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z5 = true;
            byte b8 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (z.u(input, iIndexOfFirstNonAsciiWhitespace$default, "https:", true)) {
                    this.scheme = ProxyConfig.MATCH_HTTPS;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!z.u(input, iIndexOfFirstNonAsciiWhitespace$default, "http:", true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = ProxyConfig.MATCH_HTTP;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(AbstractC1414e.h("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? C2578C.e0(6, input).concat("...") : input));
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(input, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b10 = Utf8.REPLACEMENT_BYTE;
            byte b11 = 35;
            if (iSlashCount >= 2 || httpUrl == null || !j.b(httpUrl.scheme(), this.scheme)) {
                int i12 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z8 = false;
                boolean z9 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input, "@/\\?#", i12, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input.charAt(iDelimiterOffset) : b8;
                    if (bCharAt == b8 || bCharAt == b11 || bCharAt == 47 || bCharAt == 92 || bCharAt == b10) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z8) {
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            z4 = z5;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input = str;
                            i6 = iDelimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i12, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input, ':', i12, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            z4 = z5;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i12, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                            if (z9) {
                                strCanonicalize$okhttp$default = s.q(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i10 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                                z8 = z4;
                            } else {
                                i10 = iDelimiterOffset;
                            }
                            input = str;
                            i6 = i10;
                            z9 = z4;
                        }
                        i12 = i6 + 1;
                        iIndexOfLastNonAsciiWhitespace$default = i4;
                        z5 = z4;
                        b10 = Utf8.REPLACEMENT_BYTE;
                        b8 = -1;
                        b11 = 35;
                    }
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(input, i12, iDelimiterOffset);
                int i13 = iPortColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i12, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(input, i13, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i13, iDelimiterOffset);
                        j.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i12, iPortColonOffset, false, 4, null));
                    String str2 = this.scheme;
                    j.d(str2);
                    this.port = companion4.defaultPort(str2);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i12, iPortColonOffset);
                    j.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i14 = i;
            int iDelimiterOffset3 = Util.delimiterOffset(input, "?#", iIndexOfFirstNonAsciiWhitespace$default, i14);
            resolvePath(input, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i14 || input.charAt(iDelimiterOffset3) != '?') {
                c = '#';
                i11 = iDelimiterOffset3;
            } else {
                c = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(input, '#', iDelimiterOffset3, i14);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i11 = iDelimiterOffset4;
            }
            if (i11 < i14 && input.charAt(i11) == c) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i11 + 1, i14, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            j.g(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(s.f(i, "unexpected port: ").toString());
            }
            this.port = i;
            return this;
        }

        public final Builder query(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_APP_STOP, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? AbstractC1213b.M("[\"<>^`{|}]", str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = list2.get(i4);
                    list2.set(i4, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            j.g(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            j.g(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, MfaTencentErrorResult.TENCENT_ERROR_APP_STOP, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            j.g(scheme, "scheme");
            if (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
                this.scheme = ProxyConfig.MATCH_HTTP;
                return this;
            }
            if (!scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            this.scheme = ProxyConfig.MATCH_HTTPS;
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            j.g(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String encodedPathSegment) {
            j.g(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String str) {
            j.g(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            j.g(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String pathSegment) {
            j.g(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(pathSegment).toString());
            }
            this.encodedPathSegments.set(i, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String name, String str) {
            j.g(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (C2576A.y(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || iEffectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb2.append(':');
                    sb2.append(iEffectivePort);
                }
            }
            Companion companion = HttpUrl.Companion;
            companion.toPathString$okhttp(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                j.d(list);
                companion.toQueryString$okhttp(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            String string = sb2.toString();
            j.f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final Builder username(String username) {
            j.g(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z4) {
            boolean z5;
            Builder builder;
            String str2;
            boolean z8;
            int i = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                if (iDelimiterOffset < str.length()) {
                    z5 = true;
                    str2 = str;
                    z8 = z4;
                    builder = this;
                } else {
                    z5 = false;
                    builder = this;
                    str2 = str;
                    z8 = z4;
                }
                builder.push(str2, i, iDelimiterOffset, z5, z8);
                i = iDelimiterOffset + 1;
                if (i > str2.length()) {
                    return builder;
                }
                str = str2;
                z4 = z8;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i4, String str2, boolean z4, boolean z5, boolean z8, boolean z9, Charset charset, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = 0;
            }
            if ((i6 & 2) != 0) {
                i4 = str.length();
            }
            if ((i6 & 8) != 0) {
                z4 = false;
            }
            if ((i6 & 16) != 0) {
                z5 = false;
            }
            if ((i6 & 32) != 0) {
                z8 = false;
            }
            if ((i6 & 64) != 0) {
                z9 = false;
            }
            if ((i6 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i, i4, str2, z4, z5, z8, z9, charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i4) {
            int i6 = i + 2;
            return i6 < i4 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i6)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i4, boolean z4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = 0;
            }
            if ((i6 & 2) != 0) {
                i4 = str.length();
            }
            if ((i6 & 4) != 0) {
                z4 = false;
            }
            return companion.percentDecode$okhttp(str, i, i4, z4);
        }

        private final void writeCanonicalized(Buffer buffer, String str, int i, int i4, String str2, boolean z4, boolean z5, boolean z8, boolean z9, Charset charset) throws EOFException {
            Buffer buffer2 = null;
            while (i < i4) {
                int iCodePointAt = str.codePointAt(i);
                if (!z4 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z8) {
                        buffer.writeUtf8(z4 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || C2576A.y(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z4 || (z5 && !isPercentEncoded(str, i, i4)))))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, i, Character.charCount(iCodePointAt) + i, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b8 = buffer2.readByte();
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[((b8 & 255) >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[b8 & 15]);
                        }
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                i += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i4, boolean z4) {
            int i6;
            while (i < i4) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i6 = i + 2) < i4) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i6));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i = Character.charCount(iCodePointAt) + i6;
                    }
                } else if (iCodePointAt == 43 && z4) {
                    buffer.writeByte(32);
                    i++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m332deprecated_get(String url) {
            j.g(url, "url");
            return get(url);
        }

        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m335deprecated_parse(String url) {
            j.g(url, "url");
            return parse(url);
        }

        public final String canonicalize$okhttp(String str, int i, int i4, String encodeSet, boolean z4, boolean z5, boolean z8, boolean z9, Charset charset) throws EOFException {
            j.g(str, "<this>");
            j.g(encodeSet, "encodeSet");
            int iCharCount = i;
            while (iCharCount < i4) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || C2576A.y(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z4 || (z5 && !isPercentEncoded(str, iCharCount, i4)))) || (iCodePointAt == 43 && z8)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i4, encodeSet, z4, z5, z8, z9, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i, i4);
            j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int defaultPort(String scheme) {
            j.g(scheme, "scheme");
            if (scheme.equals(ProxyConfig.MATCH_HTTP)) {
                return 80;
            }
            return scheme.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            j.g(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            j.g(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i4, boolean z4) {
            j.g(str, "<this>");
            for (int i6 = i; i6 < i4; i6++) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == '%' || (cCharAt == '+' && z4)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i6);
                    writePercentDecoded(buffer, str, i6, i4, z4);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i, i4);
            j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder out) {
            j.g(list, "<this>");
            j.g(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            j.g(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iE = C2576A.E(str, '&', i, 4);
                if (iE == -1) {
                    iE = str.length();
                }
                int iE2 = C2576A.E(str, '=', i, 4);
                if (iE2 == -1 || iE2 > iE) {
                    String strSubstring = str.substring(i, iE);
                    j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iE2);
                    j.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iE2 + 1, iE);
                    j.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iE + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder out) {
            j.g(list, "<this>");
            j.g(out, "out");
            c cVarE = d.e(d.f(0, list.size()), 2);
            int i = cVarE.f18201a;
            int i4 = cVarE.f18202b;
            int i6 = cVarE.c;
            if ((i6 <= 0 || i > i4) && (i6 >= 0 || i4 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i == i4) {
                    return;
                } else {
                    i += i6;
                }
            }
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m334deprecated_get(URL url) {
            j.g(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            j.g(url, "<this>");
            String string = url.toString();
            j.f(string, "toString()");
            return parse(string);
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m333deprecated_get(URI uri) {
            j.g(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            j.g(uri, "<this>");
            String string = uri.toString();
            j.f(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i, List<String> pathSegments, List<String> list, String str, String url) {
        j.g(scheme, "scheme");
        j.g(username, "username");
        j.g(password, "password");
        j.g(host, "host");
        j.g(pathSegments, "pathSegments");
        j.g(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = j.b(scheme, ProxyConfig.MATCH_HTTPS);
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m313deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m314deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m315deprecated_encodedPath() {
        return encodedPath();
    }

    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m316deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m317deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m318deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m319deprecated_fragment() {
        return this.fragment;
    }

    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final String m320deprecated_host() {
        return this.host;
    }

    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final String m321deprecated_password() {
        return this.password;
    }

    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m322deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m323deprecated_pathSize() {
        return pathSize();
    }

    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m324deprecated_port() {
        return this.port;
    }

    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m325deprecated_query() {
        return query();
    }

    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m326deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m327deprecated_querySize() {
        return querySize();
    }

    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m328deprecated_scheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m329deprecated_uri() {
        return uri();
    }

    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m330deprecated_url() {
        return url();
    }

    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final String m331deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(C2576A.E(this.url, '#', 0, 6) + 1);
        j.f(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(C2576A.E(this.url, ':', this.scheme.length() + 3, 4) + 1, C2576A.E(this.url, '@', 0, 6));
        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iE = C2576A.E(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iE, Util.delimiterOffset(str, "?#", iE, str.length()));
        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iE = C2576A.E(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iE, str.length());
        ArrayList arrayList = new ArrayList();
        while (iE < iDelimiterOffset) {
            int i = iE + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            String strSubstring = this.url.substring(i, iDelimiterOffset2);
            j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iE = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iE = C2576A.E(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iE, Util.delimiterOffset(str, '#', iE, str.length()));
        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && j.b(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        j.g(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        c cVarE = d.e(d.f(0, list.size()), 2);
        int i = cVarE.f18201a;
        int i4 = cVarE.f18202b;
        int i6 = cVarE.c;
        if ((i6 > 0 && i <= i4) || (i6 < 0 && i4 <= i)) {
            while (!name.equals(this.queryNamesAndValues.get(i))) {
                if (i != i4) {
                    i += i6;
                }
            }
            return this.queryNamesAndValues.get(i + 1);
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        j.d(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C1114E.f9379a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c cVarE = d.e(d.f(0, this.queryNamesAndValues.size()), 2);
        int i = cVarE.f18201a;
        int i4 = cVarE.f18202b;
        int i6 = cVarE.c;
        if ((i6 > 0 && i <= i4) || (i6 < 0 && i4 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                j.d(str);
                linkedHashSet.add(str);
                if (i == i4) {
                    break;
                }
                i += i6;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        j.f(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        j.g(name, "name");
        if (this.queryNamesAndValues == null) {
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList();
        c cVarE = d.e(d.f(0, this.queryNamesAndValues.size()), 2);
        int i = cVarE.f18201a;
        int i4 = cVarE.f18202b;
        int i6 = cVarE.c;
        if ((i6 > 0 && i <= i4) || (i6 < 0 && i4 <= i)) {
            while (true) {
                if (name.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i4) {
                    break;
                }
                i += i6;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        j.f(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        j.d(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String link) {
        j.g(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f("", string));
                j.f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String link) {
        j.g(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

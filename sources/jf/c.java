package jf;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import of.C1976a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a[] f17745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f17746b;

    static {
        a aVar = new a(a.i, C1976a.d(""));
        C1976a c1976a = a.f;
        a aVar2 = new a(c1976a, C1976a.d(ShareTarget.METHOD_GET));
        a aVar3 = new a(c1976a, C1976a.d(ShareTarget.METHOD_POST));
        C1976a c1976a2 = a.f17738g;
        a aVar4 = new a(c1976a2, C1976a.d("/"));
        a aVar5 = new a(c1976a2, C1976a.d("/index.html"));
        C1976a c1976a3 = a.h;
        a aVar6 = new a(c1976a3, C1976a.d(ProxyConfig.MATCH_HTTP));
        a aVar7 = new a(c1976a3, C1976a.d(ProxyConfig.MATCH_HTTPS));
        C1976a c1976a4 = a.e;
        int i = 0;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a(c1976a4, C1976a.d("200")), new a(c1976a4, C1976a.d("204")), new a(c1976a4, C1976a.d("206")), new a(c1976a4, C1976a.d("304")), new a(c1976a4, C1976a.d("400")), new a(c1976a4, C1976a.d("404")), new a(c1976a4, C1976a.d("500")), new a("accept-charset", ""), new a("accept-encoding", "gzip, deflate"), new a("accept-language", ""), new a("accept-ranges", ""), new a("accept", ""), new a("access-control-allow-origin", ""), new a("age", ""), new a("allow", ""), new a("authorization", ""), new a("cache-control", ""), new a("content-disposition", ""), new a("content-encoding", ""), new a("content-language", ""), new a("content-length", ""), new a("content-location", ""), new a("content-range", ""), new a("content-type", ""), new a("cookie", ""), new a("date", ""), new a("etag", ""), new a("expect", ""), new a("expires", ""), new a(TypedValues.TransitionType.S_FROM, ""), new a("host", ""), new a("if-match", ""), new a("if-modified-since", ""), new a("if-none-match", ""), new a("if-range", ""), new a("if-unmodified-since", ""), new a("last-modified", ""), new a("link", ""), new a("location", ""), new a("max-forwards", ""), new a("proxy-authenticate", ""), new a("proxy-authorization", ""), new a(SessionDescription.ATTR_RANGE, ""), new a("referer", ""), new a("refresh", ""), new a("retry-after", ""), new a("server", ""), new a("set-cookie", ""), new a("strict-transport-security", ""), new a("transfer-encoding", ""), new a("user-agent", ""), new a("vary", ""), new a("via", ""), new a("www-authenticate", "")};
        f17745a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        while (true) {
            a[] aVarArr2 = f17745a;
            if (i >= aVarArr2.length) {
                f17746b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(aVarArr2[i].f17739a)) {
                    linkedHashMap.put(aVarArr2[i].f17739a, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(C1976a c1976a) throws IOException {
        int size = c1976a.size();
        for (int i = 0; i < size; i++) {
            byte bE = c1976a.e(i);
            if (bE >= 65 && bE <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1976a.l());
            }
        }
    }
}

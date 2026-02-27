package io.split.android.client.network;

import We.s;
import bg.AbstractC0983W;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.r;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.gson.reflect.TypeToken;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.T;
import d4.AbstractC1331a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static M f17572a;

    public static URI a(String str, String str2, String str3) {
        if (str != null && str.endsWith("/") && str.length() != 0) {
            str = str.substring(0, str.length() - 1);
        }
        String strI = s.i(str, str2);
        if (!AbstractC0983W.q(str3)) {
            strI = androidx.camera.core.impl.a.j(strI, Global.QUESTION, str3);
        }
        return new URI(strI);
    }

    public static void b(HttpURLConnection httpURLConnection, r rVar) {
        if (rVar == null || !(httpURLConnection instanceof HttpsURLConnection)) {
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        synchronized (rVar) {
            String host = httpsURLConnection.getURL().getHost();
            LinkedHashSet<a> linkedHashSetE = e(host, (Map) rVar.f9803b);
            if (linkedHashSetE == null || linkedHashSetE.isEmpty()) {
                Ri.a.d("No certificate pins configured for " + host + ". Skipping pinning verification.");
                return;
            }
            try {
                List<X509Certificate> listC = ((L) rVar.c).c(host, httpsURLConnection.getServerCertificates());
                for (X509Certificate x509Certificate : listC) {
                    for (a aVar : linkedHashSetE) {
                        M2.b bVar = (M2.b) rVar.e;
                        String strA = aVar.a();
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        bVar.getClass();
                        if (Arrays.equals(M2.b.T(strA, encoded), aVar.b())) {
                            Ri.a.p("Certificate pinning verification successful for " + host);
                            return;
                        }
                    }
                }
                throw new SSLPeerUnverifiedException("Certificate pinning verification failed for host: " + host + ". Chain:\n" + rVar.o(listC));
            } catch (Exception unused) {
                throw new SSLPeerUnverifiedException("Error cleaning certificate chain for host: " + host);
            }
        }
    }

    public static HttpURLConnection c(URL url, Proxy proxy, e eVar, A0 a02, int i, HashMap map, boolean z4, SSLSocketFactory sSLSocketFactory, k kVar, String str) {
        HttpURLConnection httpURLConnection;
        if (eVar != null && sSLSocketFactory != null && !eVar.i) {
            try {
                if (f17572a == null) {
                    f17572a = new M();
                }
                g gVarE = f17572a.e(eVar, url, i, map, str, sSLSocketFactory, kVar);
                f fVar = new f(url, gVarE, gVarE.c);
                Callback.newInstance(fVar);
                return fVar;
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (eVar != null && !eVar.i && (eVar.f17586g != null || eVar.e != null)) {
            throw new IOException("SSL proxy scenarios require custom handling - use executeRequest method instead");
        }
        if (proxy != null) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy));
            Callback.openConnection(uRLConnection);
            httpURLConnection = (HttpURLConnection) uRLConnection;
            if (z4 && a02 != null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                if (httpURLConnection != null && httpURLConnection.getURL() != null) {
                    httpURLConnection.getURL().toString();
                }
                StringBuilder sb2 = new StringBuilder();
                M5.e eVar2 = (M5.e) a02.f11334b;
                sb2.append(eVar2.f3087b);
                sb2.append(Global.COLON);
                sb2.append(eVar2.c);
                concurrentHashMap.put("Proxy-Authorization", "Basic " + Xh.i.l(sb2.toString()));
                for (Map.Entry entry : new HashMap(concurrentHashMap).entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        } else {
            URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Callback.openConnection(uRLConnection2);
            httpURLConnection = (HttpURLConnection) uRLConnection2;
        }
        httpURLConnection.setRequestMethod(AbstractC1331a.v(i));
        for (Map.Entry entry2 : map.entrySet()) {
            if (entry2 != null && entry2.getKey() != null) {
                httpURLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return httpURLConnection;
    }

    public static T d(String str) {
        try {
            Map map = (Map) io.split.android.client.utils.b.f17635a.f(str, new TypeToken<Map<String, Set<a>>>() { // from class: io.split.android.client.network.CertificatePinningConfigurationProvider$1
            }.getType());
            if (map == null || map.isEmpty()) {
                return null;
            }
            C1258f0 c1258f0 = new C1258f0(13);
            for (Map.Entry entry : map.entrySet()) {
                c1258f0.a((String) entry.getKey(), (Set) entry.getValue());
            }
            return new T(c1258f0);
        } catch (Exception e) {
            Ri.a.g(String.format("Error parsing certificate pinning configuration for background sync worker", e.getLocalizedMessage()));
            return null;
        }
    }

    public static LinkedHashSet e(String str, Map map) {
        String strSubstring;
        int iLastIndexOf;
        Set set = (Set) map.get(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : map.keySet()) {
            if (str2.startsWith("**.")) {
                String strSubstring2 = str2.substring(3);
                if (str.regionMatches(str.length() - strSubstring2.length(), strSubstring2, 0, strSubstring2.length())) {
                    linkedHashSet.addAll((Collection) map.get(str2));
                }
            } else if (str2.startsWith("*.") && (iLastIndexOf = str.lastIndexOf((strSubstring = str2.substring(2)))) != -1) {
                int i = iLastIndexOf - 1;
                if (str.charAt(i) == '.' && str.regionMatches(iLastIndexOf, strSubstring, 0, strSubstring.length()) && str.substring(0, i).split("\\.").length == 1) {
                    linkedHashSet.addAll((Collection) map.get(str2));
                }
            }
        }
        if (set == null && linkedHashSet.isEmpty()) {
            return null;
        }
        if (set != null) {
            linkedHashSet.addAll(set);
        }
        return linkedHashSet;
    }

    public static URI f(String str, String str2) {
        int i;
        int codePoint;
        int i4;
        int i6;
        char[] cArr;
        String str3 = str2;
        StringBuilder sb2 = new StringBuilder("/memberships/");
        if (str3 != null) {
            j jVar = o.f17608a;
            jVar.getClass();
            int length = str3.length();
            int i10 = 0;
            while (i10 < length) {
                char cCharAt = str3.charAt(i10);
                boolean[] zArr = jVar.f17602b;
                if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                    int length2 = str3.length();
                    char[] cArr2 = (char[]) n.f17607a.get();
                    int i11 = 0;
                    int length3 = 0;
                    while (i10 < length2) {
                        if (i10 >= length2) {
                            throw new IndexOutOfBoundsException("Index exceeds specified range");
                        }
                        int i12 = i10 + 1;
                        char cCharAt2 = str3.charAt(i10);
                        if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                            i = 0;
                            codePoint = cCharAt2;
                        } else {
                            i = 0;
                            if (cCharAt2 > 56319) {
                                throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i10 + " in '" + ((Object) str3) + "'");
                            }
                            if (i12 == length2) {
                                codePoint = -cCharAt2;
                            } else {
                                char cCharAt3 = str3.charAt(i12);
                                if (!Character.isLowSurrogate(cCharAt3)) {
                                    throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i12 + " in '" + ((Object) str3) + "'");
                                }
                                codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            }
                        }
                        if (codePoint < 0) {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        if (codePoint >= zArr.length || !zArr[codePoint]) {
                            char[] cArr3 = j.c;
                            if (codePoint <= 127) {
                                cArr = new char[3];
                                cArr[i] = '%';
                                cArr[2] = cArr3[codePoint & 15];
                                cArr[1] = cArr3[codePoint >>> 4];
                                i4 = 1;
                                i6 = 2;
                            } else {
                                i4 = 1;
                                i6 = 2;
                                if (codePoint <= 2047) {
                                    char[] cArr4 = new char[6];
                                    cArr4[i] = '%';
                                    cArr4[3] = '%';
                                    cArr4[5] = cArr3[codePoint & 15];
                                    cArr4[4] = cArr3[((codePoint >>> 4) & 3) | 8];
                                    cArr4[2] = cArr3[(codePoint >>> 6) & 15];
                                    cArr4[1] = cArr3[(codePoint >>> 10) | 12];
                                    cArr = cArr4;
                                } else if (codePoint <= 65535) {
                                    cArr = new char[9];
                                    cArr[i] = '%';
                                    cArr[1] = 'E';
                                    cArr[3] = '%';
                                    cArr[6] = '%';
                                    cArr[8] = cArr3[codePoint & 15];
                                    cArr[7] = cArr3[((codePoint >>> 4) & 3) | 8];
                                    cArr[5] = cArr3[(codePoint >>> 6) & 15];
                                    cArr[4] = cArr3[((codePoint >>> 10) & 3) | 8];
                                    cArr[2] = cArr3[codePoint >>> 12];
                                } else {
                                    if (codePoint > 1114111) {
                                        throw new IllegalArgumentException(s.f(codePoint, "Invalid unicode character value "));
                                    }
                                    cArr = new char[12];
                                    cArr[i] = '%';
                                    cArr[1] = 'F';
                                    cArr[3] = '%';
                                    cArr[6] = '%';
                                    cArr[9] = '%';
                                    cArr[11] = cArr3[codePoint & 15];
                                    cArr[10] = cArr3[((codePoint >>> 4) & 3) | 8];
                                    cArr[8] = cArr3[(codePoint >>> 6) & 15];
                                    cArr[7] = cArr3[((codePoint >>> 10) & 3) | 8];
                                    cArr[5] = cArr3[(codePoint >>> 12) & 15];
                                    cArr[4] = cArr3[((codePoint >>> 16) & 3) | 8];
                                    cArr[2] = cArr3[(codePoint >>> 18) & 7];
                                }
                            }
                        } else {
                            i4 = 1;
                            i6 = 2;
                            cArr = null;
                        }
                        int i13 = (Character.isSupplementaryCodePoint(codePoint) ? i6 : i4) + i10;
                        if (cArr != null) {
                            int i14 = i10 - i11;
                            int i15 = length3 + i14;
                            int length4 = cArr.length + i15;
                            if (cArr2.length < length4) {
                                int i16 = (length2 - i10) + length4 + 32;
                                if (i16 < 0) {
                                    throw new AssertionError("Cannot increase internal buffer any further");
                                }
                                char[] cArr5 = new char[i16];
                                if (length3 > 0) {
                                    int i17 = i;
                                    System.arraycopy(cArr2, i17, cArr5, i17, length3);
                                }
                                cArr2 = cArr5;
                            }
                            if (i14 > 0) {
                                str3.getChars(i11, i10, cArr2, length3);
                                length3 = i15;
                            }
                            if (cArr.length > 0) {
                                System.arraycopy(cArr, 0, cArr2, length3, cArr.length);
                                length3 += cArr.length;
                            }
                            i11 = i13;
                        }
                        i10 = i13;
                        while (i10 < length2) {
                            char cCharAt4 = str3.charAt(i10);
                            if (cCharAt4 >= zArr.length || !zArr[cCharAt4]) {
                                break;
                            }
                            i10++;
                        }
                    }
                    int i18 = length2 - i11;
                    if (i18 > 0) {
                        int i19 = i18 + length3;
                        if (cArr2.length < i19) {
                            if (i19 < 0) {
                                throw new AssertionError("Cannot increase internal buffer any further");
                            }
                            char[] cArr6 = new char[i19];
                            if (length3 > 0) {
                                System.arraycopy(cArr2, 0, cArr6, 0, length3);
                            }
                            cArr2 = cArr6;
                        }
                        str3.getChars(i11, length2, cArr2, length3);
                        length3 = i19;
                    }
                    str3 = new String(cArr2, 0, length3);
                } else {
                    i10++;
                }
            }
        } else {
            str3 = null;
        }
        sb2.append(str3);
        return a(str, sb2.toString(), null);
    }
}

package io.split.android.client.network;

import We.s;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.M;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17578b;
    public final Proxy c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17579d;
    public final A0 e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17580g;
    public final long h;
    public final SSLSocketFactory i;
    public final C1916a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f17581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f17582l;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(io.split.android.client.network.e r7, io.split.android.client.network.k r8, long r9, long r11, javax.net.ssl.SSLSocketFactory r13, n3.C1916a r14, com.google.firebase.messaging.r r15) {
        /*
            r6 = this;
            r6.<init>()
            r6.f17579d = r7
            r0 = 0
            if (r7 == 0) goto L18
            java.net.Proxy r1 = new java.net.Proxy
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            java.lang.String r3 = r7.f17583a
            int r4 = r7.f17584b
            java.net.InetSocketAddress r3 = java.net.InetSocketAddress.createUnresolved(r3, r4)
            r1.<init>(r2, r3)
            goto L19
        L18:
            r1 = r0
        L19:
            r6.c = r1
            if (r7 != 0) goto L1f
        L1d:
            r2 = r0
            goto L3c
        L1f:
            java.lang.String r1 = r7.c
            boolean r2 = bg.AbstractC0983W.q(r1)
            if (r2 != 0) goto L1d
            com.paymaya.domain.store.A0 r2 = new com.paymaya.domain.store.A0
            M5.e r3 = new M5.e
            z2.d r4 = new z2.d
            r5 = 23
            r4.<init>(r5)
            java.lang.String r5 = r7.f17585d
            r3.<init>(r1, r5, r4)
            r1 = 13
            r2.<init>(r3, r1)
        L3c:
            r6.e = r2
            r6.f = r8
            r6.f17580g = r9
            r6.h = r11
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r6.f17577a = r8
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r6.f17578b = r8
            r6.i = r13
            r6.j = r14
            r6.f17581k = r15
            if (r7 == 0) goto L61
            if (r13 == 0) goto L61
            com.paymaya.domain.store.M r0 = new com.paymaya.domain.store.M
            r0.<init>()
        L61:
            r6.f17582l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.split.android.client.network.d.<init>(io.split.android.client.network.e, io.split.android.client.network.k, long, long, javax.net.ssl.SSLSocketFactory, n3.a, com.google.firebase.messaging.r):void");
    }

    public static byte[] b(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream == null) {
            return null;
        }
        try {
            if (byteArrayInputStream.markSupported()) {
                byteArrayInputStream.mark(Integer.MAX_VALUE);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = byteArrayInputStream.read(bArr, 0, 4096);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byteArrayOutputStream.flush();
            if (byteArrayInputStream.markSupported()) {
                byteArrayInputStream.reset();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Ri.a.g("Failed to copy input stream: " + e.getMessage());
            return null;
        }
    }

    public final void a(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null || str2 == null) {
                throw new IllegalArgumentException(s.k("Invalid value for header ", str, ": ", str2));
            }
            this.f17577a.put(str, str2);
        }
    }

    public final df.j c(URI uri, int i, String str, HashMap map) {
        HashMap map2 = new HashMap(this.f17577a);
        if (map != null) {
            map2.putAll(map);
        }
        long j = this.h;
        SSLSocketFactory sSLSocketFactory = this.i;
        Proxy proxy = this.c;
        e eVar = this.f17579d;
        A0 a02 = this.e;
        k kVar = this.f;
        long j6 = this.f17580g;
        C1916a c1916a = this.j;
        r rVar = this.f17581k;
        df.j jVar = new df.j();
        Objects.requireNonNull(uri);
        jVar.e = uri;
        if (i == 0) {
            throw null;
        }
        jVar.f16445b = i;
        jVar.f16444a = str;
        Objects.requireNonNull(c1916a);
        jVar.f16447g = c1916a;
        jVar.f = new HashMap(map2);
        jVar.h = proxy;
        jVar.i = eVar;
        jVar.j = a02;
        jVar.f16448k = kVar;
        jVar.c = j6;
        jVar.f16446d = j;
        jVar.f16449l = sSLSocketFactory;
        jVar.m = rVar;
        return jVar;
    }

    public final h d(URI uri) {
        return new h(uri, this.f17578b, this.c, this.e, this.h, this.i, this.j, this.f17581k, this.f17579d, this.f, this.f17582l);
    }
}

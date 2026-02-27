package Og;

import Ng.C0496d;
import Ng.v;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0496d f4800b;
    public final byte[] c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(java.lang.String r5, Ng.C0496d r6) throws java.nio.charset.CharacterCodingException {
        /*
            r4 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.j.g(r5, r0)
            java.lang.String r0 = "contentType"
            kotlin.jvm.internal.j.g(r6, r0)
            r4.<init>()
            r4.f4799a = r5
            r4.f4800b = r6
            java.nio.charset.Charset r6 = M8.T2.b(r6)
            if (r6 != 0) goto L19
            java.nio.charset.Charset r6 = zj.C2581c.f21468b
        L19:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.g(r5, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.j.g(r6, r0)
            java.nio.charset.Charset r0 = zj.C2581c.f21468b
            boolean r1 = r6.equals(r0)
            r2 = 0
            if (r1 == 0) goto L7f
            int r6 = r5.length()
            cj.c$a r1 = cj.AbstractC1117c.Companion
            int r3 = r5.length()
            r1.getClass()
            cj.AbstractC1117c.a.a(r2, r6, r3)
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CharsetEncoder r0 = r0.onUnmappableCharacter(r1)
            java.nio.CharBuffer r5 = java.nio.CharBuffer.wrap(r5, r2, r6)
            java.nio.ByteBuffer r5 = r0.encode(r5)
            boolean r6 = r5.hasArray()
            if (r6 == 0) goto L74
            int r6 = r5.arrayOffset()
            if (r6 != 0) goto L74
            int r6 = r5.remaining()
            byte[] r0 = r5.array()
            kotlin.jvm.internal.j.d(r0)
            int r0 = r0.length
            if (r6 != r0) goto L74
            byte[] r5 = r5.array()
            kotlin.jvm.internal.j.d(r5)
            goto L8b
        L74:
            int r6 = r5.remaining()
            byte[] r6 = new byte[r6]
            r5.get(r6)
            r5 = r6
            goto L8b
        L7f:
            java.nio.charset.CharsetEncoder r6 = r6.newEncoder()
            int r0 = r5.length()
            byte[] r5 = M8.A0.k(r6, r5, r2, r0)
        L8b:
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Og.i.<init>(java.lang.String, Ng.d):void");
    }

    @Override // Og.f
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // Og.f
    public final C0496d b() {
        return this.f4800b;
    }

    @Override // Og.f
    public final v d() {
        return null;
    }

    @Override // Og.d
    public final byte[] e() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.f4800b + "] \"" + C2578C.e0(30, this.f4799a) + '\"';
    }
}

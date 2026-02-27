package hf;

import df.InterfaceC1361c;

/* JADX INFO: renamed from: hf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1563a implements InterfaceC1361c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17032b;

    public /* synthetic */ C1563a(Object obj, int i) {
        this.f17031a = i;
        this.f17032b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.io.IOException r3, gf.k r4, boolean r5, df.C1365g r6) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f17032b
            df.f r0 = (df.C1364f) r0
            boolean r0 = r0.f16434t
            r1 = 0
            if (r0 != 0) goto La
            goto L49
        La:
            if (r5 == 0) goto L13
            df.i r6 = r6.f16441d
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L13
            return r1
        L13:
            boolean r6 = r3 instanceof java.net.ProtocolException
            if (r6 == 0) goto L18
            return r1
        L18:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L23
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L49
            if (r5 != 0) goto L49
            goto L35
        L23:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L30
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L30
            goto L49
        L30:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L35
            return r1
        L35:
            gf.d r3 = r4.h
            gf.f r5 = r3.c
            monitor-enter(r5)
            boolean r3 = r3.h     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L49
            gf.d r3 = r4.h
            boolean r3 = r3.c()
            if (r3 == 0) goto L49
            r3 = 1
            return r3
        L49:
            return r1
        L4a:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.C1563a.a(java.io.IOException, gf.k, boolean, df.g):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [gf.d, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [nf.c] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [df.r] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [hf.a] */
    /* JADX WARN: Type inference failed for: r2v7, types: [hf.b] */
    /* JADX WARN: Type inference failed for: r4v12, types: [gf.k] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // df.InterfaceC1361c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final df.k intercept(df.InterfaceC1360b r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.C1563a.intercept(df.b):df.k");
    }
}

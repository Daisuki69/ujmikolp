package gf;

import df.C1356B;
import df.C1357C;
import df.n;
import java.net.SocketException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16810b;
    public final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mg.c f16811d;
    public g e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f16812g;
    public boolean h;
    public C1357C i;

    public d(k kVar, f fVar, n nVar, C1356B c1356b, mg.c cVar) {
        this.f16809a = kVar;
        this.c = fVar;
        this.f16810b = nVar;
        this.f16811d = cVar;
        this.f = new h(nVar, fVar.e, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cb, code lost:
    
        throw new java.net.SocketException(androidx.camera.core.impl.a.d(r10, "No route to ", r11, com.dynatrace.android.agent.Global.COLON, "; port is out of range"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f6, code lost:
    
        if (r4.isEmpty() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f8, code lost:
    
        r4.addAll(r2.f16831g);
        r2.f16831g.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0202, code lost:
    
        r17.e = new gf.g(r4);
        r0 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gf.e a(int r18, int r19, int r20, boolean r21) throws java.net.SocketException, java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d.a(int, int, int, boolean):gf.e");
    }

    public final e b(int i, boolean z4, boolean z5, int i4, int i6) throws SocketException, UnknownHostException {
        while (true) {
            e eVarA = a(i, i4, i6, z4);
            synchronized (this.c) {
                try {
                    if (eVarA.m == 0) {
                        if (!(eVarA.h != null)) {
                            return eVarA;
                        }
                    }
                    if (eVarA.j(z5)) {
                        return eVarA;
                    }
                    eVarA.k();
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x000c, B:12:0x0012, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:28:0x0042, B:22:0x0030, B:24:0x0038), top: B:32:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r5 = this;
            gf.f r0 = r5.c
            monitor-enter(r0)
            df.C r1 = r5.i     // Catch: java.lang.Throwable -> La
            r2 = 1
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r1 = move-exception
            goto L44
        Lc:
            boolean r1 = r5.d()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L1c
            gf.k r1 = r5.f16809a     // Catch: java.lang.Throwable -> La
            gf.e r1 = r1.i     // Catch: java.lang.Throwable -> La
            df.C r1 = r1.c     // Catch: java.lang.Throwable -> La
            r5.i = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L1c:
            gf.g r1 = r5.e     // Catch: java.lang.Throwable -> La
            r3 = 0
            if (r1 == 0) goto L30
            int r4 = r1.f16827b     // Catch: java.lang.Throwable -> La
            java.util.ArrayList r1 = r1.f16826a     // Catch: java.lang.Throwable -> La
            int r1 = r1.size()     // Catch: java.lang.Throwable -> La
            if (r4 >= r1) goto L2d
            r1 = r2
            goto L2e
        L2d:
            r1 = r3
        L2e:
            if (r1 != 0) goto L42
        L30:
            gf.h r1 = r5.f     // Catch: java.lang.Throwable -> La
            boolean r4 = r1.a()     // Catch: java.lang.Throwable -> La
            if (r4 != 0) goto L42
            java.util.ArrayList r1 = r1.f16831g     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d.c():boolean");
    }

    public final boolean d() {
        e eVar = this.f16809a.i;
        return eVar != null && eVar.f16817l == 0 && ef.c.j(eVar.c.f16395a.f16458a, this.f16810b.f16458a);
    }

    public final void e() {
        synchronized (this.c) {
            this.h = true;
        }
    }
}

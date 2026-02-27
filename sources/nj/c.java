package nj;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18736b;
    public File[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18737d;
    public boolean e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.j.g(rootDir, "rootDir");
        this.f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // nj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File a() {
        /*
            r11 = this;
            boolean r0 = r11.e
            r1 = 0
            r2 = 1
            nj.f r3 = r11.f
            java.io.File r4 = r11.f18742a
            if (r0 != 0) goto L40
            java.io.File[] r0 = r11.c
            if (r0 != 0) goto L40
            nj.h r0 = r3.f18741d
            kotlin.jvm.functions.Function1 r0 = r0.c
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L21
            goto L65
        L21:
            java.io.File[] r0 = r4.listFiles()
            r11.c = r0
            if (r0 != 0) goto L40
            nj.h r0 = r3.f18741d
            kotlin.jvm.functions.Function2 r0 = r0.e
            if (r0 == 0) goto L3e
            kotlin.io.AccessDeniedException r5 = new kotlin.io.AccessDeniedException
            r7 = 0
            java.lang.String r8 = "Cannot list files in a directory"
            java.io.File r6 = r11.f18742a
            r9 = 2
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.invoke(r4, r5)
        L3e:
            r11.e = r2
        L40:
            java.io.File[] r0 = r11.c
            if (r0 == 0) goto L55
            int r5 = r11.f18737d
            int r6 = r0.length
            if (r5 >= r6) goto L55
            kotlin.jvm.internal.j.d(r0)
            int r1 = r11.f18737d
            int r2 = r1 + 1
            r11.f18737d = r2
            r0 = r0[r1]
            return r0
        L55:
            boolean r0 = r11.f18736b
            if (r0 != 0) goto L5c
            r11.f18736b = r2
            return r4
        L5c:
            nj.h r0 = r3.f18741d
            kotlin.jvm.functions.Function1 r0 = r0.f18745d
            if (r0 == 0) goto L65
            r0.invoke(r4)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.c.a():java.io.File");
    }
}

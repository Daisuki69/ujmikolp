package Qg;

import com.google.gson.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5378a;

    public f(j jVar) {
        this.f5378a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Qg.f r4, Ej.InterfaceC0230h r5, java.io.OutputStreamWriter r6, ij.AbstractC1609c r7) throws java.io.IOException {
        /*
            boolean r0 = r7 instanceof Qg.e
            if (r0 == 0) goto L13
            r0 = r7
            Qg.e r0 = (Qg.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Qg.e r0 = new Qg.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5377b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.io.Writer r6 = r0.f5376a
            bj.AbstractC1039j.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            bj.AbstractC1039j.b(r7)
            r7 = 91
            r6.write(r7)
            Qg.d r7 = new Qg.d
            r7.<init>(r6, r4)
            r0.f5376a = r6
            r0.e = r3
            java.lang.Object r4 = r5.collect(r7, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            r4 = 93
            r6.write(r4)
            r6.flush()
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qg.f.a(Qg.f, Ej.h, java.io.OutputStreamWriter, ij.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.charset.Charset r11, Wg.a r12, io.ktor.utils.io.n r13, ij.AbstractC1609c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof Qg.a
            if (r0 == 0) goto L13
            r0 = r14
            Qg.a r0 = (Qg.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Qg.a r0 = new Qg.a
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f5368a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            bj.AbstractC1039j.b(r14)     // Catch: com.google.gson.JsonSyntaxException -> L27
            return r14
        L27:
            r0 = move-exception
            r11 = r0
            goto L5e
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            bj.AbstractC1039j.b(r14)
            kotlin.jvm.internal.e r14 = r12.f6433a
            com.google.gson.j r2 = r10.f5378a
            java.lang.Class r14 = X5.f.n(r14)
            r4 = 0
            com.google.gson.internal.Excluder r2 = r2.f
            boolean r14 = r2.c(r14, r4)
            if (r14 != 0) goto L7b
            Ij.e r14 = Bj.U.f603a     // Catch: com.google.gson.JsonSyntaxException -> L27
            Ij.d r14 = Ij.d.f2362a     // Catch: com.google.gson.JsonSyntaxException -> L27
            Qg.b r4 = new Qg.b     // Catch: com.google.gson.JsonSyntaxException -> L27
            r9 = 0
            r7 = r10
            r6 = r11
            r8 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: com.google.gson.JsonSyntaxException -> L27
            r0.c = r3     // Catch: com.google.gson.JsonSyntaxException -> L27
            java.lang.Object r11 = Bj.H.C(r4, r14, r0)     // Catch: com.google.gson.JsonSyntaxException -> L27
            if (r11 != r1) goto L5d
            return r1
        L5d:
            return r11
        L5e:
            io.ktor.serialization.JsonConvertException r12 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Illegal json parameter found: "
            r13.<init>(r14)
            java.lang.String r14 = r11.getMessage()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "message"
            kotlin.jvm.internal.j.g(r13, r14)
            r12.<init>(r13, r11)
            throw r12
        L7b:
            r8 = r12
            io.ktor.serialization.gson.ExcludedTypeGsonException r11 = new io.ktor.serialization.gson.ExcludedTypeGsonException
            kotlin.jvm.internal.e r12 = r8.f6433a
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Qg.f.b(java.nio.charset.Charset, Wg.a, io.ktor.utils.io.n, ij.c):java.lang.Object");
    }
}

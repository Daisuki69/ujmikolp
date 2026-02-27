package Ag;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import io.ktor.utils.io.D;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.w;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Closeable f303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoroutineContext f304b;
    public Jg.d c;
    public BufferedSource e;
    public w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f305g;
    public /* synthetic */ Object h;
    public final /* synthetic */ BufferedSource i;
    public final /* synthetic */ CoroutineContext j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Jg.d f306k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BufferedSource bufferedSource, CoroutineContext coroutineContext, Jg.d dVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.i = bufferedSource;
        this.j = coroutineContext;
        this.f306k = dVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        o oVar = new o(this.i, this.j, this.f306k, interfaceC1526a);
        oVar.h = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((D) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r12.c(r11) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a2 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r11.f305g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.w r1 = r11.f
            okio.BufferedSource r4 = r11.e
            Jg.d r5 = r11.c
            kotlin.coroutines.CoroutineContext r6 = r11.f304b
            java.io.Closeable r7 = r11.f303a
            java.lang.Object r8 = r11.h
            io.ktor.utils.io.D r8 = (io.ktor.utils.io.D) r8
            bj.AbstractC1039j.b(r12)     // Catch: java.lang.Throwable -> L25
        L1d:
            r12 = r5
            r5 = r1
            r1 = r7
            r7 = r12
            r12 = r8
            r8 = r6
            r6 = r4
            goto L5a
        L25:
            r0 = move-exception
            r12 = r0
            goto Lb7
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.jvm.internal.w r1 = r11.f
            okio.BufferedSource r4 = r11.e
            Jg.d r5 = r11.c
            kotlin.coroutines.CoroutineContext r6 = r11.f304b
            java.io.Closeable r7 = r11.f303a
            java.lang.Object r8 = r11.h
            io.ktor.utils.io.D r8 = (io.ktor.utils.io.D) r8
            bj.AbstractC1039j.b(r12)     // Catch: java.lang.Throwable -> L25
            goto L8e
        L43:
            bj.AbstractC1039j.b(r12)
            java.lang.Object r12 = r11.h
            io.ktor.utils.io.D r12 = (io.ktor.utils.io.D) r12
            okio.BufferedSource r7 = r11.i
            kotlin.jvm.internal.w r1 = new kotlin.jvm.internal.w     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            kotlin.coroutines.CoroutineContext r4 = r11.j
            Jg.d r5 = r11.f306k
            r8 = r4
            r6 = r7
            r7 = r5
            r5 = r1
            r1 = r6
        L5a:
            boolean r4 = r6.isOpen()     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto Laa
            boolean r4 = Bj.H.u(r8)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto Laa
            int r4 = r5.f18193a     // Catch: java.lang.Throwable -> La7
            if (r4 < 0) goto Laa
            io.ktor.utils.io.w r10 = r12.f17517a     // Catch: java.lang.Throwable -> La7
            Ag.n r4 = new Ag.n     // Catch: java.lang.Throwable -> La7
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La7
            r11.h = r12     // Catch: java.lang.Throwable -> La7
            r11.f303a = r1     // Catch: java.lang.Throwable -> La7
            r11.f304b = r8     // Catch: java.lang.Throwable -> La7
            r11.c = r7     // Catch: java.lang.Throwable -> La7
            r11.e = r6     // Catch: java.lang.Throwable -> La7
            r11.f = r5     // Catch: java.lang.Throwable -> La7
            r11.f305g = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r4 = S1.s.v(r10, r4, r11)     // Catch: java.lang.Throwable -> La7
            if (r4 != r0) goto L87
            goto La4
        L87:
            r4 = r7
            r7 = r1
            r1 = r5
            r5 = r4
            r4 = r6
            r6 = r8
            r8 = r12
        L8e:
            io.ktor.utils.io.w r12 = r8.f17517a     // Catch: java.lang.Throwable -> L25
            r11.h = r8     // Catch: java.lang.Throwable -> L25
            r11.f303a = r7     // Catch: java.lang.Throwable -> L25
            r11.f304b = r6     // Catch: java.lang.Throwable -> L25
            r11.c = r5     // Catch: java.lang.Throwable -> L25
            r11.e = r4     // Catch: java.lang.Throwable -> L25
            r11.f = r1     // Catch: java.lang.Throwable -> L25
            r11.f305g = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r12 = r12.c(r11)     // Catch: java.lang.Throwable -> L25
            if (r12 != r0) goto L1d
        La4:
            return r0
        La5:
            r7 = r1
            goto Lb7
        La7:
            r0 = move-exception
            r12 = r0
            goto La5
        Laa:
            kotlin.Unit r12 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto Lb5
            r1.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb5
        Lb2:
            r0 = move-exception
            r12 = r0
            goto Lc1
        Lb5:
            r12 = 0
            goto Lc1
        Lb7:
            if (r7 == 0) goto Lc1
            r7.close()     // Catch: java.lang.Throwable -> Lbd
            goto Lc1
        Lbd:
            r0 = move-exception
            bj.C1030a.a(r12, r0)
        Lc1:
            if (r12 != 0) goto Lc6
            kotlin.Unit r12 = kotlin.Unit.f18162a
            return r12
        Lc6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ag.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

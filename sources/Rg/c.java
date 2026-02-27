package Rg;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import io.ktor.utils.io.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f5527b;
    public w c;
    public io.ktor.utils.io.n e;
    public Mj.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5528g;
    public final /* synthetic */ io.ktor.utils.io.n h;
    public final /* synthetic */ io.ktor.utils.io.k i;
    public final /* synthetic */ io.ktor.utils.io.k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(io.ktor.utils.io.n nVar, io.ktor.utils.io.k kVar, io.ktor.utils.io.k kVar2, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.h = nVar;
        this.i = kVar;
        this.j = kVar2;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new c(this.h, this.i, this.j, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:87|36|85|37|(3:40|41|(7:44|49|50|26|(2:28|30)|57|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r6 = r2;
        r1 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
    
        if (r2.g(r10) != r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if (r2.g(r10) != r0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:50:0x00e3, B:26:0x006b, B:28:0x0071, B:30:0x0077, B:32:0x007d, B:35:0x0094, B:55:0x00ea, B:56:0x00ed, B:57:0x00ee, B:65:0x0112, B:21:0x0061, B:49:0x00e1, B:36:0x0097, B:48:0x00d8, B:53:0x00e8), top: B:84:0x000b, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:50:0x00e3, B:26:0x006b, B:28:0x0071, B:30:0x0077, B:32:0x007d, B:35:0x0094, B:55:0x00ea, B:56:0x00ed, B:57:0x00ee, B:65:0x0112, B:21:0x0061, B:49:0x00e1, B:36:0x0097, B:48:0x00d8, B:53:0x00e8), top: B:84:0x000b, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d0 -> B:49:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d8 -> B:49:0x00e1). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rg.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

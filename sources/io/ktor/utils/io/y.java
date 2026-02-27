package io.ktor.utils.io;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17559b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC1616j e;
    public final /* synthetic */ k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Function2 function2, k kVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.e = (AbstractC1616j) function2;
        this.f = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        y yVar = new y(this.e, this.f, interfaceC1526a);
        yVar.c = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:30:0x0093, B:32:0x00a1), top: B:69:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:12:0x002c, B:52:0x0103, B:49:0x00f5, B:15:0x003a, B:42:0x00d2, B:39:0x00c4), top: B:73:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Bj.n0] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r9v22, types: [ij.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v24 */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

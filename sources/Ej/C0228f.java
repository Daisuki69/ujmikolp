package Ej;

import ij.AbstractC1616j;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ej.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0228f implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1445a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1446b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1447d;

    public C0228f(C0229g c0229g, kotlin.jvm.internal.y yVar, InterfaceC0231i interfaceC0231i) {
        this.c = c0229g;
        this.f1447d = yVar;
        this.f1446b = interfaceC0231i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Type inference failed for: r8v14, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // Ej.InterfaceC0231i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, gj.InterfaceC1526a r8) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ej.C0228f.emit(java.lang.Object, gj.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0228f(kotlin.jvm.internal.u uVar, InterfaceC0231i interfaceC0231i, Function2 function2) {
        this.c = uVar;
        this.f1446b = interfaceC0231i;
        this.f1447d = (AbstractC1616j) function2;
    }

    public C0228f(InterfaceC0231i interfaceC0231i, CoroutineContext coroutineContext) {
        this.c = coroutineContext;
        this.f1447d = Gj.v.b(coroutineContext);
        this.f1446b = new Fj.C(interfaceC0231i, null);
    }
}

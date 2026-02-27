package b3;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b3.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876P extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0903x f8400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0878S f8401b;
    public C0874N c;
    public U1.g e;
    public C0872L f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e3.m f8402g;
    public int h;
    public final /* synthetic */ C0878S i;
    public final /* synthetic */ C0872L j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876P(C0878S c0878s, C0872L c0872l, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.i = c0878s;
        this.j = c0872l;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0876P(this.i, this.j, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0876P) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0876P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

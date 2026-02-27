package H4;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f2132b;
    public G4.a c;
    public boolean e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2133g;
    public /* synthetic */ Object h;
    public final /* synthetic */ m i;
    public final /* synthetic */ String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G4.a f2135l;
    public final /* synthetic */ boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2136n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, String str2, G4.a aVar, boolean z4, long j, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.i = mVar;
        this.j = str;
        this.f2134k = str2;
        this.f2135l = aVar;
        this.m = z4;
        this.f2136n = j;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        l lVar = new l(this.i, this.j, this.f2134k, this.f2135l, this.m, this.f2136n, interfaceC1526a);
        lVar.h = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

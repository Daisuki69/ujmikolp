package H4;

import Bj.E;
import M8.T2;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Kj.d f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f2108b;
    public F4.a c;
    public e e;
    public T2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2109g;
    public final /* synthetic */ Kj.d h;
    public final /* synthetic */ e i;
    public final /* synthetic */ HashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F4.a f2110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T2 f2111l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Kj.d dVar, e eVar, HashMap map, F4.a aVar, T2 t22, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.h = dVar;
        this.i = eVar;
        this.j = map;
        this.f2110k = aVar;
        this.f2111l = t22;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        T2 t22 = this.f2111l;
        return new d(this.h, this.i, this.j, this.f2110k, t22, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[LOOP:1: B:29:0x00a7->B:31:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

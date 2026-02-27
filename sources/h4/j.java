package H4;

import Bj.E;
import android.util.Base64;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f2128b;
    public final /* synthetic */ String c;
    public final /* synthetic */ m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(byte[] bArr, String str, m mVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f2128b = bArr;
        this.c = str;
        this.e = mVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        j jVar = new j(this.f2128b, this.c, this.e, interfaceC1526a);
        jVar.f2127a = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        byte[] bArr = this.f2128b;
        String str = this.c;
        m mVar = this.e;
        try {
            C1037h.a aVar = C1037h.f9166b;
            kotlin.jvm.internal.j.g(str, "<this>");
            byte[] bArrDecode = Base64.decode(str, 2);
            kotlin.jvm.internal.j.f(bArrDecode, "decode(this, android.util.Base64.NO_WRAP)");
            objA = Xh.i.n(bArr, mVar.f2137a, bArrDecode);
            if (objA == null) {
                throw new Exception("Encryption error! Aborting extraction.");
            }
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            return null;
        }
        return objA;
    }
}

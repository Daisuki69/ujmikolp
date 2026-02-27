package N4;

import Bj.E;
import G6.u;
import K4.y;
import M8.A0;
import O4.h;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.M;
import com.maya.raven.data.DeviceExtract;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.HashMap;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3525b;
    public final /* synthetic */ G4.a c;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(G4.a aVar, String str, byte[] bArr, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        Gj.c cVar = c.f3526a;
        this.c = aVar;
        this.e = str;
        this.f = bArr;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        byte[] bArr = this.f;
        G4.a aVar = this.c;
        Gj.c cVar = c.f3526a;
        b bVar = new b(aVar, this.e, bArr, interfaceC1526a);
        bVar.f3525b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        G4.a aVar;
        h hVar;
        y yVar;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f3524a;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                K4.E e = new K4.E(true);
                G4.a aVar2 = this.c;
                aVar2.a(e);
                Gj.c cVar = c.f3526a;
                String strC = z.a(c.class).c();
                if (strC == null) {
                    strC = "DataUploader";
                }
                A0.v("upload request", strC);
                String str = this.e;
                byte[] bArr = this.f;
                C1037h.a aVar3 = C1037h.f9166b;
                u uVar = c.f3527b;
                HashMap mapG = M.g(new Pair("x-idempotency-key", UUID.randomUUID().toString()), new Pair("xx-security-context", str), new Pair("xx-proto-version", "12"));
                this.f3525b = aVar2;
                this.f3524a = 1;
                obj = uVar.e(mapG, bArr, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
                aVar = aVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (G4.a) this.f3525b;
                AbstractC1039j.b(obj);
            }
            hVar = (h) obj;
            aVar.a(new K4.E(false));
        } catch (Throwable th2) {
            C1037h.a aVar4 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (hVar instanceof O4.g) {
            objA = ((DeviceExtract) ((O4.g) hVar).f4646a).getDcrn();
            C1037h.a aVar5 = C1037h.f9166b;
            return new C1037h(objA);
        }
        if (!(hVar instanceof O4.f)) {
            throw new NoWhenBranchMatchedException();
        }
        O4.f fVar = (O4.f) hVar;
        j.g(fVar, "<this>");
        throw c.a((!(fVar instanceof O4.b) || (yVar = ((O4.b) fVar).f4642b) == null) ? null : yVar.a(), "Upload error! Aborting extraction.");
    }
}

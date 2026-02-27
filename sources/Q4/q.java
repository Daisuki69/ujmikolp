package Q4;

import M8.A0;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5252a = rVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new q(this.f5252a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        r rVar = this.f5252a;
        rVar.getClass();
        ArrayList arrayList = rVar.c;
        try {
            C1037h.a aVar = C1037h.f9166b;
            File[] fileArrListFiles = new File("/system/fonts").listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    kotlin.jvm.internal.j.f(name, "it.name");
                    arrayList.add(name);
                }
            }
            objA = Unit.f18162a;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(r.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = rVar.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
        G4.b bVar2 = rVar.f1548b;
        if (bVar2 != null) {
            bVar2.b(new K4.o(arrayList));
        }
        return Unit.f18162a;
    }
}

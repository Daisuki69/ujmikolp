package Q4;

import M8.A0;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import com.paymaya.PayMayaApplication;
import defpackage.CollectorDetails;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Q4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0569m extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0570n f5247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0569m(C0570n c0570n, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5247a = c0570n;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0569m(this.f5247a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0569m) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        C0570n c0570n = this.f5247a;
        String str = c0570n.f5248d;
        String strQ = E1.c.q(new Long(new Date().getTime()));
        PayMayaApplication payMayaApplication = c0570n.c;
        String string = payMayaApplication.getResources().getConfiguration().toString();
        PackageManager packageManager = payMayaApplication.getPackageManager();
        String packageName = payMayaApplication.getPackageName();
        ArrayList arrayList = new ArrayList();
        try {
            C1037h.a aVar = C1037h.f9166b;
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 4096);
            int length = packageInfo.requestedPermissions.length;
            for (int i = 0; i < length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    String str2 = packageInfo.requestedPermissions[i];
                    kotlin.jvm.internal.j.f(str2, "pi.requestedPermissions[i]");
                    arrayList.add(str2);
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
            String strC = kotlin.jvm.internal.z.a(C0570n.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = c0570n.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
        CollectorDetails collectorDetails = new CollectorDetails(str, null, c0570n.e, c0570n.f, strQ, string, arrayList, "android", c0570n.f5249g, payMayaApplication.getPackageName(), c0570n.h, null, 2048, null);
        G4.b bVar2 = c0570n.f1548b;
        if (bVar2 != null) {
            bVar2.b(new K4.m(collectorDetails));
        }
        return Unit.f18162a;
    }
}

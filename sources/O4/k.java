package O4;

import Bj.C0151l;
import Ng.n;
import ag.C0696f;
import ag.C0699i;
import ag.C0703m;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import bg.C0959D0;
import bg.C0964G;
import bg.C0965G0;
import bg.C0984X;
import bg.C1002h0;
import bg.C1011o;
import bg.C1014r;
import bg.m0;
import bg.n0;
import bg.s0;
import bj.InterfaceC1033d;
import cj.C1129o;
import cj.t;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i) {
        super(1);
        this.f4651a = i;
        this.f4652b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SensorManager sensorManager;
        Object obj2 = this.f4652b;
        switch (this.f4651a) {
            case 0:
                n headers = (n) obj;
                kotlin.jvm.internal.j.g(headers, "$this$headers");
                for (Map.Entry entry : ((HashMap) obj2).entrySet()) {
                    headers.j((String) entry.getKey(), (String) entry.getValue());
                }
                return Unit.f18162a;
            case 1:
                Location location = (Location) obj;
                ((C0151l) obj2).A(R4.c.f5458a, location != null ? new defpackage.Location(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider()), null, 8, null) : null);
                return Unit.f18162a;
            case 2:
                ((CancellationTokenSource) obj2).cancel();
                return Unit.f18162a;
            case 3:
                C0699i c0699i = (C0699i) obj;
                int i = Build.VERSION.SDK_INT;
                PackageManager packageManager = ((C0696f) obj2).f7205d;
                if (i < 30) {
                    if (c0699i == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    return packageManager.getInstallerPackageName(c0699i.f7208b.packageName);
                }
                if (c0699i == null) {
                    kotlin.jvm.internal.j.l();
                }
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(c0699i.f7208b.packageName);
                kotlin.jvm.internal.j.c(installSourceInfo, "_packageManager.getInsta….packageInfo.packageName)");
                return installSourceInfo.getInstallingPackageName();
            case 4:
                m0 event = (m0) obj;
                kotlin.jvm.internal.j.h(event, "event");
                C0964G c0964g = (C0964G) obj2;
                int size = c0964g.c.size();
                ArrayList arrayList = c0964g.c;
                if (size >= 2) {
                    arrayList.remove(1);
                }
                arrayList.add(new C1014r(System.currentTimeMillis(), event, c0964g.f8806g));
                return Unit.f18162a;
            case 5:
                Exception it = (Exception) obj;
                kotlin.jvm.internal.j.h(it, "it");
                C0965G0 c0965g0 = (C0965G0) obj2;
                if (c0965g0 != null) {
                    c0965g0.b("Core", it, null);
                }
                return Unit.f18162a;
            case 6:
                return ((C0984X) obj2).c.b((String) obj);
            case 7:
                return ((C1002h0) obj2).c.b((String) obj);
            case 8:
                String str = (String) obj;
                s0 s0Var = (s0) obj2;
                if (!C1129o.p(s0Var.c.a(), str)) {
                    return String.valueOf(-1);
                }
                n0 n0Var = s0Var.c;
                if (str == null) {
                    kotlin.jvm.internal.j.l();
                }
                return n0Var.b(str) ? String.valueOf(1) : String.valueOf(0);
            default:
                List<C0703m> filteredConfigurations = (List) obj;
                kotlin.jvm.internal.j.h(filteredConfigurations, "filteredConfigurations");
                ArrayList arrayList2 = new ArrayList(t.l(filteredConfigurations, 10));
                for (C0703m c0703m : filteredConfigurations) {
                    Xf.a aVarA = c0703m.a();
                    if (aVarA == null) {
                        throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IBackgroundExtractor");
                    }
                    C0964G c0964g2 = (C0964G) aVarA;
                    C1011o c1011o = c0964g2.f8804b;
                    if (c1011o != null) {
                        try {
                            SensorManager sensorManager2 = (SensorManager) c1011o.f9102a.getValue();
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(c1011o);
                            }
                        } catch (Exception e) {
                            C0965G0 c0965g02 = c1011o.c;
                            if (c0965g02 != null) {
                                c0965g02.b("Core", e, null);
                            }
                        }
                    }
                    k kVar = c0964g2.h;
                    C0965G0 c0965g03 = c0964g2.f;
                    Context context = c0964g2.f8805d;
                    int i4 = c0964g2.f8806g;
                    C1011o c1011o2 = new C1011o(context, i4, kVar, c0965g03);
                    c0964g2.f8804b = c1011o2;
                    InterfaceC1033d interfaceC1033d = c1011o2.f9102a;
                    try {
                        SensorManager sensorManager3 = (SensorManager) interfaceC1033d.getValue();
                        Sensor defaultSensor = sensorManager3 != null ? sensorManager3.getDefaultSensor(i4) : null;
                        if (defaultSensor != null && (sensorManager = (SensorManager) interfaceC1033d.getValue()) != null) {
                            sensorManager.registerListener(c1011o2, defaultSensor, 3);
                        }
                    } catch (Exception e7) {
                        C0965G0 c0965g04 = c1011o2.c;
                        if (c0965g04 != null) {
                            c0965g04.b("Core", e7, null);
                            Unit unit = Unit.f18162a;
                        }
                    }
                    arrayList2.add(new C0959D0(c0703m, System.currentTimeMillis()));
                }
                ((y) obj2).f18195a = arrayList2;
                return Unit.f18162a;
        }
    }
}

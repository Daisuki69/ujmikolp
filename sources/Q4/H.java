package Q4;

import M8.A0;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f5227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5227a = i;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new H(this.f5227a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        List<Sensor> sensorList;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        I i = this.f5227a;
        i.getClass();
        ArrayList arrayList = i.f5228d;
        try {
            C1037h.a aVar = C1037h.f9166b;
            Object systemService = i.c.getSystemService("sensor");
            ArrayList<Sensor> arrayList2 = null;
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : sensorList) {
                    if (((Sensor) obj2).getPower() > 0.0f) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (Sensor sensor : arrayList2) {
                    if (!arrayList.add(new defpackage.Sensor(sensor.getName(), String.valueOf(sensor.getMinDelay()), null, sensor.getVendor(), null, 20, null))) {
                        break;
                    }
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
            String strC = kotlin.jvm.internal.z.a(I.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = i.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
        G4.b bVar2 = i.f1548b;
        if (bVar2 != null) {
            bVar2.b(new K4.v(arrayList));
        }
        return Unit.f18162a;
    }
}

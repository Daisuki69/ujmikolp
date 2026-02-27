package Q4;

import M8.A0;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.os.Build;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import cj.C1132s;
import defpackage.Bluetooth;
import defpackage.BondedBluetoothDevice;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Q4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0559c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0560d f5236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0559c(C0560d c0560d, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5236a = c0560d;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0559c(this.f5236a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0559c) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        ArrayList arrayListD = Build.VERSION.SDK_INT >= 31 ? C1132s.d("android.permission.BLUETOOTH", "android.permission.BLUETOOTH_CONNECT") : C1132s.d("android.permission.BLUETOOTH");
        C0560d c0560d = this.f5236a;
        if (c0560d.d(arrayListD, false)) {
            try {
                C1037h.a aVar = C1037h.f9166b;
                Object systemService = c0560d.c.getSystemService("bluetooth");
                BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                if (adapter == null) {
                    String strC = kotlin.jvm.internal.z.a(C0560d.class).c();
                    if (strC == null) {
                        strC = "BluetoothRepository";
                    }
                    A0.w(2, "Bluetooth is not supported on this device", strC);
                } else {
                    String name = adapter.getName();
                    Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
                    c0560d.f5237d = new Bluetooth(name, adapter.getAddress(), null, null, 12, null);
                    ArrayList arrayList = new ArrayList();
                    if (bondedDevices != null) {
                        for (BluetoothDevice bluetoothDevice : bondedDevices) {
                            arrayList.add(new BondedBluetoothDevice(bluetoothDevice.getName(), bluetoothDevice.getAddress(), null, 4, null));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Bluetooth bluetooth = c0560d.f5237d;
                        c0560d.f5237d = bluetooth != null ? Bluetooth.copy$default(bluetooth, null, null, arrayList, null, 11, null) : null;
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
                String strC2 = kotlin.jvm.internal.z.a(C0560d.class).c();
                if (strC2 == null) {
                    strC2 = "CoroutineScopedExtractor";
                }
                A0.w(2, strB, strC2);
                G4.b bVar = c0560d.f1548b;
                if (bVar != null) {
                    bVar.a(thA);
                }
            }
        }
        G4.b bVar2 = c0560d.f1548b;
        if (bVar2 != null) {
            bVar2.b(new K4.i(c0560d.f5237d));
        }
        return Unit.f18162a;
    }
}

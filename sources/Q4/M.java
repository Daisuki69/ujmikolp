package Q4;

import M8.A0;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f5232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n7, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5232a = n7;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new M(this.f5232a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        List<WifiConfiguration> configuredNetworks;
        Object objA2;
        List networkSuggestions;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        N n7 = this.f5232a;
        WifiManager wifiManager = (WifiManager) n7.c.getApplicationContext().getSystemService("wifi");
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                C1037h.a aVar = C1037h.f9166b;
                if (wifiManager != null && (networkSuggestions = wifiManager.getNetworkSuggestions()) != null) {
                    Iterator it = networkSuggestions.iterator();
                    while (it.hasNext()) {
                        String ssid = E.f(it.next()).getSsid();
                        if (ssid != null) {
                            N.e(n7, ssid);
                        }
                    }
                }
                objA2 = Unit.f18162a;
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA2 = AbstractC1039j.a(th2);
            }
            Throwable thA = C1037h.a(objA2);
            if (thA != null) {
                String strB = C1030a.b(thA);
                String strC = kotlin.jvm.internal.z.a(N.class).c();
                A0.w(2, strB, strC != null ? strC : "CoroutineScopedExtractor");
                G4.b bVar = n7.f1548b;
                if (bVar != null) {
                    bVar.a(thA);
                }
            }
        } else {
            try {
                C1037h.a aVar3 = C1037h.f9166b;
                if (wifiManager != null && (configuredNetworks = wifiManager.getConfiguredNetworks()) != null) {
                    Iterator<T> it2 = configuredNetworks.iterator();
                    while (it2.hasNext()) {
                        String str = ((WifiConfiguration) it2.next()).SSID;
                        kotlin.jvm.internal.j.f(str, "it.SSID");
                        N.e(n7, str);
                    }
                }
                objA = Unit.f18162a;
            } catch (Throwable th3) {
                C1037h.a aVar4 = C1037h.f9166b;
                objA = AbstractC1039j.a(th3);
            }
            Throwable thA2 = C1037h.a(objA);
            if (thA2 != null) {
                String strB2 = C1030a.b(thA2);
                String strC2 = kotlin.jvm.internal.z.a(N.class).c();
                A0.w(2, strB2, strC2 != null ? strC2 : "CoroutineScopedExtractor");
                G4.b bVar2 = n7.f1548b;
                if (bVar2 != null) {
                    bVar2.a(thA2);
                }
            }
        }
        n7.g();
        return Unit.f18162a;
    }
}

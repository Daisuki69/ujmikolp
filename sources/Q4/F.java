package Q4;

import M8.A0;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import com.paymaya.PayMayaApplication;
import defpackage.Network;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f5225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g8, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5225a = g8;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new F(this.f5225a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        SignalStrength signalStrength;
        List cellSignalStrengths;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        List listC = cj.r.c("android.permission.READ_PHONE_STATE");
        G g8 = this.f5225a;
        boolean zD = g8.d(listC, false);
        ArrayList arrayList = g8.f5226d;
        if (zD) {
            PayMayaApplication payMayaApplication = g8.c;
            try {
                C1037h.a aVar = C1037h.f9166b;
                Object systemService = payMayaApplication.getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                if (Build.VERSION.SDK_INT >= 24) {
                    Object systemService2 = payMayaApplication.getSystemService("telephony_subscription_service");
                    kotlin.jvm.internal.j.e(systemService2, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
                    List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) systemService2).getActiveSubscriptionInfoList();
                    if (activeSubscriptionInfoList != null) {
                        Iterator<T> it = activeSubscriptionInfoList.iterator();
                        while (it.hasNext()) {
                            TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager != null ? telephonyManager.createForSubscriptionId(((SubscriptionInfo) it.next()).getSubscriptionId()) : null;
                            String simCountryIso = telephonyManagerCreateForSubscriptionId != null ? telephonyManagerCreateForSubscriptionId.getSimCountryIso() : null;
                            arrayList.add(new Network(String.valueOf(telephonyManagerCreateForSubscriptionId != null ? Integer.valueOf(telephonyManagerCreateForSubscriptionId.getDataNetworkType()) : null), telephonyManagerCreateForSubscriptionId != null ? telephonyManagerCreateForSubscriptionId.getSimOperatorName() : null, simCountryIso, (Build.VERSION.SDK_INT < 29 || telephonyManager == null || (signalStrength = telephonyManager.getSignalStrength()) == null || (cellSignalStrengths = signalStrength.getCellSignalStrengths()) == null) ? null : cellSignalStrengths.toString(), null, 16, null));
                        }
                    }
                } else {
                    g8.e();
                }
                objA = Unit.f18162a;
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA = AbstractC1039j.a(th2);
            }
            Throwable thA = C1037h.a(objA);
            if (thA != null) {
                String strB = C1030a.b(thA);
                String strC = kotlin.jvm.internal.z.a(G.class).c();
                if (strC == null) {
                    strC = "CoroutineScopedExtractor";
                }
                A0.w(2, strB, strC);
                G4.b bVar = g8.f1548b;
                if (bVar != null) {
                    bVar.a(thA);
                }
            }
        } else {
            g8.e();
        }
        G4.b bVar2 = g8.f1548b;
        if (bVar2 != null) {
            bVar2.b(new K4.u(arrayList));
        }
        return Unit.f18162a;
    }
}

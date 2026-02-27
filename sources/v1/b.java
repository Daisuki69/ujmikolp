package V1;

import O1.AbstractC0505d0;
import Y1.c;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2.b f6035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f6036b = null;

    public b(B2.b bVar) {
        this.f6035a = bVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f6032a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f6032a.equals(str) && aVar2.f6033b.equals(aVar.f6033b)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        c cVar = (c) ((Y1.b) this.f6035a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f6730a.getConditionalUserProperties("frc", "")) {
            AbstractC0505d0 abstractC0505d0 = Z1.a.f6877a;
            Preconditions.checkNotNull(bundle);
            Y1.a aVar = new Y1.a();
            aVar.f6722a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            aVar.f6723b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            aVar.c = zzjh.zzb(bundle, "value", Object.class, null);
            aVar.f6724d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            aVar.e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            aVar.f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            aVar.f6725g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            aVar.h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            aVar.i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            aVar.j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            aVar.f6726k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            aVar.f6727l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            aVar.f6728n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            aVar.f6729o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) throws AbtException {
        Object obj;
        String str;
        String str2;
        String str3;
        B2.b bVar = this.f6035a;
        if (bVar.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<a> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        ((c) ((Y1.b) bVar.get())).f6730a.clearConditionalUserProperty(((Y1.a) it2.next()).f6723b, null, null);
                    }
                    return;
                }
                if (bVar.get() == null) {
                    throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<Y1.a> arrayListB = b();
                ArrayList<a> arrayList3 = new ArrayList();
                for (Y1.a aVar : arrayListB) {
                    String[] strArr = a.f6031g;
                    String str4 = aVar.f6724d;
                    arrayList3.add(new a(aVar.f6723b, String.valueOf(aVar.c), str4 != null ? str4 : "", new Date(aVar.m), aVar.e, aVar.j));
                }
                ArrayList arrayList4 = new ArrayList();
                for (a aVar2 : arrayList3) {
                    if (!a(arrayList2, aVar2)) {
                        arrayList4.add(aVar2.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    ((c) ((Y1.b) bVar.get())).f6730a.clearConditionalUserProperty(((Y1.a) it3.next()).f6723b, null, null);
                }
                ArrayList<a> arrayList5 = new ArrayList();
                for (a aVar3 : arrayList2) {
                    if (!a(arrayList3, aVar3)) {
                        arrayList5.add(aVar3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f6036b == null) {
                    this.f6036b = Integer.valueOf(((c) ((Y1.b) bVar.get())).f6730a.getMaxUserProperties("frc"));
                }
                int iIntValue = this.f6036b.intValue();
                for (a aVar4 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        ((c) ((Y1.b) bVar.get())).f6730a.clearConditionalUserProperty(((Y1.a) arrayDeque.pollFirst()).f6723b, null, null);
                    }
                    Y1.a aVarA = aVar4.a();
                    c cVar = (c) ((Y1.b) bVar.get());
                    cVar.getClass();
                    AbstractC0505d0 abstractC0505d0 = Z1.a.f6877a;
                    String str5 = aVarA.f6722a;
                    if (str5 != null && !str5.isEmpty() && (((obj = aVarA.c) == null || zzlt.zzb(obj) != null) && Z1.a.a(str5) && Z1.a.c(str5, aVarA.f6723b) && (((str = aVarA.f6726k) == null || (Z1.a.b(aVarA.f6727l, str) && Z1.a.d(str5, aVarA.f6726k, aVarA.f6727l))) && (((str2 = aVarA.h) == null || (Z1.a.b(aVarA.i, str2) && Z1.a.d(str5, aVarA.h, aVarA.i))) && ((str3 = aVarA.f) == null || (Z1.a.b(aVarA.f6725g, str3) && Z1.a.d(str5, aVarA.f, aVarA.f6725g))))))) {
                        Bundle bundle = new Bundle();
                        String str6 = aVarA.f6722a;
                        if (str6 != null) {
                            bundle.putString("origin", str6);
                        }
                        String str7 = aVarA.f6723b;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str7);
                        }
                        Object obj2 = aVarA.c;
                        if (obj2 != null) {
                            zzjh.zza(bundle, obj2);
                        }
                        String str8 = aVarA.f6724d;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str8);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, aVarA.e);
                        String str9 = aVarA.f;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str9);
                        }
                        Bundle bundle2 = aVarA.f6725g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str10 = aVarA.h;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str10);
                        }
                        Bundle bundle3 = aVarA.i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, aVarA.j);
                        String str11 = aVarA.f6726k;
                        if (str11 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str11);
                        }
                        Bundle bundle4 = aVarA.f6727l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, aVarA.m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, aVarA.f6728n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, aVarA.f6729o);
                        cVar.f6730a.setConditionalUserProperty(bundle);
                    }
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = a.f6031g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = a.f6031g;
            for (int i = 0; i < 5; i++) {
                String str12 = strArr3[i];
                if (!map.containsKey(str12)) {
                    arrayList6.add(str12);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new a((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", a.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e7) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e7);
            }
        }
    }
}

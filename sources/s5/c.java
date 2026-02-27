package S5;

import A5.g;
import Kh.C0307l;
import Kh.z;
import Oi.k;
import Si.d;
import W5.e;
import Xh.h;
import androidx.camera.video.AudioStats;
import bi.EnumC1028f;
import cj.L;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f;
import io.split.android.client.dtos.Event;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V5.c f5672a;

    public c(V5.c cVar) {
        this.f5672a = cVar;
    }

    public static boolean b(c cVar, T5.a featureFlag) {
        cVar.getClass();
        j.g(featureFlag, "featureFlag");
        String strD = cVar.f5672a.d(featureFlag, null);
        Boolean boolValueOf = strD != null ? Boolean.valueOf(strD.equals(f.f16147l)) : null;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : ((A5.b) featureFlag).c;
        L.c(new Pair("final_value", String.valueOf(zBooleanValue)));
        return zBooleanValue;
    }

    public static double c(c cVar, A5.c featureFlag) {
        cVar.getClass();
        j.g(featureFlag, "featureFlag");
        String strD = cVar.f5672a.d(featureFlag, null);
        Double dE = strD != null ? x.e(strD) : null;
        double dDoubleValue = dE != null ? dE.doubleValue() : featureFlag.f155b;
        L.c(new Pair("final_value", String.valueOf(dDoubleValue)));
        return dDoubleValue;
    }

    public static String e(c cVar, g featureFlag) {
        cVar.getClass();
        j.g(featureFlag, "featureFlag");
        String strD = cVar.f5672a.d(featureFlag, null);
        if (strD == null) {
            strD = featureFlag.c;
        }
        L.c(new Pair("final_value", strD));
        return strD;
    }

    public static z f(c cVar, A5.f featureFlag) {
        cVar.getClass();
        j.g(featureFlag, "featureFlag");
        V5.c cVar2 = cVar.f5672a;
        Uh.b bVar = featureFlag.f161b == e.c ? cVar2.h : cVar2.f6081g;
        Lh.c cVar3 = new Lh.c(23, cVar2, featureFlag, false);
        bVar.getClass();
        return new z(new z(new C0307l(new z(bVar, cVar3, 0), 0), V5.b.f6077a, 1), b.f5671a, 0);
    }

    public final boolean a(A5.b featureFlag) {
        j.g(featureFlag, "featureFlag");
        return b(this, featureFlag);
    }

    public final String d(A5.f featureFlag) {
        j.g(featureFlag, "featureFlag");
        String strC = this.f5672a.c(featureFlag);
        if (strC == null) {
            strC = "";
        }
        L.c(new Pair("final_value", strC));
        return strC;
    }

    public final void g(String str, e eVar, HashMap map) {
        h hVar;
        V5.c cVar = this.f5672a;
        W5.b bVar = eVar == e.c ? cVar.f : cVar.e;
        if (bVar == null || (hVar = bVar.c) == null) {
            return;
        }
        String str2 = bVar.f6310b;
        String str3 = hVar.c.f6788a;
        if (hVar.i) {
            hVar.f.getClass();
            d.a("Client has already been destroyed - no calls possible", "track");
            return;
        }
        boolean zD = hVar.f6646d.d(EnumC1028f.f9151a);
        k kVar = k.TRACK;
        Xh.b bVar2 = hVar.h;
        Qi.c cVar2 = (Qi.c) bVar2.c;
        if (!((AtomicBoolean) bVar2.f).get()) {
            Ri.a.p("Event not tracked because tracking is disabled");
            return;
        }
        try {
            Event event = new Event();
            event.eventTypeId = str;
            event.trafficTypeName = str2;
            event.key = str3;
            event.value = AudioStats.AUDIO_AMPLITUDE_NONE;
            event.timestamp = System.currentTimeMillis();
            event.properties = map;
            Cg.c cVarX = ((Cg.c) bVar2.f6628b).x(event, zD);
            if (cVarX != null) {
                boolean z4 = ((Integer) cVarX.f768b) != null;
                d dVar = (d) bVar2.f6627a;
                if (z4) {
                    dVar.getClass();
                    d.a("track", (String) cVarX.c);
                    return;
                } else {
                    dVar.getClass();
                    d.c(cVarX, "track");
                    event.trafficTypeName = event.trafficTypeName.toLowerCase();
                }
            }
            Si.a aVarA = ((Xh.c) bVar2.f6629d).a(event.properties);
            if (aVarA.f5726a) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                event.properties = aVarA.f5727b;
                event.setSizeInBytes(aVarA.c + 1024);
                zi.d dVar2 = ((zi.c) bVar2.e).f21452b;
                if (dVar2.f21459g.c(event) && dVar2.m.get()) {
                    dVar2.f21456a.l(dVar2.f21458d.a(), dVar2.f21459g);
                }
                dVar2.j.l();
                cVar2.j(kVar, System.currentTimeMillis() - jCurrentTimeMillis);
            }
        } catch (Exception unused) {
            cVar2.L(kVar);
        }
    }
}

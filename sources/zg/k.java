package zg;

import Ng.C0496d;
import Ng.n;
import Ng.o;
import Ng.q;
import Rg.r;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cj.C1129o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21438a;

    static {
        List list = q.f4436a;
        f21438a = C1129o.C(new String[]{RtspHeaders.DATE, RtspHeaders.EXPIRES, "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }

    public static final void a(o oVar, Og.f fVar, Function2 function2) {
        String string;
        String string2;
        n nVar = new n(0);
        nVar.k(oVar);
        nVar.k(fVar.c());
        Unit unit = Unit.f18162a;
        Map values = (Map) nVar.f5552b;
        kotlin.jvm.internal.j.g(values, "values");
        Rg.h hVar = new Rg.h();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            hVar.put(str, arrayList);
        }
        Ag.j jVar = new Ag.j(function2, 25);
        for (Map.Entry entry2 : hVar.entrySet()) {
            jVar.invoke((String) entry2.getKey(), (List) entry2.getValue());
        }
        List list2 = q.f4436a;
        if (oVar.get(RtspHeaders.USER_AGENT) == null && fVar.c().get(RtspHeaders.USER_AGENT) == null) {
            int i4 = r.f5550a;
            function2.invoke(RtspHeaders.USER_AGENT, "ktor-client");
        }
        C0496d c0496dB = fVar.b();
        if ((c0496dB == null || (string = c0496dB.toString()) == null) && (string = fVar.c().get(RtspHeaders.CONTENT_TYPE)) == null) {
            string = oVar.get(RtspHeaders.CONTENT_TYPE);
        }
        Long lA = fVar.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = fVar.c().get(RtspHeaders.CONTENT_LENGTH)) == null) {
            string2 = oVar.get(RtspHeaders.CONTENT_LENGTH);
        }
        if (string != null) {
            function2.invoke(RtspHeaders.CONTENT_TYPE, string);
        }
        if (string2 != null) {
            function2.invoke(RtspHeaders.CONTENT_LENGTH, string2);
        }
    }
}

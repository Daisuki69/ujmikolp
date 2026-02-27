package C5;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.M;
import com.paymaya.common.utility.C;
import d4.AbstractC1331a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import pg.r;
import pg.t;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {
    public b() {
        super("");
    }

    public final void h(int i, r call, t result) {
        AbstractC1331a.r(i, SessionDescription.ATTR_TYPE);
        j.g(call, "call");
        j.g(result, "result");
        Object obj = call.f19113b;
        Map mapL = null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Pair(String.valueOf(entry.getKey()), entry.getValue()));
            }
            mapL = M.l(arrayList);
        }
        if (mapL == null) {
            return;
        }
        this.f739a = true;
        int iC = AbstractC2217b.c(i);
        if (iC == 0) {
            String str = (String) mapL.get("traceName");
            if (str == null) {
                result.success(Boolean.TRUE);
            } else {
                e(str);
                Map mapO0 = C.o0(mapL.get("attributes"));
                if (mapO0 != null) {
                    c(str, mapO0);
                }
                result.success(Boolean.TRUE);
            }
        } else if (iC != 1) {
            String str2 = (String) mapL.get("traceName");
            Map mapO02 = C.o0(mapL.get("attributes"));
            if (str2 == null || mapO02 == null) {
                result.success(Boolean.TRUE);
            } else {
                c(str2, mapO02);
                result.success(Boolean.TRUE);
            }
        } else {
            String str3 = (String) mapL.get("traceName");
            if (str3 == null) {
                result.success(Boolean.TRUE);
            } else {
                Map mapO03 = C.o0(mapL.get("attributes"));
                if (mapO03 != null) {
                    c(str3, mapO03);
                }
                f(str3);
                result.success(Boolean.TRUE);
            }
        }
        this.f739a = false;
    }
}

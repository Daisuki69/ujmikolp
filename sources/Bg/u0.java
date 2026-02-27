package bg;

import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9128a = new LinkedHashMap();

    public final void a(int i) {
        int i4;
        if (i == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(kotlin.jvm.internal.j.j("state"));
            kotlin.jvm.internal.j.k(illegalArgumentException, kotlin.jvm.internal.j.class.getName());
            throw illegalArgumentException;
        }
        Iterator it = this.f9128a.entrySet().iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) ((Map.Entry) it.next()).getValue();
            if (i == 1) {
                i4 = 200;
            } else {
                if (i != 2) {
                    throw null;
                }
                i4 = YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR;
            }
            function1.invoke(Integer.valueOf(i4));
        }
    }
}

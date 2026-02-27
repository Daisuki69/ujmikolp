package Ng;

import androidx.camera.video.AudioStats;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4427b;
    public final double c;

    public h(String value, List params) {
        Double d10;
        Object next;
        String str;
        Double dE;
        kotlin.jvm.internal.j.g(value, "value");
        kotlin.jvm.internal.j.g(params, "params");
        this.f4426a = value;
        this.f4427b = params;
        Iterator it = params.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((i) next).f4428a, "q")) {
                    break;
                }
            }
        }
        i iVar = (i) next;
        double dDoubleValue = 1.0d;
        if (iVar != null && (str = iVar.f4429b) != null && (dE = zj.x.e(str)) != null) {
            double dDoubleValue2 = dE.doubleValue();
            if (AudioStats.AUDIO_AMPLITUDE_NONE <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = dE;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.j.b(this.f4426a, hVar.f4426a) && kotlin.jvm.internal.j.b(this.f4427b, hVar.f4427b);
    }

    public final int hashCode() {
        return this.f4427b.hashCode() + (this.f4426a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f4426a + ", params=" + this.f4427b + ')';
    }
}

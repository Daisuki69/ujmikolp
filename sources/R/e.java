package R;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import dOYHB6.tiZVw8.numX49;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5409b;
    public final int c;

    public e(JSONObject jSONObject) {
        f fVar;
        kotlin.jvm.internal.j.g(jSONObject, numX49.tnTj78("bPuPu"));
        N4.d dVar = f.f5410b;
        String strOptString = jSONObject.optString(SessionDescription.ATTR_TYPE);
        kotlin.jvm.internal.j.f(strOptString, numX49.tnTj78("bPuPV"));
        dVar.getClass();
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (kotlin.jvm.internal.j.b(fVar.f5412a, strOptString)) {
                break;
            } else {
                i++;
            }
        }
        this.f5408a = fVar == null ? f.c : fVar;
        this.f5409b = jSONObject.optInt(numX49.tnTj78("bPuPS"));
        this.c = jSONObject.optInt(numX49.tnTj78("bPuPj"));
    }
}

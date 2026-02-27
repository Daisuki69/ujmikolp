package y3;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.ArrayList;

/* JADX INFO: renamed from: y3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2501b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21051b;

    public C2501b(int i, ArrayList arrayList) {
        this.f21050a = i;
        this.f21051b = arrayList;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb(SessionDescription.ATTR_TYPE, this.f21050a);
        zzvVarZza.zzc("points", this.f21051b.toArray());
        return zzvVarZza.toString();
    }
}

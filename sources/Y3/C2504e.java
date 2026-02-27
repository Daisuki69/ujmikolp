package y3;

import android.graphics.PointF;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* JADX INFO: renamed from: y3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2504e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f21053b;

    public C2504e(int i, PointF pointF) {
        this.f21052a = i;
        this.f21053b = pointF;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb(SessionDescription.ATTR_TYPE, this.f21052a);
        zzvVarZza.zzc("position", this.f21053b);
        return zzvVarZza.toString();
    }
}

package y3;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* JADX INFO: renamed from: y3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2503d {
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C2503d)) {
                return false;
            }
            int iFloatToIntBits = Float.floatToIntBits(0.1f);
            ((C2503d) obj).getClass();
            if (iFloatToIntBits != Float.floatToIntBits(0.1f) || !Objects.equal(2, 2) || !Objects.equal(1, 1) || !Objects.equal(2, 2)) {
                return false;
            }
            Boolean bool = Boolean.FALSE;
            if (!Objects.equal(bool, bool) || !Objects.equal(2, 2) || !Objects.equal(null, null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(0.1f)), 2, 1, 2, Boolean.FALSE, 2, null);
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", 2);
        zzvVarZza.zzb("contourMode", 1);
        zzvVarZza.zzb("classificationMode", 2);
        zzvVarZza.zzb("performanceMode", 2);
        zzvVarZza.zzd("trackingEnabled", false);
        zzvVarZza.zza("minFaceSize", 0.1f);
        return zzvVarZza.toString();
    }
}

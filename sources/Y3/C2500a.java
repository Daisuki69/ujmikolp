package y3;

import We.s;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2500a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f21046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21047b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21048d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f21049g;
    public final float h;
    public final SparseArray i = new SparseArray();
    public final SparseArray j = new SparseArray();

    public C2500a(zzf zzfVar) {
        float f = zzfVar.zzc;
        float f3 = zzfVar.zze / 2.0f;
        float f7 = zzfVar.zzd;
        float f10 = zzfVar.zzf / 2.0f;
        this.f21046a = new Rect((int) (f - f3), (int) (f7 - f10), (int) (f + f3), (int) (f7 + f10));
        this.f21047b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (a(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                SparseArray sparseArray = this.i;
                int i = zznVar.zzd;
                sparseArray.put(i, new C2504e(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i4 = zzdVar.zzb;
            if (i4 <= 15 && i4 > 0) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j > 2147483647L ? Integer.MAX_VALUE : (int) j);
                Collections.addAll(arrayList, pointFArr);
                this.j.put(i4, new C2501b(i4, arrayList));
            }
        }
        this.f = zzfVar.zzi;
        this.f21049g = zzfVar.zzg;
        this.h = zzfVar.zzh;
        this.e = zzfVar.zzm;
        this.f21048d = zzfVar.zzk;
        this.c = zzfVar.zzl;
    }

    public static boolean a(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.f21046a);
        zzvVarZza.zzb("trackingId", this.f21047b);
        zzvVarZza.zza("rightEyeOpenProbability", this.c);
        zzvVarZza.zza("leftEyeOpenProbability", this.f21048d);
        zzvVarZza.zza("smileProbability", this.e);
        zzvVarZza.zza("eulerX", this.f);
        zzvVarZza.zza("eulerY", this.f21049g);
        zzvVarZza.zza("eulerZ", this.h);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (a(i)) {
                zzvVarZza2.zzc(s.f(i, "landmark_"), (C2504e) this.i.get(i));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i4 = 1; i4 <= 15; i4++) {
            zzvVarZza3.zzc(s.f(i4, "Contour_"), (C2501b) this.j.get(i4));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    public C2500a(zzow zzowVar) {
        this.f21046a = zzowVar.zzh();
        this.f21047b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (a(zzpcVar.zza())) {
                this.i.put(zzpcVar.zza(), new C2504e(zzpcVar.zza(), zzpcVar.zzb()));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (iZza <= 15 && iZza > 0) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                this.j.put(iZza, new C2501b(iZza, new ArrayList(listZzb)));
            }
        }
        this.f = zzowVar.zzf();
        this.f21049g = zzowVar.zzb();
        this.h = -zzowVar.zzd();
        this.e = zzowVar.zze();
        this.f21048d = zzowVar.zza();
        this.c = zzowVar.zzc();
    }
}

package com.google.android.gms.vision.face;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Face {
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private int zza;
    private PointF zzb;
    private float zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private List<Landmark> zzh;
    private final List<Contour> zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private final float zzm;

    public Face(int i, @RecentlyNonNull PointF pointF, float f, float f3, float f7, float f10, float f11, @RecentlyNonNull Landmark[] landmarkArr, @RecentlyNonNull Contour[] contourArr, float f12, float f13, float f14, float f15) {
        this.zza = i;
        this.zzb = pointF;
        this.zzc = f;
        this.zzd = f3;
        this.zze = f7;
        this.zzf = f10;
        this.zzg = f11;
        this.zzh = Arrays.asList(landmarkArr);
        this.zzi = Arrays.asList(contourArr);
        this.zzj = zza(f12);
        this.zzk = zza(f13);
        this.zzl = zza(f14);
        this.zzm = zza(f15);
    }

    private static float zza(float f) {
        if (f < 0.0f || f > 1.0f) {
            return -1.0f;
        }
        return f;
    }

    @RecentlyNonNull
    public List<Contour> getContours() {
        return this.zzi;
    }

    @ShowFirstParty
    @KeepForSdk
    public float getEulerX() {
        return this.zzg;
    }

    public float getEulerY() {
        return this.zze;
    }

    public float getEulerZ() {
        return this.zzf;
    }

    public float getHeight() {
        return this.zzd;
    }

    public int getId() {
        return this.zza;
    }

    public float getIsLeftEyeOpenProbability() {
        return this.zzj;
    }

    public float getIsRightEyeOpenProbability() {
        return this.zzk;
    }

    public float getIsSmilingProbability() {
        return this.zzl;
    }

    @RecentlyNonNull
    public List<Landmark> getLandmarks() {
        return this.zzh;
    }

    @RecentlyNonNull
    public PointF getPosition() {
        PointF pointF = this.zzb;
        return new PointF(pointF.x - (this.zzc / 2.0f), pointF.y - (this.zzd / 2.0f));
    }

    public float getWidth() {
        return this.zzc;
    }
}

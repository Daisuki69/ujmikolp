package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.vision.Detector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FocusingProcessor<T> implements Detector.Processor<T> {
    private Detector<T> zza;
    private Tracker<T> zzb;
    private int zze;
    private int zzc = 3;
    private boolean zzd = false;
    private int zzf = 0;

    public FocusingProcessor(@RecentlyNonNull Detector<T> detector, @RecentlyNonNull Tracker<T> tracker) {
        this.zza = detector;
        this.zzb = tracker;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(@RecentlyNonNull Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.zzf == this.zzc) {
                this.zzb.onDone();
                this.zzd = false;
            } else {
                this.zzb.onMissing(detections);
            }
            this.zzf++;
            return;
        }
        this.zzf = 0;
        if (this.zzd) {
            T t5 = detectedItems.get(this.zze);
            if (t5 != null) {
                this.zzb.onUpdate(detections, t5);
                return;
            } else {
                this.zzb.onDone();
                this.zzd = false;
            }
        }
        int iSelectFocus = selectFocus(detections);
        T t10 = detectedItems.get(iSelectFocus);
        if (t10 == null) {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Invalid focus selected: ");
            sb2.append(iSelectFocus);
            Log.w("FocusingProcessor", sb2.toString());
            return;
        }
        this.zzd = true;
        this.zze = iSelectFocus;
        this.zza.setFocus(iSelectFocus);
        this.zzb.onNewItem(this.zze, t10);
        this.zzb.onUpdate(detections, t10);
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        this.zzb.onDone();
    }

    public abstract int selectFocus(@RecentlyNonNull Detector.Detections<T> detections);

    public final void zza(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1173g.q(28, i, "Invalid max gap: "));
        }
        this.zzc = i;
    }
}

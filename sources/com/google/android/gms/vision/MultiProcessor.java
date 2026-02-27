package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MultiProcessor<T> implements Detector.Processor<T> {
    private Factory<T> zza;
    private SparseArray<zza> zzb;
    private int zzc;

    public static class Builder<T> {
        private MultiProcessor<T> zza;

        public Builder(@RecentlyNonNull Factory<T> factory) {
            MultiProcessor<T> multiProcessor = new MultiProcessor<>();
            this.zza = multiProcessor;
            if (factory == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            ((MultiProcessor) multiProcessor).zza = factory;
        }

        @RecentlyNonNull
        public MultiProcessor<T> build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder<T> setMaxGapFrames(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC1173g.q(28, i, "Invalid max gap: "));
            }
            ((MultiProcessor) this.zza).zzc = i;
            return this;
        }
    }

    public interface Factory<T> {
        @RecentlyNonNull
        Tracker<T> create(@RecentlyNonNull T t5);
    }

    public class zza {
        private Tracker<T> zza;
        private int zzb;

        private zza(MultiProcessor multiProcessor) {
            this.zzb = 0;
        }

        public static /* synthetic */ int zzb(zza zzaVar) {
            int i = zzaVar.zzb;
            zzaVar.zzb = i + 1;
            return i;
        }

        public static /* synthetic */ int zza(zza zzaVar, int i) {
            zzaVar.zzb = 0;
            return 0;
        }
    }

    private MultiProcessor() {
        this.zzb = new SparseArray<>();
        this.zzc = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(@RecentlyNonNull Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int iKeyAt = detectedItems.keyAt(i);
            T tValueAt = detectedItems.valueAt(i);
            if (this.zzb.get(iKeyAt) == null) {
                zza zzaVar = new zza();
                zzaVar.zza = this.zza.create(tValueAt);
                zzaVar.zza.onNewItem(iKeyAt, tValueAt);
                this.zzb.append(iKeyAt, zzaVar);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < this.zzb.size(); i4++) {
            int iKeyAt2 = this.zzb.keyAt(i4);
            if (detectedItems2.get(iKeyAt2) == null) {
                zza zzaVarValueAt = this.zzb.valueAt(i4);
                zza.zzb(zzaVarValueAt);
                if (zzaVarValueAt.zzb >= this.zzc) {
                    zzaVarValueAt.zza.onDone();
                    hashSet.add(Integer.valueOf(iKeyAt2));
                } else {
                    zzaVarValueAt.zza.onMissing(detections);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.zzb.delete(((Integer) it.next()).intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i6 = 0; i6 < detectedItems3.size(); i6++) {
            int iKeyAt3 = detectedItems3.keyAt(i6);
            T tValueAt2 = detectedItems3.valueAt(i6);
            zza zzaVar2 = this.zzb.get(iKeyAt3);
            zza.zza(zzaVar2, 0);
            zzaVar2.zza.onUpdate(detections, tValueAt2);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzb.valueAt(i).zza.onDone();
        }
        this.zzb.clear();
    }
}

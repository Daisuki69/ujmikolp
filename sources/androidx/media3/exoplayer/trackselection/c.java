package androidx.media3.exoplayer.trackselection;

import N1.g;
import android.os.Bundle;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8115a;

    public /* synthetic */ c(int i) {
        this.f8115a = i;
    }

    @Override // N1.g
    public final Object apply(Object obj) {
        switch (this.f8115a) {
            case 0:
                return ((TrackGroupArray) obj).toBundle();
            case 1:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 2:
                return TrackGroupArray.fromBundle((Bundle) obj);
            default:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
        }
    }
}

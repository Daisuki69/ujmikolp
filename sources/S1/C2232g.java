package s1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;

/* JADX INFO: renamed from: s1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2232g implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19999a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19999a) {
            case 0:
                return new TrackGroupArray(parcel);
            case 1:
                return new DefaultTrackSelector$Parameters(parcel);
            case 2:
                return new DefaultTrackSelector$SelectionOverride(parcel);
            default:
                return new TrackSelectionParameters(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f19999a) {
            case 0:
                return new TrackGroupArray[i];
            case 1:
                return new DefaultTrackSelector$Parameters[i];
            case 2:
                return new DefaultTrackSelector$SelectionOverride[i];
            default:
                return new TrackSelectionParameters[i];
        }
    }
}

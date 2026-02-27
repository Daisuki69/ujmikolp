package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
    }

    @NonNull
    public static Pair<Double, Double> adjustGeoLocation(double d10, double d11) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d10 = adjustInternal(d10);
            d11 = adjustInternal(d11);
        }
        return Pair.create(Double.valueOf(d10), Double.valueOf(d11));
    }

    private static double adjustInternal(double d10) {
        return d10 >= AudioStats.AUDIO_AMPLITUDE_NONE ? d10 : ((d10 * 10000.0d) - 1.0d) / 10000.0d;
    }
}

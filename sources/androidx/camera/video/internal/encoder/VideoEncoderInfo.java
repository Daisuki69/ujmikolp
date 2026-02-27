package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    boolean canSwapWidthHeight();

    int getHeightAlignment();

    @NonNull
    Range<Integer> getSupportedBitrateRange();

    @NonNull
    Range<Integer> getSupportedHeights();

    @NonNull
    Range<Integer> getSupportedHeightsFor(int i);

    @NonNull
    Range<Integer> getSupportedWidths();

    @NonNull
    Range<Integer> getSupportedWidthsFor(int i);

    int getWidthAlignment();

    boolean isSizeSupported(int i, int i4);

    boolean isSizeSupportedAllowSwapping(int i, int i4);
}

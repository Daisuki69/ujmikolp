package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.Extractor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements N1.g, Consumer, ProgressiveMediaExtractor.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8096a;

    public /* synthetic */ l(int i) {
        this.f8096a = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.f8096a) {
            case 1:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // N1.g
    public Object apply(Object obj) {
        switch (this.f8096a) {
            case 0:
                return MergingMediaPeriod.lambda$selectTracks$0((MediaPeriod) obj);
            case 1:
            case 2:
            case 4:
            default:
                return TrackGroup.fromBundle((Bundle) obj);
            case 3:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 5:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
            case 6:
                return ((TrackGroup) obj).toBundle();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }
}

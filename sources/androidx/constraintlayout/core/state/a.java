package androidx.constraintlayout.core.state;

import N1.g;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceView;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import androidx.media3.common.b;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.c;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Interpolator, DebugViewProvider, g, ListenerSet.Event, CacheKeyFactory, ListenerSet.IterationFinishedEvent, BitmapFactoryImageDecoder.BitmapDecoder, ChunkExtractor.Factory, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, ExtractorsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7752a;

    public /* synthetic */ a(int i) {
        this.f7752a = i;
    }

    @Override // N1.g
    public Object apply(Object obj) {
        switch (this.f7752a) {
            case 5:
                return Label.fromBundle((Bundle) obj);
            case 6:
                return ((Label) obj).toBundle();
            case 7:
                return ((StreamKey) obj).toBundle();
            case 8:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 9:
                return StreamKey.fromBundle((Bundle) obj);
            case 10:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 11:
            default:
                return ((Cue) obj).toBinderBasedBundle();
            case 12:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 13:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 14:
                return Format.fromBundle((Bundle) obj);
            case 15:
                return ((TrackSelectionOverride) obj).toBundle();
            case 16:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 17:
                return ((Tracks.Group) obj).toBundle();
            case 18:
                return Tracks.Group.fromBundle((Bundle) obj);
            case 19:
                return Cue.fromBundle((Bundle) obj);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        return androidx.media3.datasource.cache.a.a(dataSpec);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f7752a) {
            case 27:
                return c.d();
            case 28:
                return AmrExtractor.lambda$static$0();
            default:
                return FlacExtractor.lambda$static$0();
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z4, List list, TrackOutput trackOutput, PlayerId playerId) {
        return MediaParserChunkExtractor.lambda$static$0(i, format, z4, list, trackOutput, playerId);
    }

    @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
    public Bitmap decode(byte[] bArr, int i) {
        return BitmapFactoryImageDecoder.access$100(bArr, i);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public /* synthetic */ ChunkExtractor.Factory experimentalParseSubtitlesDuringExtraction(boolean z4) {
        return androidx.media3.exoplayer.source.chunk.a.a(this, z4);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z4) {
        int i = this.f7752a;
        return c.b(this, z4);
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        switch (this.f7752a) {
            case 25:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i4) {
        return b.a(i, i4);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch (this.f7752a) {
            case 0:
                return Transition.lambda$getInterpolator$4(f);
            case 1:
                return Transition.lambda$getInterpolator$5(f);
            case 2:
                return Transition.lambda$getInterpolator$6(f);
            default:
                return Transition.lambda$getInterpolator$7(f);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public /* synthetic */ Format getOutputTextFormat(Format format) {
        return androidx.media3.exoplayer.source.chunk.a.b(this, format);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public /* synthetic */ ChunkExtractor.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return androidx.media3.exoplayer.source.chunk.a.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f7752a;
        return c.a(this, uri, map);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory, reason: collision with other method in class */
    public /* synthetic */ ExtractorsFactory mo74setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f7752a;
        return c.c(this, factory);
    }
}

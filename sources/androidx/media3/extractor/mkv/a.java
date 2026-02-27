package androidx.media3.extractor.mkv;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.c;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ExtractorsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubtitleParser.Factory f8151b;

    public /* synthetic */ a(SubtitleParser.Factory factory, int i) {
        this.f8150a = i;
        this.f8151b = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        switch (this.f8150a) {
            case 0:
                return MatroskaExtractor.lambda$newFactory$0(this.f8151b);
            case 1:
                return FragmentedMp4Extractor.lambda$newFactory$0(this.f8151b);
            case 2:
                return Mp4Extractor.lambda$newFactory$0(this.f8151b);
            default:
                return TsExtractor.lambda$newFactory$0(this.f8151b);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z4) {
        int i = this.f8150a;
        return c.b(this, z4);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public final /* synthetic */ ExtractorsFactory mo74setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f8150a;
        return c.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f8150a;
        return c.a(this, uri, map);
    }
}

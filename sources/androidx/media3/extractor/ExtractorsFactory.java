package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new androidx.constraintlayout.core.state.a(27);

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    @Deprecated
    ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z4);

    /* JADX INFO: renamed from: setSubtitleParserFactory */
    ExtractorsFactory mo74setSubtitleParserFactory(SubtitleParser.Factory factory);
}

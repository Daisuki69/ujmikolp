package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static Extractor[] a(ExtractorsFactory extractorsFactory, Uri uri, Map map) {
        return extractorsFactory.createExtractors();
    }

    public static ExtractorsFactory b(ExtractorsFactory extractorsFactory, boolean z4) {
        return extractorsFactory;
    }

    public static ExtractorsFactory c(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
        return extractorsFactory;
    }

    public static /* synthetic */ Extractor[] d() {
        return new Extractor[0];
    }
}

package androidx.media3.extractor.text;

import O1.O;
import O1.S;
import Xa.c;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static void a(SubtitleParser subtitleParser, byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        subtitleParser.parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    public static Subtitle b(SubtitleParser subtitleParser, byte[] bArr, int i, int i4) {
        O oJ = S.j();
        subtitleParser.parse(bArr, i, i4, SubtitleParser.OutputOptions.ALL, new c(oJ, 27));
        return new CuesWithTimingSubtitle(oJ.g());
    }

    public static void c(SubtitleParser subtitleParser) {
    }
}

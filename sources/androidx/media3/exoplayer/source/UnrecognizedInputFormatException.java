package androidx.media3.exoplayer.source;

import O1.P;
import O1.S;
import O1.t0;
import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class UnrecognizedInputFormatException extends ParserException {
    public final S sniffFailures;
    public final Uri uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, t0.e);
        P p10 = S.f4555b;
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = S.k(list);
    }
}

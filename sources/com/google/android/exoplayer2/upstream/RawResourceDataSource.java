package com.google.android.exoplayer2.upstream;

import M8.T2;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class RawResourceDataSource extends T2 {

    public static class RawResourceDataSourceException extends IOException {
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }
}

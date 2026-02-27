package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static int a(TrackOutput trackOutput, DataReader dataReader, int i, boolean z4) {
        return trackOutput.sampleData(dataReader, i, z4, 0);
    }

    public static void b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i) {
        trackOutput.sampleData(parsableByteArray, i, 0);
    }
}

package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
@Deprecated
public final class DummyTrackOutput implements TrackOutput {
    private final DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        this.discardingTrackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z4) throws IOException {
        DiscardingTrackOutput discardingTrackOutput = this.discardingTrackOutput;
        discardingTrackOutput.getClass();
        return d.a(discardingTrackOutput, dataReader, i, z4);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i4, int i6, @Nullable TrackOutput.CryptoData cryptoData) {
        this.discardingTrackOutput.sampleMetadata(j, i, i4, i6, cryptoData);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i) {
        DiscardingTrackOutput discardingTrackOutput = this.discardingTrackOutput;
        discardingTrackOutput.getClass();
        d.b(discardingTrackOutput, parsableByteArray, i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z4, int i4) throws IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i, z4, i4);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i4) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i, i4);
    }
}

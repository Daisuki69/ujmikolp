package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes2.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i, int i4, int i6, int i10, int i11, int i12, byte[] bArr) {
        this.formatType = i;
        this.numChannels = i4;
        this.frameRateHz = i6;
        this.averageBytesPerSecond = i10;
        this.blockSize = i11;
        this.bitsPerSample = i12;
        this.extraData = bArr;
    }
}

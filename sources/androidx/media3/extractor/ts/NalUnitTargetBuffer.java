package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i, int i4) {
        this.targetType = i;
        byte[] bArr = new byte[i4 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i, int i4) {
        if (this.isFilling) {
            int i6 = i4 - i;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i10 = this.nalLength;
            if (length < i10 + i6) {
                this.nalData = Arrays.copyOf(bArr2, (i10 + i6) * 2);
            }
            System.arraycopy(bArr, i, this.nalData, this.nalLength, i6);
            this.nalLength += i6;
        }
    }

    public boolean endNalUnit(int i) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i) {
        Assertions.checkState(!this.isFilling);
        boolean z4 = i == this.targetType;
        this.isFilling = z4;
        if (z4) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}

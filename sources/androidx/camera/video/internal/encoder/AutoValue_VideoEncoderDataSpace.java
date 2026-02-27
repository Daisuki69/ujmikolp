package androidx.camera.video.internal.encoder;

import We.s;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoEncoderDataSpace extends VideoEncoderDataSpace {
    private final int range;
    private final int standard;
    private final int transfer;

    public AutoValue_VideoEncoderDataSpace(int i, int i4, int i6) {
        this.standard = i;
        this.transfer = i4;
        this.range = i6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoEncoderDataSpace) {
            VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
            if (this.standard == videoEncoderDataSpace.getStandard() && this.transfer == videoEncoderDataSpace.getTransfer() && this.range == videoEncoderDataSpace.getRange()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getRange() {
        return this.range;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getStandard() {
        return this.standard;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getTransfer() {
        return this.transfer;
    }

    public int hashCode() {
        return ((((this.standard ^ 1000003) * 1000003) ^ this.transfer) * 1000003) ^ this.range;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb2.append(this.standard);
        sb2.append(", transfer=");
        sb2.append(this.transfer);
        sb2.append(", range=");
        return s.o(sb2, "}", this.range);
    }
}

package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioSpec;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioSpec extends AudioSpec {
    private final Range<Integer> bitrate;
    private final int channelCount;
    private final Range<Integer> sampleRate;
    private final int source;
    private final int sourceFormat;

    public static final class Builder extends AudioSpec.Builder {
        private Range<Integer> bitrate;
        private Integer channelCount;
        private Range<Integer> sampleRate;
        private Integer source;
        private Integer sourceFormat;

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec build() {
            String strI = this.bitrate == null ? " bitrate" : "";
            if (this.sourceFormat == null) {
                strI = We.s.i(strI, " sourceFormat");
            }
            if (this.source == null) {
                strI = We.s.i(strI, " source");
            }
            if (this.sampleRate == null) {
                strI = We.s.i(strI, " sampleRate");
            }
            if (this.channelCount == null) {
                strI = We.s.i(strI, " channelCount");
            }
            if (strI.isEmpty()) {
                return new AutoValue_AudioSpec(this.bitrate, this.sourceFormat.intValue(), this.source.intValue(), this.sampleRate, this.channelCount.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setBitrate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.bitrate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSampleRate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.sampleRate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSource(int i) {
            this.source = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSourceFormat(int i) {
            this.sourceFormat = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }

        private Builder(AudioSpec audioSpec) {
            this.bitrate = audioSpec.getBitrate();
            this.sourceFormat = Integer.valueOf(audioSpec.getSourceFormat());
            this.source = Integer.valueOf(audioSpec.getSource());
            this.sampleRate = audioSpec.getSampleRate();
            this.channelCount = Integer.valueOf(audioSpec.getChannelCount());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSpec) {
            AudioSpec audioSpec = (AudioSpec) obj;
            if (this.bitrate.equals(audioSpec.getBitrate()) && this.sourceFormat == audioSpec.getSourceFormat() && this.source == audioSpec.getSource() && this.sampleRate.equals(audioSpec.getSampleRate()) && this.channelCount == audioSpec.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
        return this.source;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
        return this.sourceFormat;
    }

    public int hashCode() {
        return ((((((((this.bitrate.hashCode() ^ 1000003) * 1000003) ^ this.sourceFormat) * 1000003) ^ this.source) * 1000003) ^ this.sampleRate.hashCode()) * 1000003) ^ this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    public AudioSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpec{bitrate=");
        sb2.append(this.bitrate);
        sb2.append(", sourceFormat=");
        sb2.append(this.sourceFormat);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", sampleRate=");
        sb2.append(this.sampleRate);
        sb2.append(", channelCount=");
        return We.s.o(sb2, "}", this.channelCount);
    }

    private AutoValue_AudioSpec(Range<Integer> range, int i, int i4, Range<Integer> range2, int i6) {
        this.bitrate = range;
        this.sourceFormat = i;
        this.source = i4;
        this.sampleRate = range2;
        this.channelCount = i6;
    }
}

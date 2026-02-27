package androidx.camera.video;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    private final AudioStats audioStats;
    private final long numBytesRecorded;
    private final long recordedDurationNanos;

    public AutoValue_RecordingStats(long j, long j6, AudioStats audioStats) {
        this.recordedDurationNanos = j;
        this.numBytesRecorded = j6;
        if (audioStats == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.audioStats = audioStats;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecordingStats) {
            RecordingStats recordingStats = (RecordingStats) obj;
            if (this.recordedDurationNanos == recordingStats.getRecordedDurationNanos() && this.numBytesRecorded == recordingStats.getNumBytesRecorded() && this.audioStats.equals(recordingStats.getAudioStats())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.RecordingStats
    @NonNull
    public AudioStats getAudioStats() {
        return this.audioStats;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
        return this.numBytesRecorded;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
        return this.recordedDurationNanos;
    }

    public int hashCode() {
        long j = this.recordedDurationNanos;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.numBytesRecorded;
        return ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.audioStats.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.recordedDurationNanos + ", numBytesRecorded=" + this.numBytesRecorded + ", audioStats=" + this.audioStats + "}";
    }
}

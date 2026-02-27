package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
public class AudioConfig {

    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    public AudioConfig(boolean z4) {
        this.mIsAudioEnabled = z4;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z4) {
        return new AudioConfig(z4);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}

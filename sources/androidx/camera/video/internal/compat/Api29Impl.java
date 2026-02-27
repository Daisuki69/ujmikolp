package androidx.camera.video.internal.compat;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class Api29Impl {
    private Api29Impl() {
    }

    @Nullable
    public static AudioRecordingConfiguration getActiveRecordingConfiguration(@NonNull AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean isClientSilenced(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void registerAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull Executor executor, @NonNull AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioManager$AudioRecordingCallback);
    }

    public static void unregisterAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
    }
}

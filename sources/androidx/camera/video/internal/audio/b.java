package androidx.camera.video.internal.audio;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements AudioStreamFactory {
    @Override // androidx.camera.video.internal.audio.AudioStreamFactory
    public final AudioStream create(AudioSettings audioSettings, Context context) {
        return new AudioStreamImpl(audioSettings, context);
    }
}

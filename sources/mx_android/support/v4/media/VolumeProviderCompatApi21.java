package mx_android.support.v4.media;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes7.dex */
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i, int i4, int i6, final Delegate delegate) {
        return new VolumeProvider(i, i4, i6) { // from class: mx_android.support.v4.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i10) {
                delegate.onSetVolumeTo(i10);
            }

            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i10) {
                delegate.onAdjustVolume(i10);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}

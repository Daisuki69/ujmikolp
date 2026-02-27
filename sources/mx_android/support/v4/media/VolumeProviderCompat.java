package mx_android.support.v4.media;

import android.os.Build;
import mx_android.support.v4.media.VolumeProviderCompatApi21;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private Object mVolumeProviderObj;

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public VolumeProviderCompat(int i, int i4, int i6) {
        this.mControlType = i;
        this.mMaxVolume = i4;
        this.mCurrentVolume = i6;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final void setCurrentVolume(int i) {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderObj != null || Build.VERSION.SDK_INT < 21) {
            return this.mVolumeProviderObj;
        }
        Object objCreateVolumeProvider = VolumeProviderCompatApi21.createVolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, new VolumeProviderCompatApi21.Delegate() { // from class: mx_android.support.v4.media.VolumeProviderCompat.1
            @Override // mx_android.support.v4.media.VolumeProviderCompatApi21.Delegate
            public void onSetVolumeTo(int i) {
                VolumeProviderCompat.this.onSetVolumeTo(i);
            }

            @Override // mx_android.support.v4.media.VolumeProviderCompatApi21.Delegate
            public void onAdjustVolume(int i) {
                VolumeProviderCompat.this.onAdjustVolume(i);
            }
        });
        this.mVolumeProviderObj = objCreateVolumeProvider;
        return objCreateVolumeProvider;
    }
}

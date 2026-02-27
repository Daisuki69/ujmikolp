package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzpa extends AudioDeviceCallback {
    final /* synthetic */ zzpe zza;

    public /* synthetic */ zzpa(zzpe zzpeVar, byte[] bArr) {
        Objects.requireNonNull(zzpeVar);
        this.zza = zzpeVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpe zzpeVar = this.zza;
        zzpeVar.zzf(zzoz.zza(zzpeVar.zzg(), zzpeVar.zzj(), zzpeVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzeo.zza;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzpe zzpeVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i], zzpeVar.zzh())) {
                zzpeVar.zzi(null);
                break;
            }
            i++;
        }
        zzpe zzpeVar2 = this.zza;
        zzpeVar2.zzf(zzoz.zza(zzpeVar2.zzg(), zzpeVar2.zzj(), zzpeVar2.zzh()));
    }
}

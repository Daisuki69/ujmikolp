package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzei implements zzdk {

    @Nullable
    private Message zza;

    private zzei() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdk
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzej.zzn(this);
    }

    public final zzei zzb(Message message, zzej zzejVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzej.zzn(this);
        return zSendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzei(byte[] bArr) {
    }
}

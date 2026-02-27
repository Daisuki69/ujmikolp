package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoi implements zzaoh {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaoi(FileChannel fileChannel, long j, long j6) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzaoh
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoh
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}

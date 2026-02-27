package com.shield.android.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15213d = {1589105889, 312325643, 1507929218};
    private final h gG;

    public d(h hVar) {
        this.gG = hVar;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15213d[0]) ^ 1589105889;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15213d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 312336373) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 312336373) + (((int) j6) ^ 1507929219), i4 | (~(((int) j) ^ 312336373)), i6, (((int) j) ^ 312336373) + cCharAt + (((int) j6) ^ 1507929219) + ((~(((int) j) ^ 312336373)) | i4)));
            long j7 = f15213d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1507929219) + (((int) j7) ^ 1507929219) + ((~(((int) j7) ^ 1507929219)) | i10) + (((((int) j7) ^ 1507929219) + i) - ((((((int) j7) ^ 1507929219) + i) + (((int) j7) ^ 1507929219)) + ((~(((int) j7) ^ 1507929219)) | i10)));
        }
        return sb2.toString();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (g("榟榐榚榌榑榗榚槐榒榑榝榟榊榗榑榐槐榮榬榱榨榷榺榻榬榭榡榽榶榿榰榹榻榺").equals(intent.getAction())) {
            this.gG.shouldSendSignature();
        }
    }
}

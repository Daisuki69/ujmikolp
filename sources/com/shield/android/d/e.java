package com.shield.android.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15214d = {699332774, 922501672, 22592760, 1267628529, 1682671945, 1850320344};
    private final h gH;

    public e(h hVar) {
        this.gH = hVar;
    }

    public static String d(String str) {
        int i = ((int) f15214d[0]) ^ 699301357;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15214d[1]) ^ 922501672;
        while (i4 < str.length()) {
            long[] jArr = f15214d;
            int i6 = (((i >> (((int) jArr[1]) ^ 922501672)) ^ (i >> (((int) jArr[2]) ^ 22592762))) ^ (i >> (((int) jArr[3]) ^ 1267628530))) ^ (i >> 5);
            long j = jArr[4];
            i = (char) ((i >> (((int) j) ^ 1682671944)) | (((char) (i6 & (((int) j) ^ 1682671944))) << (((int) jArr[5]) ^ 1850320343)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15214d[4];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1682671944, i11, i10, (((int) j6) ^ 1682671944) + i10 + i11));
            long j7 = f15214d[4];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1682671944) + (((int) j7) ^ 1682671944) + ((~(((int) j7) ^ 1682671944)) | i12) + (((((int) j7) ^ 1682671944) + i4) - ((((((int) j7) ^ 1682671944) + i4) + (((int) j7) ^ 1682671944)) + ((~(((int) j7) ^ 1682671944)) | i12)));
        }
        return sb2.toString();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (d("䋄ꄼ働ꠦ푅橼㕮骫䴬⛄ጤআҷ舅䅛ꃴ큣\ue865瑜멇嵊껇圂꯴햙檾㔽\u1aeeഄ蛱쌔懣낔堤Ⱳ陟").equals(intent.getAction())) {
            this.gH.shouldSendSignature();
        }
    }
}

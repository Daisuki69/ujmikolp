package com.shield.android.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15212d = {485728312, 375096547, 751955002};
    private final h gF;

    public c(h hVar) {
        this.gF = hVar;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15212d[0]) ^ 485728312;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15212d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 375094406) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 375094406) + (((int) j6) ^ 751955003), i4 | (~(((int) j) ^ 375094406)), i6, (((int) j) ^ 375094406) + cCharAt + (((int) j6) ^ 751955003) + ((~(((int) j) ^ 375094406)) | i4)));
            long j7 = f15212d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 751955003) + (((int) j7) ^ 751955003) + ((~(((int) j7) ^ 751955003)) | i10) + (((((int) j7) ^ 751955003) + i) - ((((((int) j7) ^ 751955003) + i) + (((int) j7) ^ 751955003)) + ((~(((int) j7) ^ 751955003)) | i10)));
        }
        return sb2.toString();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (g("\uf804\uf80b\uf801\uf817\uf80a\uf80c\uf801\uf84b\uf809\uf80a\uf806\uf804\uf811\uf80c\uf80a\uf80b\uf84b\uf828\uf82a\uf821\uf820\uf83a\uf826\uf82d\uf824\uf82b\uf822\uf820\uf821").equals(intent.getAction())) {
            this.gF.shouldSendSignature();
        }
    }
}

package com.shield.android.f;

import android.content.SharedPreferences;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldCallback;
import com.shield.android.ShieldException;
import com.shield.android.e.i;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15307d = {112532866, 558444633, 1308681686, 1313917385, 96753220, 1575467540};
    private final com.shield.android.e.m iw;
    private final com.shield.android.e.i ix;
    private final SharedPreferences iy;
    private final boolean iz;

    public e(com.shield.android.e.m mVar, com.shield.android.e.i iVar, SharedPreferences sharedPreferences, boolean z4) {
        this.iw = mVar;
        this.ix = iVar;
        this.iy = sharedPreferences;
        this.iz = z4;
    }

    public static String d(String str) {
        int i = ((int) f15307d[0]) ^ 112569822;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15307d[1]) ^ 558444633;
        while (i4 < str.length()) {
            long[] jArr = f15307d;
            int i6 = (((i >> (((int) jArr[1]) ^ 558444633)) ^ (i >> (((int) jArr[2]) ^ 1308681684))) ^ (i >> (((int) jArr[3]) ^ 1313917386))) ^ (i >> 5);
            long j = jArr[4];
            i = (char) ((i >> (((int) j) ^ 96753221)) | (((char) (i6 & (((int) j) ^ 96753221))) << (((int) jArr[5]) ^ 1575467547)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15307d[4];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 96753221, i11, i10, (((int) j6) ^ 96753221) + i10 + i11));
            long j7 = f15307d[4];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 96753221) + (((int) j7) ^ 96753221) + ((~(((int) j7) ^ 96753221)) | i12) + (((((int) j7) ^ 96753221) + i4) - ((((((int) j7) ^ 96753221) + i4) + (((int) j7) ^ 96753221)) + ((~(((int) j7) ^ 96753221)) | i12)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.f.h
    public final void c(ShieldCallback<com.shield.android.internal.d> shieldCallback) {
        this.ix.a(this.iw, new m(2, this, shieldCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ShieldCallback shieldCallback, i.a aVar) {
        SharedPreferences sharedPreferences;
        try {
            if (aVar == i.a.hB) {
                ShieldException shieldException = this.iw.bp;
                if (shieldException != null) {
                    shieldCallback.onFailure(shieldException);
                    return;
                }
                String strD = d(this.iz ? "塈걶噧⭩ᗠઠ蔃싛\ue107\uf0c9\uf838ﱏ﹥罥뿬徬⾕" : "塋걹噯\u2b75ᗭન蔎싄");
                String strD2 = d(this.iz ? "塈걶噧⭩ᗠઠ蔃싛\ue107\uf0da\uf833ﱙ﹦罣뿪徬" : "塘걲噹⭶ᗫમ蔎");
                if (!this.iz && (sharedPreferences = this.iy) != null && this.iw.f15280ic != null) {
                    sharedPreferences.edit().putString(strD, this.iw.f15280ic.bG()).putString(strD2, this.iw.f15280ic.bH()).apply();
                }
                shieldCallback.onSuccess(this.iw.f15280ic);
            }
        } catch (Exception e) {
            shieldCallback.onFailure(ShieldException.unexpectedError(e));
        }
    }
}

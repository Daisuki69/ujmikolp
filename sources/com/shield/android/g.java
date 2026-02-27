package com.shield.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15362d = {1658017348, 1850249686, 1415485961};

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15362d[0]) ^ 1658017348;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15362d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1850271638) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1850271638) + (((int) j6) ^ 1415485960), i4 | (~(((int) j) ^ 1850271638)), i6, (((int) j) ^ 1850271638) + cCharAt + (((int) j6) ^ 1415485960) + ((~(((int) j) ^ 1850271638)) | i4)));
            long j7 = f15362d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1415485960) + (((int) j7) ^ 1415485960) + ((~(((int) j7) ^ 1415485960)) | i10) + (((((int) j7) ^ 1415485960) + i) - ((((((int) j7) ^ 1415485960) + i) + (((int) j7) ^ 1415485960)) + ((~(((int) j7) ^ 1415485960)) | i10)));
        }
        return sb2.toString();
    }

    @Override // android.app.Activity
    @NonNull
    public final String getLocalClassName() {
        return g("瘓瘨瘩瘥瘬瘤瘉瘮瘩瘴瘩瘡瘬瘩瘺瘥瘁瘣瘴瘩瘶瘩瘴瘹");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}

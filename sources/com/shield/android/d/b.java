package com.shield.android.d;

import android.content.Context;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(31)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15210d = {888497188, 836903563, 1119008688, 1042093785};
    public static final b gB = new b();
    private static TelephonyManager gC;
    private static TelephonyCallback gD;

    public static final class a extends TelephonyCallback implements TelephonyCallback.CallStateListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15211d = {1569724812, 427039219, 197348036, 65160289};
        private /* synthetic */ com.shield.android.d.a gE;

        public a(com.shield.android.d.a aVar) {
            this.gE = aVar;
        }

        public final void onCallStateChanged(int i) {
            this.gE.onCallStateChanged(i);
        }
    }

    private b() {
    }

    public static void a(Context context, com.shield.android.d.a aVar, Executor executor) {
        kotlin.jvm.internal.j.g(context, f("꿤꿩꿫꿰꿦꿺꿵"));
        kotlin.jvm.internal.j.g(aVar, f("꿫꿯꿶꿰꿦꿬꿤꿲"));
        kotlin.jvm.internal.j.g(executor, f("꿢꿾꿠꿧꿶꿶꿮꿲"));
        if (gC == null) {
            Object systemService = context.getSystemService(f("꿷꿮꿪꿪꿦"));
            kotlin.jvm.internal.j.e(systemService, f("꿩꿳꿩꿨꾣꿡꿠꿮꿡꿡꿹꾬꿩꿯꾩꿫꿶꿥꿡꾴꿧꿽꾱꿾꿰꿰꾰꿲꿮꿶꿵꾸꿓꿟꿕꿁꾃꿃꿏꿄꿝꿁꿄꿈꾅꿞꿌꿄꿒꿆꿝꿛꿝꿋꾟꿤꿚꿒꿘꿌꿓꿕꿗꿁꾊꾧꾫꾥꾤꾧꾳"));
            gC = (TelephonyManager) systemService;
        }
        if (gD == null) {
            gD = new a(aVar);
        }
        TelephonyManager telephonyManager = gC;
        if (telephonyManager != null) {
            TelephonyCallback telephonyCallback = gD;
            kotlin.jvm.internal.j.e(telephonyCallback, f("꿩꿳꿩꿨꾣꿡꿠꿮꿡꿡꿹꾬꿩꿯꾩꿫꿶꿥꿡꾴꿧꿽꾱꿾꿰꿰꾰꿲꿮꿶꿵꾸꿓꿟꿕꿁꾃꿃꿏꿄꿝꿁꿄꿈꾅꿞꿌꿄꿒꿆꿝꿛꿝꿋꾟꿤꿚꿒꿘꿌꿓꿕꿗꿁꾄꾧꾩꾨꾡꾣꾢꾫"));
            telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
        }
    }

    public static void bU() {
        TelephonyManager telephonyManager;
        TelephonyCallback telephonyCallback = gD;
        if (telephonyCallback != null && (telephonyManager = gC) != null) {
            telephonyManager.unregisterTelephonyCallback(telephonyCallback);
        }
        gC = null;
        gD = null;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15210d[0]) ^ 888497188;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15210d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 836930828) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 836930828)) + (((int) j6) ^ 1119008689), (~(((int) j) ^ 836930828)) | i4, i6, (((((int) j) ^ 836930828) + cCharAt) + (((int) j6) ^ 1119008689)) + ((~(((int) j) ^ 836930828)) | i4)) ^ (i % (((int) jArr[3]) ^ 1042147622))));
            long j7 = f15210d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1119008689) + (((int) j7) ^ 1119008689) + ((~(((int) j7) ^ 1119008689)) | i10) + (((((int) j7) ^ 1119008689) + i) - ((((((int) j7) ^ 1119008689) + i) + (((int) j7) ^ 1119008689)) + ((~(((int) j7) ^ 1119008689)) | i10)));
        }
        return sb2.toString();
    }
}

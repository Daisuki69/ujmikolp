package com.shield.android.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15410d = {777700024, 783879731, 1442469018, 677027063, 1056998794};
    public static final b fD = new b();

    private b() {
    }

    public static void a(Context context, com.shield.android.d.a aVar, PhoneStateListener phoneStateListener, ExecutorService executorService) {
        kotlin.jvm.internal.j.g(context, f("꩜꩑꩓ꩈ꩞ꩂꩍ"));
        kotlin.jvm.internal.j.g(aVar, f("꩜꩟꩑꩐꩷꩓ꩊꩌ꩒꩘꩐ꩆ"));
        kotlin.jvm.internal.j.g(phoneStateListener, f("\uaa4f꩖꩒꩒꩞ꩩꩍ꩙ꩃ꩓꩹꩝ꩀꩆ꩔꩞ꩊ꩜"));
        kotlin.jvm.internal.j.g(executorService, f("꩜꩟꩑꩐ꩨ\uaa4e꩘ꩌ꩒ꩳꩍ꩑꩐ꩇꩅ꩟꩝"));
        if (Build.VERSION.SDK_INT >= (((int) f15410d[0]) ^ 777700007)) {
            if (i.j(context, f("꩞꩐꩙\uaa4e꩔꩓꩝ꨖꩇ꩓ꩇ꩙\uaa5aꩁꩂ꩙ꩀꩀꨃꩾꩮꩫꩭ꩷꩷ꩮꩪꩪꩦꩽꩲꩴ꩞ꩊ꩘"))) {
                com.shield.android.d.b.a(context, aVar, executorService);
            }
        } else if (i.j(context, f("꩞꩐꩙\uaa4e꩔꩓꩝ꨖꩇ꩓ꩇ꩙\uaa5aꩁꩂ꩙ꩀꩀꨃꩾꩮꩫꩭ꩷꩷ꩮꩪꩪꩦꩽꩲꩴ꩞ꩊ꩘"))) {
            com.shield.android.d.j.a(context, phoneStateListener);
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15410d[1]) ^ 783879731;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15410d;
            long j = jArr[2];
            long j6 = jArr[3];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1442512549) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1442512549)) + (((int) j6) ^ 677027062), (~(((int) j) ^ 1442512549)) | i4, i6, (((((int) j) ^ 1442512549) + cCharAt) + (((int) j6) ^ 677027062)) + ((~(((int) j) ^ 1442512549)) | i4)) ^ (i % (((int) jArr[4]) ^ 1056995957))));
            long j7 = f15410d[3];
            int i10 = ~i;
            i = i + (((int) j7) ^ 677027062) + (((int) j7) ^ 677027062) + ((~(((int) j7) ^ 677027062)) | i10) + (((((int) j7) ^ 677027062) + i) - ((((((int) j7) ^ 677027062) + i) + (((int) j7) ^ 677027062)) + ((~(((int) j7) ^ 677027062)) | i10)));
        }
        return sb2.toString();
    }

    public static void a(Context context, ExecutorService executorService, PhoneStateListener phoneStateListener) {
        kotlin.jvm.internal.j.g(context, f("꩜꩑꩓ꩈ꩞ꩂꩍ"));
        kotlin.jvm.internal.j.g(executorService, f("꩜꩟꩑꩐ꩨ\uaa4e꩘ꩌ꩒ꩳꩍ꩑꩐ꩇꩅ꩟꩝ꩽꩈ꩞꩝ꩃꩊꩍ"));
        kotlin.jvm.internal.j.g(phoneStateListener, f("\uaa4f꩖꩒꩒꩞ꩩꩍ꩙ꩃ꩓꩹꩝ꩀꩆ꩔꩞ꩊ꩜"));
        if (Build.VERSION.SDK_INT >= (((int) f15410d[0]) ^ 777700007)) {
            if (i.j(context, f("꩞꩐꩙\uaa4e꩔꩓꩝ꨖꩇ꩓ꩇ꩙\uaa5aꩁꩂ꩙ꩀꩀꨃꩾꩮꩫꩭ꩷꩷ꩮꩪꩪꩦꩽꩲꩴ꩞ꩊ꩘"))) {
                com.shield.android.d.b.bU();
                executorService.shutdownNow();
                return;
            }
            return;
        }
        com.shield.android.d.j.a(phoneStateListener);
    }
}

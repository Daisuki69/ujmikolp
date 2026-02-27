package com.shield.android.a;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15022d = {2111934597, 722651561, 227660959, 263677865, 1950492230};
    private AppSetIdClient bG;
    private Task<AppSetIdInfo> bH;
    private final String bI;
    private final String bJ;

    public b(Context context) {
        j.g(context, f("裪裧裥裾裨裴裻"));
        AppSetIdClient client = AppSet.getClient(context.getApplicationContext());
        this.bG = client;
        this.bH = client.getAppSetIdInfo();
        this.bI = f("裺裫裤裺裨");
        this.bJ = f("裠裬");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(JSONObject jSONObject, b bVar, CountDownLatch countDownLatch, Task task) {
        j.g(jSONObject, f("袭裩裻裺裞裩裻裇装裊裰裭裫"));
        j.g(bVar, f("製裠裢裹袩袼"));
        j.g(countDownLatch, f("袭裫裤裿裣裸裋裡裶裮裏裣裱裧裯"));
        j.g(task, f("裠裼"));
        try {
            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) task.getResult();
            int scope = appSetIdInfo.getScope();
            String id = appSetIdInfo.getId();
            jSONObject.put(bVar.bI, scope);
            jSONObject.put(bVar.bJ, id);
            countDownLatch.countDown();
        } catch (Exception unused) {
            countDownLatch.countDown();
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15022d[2]) ^ 227660959;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15022d;
            long j = jArr[3];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 263712544) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 263712544)) + (((int) j6) ^ 2111934596), (~(((int) j) ^ 263712544)) | i4, i6, (((((int) j) ^ 263712544) + cCharAt) + (((int) j6) ^ 2111934596)) + ((~(((int) j) ^ 263712544)) | i4)) ^ (i % (((int) jArr[4]) ^ 1950538169))));
            long j7 = f15022d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 2111934596) + (((int) j7) ^ 2111934596) + ((~(((int) j7) ^ 2111934596)) | i10) + (((((int) j7) ^ 2111934596) + i) - ((((((int) j7) ^ 2111934596) + i) + (((int) j7) ^ 2111934596)) + ((~(((int) j7) ^ 2111934596)) | i10)));
        }
        return sb2.toString();
    }

    public final Object Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            CountDownLatch countDownLatch = new CountDownLatch(((int) f15022d[0]) ^ 2111934596);
            this.bH.addOnCompleteListener(new Bb.c(26, jSONObject, this, countDownLatch));
            try {
                countDownLatch.await(f15022d[1] ^ 722651229, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                com.shield.android.internal.a.a(e, f("裈裘裛袪裞裉裛袮裈裄袣裖裬裩裢裩裬裬"), new Object[((int) f15022d[2]) ^ 227660959]);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}

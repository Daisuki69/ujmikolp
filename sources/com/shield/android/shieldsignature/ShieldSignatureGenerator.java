package com.shield.android.shieldsignature;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.j;
import u4.InterfaceC2300b;
import v4.C2341a;
import w4.C2382f;
import w4.EnumC2380d;

/* JADX INFO: loaded from: classes4.dex */
public final class ShieldSignatureGenerator {
    public static final ShieldSignatureGenerator INSTANCE = new ShieldSignatureGenerator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f15489a = new ConcurrentHashMap();

    public static final void clear(String siteId) {
        j.g(siteId, "siteId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f15489a;
        concurrentHashMap.remove(siteId);
        if (concurrentHashMap.isEmpty()) {
            InterfaceC2300b interfaceC2300b = com.shield.android.sheildsignature.a.a.f15484a;
            if (interfaceC2300b != null) {
                C2382f c2382f = ((C2341a) interfaceC2300b).f20475a;
                c2382f.a();
                c2382f.f20694a.set(EnumC2380d.c);
                c2382f.c.shutdown();
            }
            com.shield.android.sheildsignature.a.a.f15484a = null;
        }
    }

    public static final NTPTimestamp getNTPTime() {
        return com.shield.android.sheildsignature.a.a.a();
    }

    public static final ShieldSignature getShieldSignature(String salt) {
        j.g(salt, "salt");
        NTPTimestamp nTPTimestampA = com.shield.android.sheildsignature.a.a.a();
        boolean zIsNTP = nTPTimestampA.isNTP();
        long timestamp = nTPTimestampA.getTimestamp();
        String str = (String) ((ConcurrentHashMap) f15489a).get("DEFAULT_SITE_ID");
        String strA = "";
        if (str != null) {
            a aVar = a.f15490a;
            try {
                strA = aVar.a(salt, aVar.a(String.valueOf(timestamp), str));
            } catch (GeneralSecurityException unused) {
            }
        }
        return new ShieldSignature(timestamp, zIsNTP, strA);
    }

    public static final void initialize(Context context, String secretKey) {
        j.g(context, "context");
        j.g(secretKey, "secretKey");
        try {
            Map<String, String> map = f15489a;
            ((ConcurrentHashMap) map).put("DEFAULT_SITE_ID", secretKey);
            if (((ConcurrentHashMap) map).isEmpty()) {
                com.shield.android.sheildsignature.a.a.a(context);
            }
        } catch (Exception unused) {
            ((ConcurrentHashMap) f15489a).put("DEFAULT_SITE_ID", secretKey);
        }
    }

    public static final void initialize(Context context, String secretKey, String siteId) {
        j.g(context, "context");
        j.g(secretKey, "secretKey");
        j.g(siteId, "siteId");
        try {
            Map<String, String> map = f15489a;
            ((ConcurrentHashMap) map).put(siteId, secretKey);
            if (((ConcurrentHashMap) map).isEmpty()) {
                com.shield.android.sheildsignature.a.a.a(context);
            }
        } catch (Exception unused) {
            ((ConcurrentHashMap) f15489a).put(siteId, secretKey);
        }
    }

    public static final ShieldSignature getShieldSignature(String salt, String siteId) {
        j.g(salt, "salt");
        j.g(siteId, "siteId");
        NTPTimestamp nTPTimestampA = com.shield.android.sheildsignature.a.a.a();
        boolean zIsNTP = nTPTimestampA.isNTP();
        long timestamp = nTPTimestampA.getTimestamp();
        String str = (String) ((ConcurrentHashMap) f15489a).get(siteId);
        String strA = "";
        if (str != null) {
            a aVar = a.f15490a;
            try {
                strA = aVar.a(salt, aVar.a(String.valueOf(timestamp), str));
            } catch (GeneralSecurityException unused) {
            }
        }
        return new ShieldSignature(timestamp, zIsNTP, strA);
    }
}

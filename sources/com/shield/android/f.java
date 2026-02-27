package com.shield.android;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.Shield;
import com.shield.android.common.ShieldModule;
import com.shield.android.context.s;
import com.shield.android.context.t;
import com.shield.android.context.u;
import com.shield.android.internal.i;
import com.shield.android.view.CaptchaDialog;
import com.shield.android.view.InternalBlockedDialog;
import dOYHB6.yFtIp6.ht2aO8;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15290d = {935540922, 1071632939, 956299573, 1575979151, 1529297947, 1656278275, 1876428775, 485917527, 484184769, 967144633};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f15291F;
    protected boolean az;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private final ShieldCallback<JSONObject> f15292bg;
    private Shield.DeviceResultStateListener bh;

    /* JADX INFO: renamed from: bi, reason: collision with root package name */
    private final Thread f15293bi;

    /* JADX INFO: renamed from: bj, reason: collision with root package name */
    private com.shield.android.internal.a f15294bj;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    private final com.shield.android.f.c f15295bk;
    private final String bl;
    private int bm;

    @Nullable
    private com.shield.android.internal.e bn;

    @Nullable
    private JSONObject bo;

    @Nullable
    private ShieldException bp;
    private boolean bq;
    private final String br;
    protected boolean bs;
    private final Context bt;
    private final BlockedDialog bu;
    private final boolean bv;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15304d = {2103667727, 1004147440, 2066987706, 1581993234, 255823825, 1978842635, 155106766};

        public a(Context context) {
        }

        public static String d(String str) {
            int i = ((int) f15304d[2]) ^ 2066946728;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15304d[0]) ^ 2103667727;
            while (i4 < str.length()) {
                long[] jArr = f15304d;
                int i6 = (((i >> (((int) jArr[0]) ^ 2103667727)) ^ (i >> (((int) jArr[3]) ^ 1581993232))) ^ (i >> (((int) jArr[4]) ^ 255823826))) ^ (i >> 5);
                long j = jArr[5];
                i = (char) ((i >> (((int) j) ^ 1978842634)) | (((char) (i6 & (((int) j) ^ 1978842634))) << (((int) jArr[6]) ^ 155106753)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15304d[5];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1978842634, i11, i10, (((int) j6) ^ 1978842634) + i10 + i11));
                long j7 = f15304d[5];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 1978842634) + (((int) j7) ^ 1978842634) + ((~(((int) j7) ^ 1978842634)) | i12) + (((((int) j7) ^ 1978842634) + i4) - ((((((int) j7) ^ 1978842634) + i4) + (((int) j7) ^ 1978842634)) + ((~(((int) j7) ^ 1978842634)) | i12)));
            }
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra(d("偛⡁鑑䩔ꕌ勔⤟ᓯ訛"), ((int) f15304d[0]) ^ 2103667727);
            f.b(f.this, booleanExtra);
            if (booleanExtra) {
                return;
            }
            Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) InternalBlockedDialog.class);
            intent2.addFlags(((int) f15304d[1]) ^ 735711984);
            try {
                if (f.this.bu != null) {
                    intent2.putExtra(InternalBlockedDialog.TITLE, f.this.bu.getTitle());
                    intent2.putExtra(InternalBlockedDialog.BODY, f.this.bu.getBody());
                }
            } catch (Exception unused) {
            }
            context.getApplicationContext().startActivity(intent2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, boolean z4, ShieldCallback<JSONObject> shieldCallback, Thread thread, boolean z5, com.shield.android.f.c cVar, String str, String str2, BlockedDialog blockedDialog, boolean z8) {
        long[] jArr = f15290d;
        long j = jArr[0];
        this.az = ((int) j) ^ 935540922;
        this.f15291F = ((int) j) ^ 935540922;
        this.bm = ((int) j) ^ 935540922;
        this.bq = ((int) jArr[1]) ^ 1071632938;
        this.bs = ((int) j) ^ 935540922;
        this.az = z4;
        this.f15292bg = shieldCallback;
        this.f15293bi = thread;
        this.f15291F = z5;
        this.f15295bk = cVar;
        this.bl = str;
        this.br = str2;
        this.bt = context;
        this.bu = blockedDialog;
        this.bv = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void U() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(d("쾲\ue789玄㦎Პถ蝞䏀ꆭ킕\ue81c瑘멸嵭⻦ᜰ试"));
        ht2aO8.d90yA0(LocalBroadcastManager.getInstance(this.bt.getApplicationContext()), new a(this.bt), intentFilter);
        Intent captchaIntent = CaptchaDialog.getCaptchaIntent(this.bt.getApplicationContext(), CaptchaType.TEXT_CAPTCHA, ((int) f15290d[0]) ^ 935540922);
        captchaIntent.addFlags(((int) f15290d[7]) ^ 150373207);
        this.bt.getApplicationContext().startActivity(captchaIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        Intent intent = new Intent(this.bt.getApplicationContext(), (Class<?>) InternalBlockedDialog.class);
        intent.addFlags(((int) f15290d[7]) ^ 150373207);
        try {
            BlockedDialog blockedDialog = this.bu;
            if (blockedDialog != null) {
                intent.putExtra(InternalBlockedDialog.TITLE, blockedDialog.getTitle());
                intent.putExtra(InternalBlockedDialog.BODY, this.bu.getBody());
            }
        } catch (Exception unused) {
        }
        this.bt.getApplicationContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void W() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(d("쾲\ue789玄㦎Პถ蝞䏀ꆭ킕\ue81c瑘멸嵭⻦ᜰ试"));
        ht2aO8.d90yA0(LocalBroadcastManager.getInstance(this.bt.getApplicationContext()), new a(this.bt), intentFilter);
        Intent captchaIntent = CaptchaDialog.getCaptchaIntent(this.bt.getApplicationContext(), CaptchaType.TEXT_CAPTCHA, ((int) f15290d[0]) ^ 935540922);
        captchaIntent.addFlags(((int) f15290d[7]) ^ 150373207);
        this.bt.getApplicationContext().startActivity(captchaIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        Intent intent = new Intent(this.bt.getApplicationContext(), (Class<?>) InternalBlockedDialog.class);
        intent.addFlags(((int) f15290d[7]) ^ 150373207);
        try {
            BlockedDialog blockedDialog = this.bu;
            if (blockedDialog != null) {
                intent.putExtra(InternalBlockedDialog.TITLE, blockedDialog.getTitle());
                intent.putExtra(InternalBlockedDialog.BODY, this.bu.getBody());
            }
        } catch (Exception unused) {
        }
        this.bt.getApplicationContext().startActivity(intent);
    }

    @Nullable
    public final ShieldException Q() {
        return this.bp;
    }

    public final String R() {
        return this.bl;
    }

    @Nullable
    public final JSONObject S() {
        if (this.bo != null) {
            this.f15295bk.b(new ShieldCallback<Boolean>() { // from class: com.shield.android.f.4

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15299d = {776208948, 1766286343, 983978123, 1094814716, 1491840791, 1076978681};

                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    if (com.shield.android.internal.i.b(shieldException)) {
                        f.this.f15295bk.cf();
                    }
                }

                @Override // com.shield.android.ShieldCallback
                public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
                }
            });
        }
        com.shield.android.internal.e eVar = this.bn;
        if (eVar != null) {
            boolean z4 = eVar.fW;
            boolean z5 = eVar.fX;
            if (z4) {
                if (!this.bs) {
                    new Handler(Looper.getMainLooper()).post(new m(this, 2));
                }
            } else if (z5 && !this.bs) {
                new Handler(Looper.getMainLooper()).post(new m(this, 3));
            }
        }
        return this.bo;
    }

    public final void T() {
        this.f15295bk.T();
    }

    public static String d(String str) {
        int i = ((int) f15290d[8]) ^ 484216163;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15290d[0]) ^ 935540922;
        while (i4 < str.length()) {
            long[] jArr = f15290d;
            int i6 = (((i >> (((int) jArr[0]) ^ 935540922)) ^ (i >> (((int) jArr[5]) ^ 1656278273))) ^ (i >> (((int) jArr[2]) ^ 956299574))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1071632938)) | (((char) (i6 & (((int) j) ^ 1071632938))) << (((int) jArr[9]) ^ 967144630)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15290d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1071632938, i11, i10, (((int) j6) ^ 1071632938) + i10 + i11));
            long j7 = f15290d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1071632938) + (((int) j7) ^ 1071632938) + ((~(((int) j7) ^ 1071632938)) | i12) + (((((int) j7) ^ 1071632938) + i4) - ((((((int) j7) ^ 1071632938) + i4) + (((int) j7) ^ 1071632938)) + ((~(((int) j7) ^ 1071632938)) | i12)));
        }
        return sb2.toString();
    }

    @AnyThread
    public final void b(String str, HashMap<String, String> map) {
        if (this.f15291F) {
            return;
        }
        this.f15295bk.b(str, map);
    }

    @AnyThread
    public final void c(@NonNull String str, @Nullable HashMap<String, String> map) {
        a(str, map, (Shield.DeviceResultStateListener) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(boolean z4) {
        com.shield.android.f.c cVar = this.f15295bk;
        final boolean z5 = ((int) f15290d[0]) ^ 935540922;
        cVar.a(z5, new ShieldCallback<Boolean>() { // from class: com.shield.android.f.8

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15303d = {2093253876, 1199196777, 1066247786};

            @Override // com.shield.android.ShieldCallback
            public final void onFailure(@Nullable ShieldException shieldException) {
                if (com.shield.android.internal.i.b(shieldException)) {
                    f.a(f.this, z5);
                }
            }

            @Override // com.shield.android.ShieldCallback
            public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ShieldException shieldException) {
        Shield.DeviceResultStateListener deviceResultStateListener;
        this.bp = shieldException;
        com.shield.android.internal.a.a(d("쾂\ue7a0玽㦿Ჱฺ蜟䏙ꆟ탇\ue823瑫멓嵍⻂ᜐ诲䗰⋅ᅊ࢚Ю艋셹惯づᡤ豁온\ue373\uf1eb碵밈\ude10\uef6a\uf7e9箵붓庞⼖៏讻䗏⊒鄉죏搱㉝"), new Object[((int) f15290d[0]) ^ 935540922]);
        if (this.bo != null || (deviceResultStateListener = this.bh) == null) {
            return;
        }
        deviceResultStateListener.isReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void c(String str, HashMap map, Shield.DeviceResultStateListener deviceResultStateListener) {
        a(str, map, this.f15292bg, ((int) f15290d[1]) ^ 1071632938, deviceResultStateListener);
    }

    @AnyThread
    public final void b(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull final ShieldCallback<Boolean> shieldCallback) {
        if (this.f15291F) {
            shieldCallback.onSuccess(Boolean.TRUE);
        } else {
            this.f15295bk.b(str, map, new ShieldCallback<Boolean>(this) { // from class: com.shield.android.f.3

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15298d = {1630566820, 1153812189, 1868907310, 569566147, 1821395723, 1407353476};

                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    shieldCallback.onFailure(shieldException);
                }

                @Override // com.shield.android.ShieldCallback
                public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
                    shieldCallback.onSuccess(bool);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void b(String str, HashMap map, Shield.DeviceResultStateListener deviceResultStateListener) {
        a(str, map, this.f15292bg, ((int) f15290d[1]) ^ 1071632938, deviceResultStateListener);
    }

    @AnyThread
    public final void a(final String str, final HashMap<String, String> map) {
        if (this.f15291F) {
            return;
        }
        a(str, map, new ShieldCallback<Boolean>() { // from class: com.shield.android.f.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15296d = {2065429258, 2063990400, 19848901, 1044024900};

            @Override // com.shield.android.ShieldCallback
            public final void onFailure(@Nullable ShieldException shieldException) {
                if (com.shield.android.internal.i.b(shieldException)) {
                    f.this.b(str, map);
                }
            }

            @Override // com.shield.android.ShieldCallback
            public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
            }
        });
    }

    public static /* synthetic */ void b(f fVar, boolean z4) {
        fVar.f15295bk.t(z4);
    }

    @AnyThread
    public final void a(@NonNull final String str, @Nullable final HashMap<String, String> map, @NonNull final ShieldCallback<Boolean> shieldCallback) {
        if (this.f15291F) {
            shieldCallback.onSuccess(Boolean.TRUE);
        } else {
            this.f15295bk.sendAttributes(str, map, new ShieldCallback<Boolean>() { // from class: com.shield.android.f.2

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15297d = {532846758, 1230947945, 1471918747, 1446799091, 1543448010, 1180216666};

                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    if (com.shield.android.internal.i.b(shieldException)) {
                        f.this.b(str, map, shieldCallback);
                    }
                }

                @Override // com.shield.android.ShieldCallback
                public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Boolean bool) {
                    shieldCallback.onSuccess(bool);
                }
            });
        }
    }

    public final void a(Shield.DeviceResultStateListener deviceResultStateListener) {
        this.bh = deviceResultStateListener;
        if (this.bo == null && this.bp == null) {
            return;
        }
        deviceResultStateListener.isReady();
    }

    private void a(JSONObject jSONObject, com.shield.android.internal.e eVar) {
        int i;
        int i4;
        if (jSONObject != null) {
            this.bp = null;
            if (this.bo == null) {
                i = (int) f15290d[1];
                i4 = 1071632938;
            } else {
                i = (int) f15290d[0];
                i4 = 935540922;
            }
            int i6 = i ^ i4;
            this.bo = jSONObject;
            Shield.DeviceResultStateListener deviceResultStateListener = this.bh;
            if (deviceResultStateListener != null && i6 != 0) {
                deviceResultStateListener.isReady();
            }
        } else if (this.bo == null) {
            this.bp = ShieldException.unexpectedError(new Throwable(d("쾷\ue789玝㦖Იบ蜟䏫ꆠ탇\ue814瑜멨崮⻣ᜦ诗䖹⊋ᄑ࢚Я艋셤惾〩ᡖ")));
            Shield.DeviceResultStateListener deviceResultStateListener2 = this.bh;
            if (deviceResultStateListener2 != null) {
                deviceResultStateListener2.isReady();
            }
        }
        if (eVar != null) {
            this.bn = eVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @AnyThread
    private void a(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<JSONObject> shieldCallback, boolean z4, Shield.DeviceResultStateListener deviceResultStateListener) {
        if (!this.f15291F) {
            a(str, map, shieldCallback, z4, deviceResultStateListener, ((int) f15290d[0]) ^ 935540922);
        } else {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void a(Pair<com.shield.android.internal.e, JSONObject> pair, @NonNull ShieldCallback<JSONObject> shieldCallback, boolean z4, Shield.DeviceResultStateListener deviceResultStateListener) {
        boolean z5;
        boolean z8;
        ?? r9;
        ?? r52;
        ?? r02;
        ?? r92;
        ?? r53;
        long[] jArr = f15290d;
        ?? r54 = ((int) jArr[1]) ^ 1071632938;
        int i = ((int) jArr[0]) ^ 935540922;
        if (pair == null) {
            com.shield.android.internal.a.a(d("쾂\ue7a0玽㦿Ჱฺ蜟䏙ꆟ탇\ue823瑫멓嵍⻂ᜐ诲䗰⋅ᅊ࢚Ю艋셹惯づᡤ豁온\ue377\uf1f7碢밃\ude55\uef6b\uf7ff篦붔庘⼌។课䖝⊒鄈죈搲㉛ᤷ\u0ce5ذ͎臽"), new Object[((int) f15290d[0]) ^ 935540922]);
            a(ShieldException.unexpectedError(new Throwable(d("쾗\ue789玝㦖Იบ蜟䏫ꆠ탇\ue814瑜멨崮⻣ᜦ诗䖹⊋ᄑ࢚Я艋셤惾〩ᡖ"))));
            return;
        }
        Object obj = pair.first;
        if (obj != null) {
            try {
                r54 = ((com.shield.android.internal.e) obj).fY;
                this.bq = r54;
                z5 = ((com.shield.android.internal.e) obj).fW;
                try {
                    z8 = ((com.shield.android.internal.e) obj).fX;
                } catch (Exception e) {
                    e = e;
                    z8 = i == true ? 1 : 0;
                }
            } catch (Exception e7) {
                e = e7;
                z5 = i == true ? 1 : 0;
                z8 = z5 ? 1 : 0;
            }
            try {
                r52 = r54;
                r9 = ((com.shield.android.internal.e) obj).f15414ga;
            } catch (Exception e10) {
                e = e10;
                com.shield.android.k.a.dL().a(e);
                r52 = r54;
                r9 = i;
            }
            r02 = r9;
            r92 = z5;
            r53 = r52;
        } else {
            boolean z9 = i == true ? 1 : 0;
            z8 = z9 ? 1 : 0;
            r02 = z9;
            r53 = r54;
            r92 = i;
        }
        ?? sb2 = new StringBuilder(d("쾂\ue7a0玽㦿Ჱฺ蜟䏙ꆟ탇\ue823瑫멓嵍⻂ᜐ诲䗰⋅ᅊ࢚Ю艋셹惯づᡤ豁온\ue377\uf1f7碢밃\ude55\uef6b\uf7ff篦붔庘⼌។课䖝⊒鄈죈搲㉛᤹\u0cf8ؠ́臾삦\ue000瀒롷屹\u2e6a靯쮡\ue5a9犓륐"));
        sb2.append(pair.second == null ? ((int) f15290d[1]) ^ 1071632938 : ((int) f15290d[0]) ^ 935540922);
        com.shield.android.internal.a.a(sb2.toString(), new Object[((int) f15290d[0]) ^ 935540922]);
        Object obj2 = pair.second;
        if (obj2 != null) {
            a((JSONObject) obj2, (com.shield.android.internal.e) pair.first);
            if (r53 != 0) {
                shieldCallback.onSuccess((JSONObject) pair.second);
            }
        } else if (r53 != 0 && !z4) {
            com.shield.android.internal.a.a(d("쾂\ue7a0玽㦿Ჱฺ蜟䏙ꆟ탇\ue823瑫멓嵍⻂ᜐ诲䗰⋅ᅊ࢚Ю艋셹惯づᡤ豁온\ue377\uf1f7碢밃\ude55\uef6b\uf7ff篦붔庘⼌។课䖝⊒鄈죈搲㉛᤹\u0cf8ؠ́臾삦\ue000瀒롷屹\u2e6a靯"), new Object[((int) f15290d[0]) ^ 935540922]);
            shieldCallback.onFailure(ShieldException.unexpectedError(new Throwable(d("쾗\ue789玝㦖Იบ蜟䏫ꆠ탇\ue814瑜멨崮⻣ᜦ诗䖹⊋ᄑ࢚Я艋셤惾〩ᡖ"))));
        }
        if (r92 == 0 || r53 == 0) {
            if (z8 && r53 != 0) {
                if (this.bs) {
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).post(new m(this, 1));
                }
            }
        } else if (this.bs) {
            return;
        } else {
            new Handler(Looper.getMainLooper()).post(new m(this, 0));
        }
        if (deviceResultStateListener != null) {
            deviceResultStateListener.isReady();
        }
        if (r02 != 0) {
            try {
                this.f15295bk.cg();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ShieldException shieldException, @NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<JSONObject> shieldCallback, boolean z4, Shield.DeviceResultStateListener deviceResultStateListener, boolean z5) {
        if (shieldException == null) {
            shieldException = ShieldException.unexpectedError(new Throwable(d("쾤\ue786玟㦔Გฉ蝑䎿ꆪ킕\ue801瑖멮崮⻠ᜦ试䖤⊁ᄚࣝѽ艊셲惽〬ᡁ豴온\ue376\uf1e7碲박\ude5c\uef6c")));
        }
        com.shield.android.internal.a.a(shieldException, d("쾂\ue7a0玽㦿Ჱฺ蜟䏙ꆟ탇\ue823瑫멓嵍⻂ᜐ诲䗰⋅ᅊ࢚Ю艋셹惯づᡤ豁온\ue362\uf1e3碨밌\ude45\uef6a\uf7e9篦붆広⼊៓讬䗏⊔鄔죙搻㈏ᤪಫ") + shieldException.code, new Object[((int) f15290d[0]) ^ 935540922]);
        if (shieldException.code == 301) {
            com.shield.android.k.a.dL().a(shieldException.body, new Object[((int) f15290d[0]) ^ 935540922]);
            if (shieldException.body != null && !this.bv) {
                try {
                    JSONObject jSONObject = new JSONObject(shieldException.body);
                    if (jSONObject.has(d("쾴\ue786玐㦊Გท蝑䏫"))) {
                        com.shield.android.internal.i.k(this.bt.getApplicationContext(), this.br).edit().putString(z5 ? d("쾷\ue789玘㦖Ჟฟ蝜䏴ꆐ킂\ue81d瑝멬嵡⻮ᜭ试") : d("쾴\ue786玐㦊Გท蝑䏫"), jSONObject.optString(d("쾴\ue786玐㦊Გท蝑䏫"), d(""))).apply();
                    }
                    if (jSONObject.has(d("쾧\ue78d玆㦉Ეฑ蝑"))) {
                        com.shield.android.internal.i.k(this.bt.getApplicationContext(), this.br).edit().putString(z5 ? d("쾷\ue789玘㦖Ჟฟ蝜䏴ꆐ킑\ue816瑋멯嵧⻨ᜭ") : d("쾧\ue78d玆㦉Ეฑ蝑"), String.valueOf(jSONObject.optInt(d("쾧\ue78d玆㦉Ეฑ蝑"), ((int) f15290d[0]) ^ 935540922))).apply();
                    }
                } catch (Exception unused) {
                }
            }
            if (this.bm < (((int) f15290d[2]) ^ 956299574)) {
                a(str, map, shieldCallback, z4, deviceResultStateListener);
                this.bm += ((int) f15290d[1]) ^ 1071632938;
                return;
            }
            if (this.bq) {
                shieldCallback.onFailure(shieldException);
            }
            if (this.bo == null) {
                a(shieldException);
            }
            if (deviceResultStateListener != null) {
                deviceResultStateListener.isReady();
                return;
            }
            return;
        }
        if (!com.shield.android.internal.i.b(shieldException)) {
            if (deviceResultStateListener != null) {
                deviceResultStateListener.isReady();
            }
        } else {
            if (z5) {
                if (this.bq) {
                    shieldCallback.onFailure(shieldException);
                }
                if (this.bo == null) {
                    a(shieldException);
                }
                if (deviceResultStateListener != null) {
                    deviceResultStateListener.isReady();
                    return;
                }
                return;
            }
            HashMap<String, String> map2 = map == null ? new HashMap<>() : map;
            map2.put(d("쾷\ue789玘㦖Ჟฟ蝜䏴ꆐ킒\ue801瑕"), d("쾥\ue79a玁㦟"));
            map2.put(d("쾷\ue789玘㦖Ჟฟ蝜䏴ꆐ킂\ue801瑋멳嵼"), shieldException.message);
            a(str, map2, shieldCallback, z4, deviceResultStateListener, 1071632938 ^ ((int) f15290d[1]));
        }
    }

    private void a(@NonNull final String str, @Nullable final HashMap<String, String> map, @NonNull final ShieldCallback<JSONObject> shieldCallback, final boolean z4, final Shield.DeviceResultStateListener deviceResultStateListener, boolean z5) {
        if (z5) {
            this.f15295bk.d(str, map, new ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>>() { // from class: com.shield.android.f.5

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15300d = {1781762726, 2019673684, 612268348, 1356606596};

                public static String f(String str2) {
                    StringBuilder sb2 = new StringBuilder();
                    int i = ((int) f15300d[1]) ^ 2019673684;
                    while (i < str2.length()) {
                        char cCharAt = str2.charAt(i);
                        long[] jArr = f15300d;
                        long j = jArr[2];
                        long j6 = jArr[0];
                        int i4 = ~cCharAt;
                        int i6 = (((int) j) ^ 612272905) + cCharAt;
                        sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 612272905)) + (((int) j6) ^ 1781762727), (~(((int) j) ^ 612272905)) | i4, i6, (((((int) j) ^ 612272905) + cCharAt) + (((int) j6) ^ 1781762727)) + ((~(((int) j) ^ 612272905)) | i4)) ^ (i % (((int) jArr[3]) ^ 1356649339))));
                        long j7 = f15300d[0];
                        int i10 = ~i;
                        i = i + (((int) j7) ^ 1781762727) + (((int) j7) ^ 1781762727) + ((~(((int) j7) ^ 1781762727)) | i10) + (((((int) j7) ^ 1781762727) + i) - ((((((int) j7) ^ 1781762727) + i) + (((int) j7) ^ 1781762727)) + ((~(((int) j7) ^ 1781762727)) | i10)));
                    }
                    return sb2.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    f.this.a(shieldException, str, map, shieldCallback, z4, deviceResultStateListener, 1781762727 ^ ((int) f15300d[0]));
                }

                @Override // com.shield.android.ShieldCallback
                public final /* synthetic */ void onSuccess(@Nullable Pair<com.shield.android.internal.e, JSONObject> pair) {
                    com.shield.android.internal.a.a(f("\uf266\uf27c\uf27e\uf273\uf27d\uf274\uf213\uf274\uf26d\uf21c\uf26f\uf26c\uf276\uf27b\uf27e\uf269\uf276\uf204\uf20a\uf218\uf201\uf253\uf246\uf24c\uf249\uf20c\uf269\uf27e\uf209\uf24e\uf242\uf244\uf27c\uf267\uf27f\uf236\uf277\uf271\uf27f\uf27e\uf27f\uf27d\uf27c\uf275"), new Object[((int) f15300d[1]) ^ 2019673684]);
                    f.this.a(pair, shieldCallback, z4, deviceResultStateListener);
                }
            });
        } else {
            this.f15295bk.c(str, map, new ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>>() { // from class: com.shield.android.f.6

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15301d = {344648985, 1998527047, 1829014368, 1065755668};

                public static String f(String str2) {
                    StringBuilder sb2 = new StringBuilder();
                    int i = ((int) f15301d[0]) ^ 344648985;
                    while (i < str2.length()) {
                        char cCharAt = str2.charAt(i);
                        long[] jArr = f15301d;
                        long j = jArr[1];
                        long j6 = jArr[2];
                        int i4 = ~cCharAt;
                        int i6 = (((int) j) ^ 1998560628) + cCharAt;
                        sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1998560628)) + (((int) j6) ^ 1829014369), (~(((int) j) ^ 1998560628)) | i4, i6, (((((int) j) ^ 1998560628) + cCharAt) + (((int) j6) ^ 1829014369)) + ((~(((int) j) ^ 1998560628)) | i4)) ^ (i % (((int) jArr[3]) ^ 1065802731))));
                        long j7 = f15301d[2];
                        int i10 = ~i;
                        i = i + (((int) j7) ^ 1829014369) + (((int) j7) ^ 1829014369) + ((~(((int) j7) ^ 1829014369)) | i10) + (((((int) j7) ^ 1829014369) + i) - ((((((int) j7) ^ 1829014369) + i) + (((int) j7) ^ 1829014369)) + ((~(((int) j7) ^ 1829014369)) | i10)));
                    }
                    return sb2.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    com.shield.android.internal.a.a(shieldException, f("蝠蝺蝸蝵蝻蝲蜕蝲蝫蜚蝩蝪蝰蝽蝸蝯蝰蜂蜌蜞蜇蝕蝀蝊蝏蜊蝯蝸蜏蝋蝟蝞蝼蝠"), new Object[((int) f15301d[0]) ^ 344648985]);
                    f.this.a(shieldException, str, map, shieldCallback, z4, deviceResultStateListener, ((int) f15301d[0]) ^ 344648985);
                }

                @Override // com.shield.android.ShieldCallback
                public final /* synthetic */ void onSuccess(@Nullable Pair<com.shield.android.internal.e, JSONObject> pair) {
                    com.shield.android.internal.a.a(f("蝠蝺蝸蝵蝻蝲蜕蝲蝫蜚蝩蝪蝰蝽蝸蝯蝰蜂蜌蜞蜇蝕蝀蝊蝏蜊蝯蝸蜏蝈蝄蝂蝺蝡蝹"), new Object[((int) f15301d[0]) ^ 344648985]);
                    f.this.a(pair, shieldCallback, z4, deviceResultStateListener);
                }
            });
        }
    }

    public final void a(@NonNull String str, Shield.DeviceResultStateListener deviceResultStateListener) {
        HashMap<String, String> map = new HashMap<>();
        if (d("쾢\ue780玝㦟Ბบ蝠䏸ꆿ킔\ue82c瑉멮嵡⻱ᜪ诅䖵⊚ᄫࣂФ艔").equals(str)) {
            map.put(d("쾴\ue79e玑㦔Ᲊม蝑䏾ꆢ킂"), d("쾶\ue798率㦥\u1c8dฌ蝐䏩ꆦ킃\ue816瑋멃嵭⻯ᜢ诏䖷⊍ᄫࣞи艚셲惨〱ᡇ豵"));
            a(d("쾶\ue798率㦥\u1c8dฌ蝐䏩ꆦ킃\ue816瑋"), map, (Shield.DeviceResultStateListener) null);
            return;
        }
        if (d("쾲\ue78d玆㦎Ეธ蝖䏼ꆮ킓\ue816瑦멿嵦⻦ᜭ识䖵⊷ᄐࣟЩ艋셴惿〠ᡆ豎왰\ue37d\uf1f8").equals(str)) {
            com.shield.android.internal.a.a(d("쾢\ue78d玚㦞Ეฐ蝘䎿ꆬ킂\ue801瑍멵嵨⻮ᜠ诀䖤⊍ᅔࣙе艏셹惬〠᠂豴왾\ue361\uf1ec碵"), new Object[((int) f15290d[0]) ^ 935540922]);
            map.put(d("쾴\ue79e玑㦔Ᲊม蝑䏾ꆢ킂"), d("쾲\ue78d玆㦎Ეธ蝖䏼ꆮ킓\ue816瑦멿嵦⻦ᜭ识䖵⊷ᄐࣟЩ艋셴惿〠ᡆ"));
            a(d("쾲\ue78d玆㦎Ეธ蝖䏼ꆮ킓\ue816瑦멿嵦⻦ᜭ识䖵"), map, (Shield.DeviceResultStateListener) null);
            return;
        }
        map.put(d("쾴\ue79e玑㦔Ᲊม蝑䏾ꆢ킂"), d("쾼\ue789玚㦏Ნฒ蝠䏫ꆽ킎\ue814瑞멹嵼⻢ᜧ"));
        if ((!com.shield.android.internal.i.b(this.bt.getApplicationContext(), d("쾰\ue786玐㦈Გท蝛䎱ꆿ킂\ue801瑔멵嵽\u2ef4ᜪ诎䖾⋆ᄵࣹО艫셄惘〚ᡤ豘왆\ue341\uf1dd碍밯\ude73\uef59\uf7d8箏붬庿")) && !com.shield.android.internal.i.b(this.bt.getApplicationContext(), d("쾰\ue786玐㦈Გท蝛䎱ꆿ킂\ue801瑔멵嵽\u2ef4ᜪ诎䖾⋆ᄵࣹО艫셄惘〚ᡡ豞왉\ue356\uf1d1碄밿\ude7c\uef57\uf7cf箇붷庸⼷៲"))) || !com.shield.android.internal.i.L(this.bt.getApplicationContext())) {
            a(str, map, deviceResultStateListener);
        } else {
            com.shield.android.internal.i.a(this.br, ((int) f15290d[1]) ^ 1071632938, d("쾜\ue789玚㦏Ნฒ蝳䏰ꆬ킆\ue807瑐멳嵠⻓ᜫ诓䖵⊉ᄐ")).submit(new n(deviceResultStateListener, this, str, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(HashMap map, String str, Shield.DeviceResultStateListener deviceResultStateListener) {
        final HashMap map2;
        final String str2;
        final Shield.DeviceResultStateListener deviceResultStateListener2;
        final AtomicBoolean atomicBoolean;
        t sVar;
        final t tVar;
        final CountDownLatch countDownLatch;
        try {
            atomicBoolean = new AtomicBoolean(((int) f15290d[0]) ^ 935540922);
            if (com.shield.android.internal.i.M(this.bt.getApplicationContext())) {
                sVar = new com.shield.android.context.m(this.bt.getApplicationContext(), this.br);
            } else {
                sVar = new s(this.bt.getApplicationContext());
            }
            tVar = sVar;
            countDownLatch = new CountDownLatch(((int) f15290d[1]) ^ 1071632938);
            tVar.aO();
            map2 = map;
            str2 = str;
            deviceResultStateListener2 = deviceResultStateListener;
        } catch (Exception unused) {
            map2 = map;
            str2 = str;
            deviceResultStateListener2 = deviceResultStateListener;
        }
        try {
            tVar.a(new u() { // from class: com.shield.android.o
                @Override // com.shield.android.context.u
                public final void getLocation(Location location) throws Throwable {
                    this.f15462a.a(map2, tVar, atomicBoolean, countDownLatch, str2, deviceResultStateListener2, location);
                }
            });
            tVar.aM();
            try {
                if (countDownLatch.await(f15290d[3] ^ 1575979146, TimeUnit.SECONDS)) {
                    return;
                }
                long[] jArr = f15290d;
                if (atomicBoolean.compareAndSet(((int) jArr[0]) ^ 935540922, ((int) jArr[1]) ^ 1071632938)) {
                    a(str2, (HashMap<String, String>) map2, deviceResultStateListener2);
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            a(str2, (HashMap<String, String>) map2, deviceResultStateListener2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void a(java.util.HashMap r20, com.shield.android.context.t r21, java.util.concurrent.atomic.AtomicBoolean r22, java.util.concurrent.CountDownLatch r23, java.lang.String r24, com.shield.android.Shield.DeviceResultStateListener r25, android.location.Location r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.f.a(java.util.HashMap, com.shield.android.context.t, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.CountDownLatch, java.lang.String, com.shield.android.Shield$DeviceResultStateListener, android.location.Location):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @AnyThread
    public final void a(@NonNull String str, @Nullable HashMap<String, String> map, Shield.DeviceResultStateListener deviceResultStateListener) {
        if (this.f15292bg != null) {
            if (this.f15293bi != null) {
                new Thread(new n(this, str, map, deviceResultStateListener, 1), this.f15293bi.getName()).start();
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new n(this, str, map, deviceResultStateListener, 2));
                return;
            }
        }
        a(str, map, new ShieldCallback<JSONObject>() { // from class: com.shield.android.f.7

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15302d = {219962594, 274881802, 148733039, 272250383};

            @Override // com.shield.android.ShieldCallback
            public final void onFailure(@Nullable ShieldException shieldException) {
                com.shield.android.k.a.dL().a(shieldException);
                if (f.this.bo == null) {
                    f.this.a(shieldException);
                }
            }

            @Override // com.shield.android.ShieldCallback
            public final /* bridge */ /* synthetic */ void onSuccess(@Nullable JSONObject jSONObject) {
            }
        }, ((int) f15290d[0]) ^ 935540922, deviceResultStateListener);
    }

    public final void a(@NonNull com.shield.android.d.h hVar) {
        try {
            i.a aVarA = com.shield.android.internal.i.a(this.br, ((int) f15290d[1]) ^ 1071632938, d("쾷\ue79a玝㦞Ნ\u0e3d蝗䏺ꆬ킌\ue827瑑멮嵫⻦ᜧ"));
            aVarA.submit(new androidx.work.impl.b(6, this, hVar, aVarA));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.shield.android.d.h hVar, ExecutorService executorService) {
        this.f15295bk.a(hVar);
        executorService.shutdown();
    }

    public final void a(Application application, ShieldModule shieldModule) {
        this.f15295bk.a(application, shieldModule);
    }

    public final void a(@NonNull WeakReference<Activity> weakReference, @NonNull ShieldModule shieldModule, @NonNull String str) {
        this.f15295bk.a(weakReference, shieldModule, str);
    }

    public static /* synthetic */ void a(f fVar, boolean z4) {
        fVar.f15295bk.s(z4);
    }
}

package E5;

import E1.d;
import F1.k;
import H3.g;
import Sb.i;
import We.HandlerC0609m;
import We.O;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import of.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1262b;

    public /* synthetic */ b(int i, Object obj, boolean z4) {
        this.f1261a = i;
        this.f1262b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u5.b bVar;
        int i = 1;
        int i4 = 0;
        switch (this.f1261a) {
            case 0:
                if (p.v(context) && SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() != 0) {
                        return;
                    }
                    String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                    a aVar = (a) this.f1262b;
                    if (aVar == null || str == null) {
                        return;
                    }
                    aVar.b(str);
                    return;
                }
                return;
            case 1:
                d dVar = (d) this.f1262b;
                dVar.getClass();
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    dVar.f1226a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                dVar.f1226a.a("List of extras in received intent:", new Object[0]);
                for (String str2 : intent.getExtras().keySet()) {
                    dVar.f1226a.a("Key: %s; value: %s", str2, intent.getExtras().get(str2));
                }
                k kVar = dVar.f1226a;
                kVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                kVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                kVar.a("Key: %s; value: %s", EventKeys.ERROR.CODE, Integer.valueOf(intent.getIntExtra(EventKeys.ERROR.CODE, 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra(EventKeys.ERROR.CODE, 0), intent.getStringExtra("package.name"));
                dVar.f1226a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (dVar) {
                    for (Sb.a aVar2 : new HashSet(dVar.f1228d)) {
                        aVar2.getClass();
                        aVar2.f5694a.I1(zzaVar.f9729a);
                        break;
                    }
                }
                return;
            case 2:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((g) this.f1262b).f2094d.post(new H3.a(this, intent.getIntExtra("plugged", -1) <= 0, i));
                    return;
                }
                return;
            case 3:
                if (intent == null) {
                    return;
                }
                String action = intent.getAction();
                boolean zEquals = "android.intent.action.AIRPLANE_MODE".equals(action);
                Si.b bVar2 = (Si.b) this.f1262b;
                if (zEquals) {
                    if (intent.hasExtra("state")) {
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        HandlerC0609m handlerC0609m = (HandlerC0609m) bVar2.i;
                        handlerC0609m.sendMessage(handlerC0609m.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    StringBuilder sb2 = O.f6375a;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    HandlerC0609m handlerC0609m2 = (HandlerC0609m) bVar2.i;
                    handlerC0609m2.sendMessage(handlerC0609m2.obtainMessage(9, activeNetworkInfo));
                    return;
                }
                return;
            default:
                if (intent != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        for (String str3 : extras2.keySet()) {
                            linkedHashMap.put(str3, extras2.get(str3));
                        }
                    }
                    String action2 = intent.getAction();
                    u5.b[] bVarArrValues = u5.b.values();
                    int length = bVarArrValues.length;
                    while (true) {
                        if (i4 < length) {
                            bVar = bVarArrValues[i4];
                            if (!j.b(bVar.f20271a, action2)) {
                                i4++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        bVar = u5.b.f;
                    }
                    ((i) this.f1262b).invoke(bVar, linkedHashMap);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f1261a = i;
        this.f1262b = obj;
    }
}

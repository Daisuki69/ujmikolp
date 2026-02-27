package D;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import cj.C1132s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.FirebaseMessaging;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import n3.C1916a;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: renamed from: D.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0188v implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f951b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f952d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ CallableC0188v(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f950a = i;
        this.f951b = context;
        this.c = obj;
        this.f952d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    private final Object a() {
        String strH;
        boolean z4;
        Map mapE;
        Cg.c cVar;
        int i = 0;
        Context context = this.f951b;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.c;
        Ci.b bVar = (Ci.b) this.f952d;
        Cg.c cVar2 = (Cg.c) this.e;
        F.i iVar = (F.i) this.f;
        Cg.c cVar3 = new Cg.c(context, cleverTapInstanceConfig, bVar.D(context));
        String str = cleverTapInstanceConfig.f9439a;
        kotlin.jvm.internal.j.f(str, numX49.tnTj78("PePv"));
        int i4 = cleverTapInstanceConfig.f9454w;
        S sC = cleverTapInstanceConfig.c();
        kotlin.jvm.internal.j.f(sC, numX49.tnTj78("PeP7"));
        F.h hVar = new F.h(str, i4, sC, cVar2, iVar, cVar3);
        int iB = b0.b((Context) iVar.f1503b, -1, b0.o((String) iVar.f1504d, numX49.tnTj78("PePA")));
        int iB2 = b0.b((Context) iVar.f1503b, -1, b0.o((String) iVar.f1504d, numX49.tnTj78("PePY")));
        boolean z5 = b0.e((Context) iVar.f1503b).getBoolean(b0.o((String) iVar.f1504d, "ssInAppMigrated"), false);
        if (!z5 || (iB != i4 && iB2 != -1)) {
            iB2 = 1;
        }
        b0.k((Context) iVar.f1503b, i4, b0.o((String) iVar.f1504d, numX49.tnTj78("PePT")));
        if (iB2 == 0) {
            S.s(str, numX49.tnTj78("PePR") + i4 + numX49.tnTj78("PePp") + iB);
        } else {
            StringBuilder sbU = We.s.u(numX49.tnTj78("PeP0"), iB, numX49.tnTj78("PePg"), i4, numX49.tnTj78("PePf"));
            sbU.append(iB2);
            sbU.append(numX49.tnTj78("PeP1"));
            sbU.append(z5);
            S.s(str, sbU.toString());
            C1916a c1916a = F.k.f1507b;
            boolean z8 = i4 == 1;
            boolean z9 = iB2 == -1;
            S.s(str, numX49.tnTj78("PePn"));
            String strTnTj78 = numX49.tnTj78("PePx");
            if (z9) {
                JSONObject jSONObjectE = n0.b.e(b0.h(context, cleverTapInstanceConfig, numX49.tnTj78("PePs"), null), cleverTapInstanceConfig.c(), cleverTapInstanceConfig.f9439a);
                JSONObject jSONObject = new JSONObject();
                try {
                    Iterator<String> itKeys = jSONObjectE.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        kotlin.jvm.internal.j.d(next);
                        List listT = C2576A.T(next, new String[]{Global.UNDERSCORE}, 2);
                        String str2 = (String) listT.get(0);
                        F.m mVarA = hVar.a((String) listT.get(1), false);
                        if (mVarA.f1514b) {
                            jSONObject.put(str2 + '_' + mVarA.f1513a, jSONObjectE.get(next));
                        }
                    }
                } catch (Throwable th2) {
                    S.s(str, numX49.tnTj78("PeP5") + th2);
                }
                int length = jSONObject.length();
                b0.k((Context) cVar3.f768b, length, b0.o(((CleverTapInstanceConfig) cVar3.c).f9439a, numX49.tnTj78("PePJ")));
                if (length == 0) {
                    b0.m((Context) cVar3.f768b, b0.o(((CleverTapInstanceConfig) cVar3.c).f9439a, strTnTj78));
                    z4 = true;
                } else {
                    strH = jSONObject.toString();
                    kotlin.jvm.internal.j.d(strH);
                    F.m mVarA2 = hVar.a(strH, z8);
                    String strO = b0.o(((CleverTapInstanceConfig) cVar3.c).f9439a, strTnTj78);
                    Context context2 = (Context) cVar3.f768b;
                    String str3 = mVarA2.f1513a;
                    b0.l(context2, strO, str3);
                    S.s(str, numX49.tnTj78("PePq") + mVarA2 + numX49.tnTj78("PePz") + str3);
                    z4 = mVarA2.f1514b;
                }
            } else {
                strH = b0.h(context, cleverTapInstanceConfig, numX49.tnTj78("PePI"), null);
                if (strH == null) {
                    z4 = true;
                } else {
                    F.m mVarA22 = hVar.a(strH, z8);
                    String strO2 = b0.o(((CleverTapInstanceConfig) cVar3.c).f9439a, strTnTj78);
                    Context context22 = (Context) cVar3.f768b;
                    String str32 = mVarA22.f1513a;
                    b0.l(context22, strO2, str32);
                    S.s(str, numX49.tnTj78("PePq") + mVarA22 + numX49.tnTj78("PePz") + str32);
                    z4 = mVarA22.f1514b;
                }
            }
            S.s(hVar.f1499a, numX49.tnTj78("PePl"));
            Cg.c cVar4 = hVar.f;
            H.b bVar2 = (H.b) cVar4.f769d;
            String str4 = ((CleverTapInstanceConfig) cVar4.c).f9439a;
            synchronized (bVar2) {
                if (str4 == null) {
                    mapE = cj.M.e();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    H.e eVar = H.e.f2065b;
                    try {
                        Cursor cursorQuery = bVar2.c.getReadableDatabase().query("userProfiles", null, "_id = ?", new String[]{str4}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int columnIndex = cursorQuery.getColumnIndex("data");
                                int columnIndex2 = cursorQuery.getColumnIndex("deviceID");
                                if (columnIndex >= 0) {
                                    while (cursorQuery.moveToNext()) {
                                        String string = cursorQuery.getString(columnIndex);
                                        String string2 = cursorQuery.getString(columnIndex2);
                                        if (string != null) {
                                            try {
                                                JSONObject jSONObject2 = new JSONObject(string);
                                                kotlin.jvm.internal.j.d(string2);
                                                linkedHashMap.put(string2, jSONObject2);
                                            } catch (JSONException e) {
                                                bVar2.f2059b.getClass();
                                                S.r("Error parsing JSON for profile", e);
                                                Unit unit = Unit.f18162a;
                                            }
                                        }
                                    }
                                }
                                Unit unit2 = Unit.f18162a;
                                cursorQuery.close();
                            } finally {
                            }
                        }
                    } catch (SQLiteException e7) {
                        bVar2.f2059b.getClass();
                        S.r("Could not fetch records out of database userProfiles.", e7);
                    }
                    mapE = linkedHashMap;
                }
            }
            boolean z10 = true;
            for (Map.Entry entry : mapE.entrySet()) {
                String deviceID = (String) entry.getKey();
                JSONObject profile = (JSONObject) entry.getValue();
                try {
                    HashSet<String> piiDBKeys = InterfaceC0191y.e;
                    kotlin.jvm.internal.j.f(piiDBKeys, "piiDBKeys");
                    for (String str5 : piiDBKeys) {
                        kotlin.jvm.internal.j.d(str5);
                        String strK = S1.s.k(profile, str5);
                        if (strK != null) {
                            F.m mVarA3 = hVar.a(strK, z8);
                            z10 = z10 && mVarA3.f1514b;
                            profile.put(str5, mVarA3.f1513a);
                        }
                    }
                    S.s(hVar.f1499a, "DB migrated with success = " + z10 + " = " + profile);
                    cVar = hVar.f;
                    kotlin.jvm.internal.j.g(deviceID, "deviceID");
                    kotlin.jvm.internal.j.g(profile, "profile");
                } catch (Exception e10) {
                    S.s(hVar.f1499a, numX49.tnTj78("PePW") + deviceID + numX49.tnTj78("Peb9") + e10);
                }
                if (((H.b) cVar.f769d).o(profile, ((CleverTapInstanceConfig) cVar.c).f9439a, deviceID) <= -1) {
                    z10 = false;
                }
            }
            S.s(hVar.f1499a, numX49.tnTj78("PebP"));
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            uVar.f18191a = true;
            List<String> listG = C1132s.g(numX49.tnTj78("Pebb"), numX49.tnTj78("Peb2"));
            Cg.c cVar5 = hVar.f;
            kotlin.jvm.internal.j.g(listG, numX49.tnTj78("PebL"));
            Context context3 = (Context) cVar5.f768b;
            File[] fileArrListFiles = new File(context3.getApplicationInfo().dataDir, "shared_prefs").listFiles(new F.j(cVar5, i));
            if (fileArrListFiles != null) {
                ArrayList<SharedPreferences> arrayList = new ArrayList(fileArrListFiles.length);
                for (File file : fileArrListFiles) {
                    kotlin.jvm.internal.j.d(file);
                    String name = file.getName();
                    kotlin.jvm.internal.j.f(name, numX49.tnTj78("Pebr"));
                    arrayList.add(context3.getSharedPreferences(C2576A.a0(name, numX49.tnTj78("PebZ")), 0));
                }
                for (SharedPreferences sharedPreferences : arrayList) {
                    for (String str6 : listG) {
                        String string3 = svM7M6.getString(sharedPreferences, str6, null);
                        if (string3 != null) {
                            F.m mVarA4 = hVar.a(string3, true);
                            uVar.f18191a = uVar.f18191a && mVarA4.f1514b;
                            androidx.media3.datasource.cache.c.u(sharedPreferences, str6, mVarA4.f1513a);
                        }
                    }
                }
            }
            boolean z11 = z4 && z10 && uVar.f18191a;
            F.i iVar2 = hVar.e;
            b0.j((Context) iVar2.f1503b, b0.o((String) iVar2.f1504d, "ssInAppMigrated"), z11);
            hVar.e.g(z11);
        }
        return Unit.f18162a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.firebase.messaging.x xVar;
        switch (this.f950a) {
            case 0:
                return a();
            default:
                Context context = this.f951b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f952d;
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.e;
                Xh.b bVar = (Xh.b) this.f;
                synchronized (com.google.firebase.messaging.x.class) {
                    try {
                        WeakReference weakReference = com.google.firebase.messaging.x.f9817d;
                        com.google.firebase.messaging.x xVar2 = weakReference != null ? (com.google.firebase.messaging.x) weakReference.get() : null;
                        if (xVar2 == null) {
                            xVar = new com.google.firebase.messaging.x(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            xVar.b();
                            com.google.firebase.messaging.x.f9817d = new WeakReference(xVar);
                        } else {
                            xVar = xVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return new com.google.firebase.messaging.y(firebaseMessaging, oVar, xVar, bVar, context, scheduledThreadPoolExecutor);
        }
    }
}

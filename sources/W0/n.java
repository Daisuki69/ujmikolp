package W0;

import E8.RunnableC0218a;
import a.AbstractC0617a;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.ContactsContract;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContentResolverCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1110A;
import cj.C1112C;
import cj.C1114E;
import cj.C1129o;
import cj.C1132s;
import cj.L;
import cj.M;
import cj.P;
import cj.t;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import n3.C1916a;
import p3.C2011b;
import pg.r;
import pg.s;
import pg.u;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements FlutterPlugin, s, LifecycleOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f6203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f6204b;
    public Handler c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f6205d = Executors.newSingleThreadExecutor();
    public final LinkedHashMap e;
    public final ExecutorService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f6206g;
    public final ThreadPoolExecutor h;
    public List i;
    public Set j;

    public n() {
        d[] dVarArrValues = d.values();
        int iB = L.b(dVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (d dVar : dVarArrValues) {
            linkedHashMap.put(dVar, Executors.newSingleThreadExecutor());
        }
        this.e = linkedHashMap;
        this.f = Executors.newSingleThreadExecutor();
        d[] dVarArrValues2 = d.values();
        int iB2 = L.b(dVarArrValues2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (d dVar2 : dVarArrValues2) {
            linkedHashMap2.put(dVar2, Executors.newSingleThreadExecutor());
        }
        this.f6206g = linkedHashMap2;
        this.h = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue());
        this.i = C1112C.f9377a;
        this.j = C1114E.f9379a;
    }

    public final Collection a(d dVar, Set set, String str) throws Exception {
        final LinkedHashMap linkedHashMap;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            linkedHashMap = new LinkedHashMap();
            final int i = 1;
            b(d.f6179b, set, str, new Function1(this) { // from class: W0.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f6184b;

                {
                    this.f6184b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str2;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    str2 = "custom";
                    n nVar = this.f6184b;
                    String str3 = null;
                    String str4 = "";
                    switch (i) {
                        case 0:
                            Cursor cursor = (Cursor) obj;
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS);
                            long jLongValue = lS.longValue();
                            String strT = of.p.t(cursor, "data1");
                            if (strT == null) {
                                strT = "";
                            }
                            String strT2 = of.p.t(cursor, "data3");
                            if (strT2 == null) {
                                int columnIndex = cursor.getColumnIndex("data2");
                                Integer numValueOf = columnIndex < 0 ? null : Integer.valueOf(cursor.getInt(columnIndex));
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    nVar.getClass();
                                    str3 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? "" : "other" : "work" : "home" : "custom";
                                }
                                if (str3 != null) {
                                    str4 = str3;
                                }
                            } else {
                                str4 = strT2;
                            }
                            b bVar = new b(strT, str4);
                            if (linkedHashMap2.containsKey(lS)) {
                                Object obj2 = linkedHashMap2.get(lS);
                                kotlin.jvm.internal.j.d(obj2);
                                List list = ((a) obj2).c;
                                kotlin.jvm.internal.j.e(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.github.s0nerik.fast_contacts.ContactEmail>");
                                D.b(list).add(bVar);
                            } else {
                                linkedHashMap2.put(lS, new a(String.valueOf(jLongValue), null, C1132s.h(bVar), null, null, 26));
                            }
                            break;
                        default:
                            Cursor cursor2 = (Cursor) obj;
                            kotlin.jvm.internal.j.g(cursor2, "cursor");
                            Long lS2 = of.p.s(cursor2);
                            kotlin.jvm.internal.j.d(lS2);
                            long jLongValue2 = lS2.longValue();
                            String strT3 = of.p.t(cursor2, "data1");
                            if (strT3 == null) {
                                strT3 = "";
                            }
                            String strT4 = of.p.t(cursor2, "data3");
                            if (strT4 == null) {
                                int columnIndex2 = cursor2.getColumnIndex("data2");
                                Integer numValueOf2 = columnIndex2 < 0 ? null : Integer.valueOf(cursor2.getInt(columnIndex2));
                                if (numValueOf2 != null) {
                                    int iIntValue2 = numValueOf2.intValue();
                                    nVar.getClass();
                                    switch (iIntValue2) {
                                        case 0:
                                            break;
                                        case 1:
                                            str2 = "home";
                                            break;
                                        case 2:
                                            str2 = "mobile";
                                            break;
                                        case 3:
                                            str2 = "work";
                                            break;
                                        case 4:
                                            str2 = "faxWork";
                                            break;
                                        case 5:
                                            str2 = "faxHome";
                                            break;
                                        case 6:
                                            str2 = "pager";
                                            break;
                                        case 7:
                                            str2 = "other";
                                            break;
                                        case 8:
                                            str2 = "callback";
                                            break;
                                        case 9:
                                            str2 = "car";
                                            break;
                                        case 10:
                                            str2 = "companyMain";
                                            break;
                                        case 11:
                                            str2 = "isdn";
                                            break;
                                        case 12:
                                            str2 = "main";
                                            break;
                                        case 13:
                                            str2 = "faxOther";
                                            break;
                                        case 14:
                                            str2 = "radio";
                                            break;
                                        case 15:
                                            str2 = "telex";
                                            break;
                                        case 16:
                                            str2 = "ttyTtd";
                                            break;
                                        case 17:
                                            str2 = "workMobile";
                                            break;
                                        case 18:
                                            str2 = "workPager";
                                            break;
                                        case 19:
                                            str2 = "assistant";
                                            break;
                                        case 20:
                                            str2 = "mms";
                                            break;
                                        default:
                                            str2 = "";
                                            break;
                                    }
                                    str3 = str2;
                                }
                                if (str3 != null) {
                                    str4 = str3;
                                }
                            } else {
                                str4 = strT4;
                            }
                            e eVar = new e(strT3, str4);
                            if (linkedHashMap2.containsKey(lS2)) {
                                Object obj3 = linkedHashMap2.get(lS2);
                                kotlin.jvm.internal.j.d(obj3);
                                List list2 = ((a) obj3).f6166b;
                                kotlin.jvm.internal.j.e(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.github.s0nerik.fast_contacts.ContactPhone>");
                                D.b(list2).add(eVar);
                            } else {
                                linkedHashMap2.put(lS2, new a(String.valueOf(jLongValue2), C1132s.h(eVar), null, null, null, 28));
                            }
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        } else if (iOrdinal == 1) {
            linkedHashMap = new LinkedHashMap();
            final int i4 = 0;
            b(d.c, set, str, new Function1(this) { // from class: W0.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f6184b;

                {
                    this.f6184b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str2;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    str2 = "custom";
                    n nVar = this.f6184b;
                    String str3 = null;
                    String str4 = "";
                    switch (i4) {
                        case 0:
                            Cursor cursor = (Cursor) obj;
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS);
                            long jLongValue = lS.longValue();
                            String strT = of.p.t(cursor, "data1");
                            if (strT == null) {
                                strT = "";
                            }
                            String strT2 = of.p.t(cursor, "data3");
                            if (strT2 == null) {
                                int columnIndex = cursor.getColumnIndex("data2");
                                Integer numValueOf = columnIndex < 0 ? null : Integer.valueOf(cursor.getInt(columnIndex));
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    nVar.getClass();
                                    str3 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? "" : "other" : "work" : "home" : "custom";
                                }
                                if (str3 != null) {
                                    str4 = str3;
                                }
                            } else {
                                str4 = strT2;
                            }
                            b bVar = new b(strT, str4);
                            if (linkedHashMap2.containsKey(lS)) {
                                Object obj2 = linkedHashMap2.get(lS);
                                kotlin.jvm.internal.j.d(obj2);
                                List list = ((a) obj2).c;
                                kotlin.jvm.internal.j.e(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.github.s0nerik.fast_contacts.ContactEmail>");
                                D.b(list).add(bVar);
                            } else {
                                linkedHashMap2.put(lS, new a(String.valueOf(jLongValue), null, C1132s.h(bVar), null, null, 26));
                            }
                            break;
                        default:
                            Cursor cursor2 = (Cursor) obj;
                            kotlin.jvm.internal.j.g(cursor2, "cursor");
                            Long lS2 = of.p.s(cursor2);
                            kotlin.jvm.internal.j.d(lS2);
                            long jLongValue2 = lS2.longValue();
                            String strT3 = of.p.t(cursor2, "data1");
                            if (strT3 == null) {
                                strT3 = "";
                            }
                            String strT4 = of.p.t(cursor2, "data3");
                            if (strT4 == null) {
                                int columnIndex2 = cursor2.getColumnIndex("data2");
                                Integer numValueOf2 = columnIndex2 < 0 ? null : Integer.valueOf(cursor2.getInt(columnIndex2));
                                if (numValueOf2 != null) {
                                    int iIntValue2 = numValueOf2.intValue();
                                    nVar.getClass();
                                    switch (iIntValue2) {
                                        case 0:
                                            break;
                                        case 1:
                                            str2 = "home";
                                            break;
                                        case 2:
                                            str2 = "mobile";
                                            break;
                                        case 3:
                                            str2 = "work";
                                            break;
                                        case 4:
                                            str2 = "faxWork";
                                            break;
                                        case 5:
                                            str2 = "faxHome";
                                            break;
                                        case 6:
                                            str2 = "pager";
                                            break;
                                        case 7:
                                            str2 = "other";
                                            break;
                                        case 8:
                                            str2 = "callback";
                                            break;
                                        case 9:
                                            str2 = "car";
                                            break;
                                        case 10:
                                            str2 = "companyMain";
                                            break;
                                        case 11:
                                            str2 = "isdn";
                                            break;
                                        case 12:
                                            str2 = "main";
                                            break;
                                        case 13:
                                            str2 = "faxOther";
                                            break;
                                        case 14:
                                            str2 = "radio";
                                            break;
                                        case 15:
                                            str2 = "telex";
                                            break;
                                        case 16:
                                            str2 = "ttyTtd";
                                            break;
                                        case 17:
                                            str2 = "workMobile";
                                            break;
                                        case 18:
                                            str2 = "workPager";
                                            break;
                                        case 19:
                                            str2 = "assistant";
                                            break;
                                        case 20:
                                            str2 = "mms";
                                            break;
                                        default:
                                            str2 = "";
                                            break;
                                    }
                                    str3 = str2;
                                }
                                if (str3 != null) {
                                    str4 = str3;
                                }
                            } else {
                                str4 = strT4;
                            }
                            e eVar = new e(strT3, str4);
                            if (linkedHashMap2.containsKey(lS2)) {
                                Object obj3 = linkedHashMap2.get(lS2);
                                kotlin.jvm.internal.j.d(obj3);
                                List list2 = ((a) obj3).f6166b;
                                kotlin.jvm.internal.j.e(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.github.s0nerik.fast_contacts.ContactPhone>");
                                D.b(list2).add(eVar);
                            } else {
                                linkedHashMap2.put(lS2, new a(String.valueOf(jLongValue2), C1132s.h(eVar), null, null, null, 28));
                            }
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        } else if (iOrdinal == 2) {
            linkedHashMap = new LinkedHashMap();
            final int i6 = 0;
            b(d.f6180d, set, str, new Function1() { // from class: W0.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    switch (i6) {
                        case 0:
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS);
                            String strValueOf = String.valueOf(lS.longValue());
                            String strT = of.p.t(cursor, "data1");
                            String str2 = strT == null ? "" : strT;
                            String strT2 = of.p.t(cursor, "data4");
                            String str3 = strT2 == null ? "" : strT2;
                            String strT3 = of.p.t(cursor, "data2");
                            String str4 = strT3 == null ? "" : strT3;
                            String strT4 = of.p.t(cursor, "data5");
                            String str5 = strT4 == null ? "" : strT4;
                            String strT5 = of.p.t(cursor, "data3");
                            String str6 = strT5 == null ? "" : strT5;
                            String strT6 = of.p.t(cursor, "data6");
                            linkedHashMap.put(lS, new a(strValueOf, null, null, new p(str2, str3, str4, str5, str6, strT6 == null ? "" : strT6), null, 22));
                            break;
                        default:
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS2 = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS2);
                            String strValueOf2 = String.valueOf(lS2.longValue());
                            String strT7 = of.p.t(cursor, "data1");
                            if (strT7 == null) {
                                strT7 = "";
                            }
                            String strT8 = of.p.t(cursor, "data5");
                            if (strT8 == null) {
                                strT8 = "";
                            }
                            String strT9 = of.p.t(cursor, "data6");
                            linkedHashMap.put(lS2, new a(strValueOf2, null, null, null, new o(strT7, strT8, strT9 != null ? strT9 : ""), 14));
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            linkedHashMap = new LinkedHashMap();
            final int i10 = 1;
            b(d.e, set, str, new Function1() { // from class: W0.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS);
                            String strValueOf = String.valueOf(lS.longValue());
                            String strT = of.p.t(cursor, "data1");
                            String str2 = strT == null ? "" : strT;
                            String strT2 = of.p.t(cursor, "data4");
                            String str3 = strT2 == null ? "" : strT2;
                            String strT3 = of.p.t(cursor, "data2");
                            String str4 = strT3 == null ? "" : strT3;
                            String strT4 = of.p.t(cursor, "data5");
                            String str5 = strT4 == null ? "" : strT4;
                            String strT5 = of.p.t(cursor, "data3");
                            String str6 = strT5 == null ? "" : strT5;
                            String strT6 = of.p.t(cursor, "data6");
                            linkedHashMap.put(lS, new a(strValueOf, null, null, new p(str2, str3, str4, str5, str6, strT6 == null ? "" : strT6), null, 22));
                            break;
                        default:
                            kotlin.jvm.internal.j.g(cursor, "cursor");
                            Long lS2 = of.p.s(cursor);
                            kotlin.jvm.internal.j.d(lS2);
                            String strValueOf2 = String.valueOf(lS2.longValue());
                            String strT7 = of.p.t(cursor, "data1");
                            if (strT7 == null) {
                                strT7 = "";
                            }
                            String strT8 = of.p.t(cursor, "data5");
                            if (strT8 == null) {
                                strT8 = "";
                            }
                            String strT9 = of.p.t(cursor, "data6");
                            linkedHashMap.put(lS2, new a(strValueOf2, null, null, null, new o(strT7, strT8, strT9 != null ? strT9 : ""), 14));
                            break;
                    }
                    return Unit.f18162a;
                }
            });
        }
        return linkedHashMap.values();
    }

    public final void b(d dVar, Set set, String str, Function1 function1) throws Exception {
        Uri CONTENT_URI;
        String str2;
        String[] strArrA;
        Set setB;
        ArrayList arrayList = new ArrayList(t.l(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            switch (((c) it.next()).ordinal()) {
                case 0:
                    setB = P.b("data1");
                    break;
                case 1:
                    setB = P.b("data4");
                    break;
                case 2:
                    setB = P.b("data2");
                    break;
                case 3:
                    setB = P.b("data5");
                    break;
                case 4:
                    setB = P.b("data3");
                    break;
                case 5:
                    setB = P.b("data6");
                    break;
                case 6:
                    setB = P.b("data1");
                    break;
                case 7:
                    setB = P.b("data5");
                    break;
                case 8:
                    setB = P.b("data4");
                    break;
                case 9:
                    setB = P.b("data1");
                    break;
                case 10:
                    setB = C1129o.C(new String[]{"data2", "data3"});
                    break;
                case 11:
                    setB = P.b("data1");
                    break;
                case 12:
                    setB = C1129o.C(new String[]{"data2", "data3"});
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(setB);
        }
        ArrayList arrayListW = C1110A.W(t.m(arrayList));
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        arrayListW.add(0, "contact_id");
        String[] strArr = (String[]) arrayListW.toArray(new String[0]);
        ContentResolver contentResolver = this.f6204b;
        if (contentResolver == null) {
            kotlin.jvm.internal.j.n("contentResolver");
            throw null;
        }
        int iOrdinal2 = dVar.ordinal();
        if (iOrdinal2 == 0) {
            CONTENT_URI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            kotlin.jvm.internal.j.f(CONTENT_URI, "CONTENT_URI");
        } else if (iOrdinal2 == 1) {
            CONTENT_URI = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            kotlin.jvm.internal.j.f(CONTENT_URI, "CONTENT_URI");
        } else if (iOrdinal2 == 2) {
            CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            kotlin.jvm.internal.j.f(CONTENT_URI, "CONTENT_URI");
        } else {
            if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            kotlin.jvm.internal.j.f(CONTENT_URI, "CONTENT_URI");
        }
        Uri uri = CONTENT_URI;
        if (str != null) {
            int iOrdinal3 = dVar.ordinal();
            if (iOrdinal3 != 0 && iOrdinal3 != 1 && iOrdinal3 != 2 && iOrdinal3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal4 = dVar.ordinal();
            if (iOrdinal4 != 0 && iOrdinal4 != 1 && iOrdinal4 != 2 && iOrdinal4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "contact_id = ? AND mimetype = ?";
        } else {
            int iOrdinal5 = dVar.ordinal();
            if (iOrdinal5 != 0 && iOrdinal5 != 1 && iOrdinal5 != 2 && iOrdinal5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "mimetype = ?";
        }
        String str3 = str2;
        if (str != null) {
            String[] strArr2 = {str};
            String[] strArrA2 = dVar.a();
            int length = strArrA2.length;
            Object[] objArrCopyOf = Arrays.copyOf(strArr2, 1 + length);
            System.arraycopy(strArrA2, 0, objArrCopyOf, 1, length);
            kotlin.jvm.internal.j.d(objArrCopyOf);
            strArrA = (String[]) objArrCopyOf;
        } else {
            strArrA = dVar.a();
        }
        String[] strArr3 = strArrA;
        int iOrdinal6 = dVar.ordinal();
        if (iOrdinal6 != 0 && iOrdinal6 != 1 && iOrdinal6 != 2 && iOrdinal6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Cursor cursorQuery = ContentResolverCompat.query(contentResolver, uri, strArr, str3, strArr3, "contact_id ASC", (CancellationSignal) null);
        if (cursorQuery != null) {
            while (!cursorQuery.isClosed() && cursorQuery.moveToNext()) {
                try {
                    function1.invoke(cursorQuery);
                } finally {
                }
            }
            Unit unit = Unit.f18162a;
            cursorQuery.close();
        }
    }

    public final void c(pg.t tVar, Function0 function0) {
        try {
            Object objInvoke = function0.invoke();
            Handler handler = this.c;
            if (handler != null) {
                handler.post(new B5.g(13, tVar, objInvoke));
            } else {
                kotlin.jvm.internal.j.n("handler");
                throw null;
            }
        } catch (Exception e) {
            Handler handler2 = this.c;
            if (handler2 != null) {
                handler2.post(new i(tVar, e, 0));
            } else {
                kotlin.jvm.internal.j.n("handler");
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
        return lifecycleRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.j.g(flutterPluginBinding, "flutterPluginBinding");
        this.f6203a = new u(flutterPluginBinding.getBinaryMessenger(), "com.github.s0nerik.fast_contacts");
        this.c = new Handler(flutterPluginBinding.getApplicationContext().getMainLooper());
        this.f6204b = flutterPluginBinding.getApplicationContext().getContentResolver();
        u uVar = this.f6203a;
        if (uVar != null) {
            uVar.b(this);
        } else {
            kotlin.jvm.internal.j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.j.g(binding, "binding");
        u uVar = this.f6203a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            kotlin.jvm.internal.j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public final void onMethodCall(r call, final pg.t result) {
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            int iHashCode = str.hashCode();
            Object obj = call.f19113b;
            switch (iHashCode) {
                case -1411073135:
                    if (str.equals("getContactImage")) {
                        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        Map map = (Map) obj;
                        final long j = Long.parseLong((String) M.f(map, TtmlNode.ATTR_ID));
                        boolean zB = kotlin.jvm.internal.j.b(map.get("size"), "thumbnail");
                        ThreadPoolExecutor threadPoolExecutor = this.h;
                        if (zB) {
                            final int i = 0;
                            threadPoolExecutor.execute(new Runnable(this) { // from class: W0.k

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ n f6195b;

                                {
                                    this.f6195b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            final long j6 = j;
                                            final n nVar = this.f6195b;
                                            final int i4 = 1;
                                            nVar.c(result, new Function0() { // from class: W0.g
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() throws IOException {
                                                    switch (i4) {
                                                        case 0:
                                                            n nVar2 = nVar;
                                                            nVar2.getClass();
                                                            Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j6);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId, "withAppendedId(...)");
                                                            Uri uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedId, "display_photo");
                                                            try {
                                                                ContentResolver contentResolver = nVar2.f6204b;
                                                                if (contentResolver == null) {
                                                                    kotlin.jvm.internal.j.n("contentResolver");
                                                                    throw null;
                                                                }
                                                                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriWithAppendedPath, "r");
                                                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                                                    return null;
                                                                }
                                                                try {
                                                                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                                                                    try {
                                                                        kotlin.jvm.internal.j.d(fileInputStreamCreateInputStream);
                                                                        byte[] bArrZ = Xh.i.z(fileInputStreamCreateInputStream);
                                                                        AbstractC0617a.p(fileInputStreamCreateInputStream, null);
                                                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                                                        return bArrZ;
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } catch (Exception unused) {
                                                                return null;
                                                            }
                                                        default:
                                                            n nVar3 = nVar;
                                                            nVar3.getClass();
                                                            Uri uriWithAppendedId2 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j6);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId2, "withAppendedId(...)");
                                                            ContentResolver contentResolver2 = nVar3.f6204b;
                                                            if (contentResolver2 == null) {
                                                                kotlin.jvm.internal.j.n("contentResolver");
                                                                throw null;
                                                            }
                                                            Cursor cursorQuery = contentResolver2.query(Uri.withAppendedPath(uriWithAppendedId2, "photo"), new String[]{"data15"}, null, null, null);
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    blob = cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
                                                                    cursorQuery.close();
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    try {
                                                                        throw th2;
                                                                    } catch (Throwable th3) {
                                                                        AbstractC0617a.p(cursorQuery, th2);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            return blob;
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final long j7 = j;
                                            final n nVar2 = this.f6195b;
                                            final int i6 = 0;
                                            nVar2.c(result, new Function0() { // from class: W0.g
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() throws IOException {
                                                    switch (i6) {
                                                        case 0:
                                                            n nVar22 = nVar2;
                                                            nVar22.getClass();
                                                            Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j7);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId, "withAppendedId(...)");
                                                            Uri uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedId, "display_photo");
                                                            try {
                                                                ContentResolver contentResolver = nVar22.f6204b;
                                                                if (contentResolver == null) {
                                                                    kotlin.jvm.internal.j.n("contentResolver");
                                                                    throw null;
                                                                }
                                                                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriWithAppendedPath, "r");
                                                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                                                    return null;
                                                                }
                                                                try {
                                                                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                                                                    try {
                                                                        kotlin.jvm.internal.j.d(fileInputStreamCreateInputStream);
                                                                        byte[] bArrZ = Xh.i.z(fileInputStreamCreateInputStream);
                                                                        AbstractC0617a.p(fileInputStreamCreateInputStream, null);
                                                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                                                        return bArrZ;
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } catch (Exception unused) {
                                                                return null;
                                                            }
                                                        default:
                                                            n nVar3 = nVar2;
                                                            nVar3.getClass();
                                                            Uri uriWithAppendedId2 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j7);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId2, "withAppendedId(...)");
                                                            ContentResolver contentResolver2 = nVar3.f6204b;
                                                            if (contentResolver2 == null) {
                                                                kotlin.jvm.internal.j.n("contentResolver");
                                                                throw null;
                                                            }
                                                            Cursor cursorQuery = contentResolver2.query(Uri.withAppendedPath(uriWithAppendedId2, "photo"), new String[]{"data15"}, null, null, null);
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    blob = cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
                                                                    cursorQuery.close();
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    try {
                                                                        throw th2;
                                                                    } catch (Throwable th3) {
                                                                        AbstractC0617a.p(cursorQuery, th2);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            return blob;
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            });
                            return;
                        } else {
                            final int i4 = 1;
                            threadPoolExecutor.execute(new Runnable(this) { // from class: W0.k

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ n f6195b;

                                {
                                    this.f6195b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            final long j6 = j;
                                            final n nVar = this.f6195b;
                                            final int i42 = 1;
                                            nVar.c(result, new Function0() { // from class: W0.g
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() throws IOException {
                                                    switch (i42) {
                                                        case 0:
                                                            n nVar22 = nVar;
                                                            nVar22.getClass();
                                                            Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j6);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId, "withAppendedId(...)");
                                                            Uri uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedId, "display_photo");
                                                            try {
                                                                ContentResolver contentResolver = nVar22.f6204b;
                                                                if (contentResolver == null) {
                                                                    kotlin.jvm.internal.j.n("contentResolver");
                                                                    throw null;
                                                                }
                                                                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriWithAppendedPath, "r");
                                                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                                                    return null;
                                                                }
                                                                try {
                                                                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                                                                    try {
                                                                        kotlin.jvm.internal.j.d(fileInputStreamCreateInputStream);
                                                                        byte[] bArrZ = Xh.i.z(fileInputStreamCreateInputStream);
                                                                        AbstractC0617a.p(fileInputStreamCreateInputStream, null);
                                                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                                                        return bArrZ;
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } catch (Exception unused) {
                                                                return null;
                                                            }
                                                        default:
                                                            n nVar3 = nVar;
                                                            nVar3.getClass();
                                                            Uri uriWithAppendedId2 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j6);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId2, "withAppendedId(...)");
                                                            ContentResolver contentResolver2 = nVar3.f6204b;
                                                            if (contentResolver2 == null) {
                                                                kotlin.jvm.internal.j.n("contentResolver");
                                                                throw null;
                                                            }
                                                            Cursor cursorQuery = contentResolver2.query(Uri.withAppendedPath(uriWithAppendedId2, "photo"), new String[]{"data15"}, null, null, null);
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    blob = cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
                                                                    cursorQuery.close();
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    try {
                                                                        throw th2;
                                                                    } catch (Throwable th3) {
                                                                        AbstractC0617a.p(cursorQuery, th2);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            return blob;
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final long j7 = j;
                                            final n nVar2 = this.f6195b;
                                            final int i6 = 0;
                                            nVar2.c(result, new Function0() { // from class: W0.g
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() throws IOException {
                                                    switch (i6) {
                                                        case 0:
                                                            n nVar22 = nVar2;
                                                            nVar22.getClass();
                                                            Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j7);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId, "withAppendedId(...)");
                                                            Uri uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedId, "display_photo");
                                                            try {
                                                                ContentResolver contentResolver = nVar22.f6204b;
                                                                if (contentResolver == null) {
                                                                    kotlin.jvm.internal.j.n("contentResolver");
                                                                    throw null;
                                                                }
                                                                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriWithAppendedPath, "r");
                                                                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                                                    return null;
                                                                }
                                                                try {
                                                                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                                                                    try {
                                                                        kotlin.jvm.internal.j.d(fileInputStreamCreateInputStream);
                                                                        byte[] bArrZ = Xh.i.z(fileInputStreamCreateInputStream);
                                                                        AbstractC0617a.p(fileInputStreamCreateInputStream, null);
                                                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                                                        return bArrZ;
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } catch (Exception unused) {
                                                                return null;
                                                            }
                                                        default:
                                                            n nVar3 = nVar2;
                                                            nVar3.getClass();
                                                            Uri uriWithAppendedId2 = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j7);
                                                            kotlin.jvm.internal.j.f(uriWithAppendedId2, "withAppendedId(...)");
                                                            ContentResolver contentResolver2 = nVar3.f6204b;
                                                            if (contentResolver2 == null) {
                                                                kotlin.jvm.internal.j.n("contentResolver");
                                                                throw null;
                                                            }
                                                            Cursor cursorQuery = contentResolver2.query(Uri.withAppendedPath(uriWithAppendedId2, "photo"), new String[]{"data15"}, null, null, null);
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    blob = cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
                                                                    cursorQuery.close();
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    try {
                                                                        throw th2;
                                                                    } catch (Throwable th3) {
                                                                        AbstractC0617a.p(cursorQuery, th2);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            return blob;
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    break;
                case 811404173:
                    if (str.equals("getAllContactsPage")) {
                        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map2 = (Map) obj;
                        Object obj2 = map2.get(TypedValues.TransitionType.S_FROM);
                        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) obj2).intValue();
                        Object obj3 = map2.get(TypedValues.TransitionType.S_TO);
                        kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                        List listSubList = this.i.subList(iIntValue, ((Integer) obj3).intValue());
                        ArrayList arrayList = new ArrayList(t.l(listSubList, 10));
                        Iterator it = listSubList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((a) it.next()).a(this.j));
                        }
                        result.success(arrayList);
                        return;
                    }
                    break;
                case 1317938751:
                    if (str.equals("clearFetchedContacts")) {
                        this.i = C1112C.f9377a;
                        this.j = C1114E.f9379a;
                        result.success(null);
                        return;
                    }
                    break;
                case 1425610234:
                    if (str.equals("fetchAllContacts")) {
                        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Object obj4 = ((Map) obj).get("fields");
                        kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List<String> list = (List) obj4;
                        C1916a c1916a = c.f6170a;
                        ArrayList arrayList2 = new ArrayList(t.l(list, 10));
                        for (String str2 : list) {
                            c1916a.getClass();
                            arrayList2.add(C1916a.a(str2));
                        }
                        Set setZ = C1110A.Z(arrayList2);
                        d.f6178a.getClass();
                        Set<d> setF = C2011b.f(setZ);
                        this.j = setZ;
                        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        final CountDownLatch countDownLatch = new CountDownLatch(setF.size());
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList3 = new ArrayList(t.l(setF, 10));
                        for (d dVar : setF) {
                            Object obj5 = this.e.get(dVar);
                            kotlin.jvm.internal.j.d(obj5);
                            ((ExecutorService) obj5).execute(new RunnableC0218a(this, dVar, setZ, concurrentHashMap, countDownLatch, 1));
                            arrayList3.add(Unit.f18162a);
                        }
                        this.f6205d.execute(new Runnable() { // from class: W0.j
                            @Override // java.lang.Runnable
                            public final void run() throws InterruptedException {
                                countDownLatch.await();
                                final ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                                final long j6 = jCurrentTimeMillis;
                                final n nVar = this;
                                nVar.c(result, new Function0() { // from class: W0.h
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Collection collectionValues = concurrentHashMap2.values();
                                        kotlin.jvm.internal.j.f(collectionValues, "<get-values>(...)");
                                        for (a aVar : t.m(collectionValues)) {
                                            a aVar2 = (a) linkedHashMap.get(aVar.f6165a);
                                            if (aVar2 == null) {
                                                linkedHashMap.put(aVar.f6165a, aVar);
                                            } else {
                                                aVar2.b(aVar);
                                            }
                                        }
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j6;
                                        List listV = C1110A.V(linkedHashMap.values());
                                        nVar.i = listV;
                                        return M.h(new Pair("count", Integer.valueOf(listV.size())), new Pair("timeMillis", Long.valueOf(jCurrentTimeMillis2)));
                                    }
                                });
                            }
                        });
                        return;
                    }
                    break;
                case 1988386794:
                    if (str.equals("getContact")) {
                        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map3 = (Map) obj;
                        Object obj6 = map3.get(TtmlNode.ATTR_ID);
                        kotlin.jvm.internal.j.e(obj6, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj6;
                        Object obj7 = map3.get("fields");
                        kotlin.jvm.internal.j.e(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List<String> list2 = (List) obj7;
                        C1916a c1916a2 = c.f6170a;
                        ArrayList arrayList4 = new ArrayList(t.l(list2, 10));
                        for (String str4 : list2) {
                            c1916a2.getClass();
                            arrayList4.add(C1916a.a(str4));
                        }
                        Set setZ2 = C1110A.Z(arrayList4);
                        d.f6178a.getClass();
                        Set<d> setF2 = C2011b.f(setZ2);
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                        CountDownLatch countDownLatch2 = new CountDownLatch(setF2.size());
                        ArrayList arrayList5 = new ArrayList(t.l(setF2, 10));
                        for (d dVar2 : setF2) {
                            Object obj8 = this.f6206g.get(dVar2);
                            kotlin.jvm.internal.j.d(obj8);
                            ExecutorService executorService = (ExecutorService) obj8;
                            String str5 = str3;
                            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                            concurrentHashMap2 = concurrentHashMap3;
                            executorService.execute(new l(this, dVar2, setZ2, str5, concurrentHashMap3, countDownLatch2, 0));
                            arrayList5.add(Unit.f18162a);
                            str3 = str5;
                        }
                        this.f.execute(new l(countDownLatch2, this, result, concurrentHashMap2, str3, setZ2));
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}

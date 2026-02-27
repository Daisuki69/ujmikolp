package i2;

import Ah.r;
import Ch.f;
import G5.j;
import Xh.g;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Base64;
import androidx.core.content.FileProvider;
import c1.h;
import c1.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.g0;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.ContactName;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import f1.C1455a;
import f1.C1456b;
import f1.C1458d;
import f1.C1459e;
import f1.C1460f;
import f1.C1461g;
import f1.EnumC1457c;
import j1.C1653a;
import j1.C1654b;
import j1.C1659g;
import j1.InterfaceC1657e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.v0;
import kotlin.Pair;
import m1.AbstractC1844a;
import rc.i;
import y5.p;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1585a implements Continuation, InterfaceC1657e, r, f, j, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17086b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17087d;

    public /* synthetic */ C1585a(int i, Object obj, Object obj2, Object obj3) {
        this.f17085a = i;
        this.f17086b = obj;
        this.c = obj2;
        this.f17087d = obj3;
    }

    @Override // Ah.r
    public void a(Lh.a aVar) {
        i iVar = (i) this.f17086b;
        String str = (String) this.c;
        ContactModel contactModel = (ContactModel) this.f17087d;
        try {
            ContactName contactNameB = iVar.f19901k.b(str);
            aVar.b(new ContactModel(contactModel.getName(), contactModel.getNumber(), contactModel.getImageUri(), contactNameB.getFirstName(), contactNameB.getMiddleName(), contactNameB.getLastName(), null, 64, null));
        } catch (Exception e) {
            aVar.a(e);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // j1.InterfaceC1657e
    public Object apply(Object obj) {
        long jInsert;
        int i;
        Object obj2;
        C1659g c1659g;
        int i4 = 6;
        int i6 = 5;
        int i10 = 4;
        int i11 = 3;
        Object obj3 = null;
        int i12 = 2;
        int i13 = 1;
        switch (this.f17085a) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C1659g c1659g2 = (C1659g) this.f17086b;
                long jSimpleQueryForLong = c1659g2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1659g2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C1653a c1653a = c1659g2.f17665d;
                long j = c1653a.f17656a;
                h hVar = (h) this.c;
                String str = hVar.f9226a;
                if (jSimpleQueryForLong >= j) {
                    c1659g2.i(1L, EnumC1457c.CACHE_FULL, str);
                    return -1L;
                }
                c1.i iVar = (c1.i) this.f17087d;
                Long lC = C1659g.c(sQLiteDatabase, iVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f9230a);
                    contentValues.put("priority", Integer.valueOf(AbstractC1844a.a(iVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f9231b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                k kVar = hVar.c;
                byte[] bArr2 = kVar.f9236b;
                int length = bArr2.length;
                int i14 = c1653a.e;
                boolean z4 = length <= i14;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f9228d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.e));
                contentValues2.put("payload_encoding", kVar.f9235a.f6873a);
                contentValues2.put("code", hVar.f9227b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z4));
                contentValues2.put("payload", z4 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar.f9229g);
                contentValues2.put("pseudonymous_id", hVar.h);
                contentValues2.put("experiment_ids_clear_blob", hVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z4) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i14));
                    for (int i15 = 1; i15 <= iCeil; i15++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i15 - 1) * i14, Math.min(i15 * i14, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i15));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                Cursor cursor = (Cursor) obj;
                C1659g c1659g3 = (C1659g) this.f17086b;
                c1659g3.getClass();
                while (cursor.moveToNext()) {
                    long j6 = cursor.getLong(0);
                    int i16 = cursor.getInt(7) != 0 ? i13 : 0;
                    g gVar = new g();
                    gVar.f = new HashMap();
                    String string = cursor.getString(i13);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    gVar.f6640a = string;
                    gVar.f6642d = Long.valueOf(cursor.getLong(i12));
                    gVar.e = Long.valueOf(cursor.getLong(i11));
                    if (i16 != 0) {
                        String string2 = cursor.getString(i10);
                        gVar.c = new k(string2 == null ? C1659g.f : new Z0.c(string2), cursor.getBlob(5));
                        c1659g = c1659g3;
                        obj2 = obj3;
                        i = i13;
                    } else {
                        String string3 = cursor.getString(i10);
                        Z0.c cVar = string3 == null ? C1659g.f : new Z0.c(string3);
                        Cursor cursorQuery = c1659g3.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                int i17 = i13;
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                                i13 = i17;
                                break;
                            }
                            i = i13;
                            byte[] bArr3 = new byte[length2];
                            int i18 = 0;
                            int length3 = 0;
                            obj2 = obj3;
                            while (i18 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i18);
                                C1659g c1659g4 = c1659g3;
                                System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                length3 += bArr4.length;
                                i18++;
                                c1659g3 = c1659g4;
                            }
                            c1659g = c1659g3;
                            cursorQuery.close();
                            gVar.c = new k(cVar, bArr3);
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        gVar.f6641b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        gVar.f6643g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        gVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        gVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        gVar.j = cursor.getBlob(11);
                    }
                    ((ArrayList) this.c).add(new C1654b(j6, (c1.i) this.f17087d, gVar.b()));
                    c1659g3 = c1659g;
                    i13 = i;
                    obj3 = obj2;
                    i10 = 4;
                    i11 = 3;
                    i12 = 2;
                }
                return obj3;
            case 3:
                Cursor cursor2 = (Cursor) obj;
                C1659g c1659g5 = (C1659g) this.f17086b;
                c1659g5.getClass();
                while (true) {
                    boolean zMoveToNext = cursor2.moveToNext();
                    HashMap map = (HashMap) this.c;
                    if (zMoveToNext) {
                        String string4 = cursor2.getString(0);
                        int i19 = cursor2.getInt(1);
                        EnumC1457c enumC1457c = EnumC1457c.REASON_UNKNOWN;
                        if (i19 != 0) {
                            if (i19 == 1) {
                                enumC1457c = EnumC1457c.MESSAGE_TOO_OLD;
                            } else if (i19 == 2) {
                                enumC1457c = EnumC1457c.CACHE_FULL;
                            } else if (i19 == 3) {
                                enumC1457c = EnumC1457c.PAYLOAD_TOO_BIG;
                            } else if (i19 == 4) {
                                enumC1457c = EnumC1457c.MAX_RETRIES_REACHED;
                            } else if (i19 == i6) {
                                enumC1457c = EnumC1457c.INVALID_PAYLOD;
                            } else if (i19 == i4) {
                                enumC1457c = EnumC1457c.SERVER_ERROR;
                            } else {
                                v0.e("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i19));
                            }
                        }
                        long j7 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C1458d(j7, enumC1457c));
                        i4 = 6;
                        i6 = 5;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f17087d;
                            if (!zHasNext) {
                                long jF = c1659g5.f17664b.f();
                                SQLiteDatabase sQLiteDatabaseB = c1659g5.b();
                                sQLiteDatabaseB.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        C1461g c1461g = new C1461g(cursorRawQuery.getLong(0), jF);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseB.setTransactionSuccessful();
                                        sQLiteDatabaseB.endTransaction();
                                        rVar.c = c1461g;
                                        rVar.e = new C1456b(new C1460f(c1659g5.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1659g5.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C1653a.f.f17656a));
                                        rVar.f9803b = (String) c1659g5.e.get();
                                        return new C1455a((C1461g) rVar.c, Collections.unmodifiableList((ArrayList) rVar.f9804d), (C1456b) rVar.e, (String) rVar.f9803b);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseB.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i20 = C1459e.c;
                            new ArrayList();
                            ((ArrayList) rVar.f9804d).add(new C1459e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
            default:
                se.e eVar = (se.e) this.f17086b;
                ShopProviderCategory shopProviderCategory = (ShopProviderCategory) this.c;
                ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) this.f17087d;
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                O0 o02 = eVar.f20056d;
                String categoryCode = shopProviderCategory.getCode();
                o02.getClass();
                kotlin.jvm.internal.j.g(categoryCode, "categoryCode");
                List listB = o02.c.b(new J1.e(categoryCode, 2));
                List list = listB;
                if (list == null || list.isEmpty()) {
                    ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).C1("Load");
                    return new Pair(null, throwable);
                }
                shopHomeSectionCarousel.setList(listB);
                ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).A1(shopHomeSectionCarousel);
                return new Pair(new ShopProviderBase(listB, null), throwable);
        }
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) this.f17086b;
        p pVar = mayaAbstractBaseUserActivityFragmentImpl.t0;
        if (pVar != null) {
            Context contextRequireContext = mayaAbstractBaseUserActivityFragmentImpl.requireContext();
            Uri uriForFile = FileProvider.getUriForFile(contextRequireContext, contextRequireContext.getPackageName() + ".fileprovider", file);
            MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) pVar;
            mayaTransactionsActivity.n1();
            B5.i.D(mayaTransactionsActivity, (String) this.c, (String) this.f17087d, uriForFile);
        }
    }

    @Override // G5.j
    public void c() {
        String str = (String) this.c;
        kotlin.jvm.internal.j.d(str);
        String str2 = (String) this.f17087d;
        kotlin.jvm.internal.j.d(str2);
        ((ShopV3PaymentFragment) this.f17086b).M1(str, str2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f17086b;
        if (zIsSuccessful) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (((AtomicBoolean) this.c).getAndSet(true)) {
            ((CancellationTokenSource) this.f17087d).cancel();
        }
        return Tasks.forResult(null);
    }
}

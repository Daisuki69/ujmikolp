package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.domain.model.OnlinePayment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11327b;

    public /* synthetic */ x(Object obj, int i) {
        this.f11326a = i;
        this.f11327b = obj;
    }

    @Override // Ch.f
    public final Object apply(Object obj) {
        switch (this.f11326a) {
            case 0:
                ((y) this.f11327b).getClass();
                Cursor cursorA = ((Xe.b) obj).a();
                if (!cursorA.moveToFirst()) {
                    cursorA.close();
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                int columnIndex = cursorA.getColumnIndex(TtmlNode.ATTR_ID);
                int columnIndex2 = cursorA.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex3 = cursorA.getColumnIndex("category");
                int columnIndex4 = cursorA.getColumnIndex("link");
                int columnIndex5 = cursorA.getColumnIndex("background_url");
                int columnIndex6 = cursorA.getColumnIndex("icon_url");
                int columnIndex7 = cursorA.getColumnIndex("logo_url");
                int columnIndex8 = cursorA.getColumnIndex("priority");
                int columnIndex9 = cursorA.getColumnIndex("maintenance");
                int columnIndex10 = cursorA.getColumnIndex("tags");
                int columnIndex11 = cursorA.getColumnIndex("code");
                while (true) {
                    String string = cursorA.getString(columnIndex9);
                    com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
                    MaintenanceDate maintenanceDate = (MaintenanceDate) jVar.e(string, MaintenanceDate.class);
                    int i = columnIndex9;
                    arrayList.add(OnlinePayment.sBuilder().mId(cursorA.getString(columnIndex)).mName(cursorA.getString(columnIndex2)).mCode(cursorA.getString(columnIndex11)).mCategory(cursorA.getString(columnIndex3)).mExternalLink(cursorA.getString(columnIndex4)).mBackgroundUrl(cursorA.getString(columnIndex5)).mIconUrl(cursorA.getString(columnIndex6)).mLogoUrl(cursorA.getString(columnIndex7)).mMaintenance(maintenanceDate).mPriority(cursorA.getInt(columnIndex8)).mTags((List) jVar.f(cursorA.getString(columnIndex10), new OnlinePaymentRepository$1().getType())).build());
                    if (!cursorA.moveToNext()) {
                        cursorA.close();
                        return Collections.unmodifiableList(arrayList);
                    }
                    columnIndex9 = i;
                }
                break;
            case 1:
                ((C1237a) this.f11327b).getClass();
                return C1237a.a(((Xe.b) obj).a());
            case 2:
                ((C1242f) this.f11327b).getClass();
                return C1242f.a(((Xe.b) obj).a());
            case 3:
                ((C1243g) this.f11327b).getClass();
                return C1243g.a(((Xe.b) obj).a());
            case 4:
                ((C1246j) this.f11327b).getClass();
                return C1246j.a(((Xe.b) obj).a());
            case 5:
                ((s) this.f11327b).getClass();
                return s.a(((Xe.b) obj).a());
            case 6:
                ((v) this.f11327b).getClass();
                return v.a(((Xe.b) obj).a());
            default:
                ((G) this.f11327b).getClass();
                return G.a(((Xe.b) obj).a());
        }
    }
}

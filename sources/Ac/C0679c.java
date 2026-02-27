package ac;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.FilterQueryProvider;
import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.common.utility.C1231u;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import dc.C1352c;
import kotlin.NoWhenBranchMatchedException;
import zj.C2576A;

/* JADX INFO: renamed from: ac.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0679c extends CursorAdapter implements FilterQueryProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f7094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.database.repository.k f7095b;
    public EnumC0678b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679c(Context context, com.paymaya.data.preference.a aVar, com.paymaya.data.database.repository.k kVar) {
        super(context, (Cursor) null, 2);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("buOPO"));
        kotlin.jvm.internal.j.g(kVar, numX49.tnTj78("buOPQ"));
        this.f7094a = aVar;
        this.f7095b = kVar;
        setFilterQueryProvider(this);
        this.c = EnumC0678b.f7093b;
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        String string;
        kotlin.jvm.internal.j.g(view, numX49.tnTj78("buOPt"));
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("buOPU"));
        kotlin.jvm.internal.j.g(cursor, numX49.tnTj78("buOPe"));
        Object tag = view.getTag();
        kotlin.jvm.internal.j.e(tag, numX49.tnTj78("buOP8"));
        C1352c c1352c = (C1352c) tag;
        int iOrdinal = this.c.ordinal();
        String strTnTj78 = numX49.tnTj78("buOPC");
        com.paymaya.data.preference.a aVar = this.f7094a;
        if (iOrdinal == 0) {
            string = svM7M6.getString(aVar.f11330b, numX49.tnTj78("buOPo"), strTnTj78);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string = svM7M6.getString(aVar.f11330b, numX49.tnTj78("buOP4"), strTnTj78);
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOPK")));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOPw")));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOPc")));
        cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOPm")));
        C1352c c1352c2 = (C1352c) c1352c.f.f5284b;
        if (string2 != null) {
            c1352c2.getClass();
            We.G g8 = We.A.d().g(Uri.parse(string2));
            g8.i(new C1231u());
            g8.e(c1352c2.f16305a, null);
        }
        if (string3 == null || C2576A.H(string3)) {
            c1352c2.f16306b.setVisibility(8);
        } else {
            c1352c2.f16306b.setVisibility(0);
            c1352c2.f16306b.setText(string3);
        }
        if (string4 == null || C2576A.H(string4)) {
            return;
        }
        yk.a.a();
        String strTnTj782 = numX49.tnTj78("buOPD");
        String strR = com.paymaya.common.utility.C.r(new zj.o(strTnTj782).f(strTnTj78, string4));
        if (string != null && !C2576A.H(string)) {
            strTnTj78 = com.paymaya.common.utility.C.r(new zj.o(strTnTj782).f(strTnTj78, string));
        }
        c1352c2.c.setText(string4);
        boolean zB = kotlin.jvm.internal.j.b(strR, strTnTj78);
        View view2 = c1352c2.e;
        TextView textView = c1352c2.f16307d;
        if (!zB || strTnTj78 == null || C2576A.H(strTnTj78)) {
            textView.setVisibility(8);
            view2.setVisibility(8);
        } else {
            textView.setVisibility(0);
            view2.setVisibility(0);
        }
    }

    @Override // android.widget.CursorAdapter
    public final CharSequence convertToString(Cursor cursor) {
        kotlin.jvm.internal.j.g(cursor, numX49.tnTj78("buOPh"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOPM")));
        String strTnTj78 = numX49.tnTj78("buOPN");
        if (string == null) {
            string = strTnTj78;
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("buOP6")));
        if (string2 != null) {
            strTnTj78 = string2;
        }
        return androidx.media3.datasource.cache.c.l(string, numX49.tnTj78("buOPa"), strTnTj78, numX49.tnTj78("buOPX"));
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("buOPG"));
        kotlin.jvm.internal.j.g(cursor, numX49.tnTj78("buOP3"));
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOPy"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_shop_recipient_item, viewGroup, false);
        kotlin.jvm.internal.j.d(viewInflate);
        viewInflate.setTag(new C1352c(viewInflate));
        return viewInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // android.widget.FilterQueryProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor runQuery(java.lang.CharSequence r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0679c.runQuery(java.lang.CharSequence):android.database.Cursor");
    }
}

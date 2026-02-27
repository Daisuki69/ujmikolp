package fe;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.FilterQueryProvider;
import androidx.core.content.ContextCompat;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.data.database.repository.k;
import com.paymaya.domain.store.T;
import com.paymaya.ui.sendmoney.view.viewholder.impl.RecipientViewHolder;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;
import s.AbstractC2217b;
import zj.C2576A;
import zj.o;

/* JADX INFO: renamed from: fe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1482a extends CursorAdapter implements FilterQueryProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f16751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f16752b;
    public int c;

    public C1482a(Context context, com.paymaya.data.preference.a aVar, k kVar) {
        super(context, (Cursor) null, 2);
        this.f16751a = aVar;
        this.f16752b = kVar;
        setFilterQueryProvider(this);
        this.c = 2;
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        String string;
        RecipientViewHolder recipientViewHolder = (RecipientViewHolder) view.getTag();
        int iC = AbstractC2217b.c(this.c);
        String strTnTj78 = numX49.tnTj78("bidk");
        com.paymaya.data.preference.a aVar = this.f16751a;
        if (iC == 0) {
            string = svM7M6.getString(aVar.f11330b, numX49.tnTj78("bidu"), strTnTj78);
        } else if (iC != 1) {
            string = null;
        } else {
            string = svM7M6.getString(aVar.f11330b, numX49.tnTj78("bidB"), strTnTj78);
        }
        recipientViewHolder.getClass();
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("bidV")));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("bidS")));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("bidj")));
        RecipientViewHolder recipientViewHolder2 = (RecipientViewHolder) recipientViewHolder.f14771a.f11391b;
        if (string2 == null || C2576A.H(string2)) {
            recipientViewHolder2.d();
            recipientViewHolder2.n();
        } else {
            recipientViewHolder2.e();
            recipientViewHolder2.o();
            recipientViewHolder2.a(string2);
        }
        if (string3 != null && !C2576A.H(string3)) {
            String strTnTj782 = numX49.tnTj78("bidd");
            String strR = C.r(new o(strTnTj782).f(strTnTj78, string3));
            if (string == null) {
                string = AbstractC1213b.M(strTnTj782, strTnTj78, strTnTj78);
            }
            String strR2 = C.r(string);
            recipientViewHolder2.f(numX49.tnTj78("bidi") + string3 + numX49.tnTj78("bidE"));
            if (!j.b(strR, strR2) || strR2 == null || C2576A.H(strR2)) {
                recipientViewHolder2.c();
                recipientViewHolder2.h();
                recipientViewHolder2.m();
                recipientViewHolder2.i();
            } else {
                recipientViewHolder2.b();
                recipientViewHolder2.g();
                recipientViewHolder2.l();
                recipientViewHolder2.j();
            }
        }
        if (string4 == null || C2576A.H(string4)) {
            return;
        }
        recipientViewHolder2.k(string4);
    }

    @Override // android.widget.CursorAdapter
    public final CharSequence convertToString(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("bidF"))) + numX49.tnTj78("bidH") + cursor.getString(cursor.getColumnIndexOrThrow(numX49.tnTj78("bidO"))) + numX49.tnTj78("bidQ");
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewE = AbstractC1414e.e(viewGroup, R.layout.pma_view_send_money_recipient_item, viewGroup, false);
        RecipientViewHolder recipientViewHolder = new RecipientViewHolder();
        ButterKnife.bind(recipientViewHolder, viewE);
        Context context2 = viewE.getContext();
        recipientViewHolder.f14772b = C.C(context2);
        recipientViewHolder.c = ContextCompat.getColor(context2, R.color.pma_text_color_dark_grey);
        recipientViewHolder.f14771a = new T(recipientViewHolder, 12);
        viewE.setTag(recipientViewHolder);
        return viewE;
    }

    @Override // android.widget.FilterQueryProvider
    public final Cursor runQuery(CharSequence charSequence) {
        String strTnTj78 = numX49.tnTj78("bidt");
        String strTrim = charSequence != null ? charSequence.toString().trim() : strTnTj78;
        if (strTrim.length() >= 3 && numX49.tnTj78("bidU").equals(strTrim.substring(0, 3))) {
            strTrim = strTrim.substring(3);
        } else if (strTrim.length() >= 1 && numX49.tnTj78("bide").equals(strTrim.substring(0, 1))) {
            strTrim = strTrim.substring(1);
        }
        int iC = AbstractC2217b.c(this.c);
        com.paymaya.data.preference.a aVar = this.f16751a;
        String string = iC != 0 ? iC != 1 ? null : svM7M6.getString(aVar.f11330b, numX49.tnTj78("bid8"), strTnTj78) : svM7M6.getString(aVar.f11330b, numX49.tnTj78("bidC"), strTnTj78);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        k kVar = this.f16752b;
        Cursor cursorB = !zIsEmpty ? kVar.f11313a.b(strTrim, string) : kVar.f11313a.a(strTrim);
        if (cursorB != null) {
            cursorB.moveToFirst();
        }
        return cursorB;
    }
}

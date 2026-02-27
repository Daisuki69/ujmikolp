package I7;

import N5.C0453g;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.Dated;
import java.util.ArrayList;
import java.util.Locale;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2360b f2220b;
    public final Context c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(C0453g c0453g) {
        ConstraintLayout constraintLayout = (ConstraintLayout) c0453g.f4094b;
        super(constraintLayout);
        this.f2219a = (TextView) c0453g.c;
        this.f2220b = new C2360b(this, 2);
        this.c = constraintLayout.getContext();
    }

    public final void D(int i, ArrayList datedList) {
        kotlin.jvm.internal.j.g(datedList, "datedList");
        Dated dated = (Dated) datedList.get(i);
        Locale locale = this.c.getResources().getConfiguration().locale;
        kotlin.jvm.internal.j.f(locale, "locale");
        ((a) this.f2220b.f20516b).f2219a.setText(dated.getMayaLocalDateTimeForDateHeader(locale, false));
    }
}

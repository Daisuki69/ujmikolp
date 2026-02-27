package dc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.paymaya.R;

/* JADX INFO: renamed from: dc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1352c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16306b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16307d;
    public final View e;
    public final Q6.n f = new Q6.n(this);

    public C1352c(View view) {
        View viewFindViewById = view.findViewById(R.id.contact_name_text_view);
        kotlin.jvm.internal.j.f(viewFindViewById, "findViewById(...)");
        this.f16306b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.mobile_number_text_view);
        kotlin.jvm.internal.j.f(viewFindViewById2, "findViewById(...)");
        this.c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.recent_indicator_text_view);
        kotlin.jvm.internal.j.f(viewFindViewById3, "findViewById(...)");
        this.f16307d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recent_item_divider_view);
        kotlin.jvm.internal.j.f(viewFindViewById4, "findViewById(...)");
        this.e = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.contact_image_view);
        kotlin.jvm.internal.j.f(viewFindViewById5, "findViewById(...)");
        this.f16305a = (ImageView) viewFindViewById5;
    }
}

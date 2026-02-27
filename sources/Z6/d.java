package Z6;

import G6.r;
import N5.C0453g;
import Y6.o;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.ContactModel;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U6.c f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f6898b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f6899d;
    public final r e;
    public ContactModel f;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(C0453g c0453g, U6.c cVar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) c0453g.f4094b;
        super(constraintLayout);
        this.f6897a = cVar;
        this.f6898b = (TextView) c0453g.e;
        this.c = (TextView) c0453g.f4095d;
        this.f6899d = (AppCompatImageView) c0453g.c;
        this.e = new r(this, 27);
        constraintLayout.setOnClickListener(new o(this, 1));
    }
}

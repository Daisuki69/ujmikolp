package w1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20574b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, View view) {
        super(view);
        this.f20575d = tVar;
        this.f20573a = (TextView) view.findViewById(R.id.exo_main_text);
        this.f20574b = (TextView) view.findViewById(R.id.exo_sub_text);
        this.c = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new qf.d(this, 8));
    }
}

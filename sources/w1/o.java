package w1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f20580b;

    public o(View view) {
        super(view);
        this.f20579a = (TextView) view.findViewById(R.id.exo_text);
        this.f20580b = view.findViewById(R.id.exo_check);
    }
}
